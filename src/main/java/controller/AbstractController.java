package controller;

import model.AbstractModel;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public abstract class AbstractController<M extends AbstractModel> implements Converter<M> {
    private List<M> list;

    abstract EntityManager getEntityManager();

    abstract String getAllNamedQuery();

    abstract Class<M> getModelClass();

    public List<M> getList() {
        return list;
    }

    @PostConstruct
    private void postConstruct() {
        list = getEntityManager().createNamedQuery(getAllNamedQuery(), getModelClass()).getResultList();
    }

    @Transactional
    public void addToList() throws IllegalAccessException, InstantiationException {
        M m = getModelClass().newInstance();
        getEntityManager().persist(m);
        getList().add(m );
    }

    @Transactional
    public void removeFromList(M m) {
        getList().remove(m);
        getEntityManager().remove(getEntityManager().merge(m));
    }

    @Transactional
    public void mergeList() {
        getList().forEach(getEntityManager()::merge);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, M m) {
        return m == null ? null : m.getId() + "";
    }

    @Override
    public M getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        return getEntityManager().find(getModelClass(), id);
    }
}

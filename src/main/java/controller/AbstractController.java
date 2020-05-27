package controller;

import model.AbstractModel;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.persistence.EntityManager;
import java.util.List;

public abstract class AbstractController<M extends AbstractModel> implements Converter<M> {
    abstract EntityManager getEntityManager();

    abstract String getAllNamedQuery();

    abstract Class<M> getModelClass();

    List<M> getAll() {
        return getEntityManager().createNamedQuery(getAllNamedQuery(), getModelClass()).getResultList();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, M m) {
        return m.getId() + "";
    }

    @Override
    public M getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        return getEntityManager().find(getModelClass(), id);
    }
}

package controller;

import model.ExpendableType;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;

@Named
@ViewScoped
public class ExpendableTypeController extends AbstractController<ExpendableType> implements Serializable {
    public static final String getAllExpendableTypes = "getAllExpendableTypes";
    @Inject
    private EntityManager em;

    @Override
    EntityManager getEntityManager() {
        return em;
    }

    @Override
    String getAllNamedQuery() {
        return getAllExpendableTypes;
    }

    @Override
    Class<ExpendableType> getModelClass() {
        return ExpendableType.class;
    }
}

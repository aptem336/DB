package controller;

import model.ExpendableType;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@RequestScoped
public class ExpendableTypeController extends AbstractController<ExpendableType> {
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

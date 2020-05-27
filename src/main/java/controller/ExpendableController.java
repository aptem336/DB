package controller;

import model.Expendable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@RequestScoped
public class ExpendableController extends AbstractController<Expendable> {
    public static final String getAllExpendables = "getAllExpendables";
    @Inject
    private EntityManager em;

    @Override
    EntityManager getEntityManager() {
        return em;
    }

    @Override
    String getAllNamedQuery() {
        return getAllExpendables;
    }

    @Override
    Class<Expendable> getModelClass() {
        return Expendable.class;
    }
}

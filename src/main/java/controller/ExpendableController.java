package controller;

import model.Expendable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;

@Named
@ViewScoped
public class ExpendableController extends AbstractController<Expendable> implements Serializable {
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

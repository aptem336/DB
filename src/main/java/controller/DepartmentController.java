package controller;

import model.Department;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;

@Named
@ViewScoped
public class DepartmentController extends AbstractController<Department> implements Serializable {
    public static final String getAllDepartments = "getAllDepartments";
    @Inject
    private EntityManager em;

    @Override
    EntityManager getEntityManager() {
        return em;
    }

    @Override
    String getAllNamedQuery() {
        return getAllDepartments;
    }

    @Override
    Class<Department> getModelClass() {
        return Department.class;
    }
}

package controller;

import model.Department;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@RequestScoped
public class DepartmentController extends AbstractController<Department> {
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

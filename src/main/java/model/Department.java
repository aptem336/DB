package model;

import controller.DepartmentController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = DepartmentController.getAllDepartments, query = "SELECT d FROM Department d")
public class Department extends AbstractModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

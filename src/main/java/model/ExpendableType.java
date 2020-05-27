package model;

import controller.ExpendableTypeController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = ExpendableTypeController.getAllExpendableTypes, query = "SELECT et FROM ExpendableType et")
public class ExpendableType extends AbstractModel {
    @NotNull
    private String typeName;
    @NotNull
    private Integer resource;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String type) {
        this.typeName = type;
    }

    public Integer getResource() {
        return resource;
    }

    public void setResource(Integer resource) {
        this.resource = resource;
    }
}

package model;

import controller.ExpendableController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = ExpendableController.getAllExpendables, query = "SELECT e FROM Expendable e")
public class Expendable extends AbstractModel {
    private String serialNumber;
    private Integer mileage;
    @ManyToOne(cascade = CascadeType.ALL)
    private ExpendableType expendableType;

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer resource) {
        this.mileage = resource;
    }

    public ExpendableType getExpendableType() {
        return expendableType;
    }

    public void setExpendableType(ExpendableType expendableType) {
        this.expendableType = expendableType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

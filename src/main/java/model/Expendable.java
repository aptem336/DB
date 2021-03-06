package model;

import controller.ExpendableController;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = ExpendableController.getAllExpendables, query = "SELECT e FROM Expendable e")
public class Expendable extends AbstractModel {
    @NotNull
    private String serialNumber;
    @NotNull
    private Integer mileage;
    @ManyToOne
    private Printer printer;
    @NotNull
    @ManyToOne
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

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}

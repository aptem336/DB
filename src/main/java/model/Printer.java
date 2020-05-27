package model;

import controller.PrinterController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = PrinterController.getAllPrinters, query = "SELECT p FROM Printer p")
public class Printer extends AbstractModel {
    @NotNull
    private String inventoryNumber;
    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private PrinterModel printerModel;
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public PrinterModel getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(PrinterModel printerModel) {
        this.printerModel = printerModel;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

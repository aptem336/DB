package model;

import controller.PrinterModelController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = PrinterModelController.getAllPrinterClasses, query = "SELECT pс FROM PrinterModel pс")
public class PrinterModel extends AbstractModel {
    @NotNull
    private String manufacturer;
    @NotNull
    private String model;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

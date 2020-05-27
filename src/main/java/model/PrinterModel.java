package model;

import controller.PrinterModelController;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = PrinterModelController.getAllPrinterClasses, query = "SELECT pс FROM PrinterModel pс")
public class PrinterModel extends AbstractModel {
    private String manufacturer;
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

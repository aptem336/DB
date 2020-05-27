package model;

import controller.PrinterClassController;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NamedQuery(name = PrinterClassController.getAllPrinterClasses, query = "SELECT pс FROM PrinterClass pс")
public class PrinterClass extends AbstractModel {
    private String manufacturer;
    private String model;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "printerClass", orphanRemoval = true)
    private List<Printer> printerList;

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

    public List<Printer> getPrinterList() {
        return printerList;
    }

    public void setPrinterList(List<Printer> printerList) {
        this.printerList = printerList;
    }
}

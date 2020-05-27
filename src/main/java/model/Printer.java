package model;

import controller.PrinterController;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = PrinterController.getAllPrinters, query = "SELECT p FROM Printer p")
public class Printer extends AbstractModel {
    @ManyToOne
    private PrinterClass printerClass;

    public PrinterClass getPrinterClass() {
        return printerClass;
    }

    public void setPrinterClass(PrinterClass printerClass) {
        this.printerClass = printerClass;
    }
}

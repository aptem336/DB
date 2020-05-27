package controller;

import model.PrinterClass;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;

@Named
@ViewScoped
public class PrinterClassController extends AbstractController<PrinterClass> implements Serializable {
    public static final String getAllPrinterClasses = "getAllPrinterClasses";
    @Inject
    private EntityManager em;

    @Override
    EntityManager getEntityManager() {
        return em;
    }

    @Override
    String getAllNamedQuery() {
        return getAllPrinterClasses;
    }

    @Override
    Class<PrinterClass> getModelClass() {
        return PrinterClass.class;
    }
}

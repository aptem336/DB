package controller;

import model.Printer;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;

@Named
@ViewScoped
public class PrinterController extends AbstractController<Printer> implements Serializable {
    public static final String getAllPrinters = "getAllPrinters";
    @Inject
    private EntityManager em;

    @Override
    EntityManager getEntityManager() {
        return em;
    }

    @Override
    String getAllNamedQuery() {
        return getAllPrinters;
    }

    @Override
    Class<Printer> getModelClass() {
        return Printer.class;
    }
}

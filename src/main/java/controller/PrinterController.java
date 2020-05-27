package controller;

import model.Printer;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@RequestScoped
public class PrinterController extends AbstractController<Printer> {
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
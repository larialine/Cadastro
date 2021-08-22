package ex.pdm.cadastro;


import java.util.ArrayList;
import java.util.List;

public class ListaEmails {
    private List listaEmails = new ArrayList();

    public ListaEmails(List listaEmails) {
        this.listaEmails = listaEmails;
    }

    public List<String> getListaEmails() {
        return listaEmails;
    }

    public void setListaEmails(List<String> listaEmails) {
        this.listaEmails = listaEmails;
    }

    @Override
    public String toString() {
        return "ListaEmails {" +
                "listaEmails=" + listaEmails +
                '}';
    }
}

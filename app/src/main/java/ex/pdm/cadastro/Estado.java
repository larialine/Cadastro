package ex.pdm.cadastro;

public enum Estado {

    ACRE("Acre");

    private String label;

    Estado(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

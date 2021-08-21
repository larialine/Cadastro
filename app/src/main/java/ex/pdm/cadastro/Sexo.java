package ex.pdm.cadastro;

public enum Sexo {

    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String label;

    Sexo(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

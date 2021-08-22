package ex.pdm.cadastro;

public class Formulario {

    private String nome;
    private String telefone;
    private String email;
    private Enum<Sexo> sexoEnum;
    private String cidade;
    private Enum<Estado> estadoEnum;

    public Formulario() {

    }

    public Formulario(String nome, String telefone, String email, Enum<Sexo> sexoEnum, String cidade, Enum<Estado> estadoEnum) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexoEnum = sexoEnum;
        this.cidade = cidade;
        this.estadoEnum = estadoEnum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum<Sexo> getSexoEnum() {
        return sexoEnum;
    }

    public void setSexoEnum(Enum<Sexo> sexoEnum) {
        this.sexoEnum = sexoEnum;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Enum<Estado> getEstadoEnum() {
        return estadoEnum;
    }

    public void setEstadoEnum(Enum<Estado> estadoEnum) {
        this.estadoEnum = estadoEnum;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", sexoEnum=" + sexoEnum +
                ", cidade='" + cidade + '\'' +
                ", estadoEnum=" + estadoEnum +
                '}';
    }
}
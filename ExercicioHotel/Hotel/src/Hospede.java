public class Hospede {
    private String nome;
    private String cpf;

    public Hospede(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
}

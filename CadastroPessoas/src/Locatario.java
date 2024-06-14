public class Locatario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String nomeLoja;

    public Locatario(String nome, String cpf, String endereco, String telefone, String nomeLoja) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nomeLoja = nomeLoja;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Telefone: " + telefone + ", Nome da Loja: " + nomeLoja;
    }
}

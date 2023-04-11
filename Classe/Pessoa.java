package Classe;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private int anoNascimento;
    private Endereco endereco;
    private Setor setor;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}

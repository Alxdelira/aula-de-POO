package Cachorro;

public class Cachorro {
    private String nome;
    private String dono;
    private String raca;
    private int idade;
    private float peso;

    public String getNome() {
        return this.nome;
    }

    public String getDono() {
        return dono;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

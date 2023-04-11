package Cachorro;

import Classe.Endereco;
import Classe.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Endereco e = new Endereco();

        Pessoa p = new Pessoa();

        p.setEndereco(e);

        e.setBairro("Jardins");

        System.out.println(e.getBairro());
    }
}

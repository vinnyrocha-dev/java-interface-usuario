package br.com.vini.mod13.Interfaces.Usuario;

import java.util.Scanner;

public class Usuario implements IUsuarioService {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int idade;

    @Override
    public void cadastrarUsuario(String nome, int idade) {
       this.nome = nome;
       this.idade =  idade;
        System.out.println("Usuário cadastrado com sucesso!");
    }

    @Override
    public void mostrarUsuario() {
        System.out.println("==== DADOS DO USUÁRIO ====");
        if (nome.equals("") && idade <= 0){
            System.out.println("Nenhum usuário cadastrado");
        }else {
            System.out.println("Usuário " + nome + "\n" + " Idade " + idade + "\n");
        }
    }

    @Override
    public void atualizarNome(String novoNome) {
        if (nome.equals("") || idade < 0){
            System.out.println("Nenhum usuário cadastrado para atualizar");
        } else {
            this.nome = novoNome;
            System.out.println("Nome atualizado com sucesso!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

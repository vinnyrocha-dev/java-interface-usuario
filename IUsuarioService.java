package br.com.vini.mod13.Interfaces.Usuario;

public interface IUsuarioService {
    public void cadastrarUsuario(String nome, int idade);
    public void mostrarUsuario();
    public void atualizarNome(String novoNome);

}

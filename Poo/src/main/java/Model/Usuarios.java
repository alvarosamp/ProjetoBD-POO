package Model;

public class Usuarios {
    private int id_usuario;
    private String nome;
    private String email;
    private int idade;
    private char sexo;
    private int altura;

    public Usuarios(int id_usuario, String nome, String email, int idade, char sexo, int altura) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
    }
}

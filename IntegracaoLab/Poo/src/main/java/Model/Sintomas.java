package Model;

public class Sintomas {
    private int id;
    private int id_usuario;
    private String descricao;
    private char intensidade;

    public Sintomas(int id, int id_usuario, String descricao, char intensidade) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.descricao = descricao;
        this.intensidade = intensidade;
    }
}

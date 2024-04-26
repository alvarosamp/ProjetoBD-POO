package Model;

import java.util.Date;

public class Historico_de_doenca {
    private int id;
    private int id_usuario;
    private String nome_doenca;
    private Date date;
    private String tratamento;

    public Historico_de_doenca(int id, int id_usuario, String nome_doenca, Date date, String tratamento) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.nome_doenca = nome_doenca;
        this.date = date;
        this.tratamento = tratamento;
    }
}

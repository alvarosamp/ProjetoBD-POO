package Model;

import java.sql.Date;

public class Consultas_medicas {
    private int id;
    private int id_usuario;

    private String motivo;
    private String resultado;

    public Consultas_medicas(int id, int id_usuario,  String motivo, String resultado) {
        this.id = id;
        this.id_usuario = id_usuario;

        this.motivo = motivo;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}

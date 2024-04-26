package Model;

import java.sql.Date;

public class Consultas_medicas {
    private int id;
    private int id_usuario;
    private Date date;
    private String motivo;
    private String resultado;

    public Consultas_medicas(int id, int id_usuario, Date date, String motivo, String resultado) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.date = date;
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

    public date getDate() {
        return date;
    }

    public void setDate(date date) {
        this.date = date;
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

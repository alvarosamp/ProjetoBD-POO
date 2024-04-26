package Model;

public class Medidas_biometricas {
    private int id;
    private int id_usuario;
    private int peso;
    private double pressao_arterial;
    private double saturacao;
    private int batimentos;

    public Medidas_biometricas(int id, int id_usuario, int peso, double pressao_arterial, double saturacao, int batimentos) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.peso = peso;
        this.pressao_arterial = pressao_arterial;
        this.saturacao = saturacao;
        this.batimentos = batimentos;
    }
}

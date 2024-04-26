package DAO.Connection;

import Model.Consultas_medicas;
import com.mysql.cj.jdbc.ConnectionImpl;
import jdk.internal.reflect.FieldAccessor;

import java.sql.SQLException;
import java.util.ArrayList;

public class DAOConsultas_Medicas extends Dao {
    boolean sucesso = false;



    public boolean insertConsulta(Consultas_medicas consulta) {
        this.connectToDB(); // Move the call here
        String sql = "INSERT INTO Consultas_medicas (id_usuario, motivo, resultado) VALUES (?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);
            this.pst.setInt(1, consulta.getId_usuario());
            this.pst.setString(2, consulta.getMotivo());
            this.pst.setString(3, consulta.getResultado());
            this.pst.execute();
            this.sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            this.sucesso = false;
        } finally {
            try {
                if (con != null) { // Check if connection exists before closing
                    this.con.close();
                }
                if (pst != null) { // Check if statement exists before closing
                    this.pst.close();
                }
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return this.sucesso;
    }

    //update
    public boolean updateMotivo(int id, String novoMotivo) {
        this.connectToDB();
        String sql = "UPDATE Consultas_medicas SET motivo=? WHERE id=?";

        try {
            pst = con.prepareStatement(sql);
            this.pst.setString(1, novoMotivo);
            this.pst.setInt(2, id);
            this.pst.execute();
            this.sucesso = true;
        } catch (SQLException var13) {
            System.out.println("Erro = " + var13.getMessage());
            this.sucesso = false;
        } finally {
            try {
                this.con.close();
                this.pst.close();
            } catch (SQLException var12) {
                System.out.println("Erro: " + var12.getMessage());
            }
        }

        return this.sucesso;
    }

    public boolean deleteConsulta(int id) {
        this.connectToDB();
        String sql = "DELETE FROM Consultas_medicas WHERE id=?";

        try {
            pst = con.prepareStatement(sql);
            this.pst.setInt(1, id);
            this.pst.execute();
            this.sucesso = true;
        } catch (SQLException var12) {
            System.out.println("Erro = " + var12.getMessage());
            this.sucesso = false;
        } finally {
            try {
                this.con.close();
                this.pst.close();
            } catch (SQLException var11) {
                System.out.println("Erro: " + var11.getMessage());
            }
        }

        return this.sucesso;
    }

    public ArrayList<Consultas_medicas> selectConsultas_medicas() {
        ArrayList<Consultas_medicas> consultasMedicas = new ArrayList<>();
        this.connectToDB();
        String sql = "SELECT * FROM Consultas_medicas";

        try {
            this.st = this.con.createStatement();
            this.rs = this.st.executeQuery(sql);
            System.out.println("Lista de consultas: ");

            while (rs.next()) {
                Consultas_medicas ConsultaAux = new Consultas_medicas(
                        rs.getInt("id"),
                        rs.getInt("id_usuario"),
                        rs.getString("motivo"),
                        rs.getString("resultado")
                );
                consultasMedicas.add(ConsultaAux);
            }

            this.sucesso = true;

        } catch (SQLException var12) {
            System.out.println("Erro: " + var12.getMessage());
            this.sucesso = false;
        } finally {
            // No need for resources to be closed here since handled in try block
        }

        return consultasMedicas;
    }

}

package DAO.Connection;
import  java.sql.*;
public class Dao {
    Connection con; //integracao
    PreparedStatement pst;//declaraçao da query preparada
    Statement st;//Declaração da query
    ResultSet rs;//Reposta do banco
    String database = "integracao";
    String user = "root";
    String password = "elainema157";
    String url = "jdbc:mysql://localhost:127.0.0.1:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";


    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao deu certo!");
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}

import DAO.Connection.DAOConsultas_Medicas;
import Model.Consultas_medicas;

public class Main {


        public static void main(String[] args) {

            DAOConsultas_Medicas consultaDAO = new DAOConsultas_Medicas();

            Consultas_medicas c1 = new Consultas_medicas(2178,3212,"27/09/2003","Dengue","Negativo");

            consultaDAO.insertAluno(c1);

            consultaDAO.selectAluno();

            consultaDAO.updateMotivo(2178, "Dor de cabeça");

            consultaDAO.selectAluno();

            consultaDAO.deleteConsulta(2178);

        }
    }


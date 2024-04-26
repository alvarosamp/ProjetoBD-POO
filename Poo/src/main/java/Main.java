import DAO.Connection.DAOConsultas_Medicas;
import Model.Consultas_medicas;

public class Main {


        public static void main(String[] args) {

            DAOConsultas_Medicas consultaDAO = new DAOConsultas_Medicas();

            Consultas_medicas c1 = new Consultas_medicas(2178,3212,"Dengue","Negativo");

            consultaDAO.insertConsulta(c1);


            consultaDAO.updateMotivo(2178, "Dor de cabeça");

            consultaDAO.selectConsultas_medicas();

            consultaDAO.deleteConsulta(2178);

        }
    }


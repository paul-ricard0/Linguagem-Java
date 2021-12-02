package atividades.uni08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection conec = null;
		
		try {
			
			// testar a carga do driver
			var nome = "org.h2.Driver";
			Class.forName(nome);
			
			// obter uma cone��o atrav�s do driver e o dirver manager
			var url = "jdbc:h2:file:~/NewtonDados/users";
			var user = "root";
			var pw = "";
			
			conec = DriverManager.getConnection(url, user, pw);
			System.out.println("INFO: conex�o iniciada com sucesso");
			
			// verificar se a conex�o foi bem sucedida
			System.out.println("Status "+!conec.isClosed());
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERRO: driver de conex�o n�o encontrado");
		}catch (SQLException e) {
			System.out.println("ERRO: n�o foi poss�vel conectar com banco - "+ e.getMessage());
		}finally {
			// encerrar a conex�o
			if(conec != null && !conec.isClosed()) {
				conec.close();
				System.out.println("INFO: conex�o encerrada com sucesso");
			}
			
		}
	}
}

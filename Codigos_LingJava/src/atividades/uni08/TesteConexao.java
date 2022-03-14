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
			
			// obter uma coneção através do driver e o dirver manager
			var url = "jdbc:h2:file:~/NewtonDados/users";
			var user = "root";
			var pw = "";
			
			conec = DriverManager.getConnection(url, user, pw);
			System.out.println("INFO: conexão iniciada com sucesso");
			
			// verificar se a conexão foi bem sucedida
			System.out.println("Status "+!conec.isClosed());
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERRO: driver de conexão não encontrado");
		}catch (SQLException e) {
			System.out.println("ERRO: não foi possível conectar com banco - "+ e.getMessage());
		}finally {
			// encerrar a conexão
			if(conec != null && !conec.isClosed()) {
				conec.close();
				System.out.println("INFO: conexão encerrada com sucesso");
			}
			
		}
	}
}

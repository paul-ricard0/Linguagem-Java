package atividades.uni08;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class TesteConexao02 {

	public static final String DRIVER = "org.h2.Driver";

	public static final String URL = "jdbc:h2:file:~/NewtonDados/users";
	public static final String USER = "root";
	public static final String PW = "";

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			// testar a carga do driver
			Class.forName(DRIVER);

			// obter uma coneção através do driver e o driver manager
			// conexão
			con = DriverManager.getConnection(URL, USER, PW);
			System.out.println("INFO: conexão iniciada com sucesso.");

			// verificar se a conexão foi bem sucedida
			System.out.println("Status " + !con.isClosed());

		} catch (ClassNotFoundException e) {
			System.out.println("ERRO: driver de conexão não encontrado.");
		} catch (SQLException e) {
			System.out.println("ERRO: não foi possível conectar com banco - " + e.getMessage());
		} finally {
			// encerrar a conexão
			if (con != null && !con.isClosed()) {
				con.close();
				System.out.println("INFO: conexão encerrada com sucesso.");
			}
		}

	}

	public static Connection obterConecao() throws Exception {
		Connection con = null;
		// testar a carga do driver
		Class.forName(DRIVER);

		// obter uma coneção através do driver e o driver manager
		// conexão
		con = DriverManager.getConnection(URL, USER, PW);
		System.out.println("INFO: conexão iniciada com sucesso.");

		return con;
	}
}
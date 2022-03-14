package atividades.uni08;

public class TesteSelect_Waldir {

	public static void main(String[] args) throws Exception {
		// obter conecao
		var con = TesteConexao02.obterConecao();
		
		// executar um sql
		var statement = con.createStatement();
		var sql = "select * from users";
		
		var resultado = statement.executeQuery(sql);
		
		// processar o resultado do sql		
		while (resultado.next()) { // iterador
			var id = resultado.getInt("id");
			var userName = resultado.getString("name");
			var pw = resultado.getString("password");
			
			System.out.println(id + " - " + userName + " - " + pw);
		}
		
		resultado.close();
		statement.close();
		
		// encerrar a conecao
		if (con != null && !con.isClosed()) {
			con.close();
		}
	}
}
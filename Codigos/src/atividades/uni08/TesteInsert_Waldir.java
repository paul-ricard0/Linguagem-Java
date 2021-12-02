package atividades.uni08;

import java.util.Scanner;

public class TesteInsert_Waldir {

	public static void main(String[] args) throws Exception {
		// obter a conex�o
		var con  = TesteConexao02.obterConecao();
		
		var sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do usu�rio:");
		var name = sc.nextLine();
		
		System.out.println("Digite a senha do usu�rio:");
		var pass = sc.nextLine();
		
		// preparar o sql
		var sql = "insert into users (name, password) values('" +name+ "', '"+pass+"')";
		var statement = con.createStatement();
		
		// executar
		var num = statement.executeUpdate(sql);
		
		// exibir o resultado
		System.out.println("tuplas afetadas: "+ num);

		// buscar o valor inserido
		System.out.println("\n\n Buscando os dados:\n");
		var sql2 = "select * from users";
		var rs = statement.executeQuery(sql2);
		
		while (rs.next()) {
			var id = rs.getInt("id");
			var userName = rs.getString("name");
			var pw = rs.getString("password");
			
			System.out.println(id + " - " + userName + " - " + pw);			
		}
		
		// encerrar a conex�o
		rs.close();
		statement.close();
		con.close();		
	}
}
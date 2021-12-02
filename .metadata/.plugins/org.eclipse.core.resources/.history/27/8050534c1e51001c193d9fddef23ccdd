package atividades.uni08;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteUpdate {
	static void select(Connection con) throws SQLException {
		var statement = con.createStatement();

		var sql = "select * from users";
		var resultado = statement.executeQuery(sql);

		if (resultado.next() == false) {
			System.out.println("Nenhum resultado encontrado.");
		} else {
			// processar o resultado do sql
			do { // iterador
				var entityId = resultado.getInt("id");
				var userName = resultado.getString("name");
				var pw = resultado.getString("password");

				System.out.println(entityId + " - " + userName + " - " + pw);
			} while (resultado.next());

			resultado.close();
			statement.close();
		}
	}

	static void selectPorId(Connection con, int id) throws SQLException {
		var statement = con.createStatement();

		var sql = "select * from users where id = " + id;
		var resultado = statement.executeQuery(sql);

		if (resultado.next() == false) {
			System.out.println("Nenhum resultado encontrado.");
		} else {
			// processar o resultado do sql
			do { // iterador
				var entityId = resultado.getInt("id");
				var userName = resultado.getString("name");
				var pw = resultado.getString("password");

				System.out.println(entityId + " - " + userName + " - " + pw);
			} while (resultado.next());

			resultado.close();
			statement.close();
		}
	}

	static void deletePorId(Connection con, int id) throws SQLException {
		var statement = con.createStatement();
		var sql = "delete from users where id = " + id;
		var res = statement.executeUpdate(sql);
		System.out.println("\nLinhas atualizadas: " + res);

		statement.close();
	}

	static void update(Connection con, String nome, String pw, int id) throws SQLException {
		var statement = con.createStatement();
		var sql = "update users set name = '" + nome + "', password = '" + pw + "' where id = " + id;

		var res = statement.executeUpdate(sql);
		System.out.println("\nLinhas atualizadas: " + res);

		statement.close(); // update		
	}
	
	static void criar(Connection con, String nome, String pw) throws SQLException {
		var statement = con.createStatement();
		var sql = "insert into users (name, password) values('" +nome+ "', '"+pw+"')";

		var res = statement.executeUpdate(sql);
		System.out.println("\nLinhas atualizadas: " + res);

		statement.close(); // update				
	}
	
	static void exibirMenu() {
		System.out.println("MENU: \n");
		System.out.println("1. Listagem");
		System.out.println("2. Obter por ID");
		System.out.println("3. Criar");
		System.out.println("4. Atualizar");
		System.out.println("5. Excluir");
		System.out.println("6. Sair\n");

		System.out.println("Selecione uma das opções acima:");
	}

	public static void main(String[] args) throws SQLException {

		int op = 0, id;
		Connection con = null;
		var sc = new Scanner(System.in);

		try {
			// obter conexão
			con = TesteConexao02.obterConecao();

			while (op != 6) {
				exibirMenu();
				op = Integer.parseInt(sc.nextLine());

				switch (op) {
				case 1: // listagem
					select(con);
					break;
				case 2: // obter por ID
					System.out.println("Informe o ID desejado:");
					id = Integer.parseInt(sc.nextLine());

					// recuperar um item
					selectPorId(con, id);
					break;
				case 3: // criar
					System.out.println("Novo nome: ");
					var nome2 = sc.nextLine();
					System.out.println("Nova senha: ");
					var pw2 = sc.nextLine();

					// criar no banco
					criar(con, nome2, pw2);
					
					break;
				case 4: // atualizar
					System.out.println("Informe o ID desejado:");
					id = Integer.parseInt(sc.nextLine());

					// recuperar um item
					selectPorId(con, id);

					System.out.println("Novo nome: ");
					var nome = sc.nextLine();
					System.out.println("Nova senha: ");
					var pw = sc.nextLine();

					// realizar um update
					update(con, nome, pw, id);
					
					break;
				case 5: // delete
					System.out.println("Informe o ID desejado:");
					id = Integer.parseInt(sc.nextLine());
					
					// recuperar um item
					selectPorId(con, id);
					
					System.out.println("\nConfirma a exclusão? (s/n)");
					var resp = sc.nextLine();
					
					if ("SsYy".contains(""+resp.charAt(0))) {
						deletePorId(con, id);
					}					
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		} finally {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		}
	}
}

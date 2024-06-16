package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
	
		//useSSL=true -> executa uma conexão segura
		final String url = "jdbc:mysql://localhost:?verifyServerCertificate=false&useSSL=true";
		final String usuario = "rhyann";
		final String senha = "c93m$20md%aksKMn#";
		
		Connection conexao = 
				DriverManager.
				getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso");
		conexao.close();
	}

}

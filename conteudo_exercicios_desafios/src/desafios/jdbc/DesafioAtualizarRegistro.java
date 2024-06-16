package desafios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class DesafioAtualizarRegistro {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		
		 // Estabelecendo conexão com o banco de dados
		Connection conexao = FabricaConexao.getConexao();

		//// Solicitando ao usuário o código da pessoa a ser atualizada
		System.out.println("Informe o códgio da pessoa: ");
		int codigo = entrada.nextInt();

		// Consulta SQL para selecionar o registro da pessoa pelo código
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		
		// Consulta SQL para atualizar o nome da pessoa pelo código
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		// Preparando e executando a consulta de seleção
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();

		// Verificando se a pessoa com o código informado existe
		if (resultado.next()) {
			
			// Criando um objeto Pessoa com os dados obtidos do banco de dados
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			// Exibindo o nome atual da pessoa
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();

			// Solicitando ao usuário o novo nome para a pessoa
			System.out.println("Informe o nome: ");
			String novoNome = entrada.nextLine();

			// Fechando o statement da consulta de seleção
			stmt.close();

			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();

			// Informando ao usuário que a pessoa foi alterada com sucesso
			System.out.println("Pessoa alterada com sucesso!");

		}
		else {
            // Informando ao usuário que o código da pessoa não foi encontrado
            System.out.println("Pessoa não encontrada com o código informado.");
        }

		// Fechando os recursos
		stmt.close();
		conexao.close();
		entrada.close();

	}

}

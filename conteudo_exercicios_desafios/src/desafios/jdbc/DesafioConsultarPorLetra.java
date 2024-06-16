package desafios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class DesafioConsultarPorLetra {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);

		// Criando a conexão com o banco de dados
		Connection conexao = FabricaConexao.getConexao();
		
		//Solicita a letra para o usuário
		System.out.println("Informe a letra inicial do usuário: ");
		String valorLetra = entrada.nextLine();
		
		// Definido a consulta
		String sql = "SELECT * FROM pessoas WHERE (nome) LIKE (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		 // Configurando o parâmetro da consulta com o valor fornecido pelo usuário,
        // adicionando os caracteres coringa '%' antes e depois do valor
        stmt.setString(1, "%" + valorLetra + "%");
		
        // Executando a consulta e obtendo os resultados
        ResultSet resultado = stmt.executeQuery();
        
     // Iterando sobre os resultados e imprimindo cada registro
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            System.out.println(codigo + "==>" + nome);
        }
        
        // Fechando os recursos 
        stmt.close();
        conexao.close();
        entrada.close();
	}

}

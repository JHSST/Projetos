package br.edu.idp.disciplinas.poo2023_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws SQLException {

        // 1. Habilitar o driver JDBC a partir da aplicação cliente;
        // ok

        // 2. Estabelecer uma conexão entre a aplicação cliente e servidor do banco de dados;
        String paramsConexao = "jdbc:h2:mem:testdb";
        String usuario = "";
        String senha = "";
        Connection conexao = DriverManager.getConnection(paramsConexao, usuario, senha);

        // 3. Montar e executar a consulta SQL desejada;
        String criacaoSql = "create table pessoa (id int primary key, nome varchar(150), qtdAcesso int, naturalidade varchar(75) )";
        Statement stmtC = conexao.createStatement();
        stmtC.executeUpdate(criacaoSql);
        stmtC.close();

        // Inserir duas pessoas no banco de dados
        inserirPessoa(conexao, 1, "João", 5, "Brasil");
        inserirPessoa(conexao, 2, "Maria", 3, "Portugal");

        String consulta = "select * from pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(consulta);

        // 4. Processar no cliente o resultado da consulta.
        while (resultado.next()) {
            String nome = resultado.getString("nome");
            Integer quantidade = resultado.getInt("qtdAcesso");
            String naturalidade = resultado.getString("naturalidade");

            // Criar um objeto Pessoa com os dados da consulta
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setQuantidadeAcesso(quantidade);
            pessoa.setNaturalidade(naturalidade);

            // Exibir os detalhes da pessoa
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Quantidade de Acessos: " + pessoa.getQuantidadeAcesso());
            System.out.println("Naturalidade: " + pessoa.getNaturalidade());
        }

        System.out.println("\nTchau, até a próxima\n\n\t\t:-)");
    }

    private static void inserirPessoa(Connection conexao, int id, String nome, int qtdAcesso, String naturalidade) throws SQLException {
        String insercaoSql = "insert into pessoa (id, nome, qtdAcesso, naturalidade) values (" + id + ", '" + nome + "', " + qtdAcesso + ", '" + naturalidade + "')";
        Statement stmt = conexao.createStatement();
        stmt.executeUpdate(insercaoSql);
        stmt.close();
    }
}

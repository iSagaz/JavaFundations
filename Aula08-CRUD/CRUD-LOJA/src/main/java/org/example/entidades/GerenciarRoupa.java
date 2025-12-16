package org.example.entidades;

import java.sql.*;

public class GerenciarRoupa {
    private final String url = "jdbc:mysql://localhost:3306/ESCOLA";
    private final String usuario = "root";
    private final String senha = "admin";

    //Metodo para conectar no banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    // METODO PARA CADASTRO
    public void cadastrarRoupa(Roupa roupa)  {

        String sql = "INSERT INTO LOJA(MARCA, TIPO, TAMANHOROUPA, QUANTIDADE, VALOR) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, roupa.getMarca());
            stmt.setString(2, roupa.getTipo());
            stmt.setString(3, roupa.getTamanho());
            stmt.setInt(4, roupa.getQuantidade());
            stmt.setDouble(5, roupa.getValor());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Roupa cadastrada com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void excluirRoupa(int id)  {
        String sql = "DELETE FROM Loja WHERE id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            System.out.println("Roupa excluida com sucesso!");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void alterarRoupa(int id, String marca, String tipo, String tamanhoroupa, int quantidade, double valor)  {

        String sql = "UPDATE Loja SET MARCA = ?, TIPO = ?, TAMANHOROUPA = ?, QUANTIDADE = ?, VALOR = ?, WHERE ID = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, tipo);
            stmt.setString(3, tamanhoroupa);
            stmt.setDouble(4, quantidade);
            stmt.setDouble(5, valor);
            stmt.setInt(6, id);
            stmt.executeUpdate();
            stmt.close();

            System.out.println("Roupa alterada com sucesso!");


        } catch (SQLException e)  {
            System.out.println(e.getMessage());
        }


    }
    public void listarRoupa()  {
        String sql = "SELECT * FROM loja";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        "|" + rs.getInt("id") + "|" +
                                rs.getString("marca") + "|" +
                                rs.getString("tipo") + "|" +
                                rs.getString("tamanhoroupa") + "|" +
                                rs.getInt("quantidade") + "|" +
                                rs.getDouble("valor") + "|" +
                                calcularQuantidade(rs.getInt("quantidade"), rs.getDouble("valor"))
                );
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private double calcularQuantidade(int quantidade, double valor) {
        return (quantidade * valor);
    }

}







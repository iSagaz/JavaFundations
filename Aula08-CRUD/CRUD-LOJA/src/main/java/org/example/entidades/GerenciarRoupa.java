package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

            System.out.println("Roupa cadastrada com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

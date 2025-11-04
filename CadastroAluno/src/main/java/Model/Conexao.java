package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EscolaDB;encrypt=false";
            String user = "sa";
            String password = "12340987"; // sua senha do SQL Server
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
        return con;
    }
}

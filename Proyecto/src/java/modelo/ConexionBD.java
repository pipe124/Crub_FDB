/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Configura tu conexión correctamente
    private static final String URL = "jdbc:mysql://localhost:3306/tienda_canasta_familiar?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Pipefelipe123"; // Asegúrate de escribir tu contraseña si aplica

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("✅ Conexión establecida correctamente.");
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("❌ No se encontró el Driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
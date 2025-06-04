package modelo;

import java.sql.*;
import java.util.*;

public class AdministradorDAO {

    // Método para obtener todos los administradores
    public List<Administrador> obtenerAdministradores() {
        List<Administrador> lista = new ArrayList<>();
        String sql = "SELECT * FROM administrador";

        try (Connection conn = ConexionBD.getConnection()) {
            if (conn == null) {
                System.out.println("❌ Conexión fallida en obtenerAdministradores.");
                return lista;
            }

            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Administrador admin = new Administrador();
                    admin.setId_administrador(rs.getInt("ID_administrador"));
                    admin.setNombre(rs.getString("nombre"));
                    admin.setCorreo(rs.getString("correo"));
                    admin.setContraseña(rs.getString("contraseña"));
                    lista.add(admin);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Método para insertar un nuevo administrador
    public void insertarAdministrador(Administrador admin) {
        String sql = "INSERT INTO administrador (nombre, correo, contraseña) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.getConnection()) {
            if (conn == null) {
                System.out.println("❌ Conexión fallida en insertarAdministrador.");
                return;
            }

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, admin.getNombre());
                stmt.setString(2, admin.getCorreo());
                stmt.setString(3, admin.getContraseña());
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

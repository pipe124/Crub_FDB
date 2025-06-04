<%-- 
    Document   : listas
    Created on : 3 jun 2025, 11:39:44 p.m.
    Author     : wendy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Administradores</title>
</head>
<body>
    <h2>Lista de Administradores</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Correo</th>
        </tr>
        <c:forEach var="administrador" items="${listaadministrador}">
            <tr>
                <td>${administrador.id_administrador}</td> <!-- CORREGIDO -->
                <td>${administrador.nombre}</td>
                <td>${administrador.correo}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>Agregar Nuevo Administrador</h3>
    <form action="IndexServlet" method="post">
        Nombre: <input type="text" name="nombre" required><br>
        Correo: <input type="email" name="correo" required><br>
        Contraseña: <input type="password" name="contraseña" required><br>
        <input type="submit" value="Agregar Administrador">
    </form>
</body>
</html>
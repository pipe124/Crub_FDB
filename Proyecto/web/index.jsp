<%-- 
    Document   : index
    Created on : 2 jun 2025, 5:14:15 p.m.
    Author     : wendy
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>CRUD de Administradores</title>
</head>
<body>
    <h2>Bienvenido al sistema de administración</h2>
    <ul>
        <li><a href="listas.jsp">📋 Listar administradores</a></li>
        <li><a href="insertar.jsp">➕ Agregar nuevo administrador</a></li>
    </ul>

    <h3>Lista de Administradores</h3>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Correo</th>
            <th>Contraseña</th>
        </tr>
        <c:forEach var="admin" items="${listaadministrador}">
            <tr>
                <td>${admin.idAdministrador}</td>
                <td>${admin.nombre}</td>
                <td>${admin.correo}</td>
                <td>${admin.contraseña}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
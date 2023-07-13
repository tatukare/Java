

<%@page import="java.util.List"%>
<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        <%
            List<Usuarios> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for (Usuarios usu: listaUsuarios) {       
        %>
        
                <p><b>Usuario # <%=cont%></b></p>
                <p>Cedula: <%=usu.getCedula()%> </p>
                <p>Nombre: <%=usu.getNombre()%> </p>
                <p>Apellido: <%=usu.getApellido()%> </p>
                <p>telefono: <%=usu.getTelefono()%> </p>
                <p>------------------------------------</p>
                <% cont = cont + 1; %>
        
        <% } %>
        
    </body>
</html>

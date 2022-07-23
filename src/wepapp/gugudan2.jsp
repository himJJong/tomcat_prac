<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    int num = (int)request.getAttribute("num");
    int limit = (int)request.getAttribute("limit");
%>

<h1><%=num%>단</h1>

<% for ( int i = 1; i <= limit; i++ ) { %>
<div><%=num%> * <%=i%> = <%=num * i%></div>
<% } %>
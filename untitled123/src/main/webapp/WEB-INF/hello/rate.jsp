<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Rate List</title>
</head>
<body>
<h2>Тарифы и абоненты:</h2>
<%-- Перебираем тарифы и отображаем их детали вместе с абонентами --%>
<c:forEach var="rate" items="${rates}">
    <h3>Тариф: ${rate.name} (Компания: ${rate.company.name})</h3>
    <p>Абоненты:</p>
    <ul>
        <%-- Перебираем абонентов, привязанных к текущему тарифу, и отображаем их данные --%>
        <c:forEach var="subscriber" items="${rate.subscribers}">
            <li>${subscriber.data} - ${subscriber.number} (Balance: ${subscriber.balance})</li>
        </c:forEach>
    </ul>
</c:forEach>
</body>
</html>

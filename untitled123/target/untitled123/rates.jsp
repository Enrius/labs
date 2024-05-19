<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Company Info</title>
</head>
<body>
    <h2>Company: ${company.name}</h2>

    <h3>Rates</h3>
    <ul>
        <c:forEach var="rate" items="${companyRates}">
            <li>${rate.name}</li>
        </c:forEach>
    </ul>

    <h3>Subscribers</h3>
    <ul>
        <c:forEach var="subscriber" items="${subscribers}">
            <li>ФИО: ${subscriber.data}, Номер телефона: ${subscriber.number}, Тариф: ${subscriber.rate.name}</li>
        </c:forEach>
    </ul>
</body>
</html>
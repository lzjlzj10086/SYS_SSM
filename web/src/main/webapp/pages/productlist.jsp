<%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/6/18
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:forEach items="${productlist}" var="product">
        ${product.productName}
        ${product.cityName}
        ${product.productStatusStr}
        ${product.departureTimeStr}
        <br>
    </c:forEach>
</head>
<body>

</body>
</html>

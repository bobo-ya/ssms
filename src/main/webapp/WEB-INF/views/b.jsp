<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/user/findUserByPage">分页</a>
${pageInfo.list[0].id}
${pageInfo.list[0].userName}


<ul >
    <li><a href="/user/findUserByPage?pn=${pageInfo.navigateFirstPage }">首页</a></li>
    <a href="/user/findUserByPage?pn=${pageInfo.pageNum-1}" aria-label="Previous">&laquo;</a>
    <c:forEach var="page_Num" items="${pageInfo.navigatepageNums }"> 
       <c:if test="${page_Num==pageInfo.pageNum }">
         <li class="active">
           <a href="/user/findUserByPage?pn=${page_Num }">${page_Num }</a>
         </li>
       </c:if>
       <c:if test="${page_Num==pageInfo.pageNum}">
         <li><a href="/user/findUserByPage?pn=${page_Num }" > ${page_Num } </a></li>
       </c:if>
    </c:forEach>
    <a href="/user/findUserByPage?pn=${pageInfo.pageNum+1}" aria-label="Next">&raquo;</a>            当前页+1
    <li><a href="/user/findUserByPage?pn=${pageInfo.navigateLastPage }">末页</a></li>
</ul>



    </body>
</html>
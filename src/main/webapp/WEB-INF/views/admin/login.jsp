<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/static/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="/static/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/static/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="/static/css/square/blue.css">

</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-box-body">
        <form action="/admin/tologin" method="post">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name = "userName" placeholder="UserName">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="Password" name = "password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <c:if test="${msg eq '用户名或密码错误'}">
                <div class="alert alert-info" role="alert" id="alert"> ${msg}</div>
                <br>
            </c:if>
            <div>
                <button type="submit" class="btn btn-success btn-block btn-flat">进入系统</button>
            </div>
        </form>
    </div>
</div>

<!-- jQuery 3 -->
<script src="/static/js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/static/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="/static/js/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
        $(".errordiv").fadeOut(3000);        //错误框淡出
    });
</script>


</body>
</html>


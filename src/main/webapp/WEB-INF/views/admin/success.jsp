<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>登录成功！</h1>
    <a href="#" class="find">查询所有用户</a>

    <!-- jQuery 3 -->
    <script src="/static/js/jquery.min.js"></script>
    <script type="text/javascript">
        $(".find").click(function () {
            $.ajax({
                type:"GET",
                url:"/user/findByPage",
                success:function (json) {
                    console.log(json);
                }
            });
        });
    </script>

</body>
</html>

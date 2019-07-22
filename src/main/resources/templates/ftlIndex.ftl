哈哈哈哈哈，这是我的第一个Fremarker文件：ftlIndex
<br><!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title>这是首页</title>
</head>
<body>
${name}<br>
${age}<br>
<#if sex="1"><br>
    男
<#else ><br>
女
</#if><br>

<#list userlist as user>
    ${user}<br>
</#list>
</body>
</html>


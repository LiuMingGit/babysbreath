<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <!-- 导入easyui的样式表 -->
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
    <link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;">
    <h1>满天星web部署系统</h1>
</div>
<div data-options="region:'south'" style="padding:5px;background:#eee;">
    系统版本：V1.0
</div>
<div data-options="region:'west'" style="width:200px;">
    <div id="menu" class="easyui-accordion">
        <div title="服务器管理" data-options="selected:true,iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'service-add'}">新增服务器</li>
                <li data-options="attributes:{'href':'item-add'}">新增程序部署位置</li>
                <li data-options="attributes:{'href':'item-list'}">查询服务器及文件所在位置情况</li>
                <li data-options="attributes:{'href':'item-param-list'}">规格参数</li>
            </ul>
        </div>
        <div title="程序部署" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'content-category'}">单文件部署</li>
                <li data-options="attributes:{'href':'content'}">多文件部署</li>
            </ul>
        </div>
    </div>
</div>
<div data-options="region:'center'" style="background:#eee;">
    <div id="tab" class="easyui-tabs" data-options="fit:true">
        <div title="欢迎页面" style="padding:20px;">开心每一天</div>
    </div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script src="js/moment/moment-with-locales.js"></script>
<script>
    moment.locale('zh-cn');
</script>
<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<!-- 自定义js -->
<script>
    babysbreath.registerMenuEvent();
</script>
</body>
</html>
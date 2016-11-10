<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- viewport的<meta>标签，这个标签可以修改在大部分的移动设备上面的显示，为了确保适当的绘制和触屏缩放。-->
<title>健康云首页</title>
<!--样式文件引用-->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.0/css/bootstrap-combined.min.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      
       <![endif]
IE9以下的浏览器并不支持这些标签，也不能为这些标签进行添加样式。那么修复这个问题我们需要链接引用的文件
意思就是说如果用户IE浏览器的版本小于IE9，那么就会加载这两个js文件库，现在就可以使用这些新的标签，并且可以在这些标签上添加样式了
-->
</head>
<body>
 <div class='navbar navbar-inverse'>
     <div class='nav-collapse' style="height: auto;">
          <ul class="nav">
               <li class="active"><a href="#">健康资讯</a></li>
               <li><a href="#">爱心互助</a></li>
               <li><a href="#">健康投资</a></li>
               <li><a href="#">APP下载</a></li>
          </ul>
     </div>
</div>
<!--JavaScript插件都是依赖与jQuery库-->
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>
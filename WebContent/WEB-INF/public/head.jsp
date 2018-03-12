<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>my jsp 'head.jsp' staring page</title>
<link rel="stylesheet" href="/myxiaonei/css/head.css" type="text/css"/>
<link rel="stylesheet" href="/myxiaonei/css/common.css" type="text/css"/>
<link rel="stylesheet" href="/myxiaonei/css/foot.css" type="text/css"/>

<script type="text/javascript">
		function changeBG(o){
			o.style.backgroundColor="#5C75AA";
		}
		function changeBG2(o){
			o.style.backgroundColor="";
		}
</script>
</head>
<body>
	<div class='head'>
	<img class='img1' src="/myxiaonei/images/front/top1.gif">
	<img class='img2' src="/myxiaonei/images/front/top2.jpg">
	<img  src="/myxiaonei/images/front/xnw3.jpg">
	<ul class="navi1">
		<li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="">注册</a></li>
		<li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="">设为首页</a></li>
		<li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="">加入收藏</a></li>
		<li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="">帮助</a></li>
	</ul>
	</div>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]>
<html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="">
<![endif]-->
<!--[if IE 7]>
<html class="no-js lt-ie9 lt-ie8" lang="">
<![endif]-->
<!--[if IE 8]>
<html class="no-js lt-ie9" lang="">
<![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="de">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>Histarantia</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="apple-touch-icon" href="${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.min.css">
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
<link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
<script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/zugriffsskala.js"></script>
<style>
.sortieren{
	cursor: pointer;
    border: none;
    color: black;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    border-radius: 10px;
    float: right;
}
</style>

</head>
<body>
	<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->
	<div class="header-container">
		<header class="wrapper clearfix"> 
		<nav> 
		<span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></span><span class="title">Zugriffsskala</span>
                <div id="mySidenav" class="sidenav side-nav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
			<a href="${pageContext.request.contextPath}/home/">Home</a> ^
			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
			<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
			<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
			<a class="active" href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
			<a href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
			<a href="${pageContext.request.contextPath}/faq/">FAQ</a>
		</div>
		</nav>
        <a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
    </header>
	</div>
	<div class="main-container">
		<div class="main wrapper clearfix">
			<section>
			<form method="get" action="${pageContext.request.contextPath}/lebensmittelsuche/">
				<div>
					<%@ page import="container.*"%>
					<%@ page import="datenbank.container.*"%>
					<%@ page import="java.util.ArrayList" %>
					<%  Zugriffsskalamanager tabelle = new Zugriffsskalamanager();
						tabelle.searchForString();
						out.println("<table id='zugriffsskala' class='table table-striped table-bordered' style='width:100%'>");
						out.println("<thead>"); 								
						out.println("<tr>");
 						out.println("<th>Platzierung<div class='sortieren'>SORTIEREN▼▲</div></th>");
 						out.println("<th>Lebensmittel<div class='sortieren'>SORTIEREN▼▲</div></th>");
 						out.println("<th>Karenzphase<div class='sortieren'>SORTIEREN▼▲</div></th>");
 						out.println("<th>Dauerernaehrung<div class='sortieren'>SORTIEREN▼▲</div></th>");
 						out.println("</tr>");
 						out.println("</thead>"); 
 						out.println("<tbody class='meineTabelle'>");
        		  			for(Zugriffsmanager zugriff : tabelle.getTabelle()) {
           		  				// System.out.println(zugriff); 

		 						out.println("<tr data-platzierung='"+zugriff.getPlatzierung()+"'>");
		 						out.println("<td>");
		 						out.println(zugriff.getPlatzierung()); 
		 						out.println("</td>");
		 						out.println("<td>");
		 						out.println(zugriff.getLname());
		 						out.println("</td>");
		 						out.println("<td>");
		 						out.println(zugriff.getKarenzphase());
		 						out.println("</td>");
		 						out.println("<td>");
		 						out.println(zugriff.getDauerernaehrung());
		 						out.println("</td>");
		 						out.println("</tr>");


           		  			}
	 						out.println("</tbody>");
	 						out.println("<tfoot>"); 
	 						out.println("<tr>");
	 						out.println("<th>Platzierung</th>");
	 						out.println("<th>Lebensmittel</th>");
	 						out.println("<th>Karenzphase</th>");
	 						out.println("<th>Dauerernaehrung</th>");
	 						out.println("</tr>");
	 						out.println("</tfoot>");
	 						out.println("</table>");
		               %>
				</div>
			</section>
			</from>
		</div>
		<!-- #main -->
	</div>
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
	<script src="${pageContext.request.contextPath}/js/main.js"></script>
	<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
	<script>
    (function (b, o, i, l, e, r) {
        b.GoogleAnalyticsObject = l;
        b[l] || (b[l] =
            function () {
                (b[l].q = b[l].q || []).push(arguments)
            });
        b[l].l = +new Date;
        e = o.createElement(i);
        r = o.getElementsByTagName(i)[0];
        e.src = '//www.google-analytics.com/analytics.js';
        r.parentNode.insertBefore(e, r)
    }(window, document, 'script', 'ga'));
    ga('create', 'UA-XXXXX-X', 'auto');
    ga('send', 'pageview');
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
	<link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/suchfilter.css/">
	<script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>

<body>
	<!-- die Seite Suchverlauf besteht aus einem header, nav, einem fieldset für die Sucheingabe
	und einer section für die möglichen Suchresultate -->
	<div class="header-container">
		<header class="wrapper clearfix">
			<div class="flex-grid-thirds">
				<div class="col menugrid">
					<span onclick="openNav()">&#9776;
					<span class="menutext">&nbsp;Menu</span>
				</div>
				<div class="col titlegrid">Suchfilter</div>
				<div class="col suchgrid">
					<a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
				</div>
			</div>
			<nav>
				<div id="mySidenav" class="sidenav side-nav">
					<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
					<a href="${pageContext.request.contextPath}/home/">Home</a>
					<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
					<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
					<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
					<a href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
					<a href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
					<a href="${pageContext.request.contextPath}/faq/">FAQ</a>
				</div>
			</nav>
		</header>
	</div>
	<div class="main-container">
		<form method="get" action="${pageContext.request.contextPath}/suchfilter/">
			<div class="main wrapper clearfix">
				<input id="suche" type="text" name="keyword" value="">
				<input class="link" type="submit" value="Suche" />
				<%@ page import="suchfilter.*"%>
				<%@ page import="controller.servlets.*"%>
				<%	if (request.getParameter("keyword") == null) {
						
					} else {
						Suchfilter suche = new Suchfilter(request.getParameter("keyword"));
						suche.search();
						if (suche.getSearcher().getSearchResults().isEmpty()) {
							out.println("Leider keine Suchergebnisse");
						} else {
							for (Searchresult result : suche.getSearcher().getSearchResults()) {
								result.prepareResult();
								for (ResultPreview preview : result.getPreviews()) {
									String url = "<a href=\"" + SuchfilterServlet.getContextPath() + "/" + preview.getUrl() + "/\">";
									out.println(url);
									out.println(preview.getUrl());
									out.println("</a>");
									out.println("<p>");
									out.println(preview.getMetaData());
									out.println("</p>");
								}
							}
						}
					}
				%>
			</div>
		</form>
		<!-- #main -->
	</div>
	<!-- javascript einbinden, um nav ein- und auszublenden-->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script>
		window.jQuery
			|| document
				.write(
					'<script src="${pageContext.request.contextPath}/js/vendor/jquery-1.11.2.min.js"><\/script>')
	</script>
	<script src="${pageContext.request.contextPath}/js/main.js"></script>
	<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
	<script>
				(function (b, o, i, l, e, r) {
					b.GoogleAnalyticsObject = l;
					b[l] || (b[l] = function () {
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
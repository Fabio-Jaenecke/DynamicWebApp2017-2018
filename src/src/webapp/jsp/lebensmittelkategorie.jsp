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
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
	<link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
	<script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/zugriffsskala.js"></script>
</head>

<body>
	<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
your browser</a> to improve your experience.</p>
<![endif]-->
	<div class="header-container">
		<header class="wrapper clearfix">
			<div class="flex-grid-thirds">
				<div class="col menugrid">
					<span onclick="openNav()">&#9776;
					<span class="menutext">&nbsp;Menu</span>
				</div>
				<div class="col titlegrid">Lebensmittel</div>
				<div class="col suchgrid">
					<a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
				</div>
			</div>
			<nav>
				<div id="mySidenav" class="sidenav side-nav">
					<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
					<a href="${pageContext.request.contextPath}/home/">Home</a>
					<a class="active" href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
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
		<div class="main wrapper clearfix">
			<article>
				<form method="get" action="${pageContext.request.contextPath}/lebensmittel/">
					<div>
						<h2>Lebensmittelliste</h2>

						<p>Hier werden alle Lebensmittel und ihre Werte fuer Karenzphase und Dauerernährung angezeigt.
							<br> Sie können die einzelnen Spalten sortieren, indem Sie auf die Pfeilsymbole klicken.
						</p>

						<table class='table_lebensmittelkategorie' style='margin-top: 30px;'>
							<thead>
								<tr>
									<th style="min-width: 180px">Lebensmittel
										<span class="sortierer">
											<label>
												<input type="submit" class="sorting" name="lebensmittelnameabsteigend" value="desc">▼</label>
											<label>
												<input type="submit" class="sorting" name="lebensmittelnameaufsteigend" value="asc">▲</label>
										</span>
									</th>
									<th style="min-width: 180px">Karenzphase
										<span class="sortierer">
											<label>
												<input type="submit" class="sorting" name="karenzphaseabsteigend" value="desc">▼</label>
											<label>
												<input type="submit" class="sorting" name="karenzphaseaufsteigend" value="asc">▲</label>
										</span>
									</th>
									<th style="min-width: 180px">Dauerernährung
										<span class="sortierer">
											<label>
												<input type="submit" class="sorting" name="dauerernaehrungabsteigend" value="desc">▼</label>
											<label>
												<input type="submit" class="sorting" name="dauerernaehrungaufsteigend" value="asc">▲</label>
										</span>
									</th>
								</tr>
							</thead>
							<%@ page import ="suche.*" %>
							<%@ page import="datenbank.container.*" %>
							<%@ page import="java.util.ArrayList" %>
							<%//CATCH EXCEPTIONS BLOCK1: lebensmittelnamenknoepfe:		
								String order = "asc"; // Die Standardsortierung
								String auswahl = "LName"; // Die Standardspalte
								if(request.getParameter("lebensmittelnameabsteigend")==null){
									//do nothing
								}else{
									order = request.getParameter("lebensmittelnameabsteigend");
									auswahl = "LName";
								}
								if(request.getParameter("lebensmittelnameaufsteigend")==null){
									//do nothing
								}else{
									order = request.getParameter("lebensmittelnameaufsteigend");
									auswahl = "LName";
								}
							
							//CATCH EXCEPTIONS BLOCK2: Karenzphaseknoepfe:	
								if(request.getParameter("karenzphaseabsteigend")==null){
									//do nothing
								}else{
									order = request.getParameter("karenzphaseabsteigend");
									auswahl = "Karenzphase";
								}
								if(request.getParameter("karenzphaseaufsteigend")==null){
									//do nothing
								}else{
									order = request.getParameter("karenzphaseaufsteigend");
									auswahl = "Karenzphase";
								}
								
							//CATCH EXCEPTIONS BLOCK3: Dauerernaehrungknoepfe:
								if(request.getParameter("dauerernaehrungabsteigend")==null){
									//do nothing
								}else{
									order = request.getParameter("dauerernaehrungabsteigend");
									auswahl = "Dauerernaehrung";
								}
								if(request.getParameter("dauerernaehrungaufsteigend")==null){
									//do nothing
								}else{
									order = request.getParameter("dauerernaehrungaufsteigend");
									auswahl = "Dauerernaehrung";
								}
								
							//Die Tabelle
								SucheListe sortierauftrag = new SucheListe();
								String abfrage = sortierauftrag.spaltenSortierer(auswahl, order);
								sortierauftrag.searchForString(abfrage);
								ArrayList<LebensmittelDaten> daten = sortierauftrag.getLebensmittel();
							%>
							<tbody>
								<%
								for(LebensmittelDaten lebensmitteleintrag : daten){
										out.println("<tr>");
										out.println("<td>");
										out.println(lebensmitteleintrag.getLname());
										out.println("</td>");
										out.println("<td>");
										out.println(lebensmitteleintrag.getKarenzphase());
										out.println("</td>");
										out.println("<td>");
										out.println(lebensmitteleintrag.getDauerernaehrung());
										out.println("</td>");
										out.println("</tr>");
									}
								// for the next category call we have to clear the arraylist of lebensmittel
								sortierauftrag.clearLebensmittel();
								%>
							</tbody>
						</table>
					</div>
				</form>
			</article>
			</article>
			<aside>
				<section>
					<a href="${pageContext.request.contextPath}/zugriffsskala/">
						<h3>Häufige Zugriffe</h3>
						<form method="get" action="${pageContext.request.contextPath}/lebensmittelsuche/">
							<div>
								<%@ page import="container.*"%>
								<%@ page import="datenbank.container.*"%>
								<%@ page import="java.util.ArrayList" %>
								<%  
									ZugriffsskalaManager tabelle = new ZugriffsskalaManager();
									tabelle.searchForString();
								%>
								<table id='zugriffsskala' class='table_beliebte_lebensmittel' style='width:100%'>
									<thead>
										<tr>
											<th>Platzierung</th>
											<th>Lebensmittel</th>
											<th>Karenzphase</th>
											<th>Dauerernährung</th>
										</tr>
									</thead>
									<tbody class='meineTabelle'>
										<%
											for(ZugriffsManager zugriff : tabelle.getTabelle()) {
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
										%>
									</tbody>
									<tfoot>
										<tr>
											<th>Platzierung</th>
											<th>Lebensmittel</th>
											<th>Karenzphase</th>
											<th>Dauerernährung</th>
										</tr>
									</tfoot>
								</table>
							</div>
						</form>
					</a>
				</section>
			</aside>
		</div>
		<!-- #main -->
	</div>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
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
<%-- TODO: JAVA-CODE richtig implementieren, bzw. DAO implementieren (Dann könnte die JSP Logik von hier übernommen werden --%>

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
    <link rel="apple-touch-icon" href="../imgs/apple-touch-icon.png">
    <link rel="stylesheet" href="../css/normalize.min.css">
    <link rel="stylesheet" href="../css/Main/main.css">
    <link rel="stylesheet" href="../css/Rest/lebensmittelkategorie.css">
    <link rel="shortcut icon" href="../imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="../imgs/favicon.ico" type="image/x-icon">
    <script src="../js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    <style>
		table.table_lebensmittelkategorie {display: <%out.println(request.getParameter("displaytable"));%>;}
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
            <span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></span><span class="title">FrÃ¼chte&nbsp;<span
                class="arrowdown">&#9662;</span></span>
            <div id="mySidenav" class="sidenav side-nav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
                <a href="${pageContext.request.contextPath}/home/">Home</a>
       			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
       			<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
       			<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
       			<a href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
       			<a class="active" href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
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
	            		<img src="../imgs/scrollbar.jpg" alt="scrollbar">
	            		<table>
	            		<tr>
	            			<td><h3>Suchfilter</h3></td>
	            			<td><h3>Kategorie</h3></td>
	            		</tr>
	            		</table>
	            		<h3>Kategorie</h3>
							  <select name="select">
			           			<option value="fleisch">Fleisch</option>
			           			<option value="obst">Obst</option>
			           			<option value="gemuese">Gemuese</option>
			           			<option value="huelsenfruechte">Huelsenfruechte</option>
			           			<option value="nuesseundsamen">Nuesse und Samen</option>
			           			<option value="fisch">Fisch</option>
			           			<option value="milchundmilchprodukte">Milch und Milchprodukte</option>
			           			<option value="sonstiges">Sonstiges</option>
			           		</select>
			           		<p></p>
	            			<input type="text" name="sucheintrag" value="" />
	            			<input type="submit" value="Suche" />
		           			  <%@ page import ="datenbank.container.*" %>
			           		  <%@ page import ="Suche.*" %>
			           		  <%
			           			String query = null;
			           		    String notfound = "";
			           		    String displaytable = "inline";
			           		    String resultat = null;
			           		    String lebensmittelname = "StringThatsNotInTheDB";
									if (request.getParameter("sucheintrag") == null) {
										//its not there
				                    
									}else{
										lebensmittelname = request.getParameter("sucheintrag");
										LebensmittelsucheDao suchauftrag = new LebensmittelsucheDao(lebensmittelname);
										resultat = suchauftrag.suche();
							  %>
		           			  <table class="table_lebensmittelkategorie">
			               		<tr>
				                    <th>Lebensmittel</th>
				                    <th>Karenzphase</th>
				                    <th>Dauerernaehrung</th>
				                </tr>
			 					<tr>
				 					<td>
				 					<%
				 					if (resultat.contains(lebensmittelname)){
				 						query = suchauftrag.getSelectSQL();
				 						out.println(suchauftrag.getGefundeneslebensmittel());
								    %>
				 					</td>
				 					<td>
				 					<%
				 					    out.println(suchauftrag.getKarenzphase());
									%>
				 					</td>
								    <td>
								    <%
				 					    out.println(suchauftrag.getDauerernaehrung());
									%>
								    <%
				 					}else{
				 						query = suchauftrag.getSelectSQL();
						            	notfound = "Ihre Suche ergab keine Treffer";
						            	displaytable = "none";
					               }
								   }
					               %>
								   </td>
			                    </tr>
			                </table>
	            		</div>
	            		<%
	                    	out.println(notfound); 
		                %>
	           		</form>
            </section>
    </div>
    <!-- #main -->
</div>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
<script src="../js/main.js"></script>
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
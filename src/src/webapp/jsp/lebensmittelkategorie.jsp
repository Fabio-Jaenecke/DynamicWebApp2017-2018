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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
	<style>
	input[type=submit]{
		display: none;
	}
	label{
		cursor: pointer;
	}
	span.sortierer{
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
    <header class="wrapper clearfix" style="max-height: 50px; padding-top: 15px;">
    	<div class="flex-grid-thirds">
						  <div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div>
						  <div class="col titlegrid">Lebensmittel</div>
						  <div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div>
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
	            		<h3>Lebensmittelliste</h3>
	            			
	            			<p>Hier werden alle Lebensmittel und ihre Werte für Karenzphase und Dauerernaehrung angezeigt.<br>
	            			Sie koennen die einzelnen Spalten sortieren, indem Sie auf die Pfeilsymbole klicken.
	            			</p>
    						
    						<table class='table_lebensmittelkategorie' style='margin-top: 30px;'>
	                             <thead>
	                                 <tr>
	                                    <th style="min-width: 180px">Lebensmittel
	                                    <span class="sortierer">
	                                    <label><input type="submit" name="lebensmittelnameabsteigend" value="desc">▼</label>
	                                    <label><input type="submit" name="lebensmittelnameaufsteigend" value="asc">▲</label>
	                                    </span>
	                                    </th>
	                                    <th style="min-width: 180px">Karenzphase
	                                    <span class="sortierer">
	                                    <label><input type="submit" name="karenzphaseabsteigend" value="desc">▼</label>
	                                    <label><input type="submit" name="karenzphaseaufsteigend" value="asc">▲</label>
	                                    </span>
	                                    </th>
	                                    <th style="min-width: 180px">Dauerernaehrung
	                                    <span class="sortierer">
	                                    <label><input type="submit" name="dauerernaehrungabsteigend" value="desc">▼</label>
	                                    <label><input type="submit" name="dauerernaehrungaufsteigend" value="asc">▲</label>
	                                    </span>
	                                    </th>
	                                 </tr>
	                              </thead>
			           		  <%@ page import ="suche.*" %>
			           		  <%@ page import="datenbank.container.*" %>
							  <%@ page import="java.util.ArrayList" %>
			           		  <%
			           	
			           	//CATCH EXCEPTIONS BLOCK1: lebensmittelnamenknoepfe:
			           		  
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
			           		SortiererDao sortierer = new SortiererDao();
			           		sortierer.searchForString(auswahl, order);
							ArrayList<LebensmittelDaten> daten = sortierer.getLebensmittel();
							//Die Standardtabelle weil sonst nichts angezeigt wuerde. Eigentlich braucht es diese nicht, aber die Seite waere dann leer
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
				        			sortierer.clearLebensmittel();
					                %>
					                </tbody>
				            </table>
	            		</div>
	           		</form>
				</article>
        </article>
        <aside>
            <h3>Häufige Zugriffe</h3>
            <table class="table_beliebte_lebensmittel">
                <thead>
                <tr>
                    <th rowspan="2">Platz</th>
                    <th rowspan="2">Lebensmittel</th>
                    <th colspan="2">Vertraeglichkeit</th>
                    <th rowspan="2">Zugriffe</th>
                </tr>
                <tr>
                    <th>KP</th>
                    <th>DE</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                   <td>1</td>
                    <td>Kartoffeln</td>
                    <td>gut</td>
                    <td>gut</td>
                    <td>100'000</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Brokkoli</td>
                    <td>gut</td>
                    <td>gut</td>
                    <td>80'000</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>Rindfleisch</td>
                    <td>gut</td>
                    <td>gut</td>
                    <td>70'000</td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>Mango</td>
                    <td>mittel</td>
                    <td>gut</td>
                    <td>60'000</td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>Kokosmilch</td>
                    <td>mittel</td>
                    <td>mittel</td>
                    <td>50'000</td>
                </tr>
                <tr>
                    <td>6</td>
                    <td>Bananen</td>
                    <td>schlecht</td>
                    <td>mittel</td>
                    <td>40'000</td>
                </tr>
                <tr>
                    <td>7</td>
                    <td>Sojaprodukte</td>
                    <td>schlecht</td>
                    <td>mittel</td>
                    <td>30'000</td>
                </tr>
                <tr>
                    <td>8</td>
                    <td>Bier</td>
                    <td>schlecht</td>
                    <td>schlecht</td>
                    <td>20'000</td>
                </tr>
                <tr>
                    <td>9</td>
                    <td>Eiweiss</td>
                    <td>schlecht</td>
                    <td>schlecht</td>
                    <td>10'000</td>
                </tr>
                </tbody>
            </table>
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
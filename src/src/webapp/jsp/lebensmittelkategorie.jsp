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
</head>
<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->
<div class="header-container">
    <header class="wrapper clearfix">
        <nav>
            <span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></span><span class="title">Lebensmittel</span>
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
        <a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
    </header>
</div>
<div class="main-container">
    <div class="main wrapper clearfix">
        <article>
       		<form method="get" action="${pageContext.request.contextPath}/lebensmittel/">
	            		<div>
	            		<h3>Lebensmittelliste</h3>
	            			
    						
    						<table class='table_lebensmittelkategorie' style='margin-top: 30px;'>
	                             <thead>
	                             	<tr>
	                                    <th><input type="submit" name="lebensmittelnameabsteigend" value="desc"> <input type="submit" name="lebensmittelnameaufsteigend" value="asc"></th>
	                                    <th><input type="submit" name="karenzphaseabsteigend" value="desc"><input type="submit" name="karenzphaseaufsteigend" value="asc"></th>
	                                    <th><input type="submit" name="dauerernaehrungabsteigend" value="desc"><input type="submit" name="dauerernaehrungaufsteigend" value="asc"></th>
	                                 </tr>
	                                 <tr>
	                                    <th>Lebensmittel</th>
	                                    <th>Karenzphase</th>
	                                    <th>Dauerernaehrung</th>
	                                 </tr>
	                              </thead>
			           		  <%@ page import ="suche.*" %>
			           		  <%@ page import="datenbank.container.*" %>
							  <%@ page import="java.util.ArrayList" %>
			           		  <%
			           	
			           	//CATCH EXCEPTIONS BLOCK1: lebensmittelnamenknoepfe:
			           		  
			           	String orderlebensmittelname = null;
			           	if(request.getParameter("lebensmittelnameabsteigend")==null){
			           		//donothing
			           	}else{
			           		orderlebensmittelname = request.getParameter("lebensmittelnameabsteigend");
			           	}
			           	if(request.getParameter("lebensmittelnameaufsteigend")==null){
			           		//donothing
			           	}else{
			           		orderlebensmittelname = request.getParameter("lebensmittelnameaufsteigend");
			           	}
			           	
			          	//CATCH EXCEPTIONS BLOCK2: Karenzphaseknoepfe:
		           		  
			           	String orderKarenzphase = null;
			           	if(request.getParameter("karenzphaseabsteigend")==null){
			           		//donothing
			           	}else{
			           		orderKarenzphase = request.getParameter("karenzphaseabsteigend");
			           	}
			           	if(request.getParameter("karenzphaseaufsteigend")==null){
			           		//donothing
			           	}else{
			           		orderKarenzphase = request.getParameter("karenzphaseaufsteigend");
			           	}
			           	
			          	//CATCH EXCEPTIONS BLOCK3: Dauerernaehrungknoepfe:
		           		  
			           	String orderDauerernaehrung = null;
			           	if(request.getParameter("dauerernaehrungabsteigend")==null){
			           		//donothing
			           	}else{
			           		orderDauerernaehrung = request.getParameter("dauerernaehrungabsteigend");
			           	}
			           	if(request.getParameter("dauerernaehrungaufsteigend")==null){
			           		//donothing
			           	}else{
			           		orderDauerernaehrung = request.getParameter("dauerernaehrungaufsteigend");
			           	}
			           	
			          	//Die Standardtabelle: Sortierung nach Lebensmittelname
			           					        			
					                
			           	if (request.getParameter("lebensmittelnameabsteigend")==null && request.getParameter("lebensmittelnameaufsteigend")==null){
			           		SortiererDao sortierer = new SortiererDao();
							
				           	
			           		
				           	sortierer.searchForString("LName", "asc");
				           	
				           	
				           	
							ArrayList<Lebensmitteldaten> daten = sortierer.getLebensmittel();
							//Die Standardtabelle weil sonst nichts angezeigt wuerde. Eigentlich braucht es diese nicht, aber die Seite waere dann leer
						    %>
						     
	                              <tbody>
					                <%
					                for(Lebensmitteldaten lebensmitteleintrag : daten){
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
			            <%
			            //Sonst schauen, ob order-variable gesetzt ist. Jetzt koennen wir die knoepfe druecken. Jedes mal, wenn ein knopf gedrueckt ist,
						//wird die Form abgesendet (die seite laedt neu). Je nach dem, welcher knopf gedrueckt wurde, enthaelt jeweils nur ein Parameter 
						//(Lname, Karenzphase oder Dauerernaehrung) einen wert entweder desc oder asc. Wird erneut ein Knopf gedrueckt, wird wiederum nur
						//der jeweilige Parameter gesetzt per Knopfdruck. Die Lebenszeit des Parameters besteht nur fuer jeweils einen Form-Submit.
						//Mit den obigen Exception-Blocks werden nur Variablen befüllt, die gedrueckt wurden, sonst sind sie einfach 'null' .
						//Das heisst, das nur ein Parameter jeweils 'not null' sein kann, diesen lassen wir jetzt per if bedingung in die Methode searchForString laden.
			           	}else{
			           	
			           	SortiererDao sortierer = new SortiererDao();
						
			           	if (orderlebensmittelname != null) {
							sortierer.searchForString("LName", orderlebensmittelname);
						}
						if (orderKarenzphase != null) {
							sortierer.searchForString("Karenzphase", orderKarenzphase);;
						}
			            if (orderDauerernaehrung != null) {          	
							sortierer.searchForString("Dauerernaehrung", orderDauerernaehrung);
						}
			
           	
			           	
						ArrayList<Lebensmitteldaten> daten = sortierer.getLebensmittel();
			            
					    %>
					     
                              <tbody>
				                
				                <%
				                for(Lebensmitteldaten lebensmitteleintrag : daten){
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
			        			}
				                %>
				                </tbody>
			            </table>
	            		</div>
	           		</form>
				</article>
        
        
        
            <%--
            
            <header>
                <h2>Definition von Frucht</h2>
                <p>Die Frucht (von lateinisch fructus) einer Pflanze ist die Gesamtheit der Organe, die aus einer Bluete
                    hervorgehen, und die die Pflanzensamen bis zu deren Reife umschliessen. Fruechte bilden prinzipiell
                    nur die Pflanzen, die einen geschlossenen Fruchtknoten besitzen (Bedecktsamer = Angiospermen) -
                    Wikipedia</p>
                <a href="https://de.wikipedia.org/wiki/Frucht">Mehr</a>
            </header>
            <section>
                <table class="table_lebensmittelkategorie">
                    <thead>
                        <tr>
                            <th>Nahrungsmittel</th>
                            <th>KP</th>
                            <th>DE</th>
                        </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Blaubeeren</td>
                        <td>gut</td>
                        <td>gut</td>
                    </tr>
                    <tr>
                        <td>Wassermelonen</td>
                        <td>gut</td>
                        <td>gut</td>
                    </tr>
                    <tr>
                        <td>Zuckermelone</td>
                        <td>gut</td>
                        <td>gut</td>
                    </tr>
                    <tr>
                        <td>Apfel</td>
                        <td>mittel</td>
                        <td>gut</td>
                    </tr>
                    <tr>
                        <td>Pfirsich</td>
                        <td>mittel</td>
                        <td>gut</td>
                    </tr>
                    <tr>
                        <td>Stachelbeeren</td>
                        <td>mittel</td>
                        <td>gut</td>
                    </tr>
                    <tr>
                        <td>Avocados</td>
                        <td>schlecht</td>
                        <td>mittel</td>
                    </tr>
                    <tr>
                        <td>Bananen</td>
                        <td>schlecht</td>
                        <td>mittel</td>
                    </tr>
                    <tr>
                        <td>Erdbeeren</td>
                        <td>schlecht</td>
                        <td>mittel</td>
                    </tr>
                    </tbody>
                </table>
            </section>
            <section class="table_legend"> <!--IDEE: Legende nur anzeigen bei mobiler Ansicht-->
                <h3 class="title_legende">Legende:</h3>
                <ul class="legende">
                    <li>KP = Karenzphase</li>
                    <li>DE = Dauerernaehrung</li>
                </ul>
            </section>
            
            --%>
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
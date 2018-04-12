<!-- TODO: Refactor JSP and make use of MahlzeitassistentServlet for the Java code. -->

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
    
    <link rel="stylesheet" href="../css/Rest/mahlzeitassistent.css">

    <link rel="shortcut icon" href="../imgs/favicon.ico" type="image/x-icon">

    <link rel="icon" href="../imgs/favicon.ico" type="image/x-icon">

    <script src="../js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
	
</head>

<body>

<!--[if lt IE 8]>

<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade

    your browser</a> to improve your experience.</p>

<![endif]-->

<div class="header-container">

    <header class="wrapper clearfix">

        <nav>

            <span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></span><span class="title">Assistent</span>

            <div id="mySidenav" class="sidenav side-nav">

                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>

                <a href="${pageContext.request.contextPath}/home/">Home</a>

       			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>

       			<a class="active" href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>

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

                <h2>Mahzeitsassistent</h2>

                <p>Hier können Sie Ihre Mahlzeiten schön und leicht selber konfigurieren.</p>                

        </article>

		<article style="min-width:100%;">
            	<em>Anleitung:</em>
            	<ol>
            		<li>Waehlen Sie zwischen dem Assisten für Lebensmittelkategorien oder für Naehrstoffe.</li>
            		<% if (request.getParameter("radiobutton") == null) {/*its not there*/}else if(request.getParameter("radiobutton").equals("kategorienframe")){out.println("<li>Waehlen Sie drei Lebensmittelkategorien aus der jeweiligen Auswahlliste aus.</li>");%>
            	    <% out.println("<li>Druecken Sie auf 'Mahlzeit erstellen'</li>");}%>
            	    <% if (request.getParameter("radiobutton") == null) {/*its not there*/}else if(request.getParameter("radiobutton").equals("naehrstoffeframe")){out.println("<li>Waehlen Sie drei Naehrstoffkategorien aus der jeweiligen Auswahlliste aus.</li>");%>
            	    <% out.println("<li>Druecken Sie auf 'Mahlzeit erstellen'</li>");}%>
            	    <% if (request.getParameter("button_clicked") == null) {/*its not there*/}else if ("Mahlzeit erstellen".equals(request.getParameter("button_clicked"))){out.println("<li>Sie erhalten einen Teller mit vorgeschlagenen Lebensmitteln</li>");} %>
            	</ol>
            </article>
      </div>
      <div class="main wrapper clearfix">
			<form method="get" action="${pageContext.request.contextPath}/mahlzeitassistent/">
			    <input  type="radio" name="radiobutton"  id="kategorien" value="kategorienframe" <%if (request.getParameter("radiobutton") == null) {/*its not there*/} else if (request.getParameter("radiobutton").equals("kategorienframe")){out.println("checked");} %> onclick="this.form.submit()"/>
				<label style="cursor:pointer;" for="kategorien">Kategorien</label><br>
				<input type="radio"  name="radiobutton" id="naehrstoffe" value="naehrstoffeframe" <%if (request.getParameter("radiobutton") == null) {/*its not there*/} else if (request.getParameter("radiobutton").equals("naehrstoffeframe")){out.println("checked");} %> onclick="this.form.submit()"/>
				<label style="cursor:pointer;" for="naehrstoffe">Naehrstoffe</label><br>
			<%
			if (request.getParameter("radiobutton") == null) {/*its not there*/
				} else if(request.getParameter("radiobutton").equals("kategorienframe")) {
					out.println("<div id='kategorienframe'>");
					%>
					     <section class="mahlzeitassistent">
											<%@ page import="datenbank.container.*" %>
					
											<%@ page import="suche.*" %>
					
											<%@ page import="java.util.ArrayList" %>
											<div class='selektiereDrittel erstesDrittel'>
											<img src="../imgs/thirdcircle.png" alt="thirdcircle" class="rotate0">
											<select name='kategorieauswahl' class="dropdown1drittel">
					
													<option value="" disabled selected>Wählen Sie eine Kategorie</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Fleisch")){out.println("selected");} %> value="Fleisch">Fleisch</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Obst")){out.println("selected");} %> value="Obst">Obst</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Gemuese")){out.println("selected");} %> value="Gemuese">Gemuese</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Huelsenfruechte")){out.println("selected");} %> value="Huelsenfruechte">Huelsenfruechte</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Nuesse und Samen")){out.println("selected");} %> value="Nuesse und Samen">Nuesse und Samen</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Fisch")){out.println("selected");} %> value="Fisch">Fisch</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Milch und Milchprodukte")){out.println("selected");} %> value="Milch und Milchprodukte">Milch und Milchprodukte</option>
					
											</select>
											</div>
											<div class='zeigeDrittel zeigeErstesDrittel'>
											<%
										
											String kategorienname = "";
					
											if (request.getParameter("kategorieauswahl") == null) {
					
												out.println("&#8598;wähle");
					
											}else{
					
												kategorienname = request.getParameter("kategorieauswahl");
					
												KategoriensucheDao kategorieauftrag = new KategoriensucheDao();
					
												kategorieauftrag.searchForString(kategorienname);
					
												ArrayList<Lebensmitteldaten> daten = kategorieauftrag.getLebensmittel();
												
												//give a result if a Lebensmittel has either karenzphase or dauerernaehrug gut
												boolean gefunden = false;
												for(Lebensmitteldaten lebensmitteleintrag : daten){	
													if((lebensmitteleintrag.getKarenzphase().toString().equals("gut") && gefunden==false) || (lebensmitteleintrag.getDauerernaehrung().toString().equals("gut") && gefunden==false)){
														out.println(lebensmitteleintrag.getLname());
														gefunden = true;
													}
												}	
												//if nothing is found:
												if (gefunden==false){
													out.println("empty");
												}
					
												// for the next category call we have to clear the arraylist of lebensmittel
												kategorieauftrag.clearLebensmittel();
											}
					
											%>
											</div>
											<div class='selektiereDrittel zweitesDrittel'>
											<img src="../imgs/thirdcircle.png" alt="thirdcircle" class='rotate120'>
											<select name='kategorieauswahl2' class="dropdown2drittel">
					
													<option value="" disabled selected>Wählen Sie eine Kategorie</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Fleisch")){out.println("selected");} %> value="Fleisch">Fleisch</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Obst")){out.println("selected");} %> value="Obst">Obst</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Gemuese")){out.println("selected");} %> value="Gemuese">Gemuese</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Huelsenfruechte")){out.println("selected");} %> value="Huelsenfruechte">Huelsenfruechte</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Nuesse und Samen")){out.println("selected");} %> value="Nuesse und Samen">Nuesse und Samen</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Fisch")){out.println("selected");} %> value="Fisch">Fisch</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl2") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl2").equals("Milch und Milchprodukte")){out.println("selected");} %> value="Milch und Milchprodukte">Milch und Milchprodukte</option>
					
											</select>
											</div>
											<div class='zeigeDrittel zeigeZweitesDrittel'>
											<%
										
											String kategorienname2 = "";
					
											if (request.getParameter("kategorieauswahl2") == null) {
					
												out.println("wähle&#8599;");
					
											
					
											}else{
					
												kategorienname2 = request.getParameter("kategorieauswahl2");
					
												KategoriensucheDao kategorieauftrag2 = new KategoriensucheDao();
					
												kategorieauftrag2.searchForString(kategorienname2);
					
												ArrayList<Lebensmitteldaten> daten2 = kategorieauftrag2.getLebensmittel();
												
												//give a result if a Lebensmittel has either karenzphase or dauerernaehrug gut
												boolean gefunden = false;
												for(Lebensmitteldaten lebensmitteleintrag : daten2){	
													if((lebensmitteleintrag.getKarenzphase().toString().equals("gut") && gefunden==false) || (lebensmitteleintrag.getDauerernaehrung().toString().equals("gut") && gefunden==false)){
														out.println("<div class='assistentenfeld'>");
														out.println(lebensmitteleintrag.getLname());
														out.println("</div>");
														gefunden = true;
													}
													
												}
												//if nothing is found:
												if (gefunden==false){
													out.println("emtpy");
												}
					
												// for the next category call we have to clear the arraylist of lebensmittel
												kategorieauftrag2.clearLebensmittel();
											}
					
											%>
											</div>
											<div class='selektiereDrittel drittesDrittel'>
											<img src="../imgs/thirdcircle.png" alt="thirdcircle" class='rotate240'>
											<select name='kategorieauswahl3' class="dropdown3drittel">
					
													<option value="" disabled selected>Wählen Sie eine Kategorie</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Fleisch")){out.println("selected");} %> value="Fleisch">Fleisch</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Obst")){out.println("selected");} %> value="Obst">Obst</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Gemuese")){out.println("selected");} %> value="Gemuese">Gemuese</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Huelsenfruechte")){out.println("selected");} %> value="Huelsenfruechte">Huelsenfruechte</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Nuesse und Samen")){out.println("selected");} %> value="Nuesse und Samen">Nuesse und Samen</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Fisch")){out.println("selected");} %> value="Fisch">Fisch</option>
					
								           			<option <%if (request.getParameter("kategorieauswahl3") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl3").equals("Milch und Milchprodukte")){out.println("selected");} %> value="Milch und Milchprodukte">Milch und Milchprodukte</option>
					
											</select>
											</div>
											<div class='zeigeDrittel zeigeDrittesDrittel'>
											<%
										
											String kategorienname3 = "";
					
											if (request.getParameter("kategorieauswahl3") == null) {
					
												out.println("&#8595;wähle");
											
											}else{
					
												kategorienname3 = request.getParameter("kategorieauswahl3");
					
												KategoriensucheDao kategorieauftrag3 = new KategoriensucheDao();
					
												kategorieauftrag3.searchForString(kategorienname3);
					
												ArrayList<Lebensmitteldaten> daten3 = kategorieauftrag3.getLebensmittel();
												
												//give a result if a Lebensmittel has either karenzphase or dauerernaehrug gut
												boolean gefunden = false;
												for(Lebensmitteldaten lebensmitteleintrag : daten3){	
													if((lebensmitteleintrag.getKarenzphase().toString().equals("gut") && gefunden==false) || (lebensmitteleintrag.getDauerernaehrung().toString().equals("gut") && gefunden==false)){
														out.println(lebensmitteleintrag.getLname());
														gefunden = true;
													}
													
												}	
												//if nothing is found:
												if (gefunden==false){
													out.println("empty");
												}
					
												// for the next category call we have to clear the arraylist of lebensmittel
												kategorieauftrag3.clearLebensmittel();
											}
											%>
											</div>
											<div>
											<input type='submit' name='button_clicked' value='Mahlzeit erstellen' class='erstelleMahlzeit'>
											</div>
									
								</section>	       
					<%
					
					out.println("</div>");
				} else if(request.getParameter("radiobutton").equals("naehrstoffeframe")) {
					out.println("<div id='naehrstoffeframe'>");
					%>
					<section class="mahlzeitassistent">
											<%@ page import="datenbank.container.*" %>
					
											<%@ page import="suche.*" %>
					
											<%@ page import="java.util.ArrayList" %>
											
											<div class='selektiereDrittel erstesDrittel'>
											<img src="../imgs/thirdcircleyellow.png" alt="thirdcircleyellow" class="rotate0">
											<select name='naehrstoffauswahl' class="dropdown1drittel">
					
													<option value="" disabled selected>Wählen Sie einen Naehrstoff</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl").equals("Proteine")){out.println("selected");} %> value="Proteine">Proteine</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl").equals("Staerkebeilage")){out.println("selected");} %> value="Staerkebeilage">Staerkebeilage</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl").equals("Vitamine")){out.println("selected");} %> value="Vitamine">Vitamine</option>
					
											</select>
											</div>
											<div class='zeigeDrittel zeigeErstesDrittel'>
											<%
										
											String naehrstoffname = "";
					
											if (request.getParameter("naehrstoffauswahl") == null) {
					
												out.println("&#8598;wähle");
					
											}else{
					
												naehrstoffname = request.getParameter("naehrstoffauswahl");
					
												NaehrstoffsucheDao naehrstoffauftrag = new NaehrstoffsucheDao();
					
												naehrstoffauftrag.searchForString(naehrstoffname);
					
												ArrayList<Lebensmitteldaten> daten = naehrstoffauftrag.getLebensmittel();
												
												//give a result if a Lebensmittel has either karenzphase or dauerernaehrug gut
												boolean gefunden = false;
												for(Lebensmitteldaten lebensmitteleintrag : daten){	
													if((lebensmitteleintrag.getKarenzphase().toString().equals("gut") && gefunden==false) || (lebensmitteleintrag.getDauerernaehrung().toString().equals("gut") && gefunden==false)){
														out.println(lebensmitteleintrag.getLname());
														gefunden = true;
													}
												}	
												//if nothing is found:
												if (gefunden==false){
													out.println("empty");
												}
					
												// for the next category call we have to clear the arraylist of lebensmittel
												naehrstoffauftrag.clearLebensmittel();
											}
					
											%>
											</div>
											<div class='selektiereDrittel zweitesDrittel'>
											<img src="../imgs/thirdcircleyellow.png" alt="thirdcircleyellow" class='rotate120'>
											<select name='naehrstoffauswahl2' class="dropdown2drittel">
					
													<option value="" disabled selected>Wählen Sie einen Naehrstoff</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl2") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl2").equals("Proteine")){out.println("selected");} %> value="Proteine">Proteine</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl2") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl2").equals("Staerkebeilage")){out.println("selected");} %> value="Staerkebeilage">Staerkebeilage</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl2") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl2").equals("Vitamine")){out.println("selected");} %> value="Vitamine">Vitamine</option>
					
											</select>
											</div>
											<div class='zeigeDrittel zeigeZweitesDrittel'>
											<%
										
											String naehrstoffname2 = "";
														
											if (request.getParameter("naehrstoffauswahl2") == null) {
					
												out.println("wähle&#8599;");
					
											
					
											}else{
					
												naehrstoffname2 = request.getParameter("naehrstoffauswahl2");
					
												NaehrstoffsucheDao naehrstoffauftrag2 = new NaehrstoffsucheDao();
					
												naehrstoffauftrag2.searchForString(naehrstoffname2);
					
												ArrayList<Lebensmitteldaten> daten2 = naehrstoffauftrag2.getLebensmittel();
												
												//give a result if a Lebensmittel has either karenzphase or dauerernaehrug gut
												boolean gefunden = false;
												for(Lebensmitteldaten lebensmitteleintrag : daten2){	
													if((lebensmitteleintrag.getKarenzphase().toString().equals("gut") && gefunden==false) || (lebensmitteleintrag.getDauerernaehrung().toString().equals("gut") && gefunden==false)){
														out.println(lebensmitteleintrag.getLname());
														gefunden = true;
													}
												}	
												//if nothing is found:
												if (gefunden==false){
													out.println("empty");
												}
					
												// for the next category call we have to clear the arraylist of lebensmittel
												naehrstoffauftrag2.clearLebensmittel();
											}
					
											%>
											</div>
											<div class='selektiereDrittel drittesDrittel'>
											<img src="../imgs/thirdcircleyellow.png" alt="thirdcircleyellow" class='rotate240'>
											<select name='naehrstoffauswahl3' class="dropdown3drittel">
					
													<option value="" disabled selected>Wählen Sie einen Naehrstoff</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl3") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl3").equals("Proteine")){out.println("selected");} %> value="Proteine">Proteine</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl3") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl3").equals("Staerkebeilage")){out.println("selected");} %> value="Staerkebeilage">Staerkebeilage</option>
					
								           			<option <%if (request.getParameter("naehrstoffauswahl3") == null) {/*its not there*/} else if (request.getParameter("naehrstoffauswahl3").equals("Vitamine")){out.println("selected");} %> value="Vitamine">Vitamine</option>
					
											</select>
											</div>
											<div class='zeigeDrittel zeigeDrittesDrittel'>
											<%
										
											String naehrstoffname3 = "";
					
											if (request.getParameter("naehrstoffauswahl3") == null) {
					
												out.println("&#8595;wähle");
					
											
					
											}else{
					
												naehrstoffname3 = request.getParameter("naehrstoffauswahl3");
					
												NaehrstoffsucheDao naehrstoffauftrag3 = new NaehrstoffsucheDao();
					
												naehrstoffauftrag3.searchForString(naehrstoffname3);
					
												ArrayList<Lebensmitteldaten> daten3 = naehrstoffauftrag3.getLebensmittel();
												
												//give a result if a Lebensmittel has either karenzphase or dauerernaehrug gut
												boolean gefunden = false;
												for(Lebensmitteldaten lebensmitteleintrag : daten3){	
													if((lebensmitteleintrag.getKarenzphase().toString().equals("gut") && gefunden==false) || (lebensmitteleintrag.getDauerernaehrung().toString().equals("gut") && gefunden==false)){
														out.println(lebensmitteleintrag.getLname());
														gefunden = true;
													}
												}	
												//if nothing is found:
												if (gefunden==false){
													out.println("empty");
												}
					
												// for the next category call we have to clear the arraylist of lebensmittel
												naehrstoffauftrag3.clearLebensmittel();
											}
											%>
											</div>
											<div>
											<input type='submit' name='button_clicked' value='Mahlzeit erstellen' class='erstelleMahlzeit'>
											</div>
									
								</section>	
					<%
				}
			
			%>
			</form>
		</div>
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
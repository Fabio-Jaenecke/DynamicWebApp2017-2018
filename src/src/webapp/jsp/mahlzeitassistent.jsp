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
	.mahlzeitassistent{
		position: relative;
		margin-top: -200px;
		margin-left: auto;
		margin-right: auto;
	}
	
	.dropdown1drittel{
		position: absolute;
		left: -180px;
		top: 80px;
	}
	
	.dropdown2drittel{
		position: absolute;
		left: 200px;
		top: 88px;
		
	}
	
	.dropdown3drittel{
		position: absolute;
		top: 240px;
		left: 5px;
	    
	}
	
	.erstesDrittel{
		position: absolute;
		left: 200px;
		top: 150px;
	}
	
	.zweitesDrittel{
		position: absolute;
		left: 400px;
		top: 143px;
	}
		
	.drittesDrittel{
		position: absolute;
		left: 305px;
		top: 320px;
	}
	
	.rotate120 {
			-webkit-transform: rotate(120deg);
			-moz-transform: rotate(120deg);
			-o-transform: rotate(120deg);
			-ms-transform: rotate(120deg);
			transform: rotate(120deg);
	}
	.rotate240{
			-webkit-transform: rotate(240deg);
			-moz-transform: rotate(240deg);
			-o-transform: rotate(240deg);
			-ms-transform: rotate(240deg);
			transform: rotate(240deg);
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

            <header>

                <h2>Mahzeitsassistent</h2>

                <p>Hier könne Sie bald Ihre Mahlzeiten schön und leicht selber konfigurieren.</p>

                

            </header>



        </article>

        

    </div>

	<div class="main-container">
		<div class="main wrapper clearfix">
		
            <section class="mahlzeitassistent">
	            <form method="get" action="${pageContext.request.contextPath}/mahlzeitassistent/">
						<%@ page import="datenbank.container.*" %>

						<%@ page import="Suche.*" %>

						<%@ page import="java.util.ArrayList" %>
						
						<div class='selektiereLebensmittelDrittel erstesDrittel'>
						<img src="../imgs/thirdcircle.png" alt="thirdcircle" class="rotate0">
						<select onchange="<%out.println("name='kategorieauswahl'");%>" class="dropdown1drittel">

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
						<div class='zeigeLebensmittelDrittel erstesDrittel1'>
						<%
					
						String kategorienname = "";

						ArrayList<Lebensmitteldaten> kategorieresultate = new ArrayList<>();

						if (request.getParameter("kategorieauswahl") == null) {

							//Technically, this is not required:

							//out.println("input field could not be validated");

						

						}else{

							kategorienname = request.getParameter("kategorieauswahl");

							KategoriensucheDao kategorieauftrag = new KategoriensucheDao();

							kategorieauftrag.searchForString(kategorienname);

							ArrayList<Lebensmitteldaten> daten = kategorieauftrag.getLebensmittel();
							
							for(Lebensmitteldaten lebensmitteleintrag : daten){
								boolean gefunden=false;
								if((gefunden==false && lebensmitteleintrag.getKarenzphase()=="mittel") || (gefunden==false && lebensmitteleintrag.getKarenzphase()=="gut")){
									out.println("<table>");
									out.println("<tr>");
									out.println("<td>");
									out.println(lebensmitteleintrag.getLname());
									out.println("</td>");
									out.println("</tr>");
									out.println("</table>");
									gefunden=true;
								}
							}	

							// for the next category call we have to clear the arraylist of lebensmittel
							kategorieauftrag.clearLebensmittel();
						}

						%>
						</div>
						<div class='selektiereLebensmittelDrittel zweitesDrittel'>
						<img src="../imgs/thirdcircle.png" alt="thirdcircle" class='rotate120'>
						<select onchange="<%out.println("name='kategorieauswahl2'");%>" class="dropdown2drittel">

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
						<div class='zeigeLebensmittelDrittel zweitesDrittel2'>
						<%
					
						String kategorienname2 = "";

						ArrayList<Lebensmitteldaten> kategorieresultate2 = new ArrayList<>();

						if (request.getParameter("kategorieauswahl2") == null) {

							//Technically, this is not required:

							//out.println("input field could not be validated");

						

						}else{

							kategorienname2 = request.getParameter("kategorieauswahl2");

							KategoriensucheDao kategorieauftrag2 = new KategoriensucheDao();

							kategorieauftrag2.searchForString(kategorienname2);

							ArrayList<Lebensmitteldaten> daten2 = kategorieauftrag2.getLebensmittel();
							
							for(Lebensmitteldaten lebensmitteleintrag : daten2){
								boolean gefunden=false;
								if((gefunden==false && lebensmitteleintrag.getKarenzphase()=="mittel") || (gefunden==false && lebensmitteleintrag.getKarenzphase()=="gut")){
									out.println(lebensmitteleintrag.getLname());
									gefunden=true;
								}
							}

							// for the next category call we have to clear the arraylist of lebensmittel
							kategorieauftrag2.clearLebensmittel();
						}

						%>
						</div>
						<div class='selektiereLebensmittelDrittel drittesDrittel'>
						<img src="../imgs/thirdcircle.png" alt="thirdcircle" class='rotate240'>
						<select onchange="<%out.println("name='kategorieauswahl3'");%>" class="dropdown3drittel">

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
						<div class='zeigeLebensmittelDrittel drittesDrittel'>
						<%
					
						String kategorienname3 = "";

						ArrayList<Lebensmitteldaten> kategorieresultate3 = new ArrayList<>();

						if (request.getParameter("kategorieauswahl3") == null) {

							//Technically, this is not required:

							//out.println("input field could not be validated");

						

						}else{

							kategorienname3 = request.getParameter("kategorieauswahl3");

							KategoriensucheDao kategorieauftrag3 = new KategoriensucheDao();

							kategorieauftrag3.searchForString(kategorienname3);

							ArrayList<Lebensmitteldaten> daten3 = kategorieauftrag3.getLebensmittel();
							
							for(Lebensmitteldaten lebensmitteleintrag : daten3){
								boolean gefunden=false;
								if((gefunden==false && lebensmitteleintrag.getKarenzphase()=="mittel") || (gefunden==false && lebensmitteleintrag.getKarenzphase()=="gut")){
									out.println(lebensmitteleintrag.getLname());
									gefunden=true;
								}
							}	

							// for the next category call we have to clear the arraylist of lebensmittel
							kategorieauftrag3.clearLebensmittel();
						}
						%>
						</div>
						<div>
						<% 
						
						
						if (request.getParameter("kategorieauswahl") == null || request.getParameter("kategorieauswahl2") == null || request.getParameter("kategorieauswahl3") == null) {
							/*at least one parameter is not there*/
						}else if (request.getParameter("kategorieauswahl1") != null && request.getParameter("kategorieauswahl2") != null && request.getParameter("kategorieauswahl3") !=null ) {
							out.println("<input type='submit' value='Mahlzeit erstellen'>");
						}	
						
						%>
						<input type='submit' value='Mahlzeit erstellen'>
						</div>
				</form>
			</section>	
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
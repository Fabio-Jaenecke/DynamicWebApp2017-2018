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
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/mahlzeitassistent.css">

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

    <header class="wrapper clearfix" style="max-height: 50px;">
    <div class="flex-grid-thirds">
		<div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div>
		<div class="col titlegrid">Mahlzeitassistent</div>
		<div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div>
    </div>

        <nav>

            

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

         

    </header>

</div>

<div class="main-container">

    <div class="main wrapper clearfix">

        <article>
				<%@ page import="controller.servlets.*" %>		
                <h2>Mahzeitsassistent</h2>

                <p>Klicken Sie auf ein Tellerdrittel, um ein Lebensmittel auszuwaehlen oder zu aendern.<br>
                Sie koennen zwischen dem Kategorienassisten und dem Naehrstoffassistenten waehlen.<br>
                Es werden nur Lebensmittel angezeigt, welche als gut oder mittel vertraeglich eingestuft wurden.
                </p>

                
				<%--TODO: Adjust fields / TODO: Refactor some code into Java-Files --%>
                <% 
                	if (request.getParameter("auswaehler") == null) {
				%>
				<%@ page import="controller.servlets.*" %>	
				<%
	                }else{
						
	                }	
                %>
                
               
	 		    <%
	 		    session.setAttribute("auswahl", "gehezurauswahl");
				%>	
					<div class='kategorien'>
					<h3>Assistent Kategorien</h3>
					     <section class="mahlzeitassistent">
											<%@ page import="datenbank.container.*" %>
					
											<%@ page import="suche.*" %>
					
											<%@ page import="java.util.ArrayList" %>
											
											<%@ page import="controller.servlets.*" %>
											
											
											<div class="auswahlDrittel auswahlerstesDrittel" style="position: relative; top: 15em; left: 2em">
												<a class="oeffneAuswahl" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/erstesLKategorie.jsp" style='color: white;' >
							                        <div class='selektiereDrittel erstesDrittel'>
							                        	<%
														String auswahl1 = null;
														if (request.getSession().getAttribute("auswahl1")==null){
															//do nothing
														}else{
														auswahl1 = (String) request.getSession().getAttribute("auswahl1");
														}
														if (auswahl1==null){
															%>
															<img src="${pageContext.request.contextPath}/imgs/thirdcircle.png" alt="thirdcircle" class="rotate0" >
															<%
														
														}else{
															String kategorienname1 = null;
															if (request.getSession().getAttribute("kategorienname1")==null){
																//do nothing
															}else{
															kategorienname1 = (String) request.getSession().getAttribute("kategorienname1");
															}
															
															%>
															<img src="${pageContext.request.contextPath}/imgs/<%out.println(kategorienname1);%>circle.png" alt="kategoriencircle" class="rotate0" >
															<%
														}
														
														%>
														<div class="oeffnenText zeigeDrittelkategorie">
															<p>Aendern</p>
														</div>
													</div>
													<div class='zeigeDrittelkategorie zeigeErstesDrittel'>
													<%
													if (auswahl1==null){
														out.println("______");
													}else{
														out.println(auswahl1);
													}
													%>
													</div>
							                    </a> 
											</div>
											
											<div class="auswahlDrittel auswahlzweitesDrittel" style="position: relative; top: 1.5em; left: 13.9em">
												<a class="oeffneAuswahl" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/zweitesLKategorie.jsp" >
							                        <div class='selektiereDrittel zweitesDrittel'>
														<%
														String auswahl2 = null;
														if (request.getSession().getAttribute("auswahl2")==null){
															//do nothing
														}else{
														auswahl2 = (String) request.getSession().getAttribute("auswahl2");
														}
														if (auswahl2==null){
															%>
															<img src="${pageContext.request.contextPath}/imgs/thirdcircle.png" alt="thirdcircle" class="rotate120" >
															<%
														
														}else{
															String kategorienname2 = null;
															if (request.getSession().getAttribute("kategorienname2")==null){
																//do nothing
															}else{
															kategorienname2 = (String) request.getSession().getAttribute("kategorienname2");
															}
															
															%>
															<img src="${pageContext.request.contextPath}/imgs/<%out.println(kategorienname2);%>circle.png" alt="kategoriencircle" class="rotate120" >
															<%
														}
														
														%>
														<div class="oeffnenText zeigeDrittelkategorie">
															<p>Aendern</p>
														</div>
													</div>
													<div class='zeigeDrittelkategorie zeigeZweitesDrittel'>
													<%
													if (auswahl2==null){
														out.println("______");
													}else{
														out.println(auswahl2);
													}
													%>
													</div>
							                    </a> 
											</div>
											
											<div class="auswahlDrittel auswahldrittesDrittel" style="position: relative; top: -1.1em; left: 8.3em">
												<a class="oeffneAuswahl" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/drittesLKategorie.jsp" >
							                        <div class='selektiereDrittel drittesDrittel'>
														<%
														String auswahl3 = null;
														if (request.getSession().getAttribute("auswahl3")==null){
															//do nothing
														}else{
														auswahl3 = (String) request.getSession().getAttribute("auswahl3");
														}
														if (auswahl3==null){
															%>
															<img src="${pageContext.request.contextPath}/imgs/thirdcircle.png" alt="thirdcircle" class="rotate240" >
															<%
														
														}else{
															String kategorienname3 = null;
															if (request.getSession().getAttribute("kategorienname3")==null){
																//do nothing
															}else{
															kategorienname3 = (String) request.getSession().getAttribute("kategorienname3");
															}
															
															%>
															<img src="${pageContext.request.contextPath}/imgs/<%out.println(kategorienname3);%>circle.png" alt="kategoriencircle" class="rotate240" >
															<%
														}
														
														%>
														<div class="oeffnenText zeigeDrittelkategorie">
															<p>Aendern</p>
														</div>
													</div>
													<div class='zeigeDrittelkategorie zeigeDrittesDrittel'>
													<%
													if (auswahl3==null){
														out.println("______");
													}else{
														out.println(auswahl3);
													}
													%>
													</div>
							                    </a> 
											</div>
											
											
								</section>
								
					</div>
					
					
					<div class='naehrstoffe' >
					<h3 style="margin-top: -250px">Assistent Naehrstoffe</h3>
					<section class="mahlzeitassistent" style="margin-top: -200px">
											<%@ page import="datenbank.container.*" %>
					
											<%@ page import="suche.*" %>
					
											<%@ page import="java.util.ArrayList" %>
											
											
											<div class="auswahlDrittel auswahlerstesDrittel" style="position: relative; top: 15em; left: 2em">
												<a class="oeffneAuswahl" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/erstesLNaehrstoff.jsp">
							                        <div class='selektiereDrittel erstesDrittel'>
														<%
														String auswahl4 = null;
														if (request.getSession().getAttribute("auswahl4")==null){
															//do nothing
														}else{
														auswahl4 = (String) request.getSession().getAttribute("auswahl4");
														}
														if (auswahl4==null){
															%>
															<img src="${pageContext.request.contextPath}/imgs/thirdcircleyellow.png" alt="thirdcircle" class="rotate0" >
															<%
														
														}else{
															String naehrstoffname1 = null;
															if (request.getSession().getAttribute("naehrstoffname1")==null){
																//do nothing
															}else{
															naehrstoffname1 = (String) request.getSession().getAttribute("naehrstoffname1");
															}
															
															%>
															<img src="${pageContext.request.contextPath}/imgs/<%out.println(naehrstoffname1);%>circle.png" alt="naehrstoffcircle" class="rotate0" >
															<%
														}
														
														%>
														<div class="oeffnenText zeigeDrittelnaehrstoff">
															<p>Aendern</p>
														</div>
													</div>
													<div class='zeigeDrittelnaehrstoff zeigeErstesDrittel'>
													<%
													if (auswahl4==null){
														out.println("______");
													}else{
														out.println(auswahl4);
													}
													%>
													</div>
							                    </a> 
											</div>
											
											<div class="auswahlDrittel auswahlzweitesDrittel" style="position: relative; top: 1.5em; left: 13.9em">
												<a class="oeffneAuswahl" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/zweitesLNaehrstoff.jsp">
							                        <div class='selektiereDrittel zweitesDrittel'>
														<%
														String auswahl5 = null;
														if (request.getSession().getAttribute("auswahl5")==null){
															//do nothing
														}else{
														auswahl5 = (String) request.getSession().getAttribute("auswahl5");
														}
														if (auswahl5==null){
															%>
															<img src="${pageContext.request.contextPath}/imgs/thirdcircleyellow.png" alt="thirdcircle" class="rotate120" >
															<%
														
														}else{
															String naehrstoffname2 = null;
															if (request.getSession().getAttribute("naehrstoffname2")==null){
																//do nothing
															}else{
															naehrstoffname2 = (String) request.getSession().getAttribute("naehrstoffname2");
															}
															
															%>
															<img src="${pageContext.request.contextPath}/imgs/<%out.println(naehrstoffname2);%>circle.png" alt="naehrstoffcircle" class="rotate120" >
															<%
														}
														
														%>
														<div class="oeffnenText zeigeDrittelnaehrstoff">
															<p>Aendern</p>
														</div>
													</div>
													<div class='zeigeDrittelnaehrstoff zeigeZweitesDrittel'>
													<%
													if (auswahl5==null){
														out.println("______");
													}else{
														out.println(auswahl5);
													}
													%>
													</div>
							                    </a> 
											</div>
											
											<div class="auswahlDrittel auswahldrittesDrittel" style="position: relative; top: -1.1em; left: 8.3em">
												<a class="oeffneAuswahl" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/drittesLNaehrstoff.jsp" >
							                        <div class='selektiereDrittel drittesDrittel'>
														<%
														String auswahl6 = null;
														if (request.getSession().getAttribute("auswahl6")==null){
															//do nothing
														}else{
														auswahl6 = (String) request.getSession().getAttribute("auswahl6");
														}
														if (auswahl6==null){
															%>
															<img src="${pageContext.request.contextPath}/imgs/thirdcircleyellow.png" alt="thirdcircle" class="rotate240" >
															<%
														
														}else{
															String naehrstoffname3 = null;
															if (request.getSession().getAttribute("naehrstoffname3")==null){
																//do nothing
															}else{
															naehrstoffname3 = (String) request.getSession().getAttribute("naehrstoffname3");
															}
															
															%>
															<img src="${pageContext.request.contextPath}/imgs/<%out.println(naehrstoffname3);%>circle.png" alt="naehrstoffcircle" class="rotate240" >
															<%
														}
														
														%>
														<div class="oeffnenText zeigeDrittelnaehrstoff">
															<p>Aendern</p>
														</div>
													</div>
													<div class='zeigeDrittelnaehrstoff zeigeDrittesDrittel'>
													<%
													if (auswahl6==null){
														out.println("______");
													}else{
														out.println(auswahl6);
													}
													%>
													</div>
							                    </a> 
											</div>				
								</section>	
							</div>
			<footer>
               <h3>Zu den Rezepten:</h3>
               <a class="link" href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
            </footer>				
			</article>
		 	
			<aside>
				<h3>Legende</h3>
				<div class='my-legend'>
					<div class='legend-title'>Kategorien:</div>
					<div class='legend-scale'>
					  <ul class='legend-labels'>
					    <li><span style='background:#FF7F7F;'></span>Fleisch</li>
					    <li><span style='background:#3EAC33;'></span>Obst</li>
					    <li><span style='background:#00933A;'></span>Gemuese</li>
					    <li><span style='background:#FEC576;'></span>Huelsenfruechte</li>
					    <li><span style='background:#D1B89B;'></span>Nuesse und Samen</li>
					    <li><span style='background:#BFD1E0;'></span>Fisch</li>
					    <li><span style='background:#A2D3FF;'></span>Milch und Milchprodukte</li>
					  </ul>
					</div>
				</div>
				<div class='my-legend'>
					<div class='legend-title'>Naehrstoffe:</div>
					<div class='legend-scale'>
					  <ul class='legend-labels'>
					    <li><span style='background:#FFEBE4;'></span>Proteine</li>
					    <li><span style='background:#E8E9FF;'></span>Staerkebeilage</li>
					    <li><span style='background:#E4FFF2;'></span>Vitamine</li>
					  </ul>
					</div>
				</div>
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
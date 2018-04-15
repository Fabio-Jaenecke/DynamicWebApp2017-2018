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
				<%@ page import="controller.servlets.*" %>		
                <h2>Mahzeitsassistent</h2>
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
				<%-- DELETE
				<form method="get" action="${pageContext.request.contextPath}/mahlzeitassistent/">
                <%
							                session.setAttribute("auswahl", "gehezurauswahl");
											
											if (request.getSession().getAttribute("auswahl1")==null){
								        		 //do nothing
								        	 }else{
								        		 out.println("Ausgewaehltes Lebensmittel2: " + request.getSession().getAttribute("auswahl2"));
								        	 }
											
											<input type='submit' name="auswahlsender" value="kategorie2">
				</form>
				
                <p>Hier können Sie Ihre Mahlzeiten schön und leicht selber konfigurieren.</p>     
                

        </article>

		<article style="min-width:100%;">
            	<em>Anleitung:</em>
            	<ol>
            		<li>Waehlen Sie zwischen dem Assisten für Lebensmittelkategorien oder für Naehrstoffe.</li>
            		<% if (request.getParameter("radiobutton") == null) {/*its not there*/}else if(request.getParameter("radiobutton").equals("kategorienframe")){out.println("<li>Waehlen Sie drei Lebensmittelkategorien aus der jeweiligen Auswahlliste aus.</li>");}%>
            	    <% if (request.getParameter("radiobutton") == null) {/*its not there*/}else if(request.getParameter("radiobutton").equals("naehrstoffeframe")){out.println("<li>Waehlen Sie drei Naehrstoffkategorien aus der jeweiligen Auswahlliste aus.</li>");}%>
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
				} else if(request.getParameter("radiobutton").equals("kategorienframe")) { --%>
					<div id='kategorienframe'>
					<h3>Assistent Kategorien</h3>
					     <section class="mahlzeitassistent">
											<%@ page import="datenbank.container.*" %>
					
											<%@ page import="suche.*" %>
					
											<%@ page import="java.util.ArrayList" %>
											
											<%@ page import="controller.servlets.*" %>
											
											<div class='selektiereDrittel erstesDrittel'>
											<img src="${pageContext.request.contextPath}/imgs/thirdcircle.png" alt="thirdcircle" class="rotate0">
											<div class="auswahlerstesDrittel" style="position: absolute; top: 100px; left: -100px">

												<a class="resp-sharing-button__link" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/erstesLKategorie.jsp" style='color: white;' >
												 <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
							                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
							                                Auswahl 1
							                           </div>
							                        </div>
							                    </a>
											</div>
											</div>
											<div class='zeigeDrittelkategorie zeigeErstesDrittel'>
												<%
												String auswahl1 = null;
												if (request.getSession().getAttribute("auswahl1")==null){
													//donothing
												}else{
												auswahl1 = (String) request.getSession().getAttribute("auswahl1");
												out.println(auswahl1);
												}
												%>
											</div>
											
											
											<div class='selektiereDrittel zweitesDrittel'>
											<img src="${pageContext.request.contextPath}/imgs/thirdcircle.png" alt="thirdcircle" class='rotate120'>
											<div class="auswahlzweitesDrittel" style="position: absolute; top: 100px; left: 220px; width: 100%;">

												<a class="resp-sharing-button__link" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/zweitesLKategorie.jsp" style='color: white;' >
												 <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
							                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
							                                Auswahl 2
							                           </div>
							                        </div>
							                    </a>
											</div>
											</div>
											<div class='zeigeDrittelkategorie zeigeZweitesDrittel'>
												<%
												String auswahl2 = null;
												if (request.getSession().getAttribute("auswahl2")==null){
													//donothing
												}else{
												auswahl2 = (String) request.getSession().getAttribute("auswahl2");
												out.println(auswahl2);
												}
												%>
											</div>
											
											<div class='selektiereDrittel drittesDrittel'>
											<img src="${pageContext.request.contextPath}/imgs/thirdcircle.png" alt="thirdcircle" class="rotate240">
											<div class="auswahldrittesDrittel" style="position: absolute; top: 250px; left: 50px; width: 100%">

												<a class="resp-sharing-button__link" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/drittesLKategorie.jsp" style='color: white;' >
												 <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
							                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
							                                Auswahl 3
							                           </div>
							                        </div>
							                    </a>
											</div>
											</div>
											<div class='zeigeDrittelkategorie zeigeDrittesDrittel'>
												<%
												String auswahl3 = null;
												if (request.getSession().getAttribute("auswahl3")==null){
													//donothing
												}else{
												auswahl3 = (String) request.getSession().getAttribute("auswahl3");
												out.println(auswahl3);
												}
												%>
											</div>
							
								</section>
					</div>
					
					
					<div id='naehrstoffeframe'style="position: absolute; top: 700px;">
					<h3>Assistent Naehrstoffe</h3>
					<section class="mahlzeitassistent">
											<%@ page import="datenbank.container.*" %>
					
											<%@ page import="suche.*" %>
					
											<%@ page import="java.util.ArrayList" %>
											
											
											
											<div class='selektiereDrittel erstesDrittel'>
											<img src="${pageContext.request.contextPath}/imgs/thirdcircleyellow.png" alt="thirdcircleyellow" class="rotate0">
											<div class="auswahlerstesDrittel" style="position: absolute; top: 100px; left: -100px">

												<a class="resp-sharing-button__link" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/erstesLNaehrstoff.jsp" style='color: white;' >
												 <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
							                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
							                                Auswahl 1
							                           </div>
							                        </div>
							                    </a>
											</div>
											</div>
											<div class='zeigeDrittelnaehrstoff zeigeErstesDrittel'>
												<%
												String auswahl4 = null;
												if (request.getSession().getAttribute("auswahl4")==null){
													//donothing
												}else{
												auswahl4 = (String) request.getSession().getAttribute("auswahl4");
												out.println(auswahl4);
												}
												%>
											</div>
											
											<div class='selektiereDrittel zweitesDrittel'>
											<img src="${pageContext.request.contextPath}/imgs/thirdcircleyellow.png" alt="thirdcircleyellow" class="rotate120">
											<div class="auswahlerstesDrittel" style="position: absolute; top: 100px; left: 220px; width: 100%;">

												<a class="resp-sharing-button__link" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/zweitesLNaehrstoff.jsp" style='color: white;' >
												 <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
							                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
							                                Auswahl 2
							                           </div>
							                        </div>
							                    </a>
											</div>
											</div>
											<div class='zeigeDrittelnaehrstoff zeigeErstesDrittel'>
												<%
												String auswahl5 = null;
												if (request.getSession().getAttribute("auswahl5")==null){
													//donothing
												}else{
												auswahl5 = (String) request.getSession().getAttribute("auswahl5");
												out.println(auswahl5);
												}
												%>
											</div>
											
											<div class='selektiereDrittel drittesDrittel'>
											<img src="${pageContext.request.contextPath}/imgs/thirdcircleyellow.png" alt="thirdcircleyellow" class="rotate240">
											<div class="auswahlerstesDrittel" style="position: absolute; top: 250px; left: 50px; width: 100%">

												<a class="resp-sharing-button__link" href="${pageContext.request.contextPath}/jsp/mahlzeitassistentauswahl/drittesLNaehrstoff.jsp" style='color: white;' >
												 <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
							                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
							                                Auswahl 3
							                           </div>
							                        </div>
							                    </a>
											</div>
											</div>
											<div class='zeigeDrittelnaehrstoff zeigeErstesDrittel'>
												<%
												String auswahl6 = null;
												if (request.getSession().getAttribute("auswahl6")==null){
													//donothing
												}else{
												auswahl6 = (String) request.getSession().getAttribute("auswahl6");
												out.println(auswahl6);
												}
												%>
											</div>
																		
								</section>	
				
			</form>
		</div>
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
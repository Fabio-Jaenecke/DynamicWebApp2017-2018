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
       			<a class="active" href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
       			<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
       			<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
       			<a href="${pageContext.request.contextPath}/beliebtheitsskala/">Zugriffsskala</a>
       			<a href="${pageContext.request.contextPath}/suchfilter/">Suche</a>
       			<a href="${pageContext.request.contextPath}/faq/">FAQ</a>
            </div>
        </nav>
        <a class="suchicon" href="Suchfilter.html">&#8981;</a>
    </header>
</div>
<div class="main-container">
    <div class="main wrapper clearfix">
        <article>
            <header>
            </header>
            <section>
          		<form action="${pageContext.request.contextPath}/lebensmittel/">
            		<div>
            			<input type="search" id="mySearch" name="q">
            			<button>Suche</button>
            		</div>
           		</form>
           		<%@ page import="java.sql.ResultSet"%>
           		<%@ page import ="datenbank.container.*" %>
           		<%@ page import ="Suche.*" %>
                <table class="table_lebensmittelname">
               		<tr>
                    <th>Kategorie</th>
                    <th>Karenzphase</th>
                    <th>Dauerernaehrung</th>
                    </tr>
 					<tr>
	                    <%
	                    // TODO replace "true" with Lebensmittelsuche.next()
	                    while(true){
	                    	Lebensmittelsuche kategorie;
	                    	// TODO initialize kategorie 
	                    	// kategorie.getLebensmittelInfoByName("kategorie");
	                        //System.out.println(kategorie); 
	                        }%>
	                    <td>
	                    <%
	                    Lebensmittelsuche kategorie;
	                    kategorie.getLebensmittelInfoByName("kategorie");
	                    %>
	                    </td>
                        
	                    <%
	                 // TODO replace "true" with Lebensmittelsuche.next()
	                    while(true){
	                    	Lebensmittelsuche karenzphase;
	                    	karenzphase.getLebensmittelInfoByName("Karenzphase");
	                        System.out.println(karenzphase); 
	                        }%>
	                    <td>
	                    <%
	                    Lebensmittelsuche karenzphase;
	                    karenzphase.getLebensmittelInfoByName("Karenzphase");
	                    %>
	                    </td>
	                        
	                    <% 
	                    while(true){
	                    	Lebensmittelsuche dauerernaehrung;
	                    	dauerernaehrung.getLebensmittelInfoByName("Dauerernaehrung");
	                        System.out.println(dauerernaehrung); 
	                        }%>
	                    <td>
	                    <%
	                    Lebensmittelsuche dauerernaehrung;
	                    dauerernaehrung.getLebensmittelInfoByName("Dauerernaehrung");
	                    %>
	                    </td>
                    </tr>
                </table>
            </section>
            <section>
          		<form>
            		<div>
            			<input> type="search" id="mySearch" name="q">
            			<button>Suche</button>
            		</div>
           		</form>
           		<select> name="select">
           			<option value="fleisch">Fleisch</option>
           			<option value="obst">Obst</option>
           			<option value="gemuese">Gemuese</option>
           			<option value="huelsenfruechte">Huelsenfruechte</option>
           			<option value="nuesseundsamen">Nuesse und Samen</option>
           			<option value="fisch">Fisch</option>
           			<option value="milchundmilchprodukte">Milch und Milchprodukte</option>
           			<option value="sonstiges">Sonstiges</option>
           		</select>
                <table class="table_lebensmittelkategorie">
               		<tr>
                    <th>Kategorie</th>
                    <th>Karenzphase</th>
                    <th>Dauerernaehrung</th>
                    </tr>
                    <tr>
	                    <%
	                 // TODO replace "true" with Lebensmittelsuche.next()
	                    while(true){
	                    	Lebensmittelsuche kategorie2;
	                    	kategorie2.getLebensmittelInfoByName("kategorie");
	                        System.out.println(kategorie2); 
	                        }%>
	                    <td>
	                    <%
	                    Lebensmittelsuche kategorie2;
	                    kategorie2.getLebensmittelInfoByName("kategorie");
	                    %>
	                    </td>
                        
	                    <%
	                 // TODO replace "true" with Lebensmittelsuche.next()
	                    while(true){
	                    	Lebensmittelsuche karenzphase2;
	                    	karenzphase2.getLebensmittelInfoByName("Karenzphase");
	                        System.out.println(karenzphase2); 
	                        }%>
	                    <td>
	                    <%
	                    Lebensmittelsuche karenzphase2;
	                    karenzphase2.getLebensmittelInfoByName("Karenzphase");
	                    %>
	                    </td>
	                        
	                    <% 
	                 // TODO replace "true" with Lebensmittelsuche.next()
	                    while(true){
	                    	Lebensmittelsuche dauerernaehrung2;
	                    	dauerernaehrung2.getLebensmittelInfoByName("Dauerernaehrung");
	                        System.out.println(dauerernaehrung2); 
	                        }%>
	                    <td>
	                    <%
	                    Lebensmittelsuche dauerernaehrung2;
	                    dauerernaehrung2.getLebensmittelInfoByName("Dauerernaehrung");
	                    %>
	                    </td>
                    </tr>
                </table>
            </section>
    </div>
    <!-- #main -->
</div>
<!-- #main-container -->
<div class="footer-container">
<!-- 
 <footer class="wrapper">
        <h4>Quelle:</h4>
        <a href="https://www.nahrungsmittel-intoleranz.com">https://www.nahrungsmittel-intoleranz.com</a>
        <h3>Impressum</h3>
        <p> Â© 2017 PSIT1/2, WEB1, ZHAW<br>
            Powered by: Michèle Trebo (trebomic), Raphael Caradonna (caradrap) , Marko Despotovic (despomar), Fabio
            Jaenecke (jaenefab)
        </p>
        <!-- Sharingbutton E-Mail
        <table class="table_contact">
            <thead>
            <tr>
                <th colspan="2">Kontakt</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <a class="resp-sharing-button__link" href="mailto:livraand@students.zhaw.ch"
                       target="livraand@students.zhaw.ch" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                                    <path d="M22 4H2C.9 4 0 4.9 0 6v12c0 1.1.9 2 2 2h20c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7.25 14.43l-3.5 2c-.08.05-.17.07-.25.07-.17 0-.34-.1-.43-.25-.14-.24-.06-.55.18-.68l3.5-2c.24-.14.55-.06.68.18.14.24.06.55-.18.68zm4.75.07c-.1 0-.2-.03-.27-.08l-8.5-5.5c-.23-.15-.3-.46-.15-.7.15-.22.46-.3.7-.14L12 13.4l8.23-5.32c.23-.15.54-.08.7.15.14.23.07.54-.16.7l-8.5 5.5c-.08.04-.17.07-.27.07zm8.93 1.75c-.1.16-.26.25-.43.25-.08 0-.17-.02-.25-.07l-3.5-2c-.24-.13-.32-.44-.18-.68s.44-.32.68-.18l3.5 2c.24.13.32.44.18.68z"/>
                                </svg>
                                trebomic
                            </div>
                        </div>
                    </a>
                </td>
                <td>
                    <a class="resp-sharing-button__link" href="mailto:caradrap@students.zhaw.ch"
                       target="caradrap@students.zhaw.ch" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                                    <path d="M22 4H2C.9 4 0 4.9 0 6v12c0 1.1.9 2 2 2h20c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7.25 14.43l-3.5 2c-.08.05-.17.07-.25.07-.17 0-.34-.1-.43-.25-.14-.24-.06-.55.18-.68l3.5-2c.24-.14.55-.06.68.18.14.24.06.55-.18.68zm4.75.07c-.1 0-.2-.03-.27-.08l-8.5-5.5c-.23-.15-.3-.46-.15-.7.15-.22.46-.3.7-.14L12 13.4l8.23-5.32c.23-.15.54-.08.7.15.14.23.07.54-.16.7l-8.5 5.5c-.08.04-.17.07-.27.07zm8.93 1.75c-.1.16-.26.25-.43.25-.08 0-.17-.02-.25-.07l-3.5-2c-.24-.13-.32-.44-.18-.68s.44-.32.68-.18l3.5 2c.24.13.32.44.18.68z"/>
                                </svg>
                                caradrap
                            </div>
                        </div>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <a class="resp-sharing-button__link" href="mailto:despomar@students.zhaw.ch"
                       target="despomar@students.zhaw.ch" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                                    <path d="M22 4H2C.9 4 0 4.9 0 6v12c0 1.1.9 2 2 2h20c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7.25 14.43l-3.5 2c-.08.05-.17.07-.25.07-.17 0-.34-.1-.43-.25-.14-.24-.06-.55.18-.68l3.5-2c.24-.14.55-.06.68.18.14.24.06.55-.18.68zm4.75.07c-.1 0-.2-.03-.27-.08l-8.5-5.5c-.23-.15-.3-.46-.15-.7.15-.22.46-.3.7-.14L12 13.4l8.23-5.32c.23-.15.54-.08.7.15.14.23.07.54-.16.7l-8.5 5.5c-.08.04-.17.07-.27.07zm8.93 1.75c-.1.16-.26.25-.43.25-.08 0-.17-.02-.25-.07l-3.5-2c-.24-.13-.32-.44-.18-.68s.44-.32.68-.18l3.5 2c.24.13.32.44.18.68z"/>
                                </svg>
                                despomar
                            </div>
                        </div>
                    </a>
                </td>
                <td>
                    <a class="resp-sharing-button__link" href="mailto:jaenefab@students.zhaw.ch"
                       target="jaenefab@students.zhaw.ch" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--email resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                                    <path d="M22 4H2C.9 4 0 4.9 0 6v12c0 1.1.9 2 2 2h20c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7.25 14.43l-3.5 2c-.08.05-.17.07-.25.07-.17 0-.34-.1-.43-.25-.14-.24-.06-.55.18-.68l3.5-2c.24-.14.55-.06.68.18.14.24.06.55-.18.68zm4.75.07c-.1 0-.2-.03-.27-.08l-8.5-5.5c-.23-.15-.3-.46-.15-.7.15-.22.46-.3.7-.14L12 13.4l8.23-5.32c.23-.15.54-.08.7.15.14.23.07.54-.16.7l-8.5 5.5c-.08.04-.17.07-.27.07zm8.93 1.75c-.1.16-.26.25-.43.25-.08 0-.17-.02-.25-.07l-3.5-2c-.24-.13-.32-.44-.18-.68s.44-.32.68-.18l3.5 2c.24.13.32.44.18.68z"/>
                                </svg>
                                jaenefab
                            </div>
                        </div>
                    </a>
                </td>
            </tr>
            </tbody>
        </table>
    </footer>
</div> -->   
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
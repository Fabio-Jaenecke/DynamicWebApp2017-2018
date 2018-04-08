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
    <link rel="shortcut icon" href="../imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="../imgs/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="../css/Rest/suchfilter.css/">
    <script src="../js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>
<body>
    <!-- die Seite Suchverlauf besteht aus einem header, nav, einem fieldset fuer die Sucheingabe
    und einer section fuer die moeglichen Suchresultate
    -->
    <div class="header-container">
        <header class="wrapper clearfix">
            <nav>
                <span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></span><span class="title">Suchfilter</span>
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
            <a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
        </header>
    </div>
    <div class="main-container">
        <div class="main wrapper clearfix">
        <!-- das fieldset, um einen Suchbegriff einzugeben und dann mithilfe des Buttons zu suchen-->
        <fieldset class="suche">
            <input id="suche" type="text" name="suche">
            <button type="button" id="suchknopf"> Suchen </button>
        </fieldset>
        <!-- die section, in der nach druecken des Buttons Suchresulate angezeigt werden-->
        <section class="resultate">
                <article>
                    <a> www.histarantia.ch/home </a>
                    <p> Histaminintoleranz ist die Unvertraeglichkeit von stark histaminhaltigen
                        Nahrungsmitteln beziehungsweise die Unfaehigkeit  ...  </p>
                </article>
                <article>
                    <a> www.histarantia.ch/rangliste </a>
                    <p> Hier folgt eine Tabelle, die die Anzahl Zugriffe auf ein Lebensmittel
                        darstellen. Das Lebensmittel mit den meisten .. </p>
                </article>
                <article>
                    <a> www.histarantia.ch/lebensmittelkategorie </a>
                    <p> Die Frucht (von lateinisch fructus) einer Pflanze ist die Gesamtheit der Organe,
                        die aus einer Bluete hervorgehen .. </p>
                </article>
                <article>
                    <a> www.histarantia.ch/faq </a>
                    <p> Gibt es Labortests zur Diagnose der Histaminunvertraeglichkeit? Die Antwort
                        ist nicht so leicht zu beantworten ... </p>
                </article>
            </section>
        </div>
        <!-- #main -->
    </div>
<!-- javascript einbinden, um nav ein- und auszublenden-->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
<script src="../js/main.js"></script>
<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
<script>
    (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
        function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
        e=o.createElement(i);r=o.getElementsByTagName(i)[0];
        e.src='//www.google-analytics.com/analytics.js';
        r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
    ga('create','UA-XXXXX-X','auto');ga('send','pageview');
</script>
</body>
</html>

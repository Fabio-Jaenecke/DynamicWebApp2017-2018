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
               <link rel="apple-touch-icon" href="../${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
               <link rel="stylesheet" href="../${pageContext.request.contextPath}/css/normalize.min.css">
               <link rel="stylesheet" href="../${pageContext.request.contextPath}/css/Main/main.css">
               <link rel="shortcut icon" href="../${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
               <link rel="icon" href="../${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
               <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
			   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.min.css">
			   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
			   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
			   <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
			   <link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
               <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
               <style>
               	/* ==========================================================================
				   Breadcrumbs
				   ========================================================================== */

				ul.breadcrumb {
				    padding: 10px 16px;
				    list-style: none;
				    background-color: #eee;
				}
				ul.breadcrumb li {
				    display: inline;
				    font-size: 18px;
				}
				ul.breadcrumb li+li:before {
				    padding: 8px;
				    color: black;
				    content: ">";
				}
				ul.breadcrumb li a {
				    color: #6FA8DC;
				    text-decoration: none;
				}
				ul.breadcrumb li a:hover {
				    color: #01447e;
				    text-decoration: underline;
				}
               </style>
            </head>
            <body>
               <!--[if lt IE 8]>
               <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
               <![endif]-->
               <div class="header-container">
                  <header class="wrapper clearfix"><div class="flex-grid-thirds"><div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div><div class="col titlegrid">Home</div><div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div></div>
                     <nav>
                        
                        <div id="mySidenav" class="sidenav side-nav">
                           <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
                            <a class="active" href="${pageContext.request.contextPath}/home/">Home</a>
                			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
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
                  	<form method="get" action="${pageContext.request.contextPath}/home/">
                     <article>
                     <input type="submit" value="Zurück" onchange="history.back()">
                     	<ul class="breadcrumb">
                     	<li><a href="${pageContext.request.contextPath}/home/">Home</a></li>
						 <li>Was ist Histamin-Inteloreranz?</li>
						</ul>
						                        	
                        <header>
                           <h2>Histaminintoleranz (kurz: HIT) - Was ist das?</h2>
                           
                    
                       		<article style="min-width: 100%">
							
							Histaminintoleranz, auch Histaminunverträglichkeit genannt, ist der Zustand, wenn zu viel Histamin im Körper ist und folglich Probleme auftreten. Histamin ist ein biogenes Amin und ein sehr wichtiger Stoff, der im Körper vorkommen muss und dort wichtige Aufgaben erfüllt. Besteht aber ein Ungleichgewicht, so kann es zu Problemen kommen. Das nennt man dann Histaminintoleranz. Dieses Ungleichgewicht kann durch eine verringerte Aktivität des Enzyms Diaminoxidase (DAO), sowie durch erhöhte Aufnahme von biogenen Aminen durch die Nahrung, durch Produktion biogener Amine von körpereigenen Darmbakterien und durch externe Inhibitoren (also Hemmstoffe) Symptome wie Hautrötungen, Bauchschmerzen, Durchfälle, usw. verursachen. Wobei nicht alle diese Auslöser zeitgleich auftreten müssen. Das Symptomspektrum ist dabei sehr variabel.
							
							<h3>Häufigkeit der Histaminintoleranz</h3>
							
							Die Histaminintoleranz tritt bei ca. 1-3% der Bevölkerung auf. Nach einer Studie des nmi-Portals ist die Dunkelziffer jedoch sehr hoch, d.h. es sind vermutlich mehr Personen davon Betroffen. Laut einer Studie von Jarisch sind zirka 80% der Betroffenen Frauen, die meisten davon ab dem 40. Lebensjahr. In der Umfrage des nmi-Portals konnte diese Tendenz nicht verifiziert werden.
							
							<h3>Zwei Arten von Histaminintoleranz</h3>
							
							Histidin (eine natürliche Aminosäure) wird in der Nahrung durch Bakterien (oder Hefe) zu Histamin abgebaut. Dieses wird dann im menschlichen Körper durch die Enzyme Diaminoxidase [DAO] (außerhalb der Zellen; zu finden in Dünndarm) bzw. N-Methyl-Transferase [HNMT] (innerhalb von Zellen; zum Beispiel in der Leber) abgebaut. Enzyme sind Moleküle die dem Körper dabei helfen bestimmte Reaktionen auszuführen. Sie können z.B. andere Moleküle spalten oder dabei helfen ein Molekül in ein anderes umzuwandeln.
							
							<h4>Typ Diaminoxidase - DAO</h4>
							
							Das Enzym DAO benötigt die Hilfe von Kupfer und Vitamin B6 um richtig zu funktionieren. Bei einer Histaminintoleranz vom "Typ DAO" ist die Aktivität der Diaminoxidase (DAO) eingeschränkt und durch die Nahrung aufgenommenes Histamin kann nicht oder nur teilweise abgebaut werden. Beim Verzehr histaminhaltiger oder histaminfreisetzender Nahrungsmittel kommt es zu einer pseudoallergischen Reaktion des Körpers.
							
							<h4>Typ HNMT</h4>
							
							Die HNMT kommt vermehrt in Organen wie Leber, Haut, Atemwege oder im Zentralnervensystem vor. Ist zu wenig dieser HNMT vorhanden, kommt es ebenfalls zu einer Histaminintoleranz, allerdings "Typ HNMT". Hier kommt es zu einer allmälichen und langsamen Ansammlung von Histamin im Körper. Wird dann Histamin dem Körper zugeführt, bringt dies sozusagen das Fass zum überlaufen. Die Symptomatik ist bei diesem Typ oft weniger auffällig, dafür länger andauernd.
							
							Der Abbau des Histamins wird durch Vitamin C gefördert.
							
							<h3>Welchen Typ habe ich?</h3>
							
							Wie wird die Histaminintoleranz diagnostiziert?
							
							Ein gesunder Mensch produziert laufend DAO, das ins Darmlumen abgegeben wird. Wird dann histaminreiche Nahrung gegessen, kann das Histamin bereits im Darm "neutralisiert" werden. Dies funktioniert natürlich nur bis zu einer gewissen Grenze. Wird zuviel Histamin zugeführt (zum Beispiel verdorbene Nahrung - oft verdorbener Fisch), so kommt es auch bei einem gesunden Menschen zu den typischen Symptomen einer "Histaminvergiftung". Man nennt das dann Lebensmittelvergiftung. Wird zu wenig DAO produziert, hat man schon bei geringen Mengen Histamin diese Symptome.
							</article>
                        </header>
                        
                     </article>
                     </form>
                  </div>
                  <!-- #main -->
               </div>
               <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
               <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
               <script src="${pageContext.request.contextPath}/js/main.js"></script>
               <script src="../${pageContext.request.contextPath}/js/main.js"></script>
               <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
               <script>
                  (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
                  function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
                  e=o.createElement(i);r=o.getElementsByTagName(i)[0];
                  e.src='//www.google-analytics.com/analytics.js';
                  r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
                  ga('create','UA-XXXXX-X','auto');ga('send','pageview');
               </script>
               </form>
            </body>
         </html>
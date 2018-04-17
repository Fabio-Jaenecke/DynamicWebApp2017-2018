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
                  <header class="wrapper clearfix" style="max-height: 75px;"><div class="flex-grid-thirds"><div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div><div class="col titlegrid">Home</div><div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div></div>
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
						 <li>Symptome der Histamin-Intoleranz</li>
						</ul>
						                        	
                        <header>
                           <h2>Symptome der Histamin-Intoleranz</h2>
                           
                    
                       		<article style="min-width: 100%">
							Die Symptome der Histaminintoleranz sind vielfältig. Auch die Behandlung ist abhängig von einigen Faktoren. Im Folgenden wollen wir uns diese beiden Themen anschauen. Direkt zur Behandlung der Histaminintoleranz.
							
							<h3>Symptome der Histaminunverträglichkeit</h3>
							Zusammenfassung (leichte Sprache)
							Die Symptome der Histaminintoleranz treten meist kurz nach oder wenige Stunden nach einer histaminreichen Mahlzeit auf. Die Symptome sind u.a. Kopfschmerzen, Hautrötungen, Juckreiz, Übelkeit, Duchfall oder Herzrasen .
							
							Die Symptome der Histaminintoleranz sind sehr vielfältig (siehe unten) und teilweise schwer von den Symptomen anderer Krankheiten zu unterscheiden. Vor allem Allergie-Symptome ähneln denen der Histaminintoleranz. Die Symptome machen sich meist einige Minuten bis wenige Stunden nach dem Konsum histaminreicher bzw. histaminfreisetzender oder das Enzym DAO blockierender Nahrungsmittel bemerkbar. Nach einer Studie an 141 Betroffenen, treten bei 41% der Betroffenen die Symptome bereits wenige Minuten, bei 47% wenige Stunden nach dem Verzehr der entsprechenden Nahrungsmittel auf. Nur etwa 12% berichten von Symptomen an darauffolgenden Tagen.
							
							Die Schwierigkeit in der Diagnostik der Histaminunverträglichkeit ist die Vielfältigkeit der Symptome. Es gibt gewisse Symptomgruppen: Herz-Kreislaufsystem, Haut / Schleimhäute und Verdauung. Oft treten mehrere Symptome einer dieser Kategorien gehäuft auf. Oft treten einige Symptome gemeinsam auf, es können sich aber auch nur einzelne Symptome bemerkbar machen. Dies ist individuell unterschiedlich und auch abhängig von den Nahrungsmitteln oder zusätzlichen Intoleranzen!
							
							<h3>Bei der Histaminintoleranz können mehrere Bereiche betroffen sein:</h3>
							HIT Symptome
							
							Herz-Kreislauf-System
							Haut
							Gastrointestinaltrakt (Verdauungstrakt)
							Genitaltrakt*
							*Die Symptomgruppe "Genitaltrakt" konnte in unserer Umfrage nicht bestätigt werden, da keine einzige der Befragten diese Symptomgruppe erwähnte. Jarisch beschreibt in seinem Buch, dass ein Zusammenhang zwischen krampfartigen Regelschmerzen und Histamin-Intoleranz plausibel sein könnte.
							
							In unserer Studie mit 141 Teilnehmern, haben wir folgende Verteilung von Symptomen gefunden: Am häufigsten waren Kopfschmerzen (38%) und Flush (36%; Hautrötungen im Gesichts- und Halsbereich), gefolgt von Bauchschmerzen (31%), Durchfall (26%), Nasenrinnen bzw. Nasenschleimhautschwellung (19%). Blähungen und Übelkeit verzeichneten wir jeweils mit etwa 17%, gefolgt von Herzrasen mit nur noch etwa 12%. Weniger oft, aber immer noch in mehr als 5% der Fälle, kommen Ausschlag, juckende Haut, Müdigkeit, Schwindel und Kreislaufprobleme vor.
							
							<h3>Die häufigsten Symptome der verschiedenen Symptomgruppen sind:</h3>
							<table>
							  <tr>
							    <th><br>  Herz-Kreislauf-System / ZNS</th>
							    <th><br>  <br>  <br>  Haut</th>
							    <th><br>  <br>  <br>  Verdauungstrakt</th>
							  </tr>
							  <tr>
							    <td>Kopfschmerz<br>  (bis hin zu Migräne)</td>
							    <td>Flush (rot werden im Hals- und<br>  Gesichtsbereich)</td>
							    <td>Übelkeit</td>
							  </tr>
							  <tr>
							    <td>Herzrasen</td>
							    <td>Ausschlag</td>
							    <td>Bauchschmerzen (auch krampfhaft)</td>
							  </tr>
							  <tr>
							    <td>Schwindel</td>
							    <td>Juckreiz</td>
							    <td>Blähungen</td>
							  </tr>
							  <tr>
							    <td>Müdigkeit<br>  / Kreislaufprobleme<br>    </td>
							    <td>Quaddeln und Schwellungen</td>
							    <td>Durchfall<br>  <br>  </td>
							  </tr>
							  <tr>
							    <td>VerdauungstraktÜbelkeitBauchschmerzen (auch krampfhaft)BlähungenDurchfall</td>
							    <td></td>
							    <td></td>
							  </tr>
							</table>
							Bei der Histaminintoleranz wird generell davor gewarnt, dass es in sehr seltenen Fällen zu lebensbedrohlichen Zuständen kommen könnte. Bisher wurde jedoch kein solcher Fall dokumentiert!
							
							<h3>Folgende Symptome werden von einigen Betroffenen zusätzlich berichtet:</h3>
							<ul>
								<li>Nesselsucht (Urtikaria)</li>
								<li>Probleme beim Wasserlassen</li>
								<li>Schweißausbrüche</li>
								<li>Kribbeln in Fingern, Beinen</li>
								<li>Muskel/Gelenksschmerzen</li>
								<li>Schlafstörungen</li>
								<li>Asthma/Atemnot</li>
								<li>Niesen</li>
								<li>Augenjucken</li>
								<li>Sodbrennen</li>
								<li>Sehstörungen</li>
								<li>Hitzewallungen</li>
								<li>Niesanfälle</li>
								<li>Tinnitus, Ohrensausen</li>
								<li>Zahn- und Kieferschmerzen</li>
								<li>raue, pelzige Zunge</li>
								<li>Mundaphten oder sonstige Entzündungen im Mund</li>
								<li>verstärkte Akne</li>
								<li>Antriebslosigkeit</li>
								<li>Konzentrationsschwierigkeiten</li>
								<li>Stimmungsschwankungen/Weinerlichkeit/Aggressivität</li>
								<li>erhöhte Temperatur bzw. grippeartiges Gefühl</li>
								<li>Erbrechen</li>
							</ul>
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
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
						 <li>Diagnose der Histamin-Intoleranz</li>
						</ul>
						                        	
                        <header>
                           <h2>Diagnose der Histamin-Intoleranz</h2>
                           
                    
                       		<article style="min-width: 100%">
                       		
								Zusammenfassung
								Histaminintoleranz wird diagnostiziert, indem man ein Ernährungs- und Symptomtagebuch führt, das vom Arzt ausgewertet wird. Darauf folgt eine Differenzialdiagniostik des Arztes, sowie eine Eliminationsdiät inkl. einiger Untersuchungen. Heimtests wie Blutanalysen, IgG4-Tests, Stuhl- oder Urintests und DAO-Bestimmungen des Blutes sind nicht geeignet, eine Histaminintoleranz zu diagnostizieren.
								
								Wie eine Histaminintoleranz (HIT) diagnostiziert wird, hat sich in den letzten Jahren laufend geändert. Da die HIT eine sehr neue Erscheinung ist, musste man erst Studien machen und Erfahrungen sammeln. Aktuell gibt es eine Leitlinie, die den Gold-Standard in der Diagnostik vorgibt. Im folgenden Beitrag zeigen wir euch auch verschiedene historische Diagnosewege und deren Probleme.
								
								<h3>Einige Begriffe und Erklärungen</h3>
								<strong>Diaminoxidase (DAO)</strong> ist ein Enzym, welches unter anderem im Dünndarm produziert wird und über die Nahrung aufgenommenes Histamin abbaut. Für diesen Vorgang benötigt die DAO unter anderem Vitamin B6 und Kupfer. DAO wird von gewissen Substanzen wie Alkohol oder anderen biogenen Aminen gehemmt. Histamin bildet sich ganz natürlich durch Bakterien, d.h. Nahrung die lange gelagert wird enthält mehr Histamin, als frische Nahrung. Auch die Darmbakterien produzieren Histamin und andere biogene Amine. Daher benötigt unser Körper dieses Enzym im Darm, um das aufgenommene und im Darm produzierte Histamin abzubauen.
								
								<strong>Histamin-N-Methyl-Transferase (HNMT)</strong> ist ein Enzym, das in den Zellen vorkommt, vor allem in Leberzellen, aber auch im Darm. Auch HNMT baut Histamin ab.
								
								<h3>Wie diagnostiziert man eine Histaminintoleranz?</h3>
								Es gibt mittlerweile eine Leitlinie die von führenden Fachorganisationen empfohlen wird. Wichtig ist, keine Selbstdiagnosen zu machen, sondern immer im Dialog mit dem Arzt zu einer Diagnose zu kommen. Folgender Diagnoseweg gilt aktuell als Gold-Standard:
								
								<h4>Erster Schritt: Symptomtagebuch und Differenzialdiagnose</h4>
								Bevor man zum Arzt geht sollte man auf jeden Fall ein Symptomtagebuch führen. Dadurch tut sich der behandelnde Arzt deutlich leichter mit einer Eingrenzung der Symptome.
								
								Unser Symptom-Tagebuch ist auch als App für Android Geräte verfügbar.
								
								Wir haben auch einen Vordruck für ein Symptomtagebuch zum kostenlosen Download:
								
								
								Symptomtagebuch zum Ausdrucken (A4)
								Während du ein Symptomtagebuch führst, solltest du dich normal ernähren und keine Diät halten oder plötzlich auf bestimmte Produkte verzichten. Dein Arzt muss sich Zeit für dich nehmen und ein sehr intensives Gespräch mit dir führen. Am besten ist es, wenn du dein Ernährungs- / Symptomtagebuch mitbringst. Vermerke im Tagebuch auch den Menstruationszyklus, sowie jede Einnahme von Medikamenten! Vermerke auch die Symptome die du hast.
								
								Dein Arzt wird versuchen mittels Differenzialdiagnose andere Erkrankungen auszuschließen. Hierzu gehören zum Beispiel Allergien, Mastozytose, chronisch entzündliche Darmerkrankungen oder andere Unverträglichkeiten. Differnzialdiagnose heißt, dass man zuerst andere Erkrankungen mit sehr ähnlichen Symptomen, ausschließt. Allergien z.Bsp. über Prick- und RAST-Test, intestinale Fruktoseintoleranz oder Laktoseintoleranz über H2-Atemtest. Es gibt noch einige andere Erkrankungen, zum Beispiel die sehr seltene Mastozytose, die man zuerst ausschließen sollte.
								
								<h4>Zweiter Schritt: Eliminationsdiät mit oder ohne Provokationstest</h4>
								Da man für diesen Diagnoseweg eine genaue Kenntnis über den Histamingehalt und die Histaminkarenz benötigt, ist dieser Diagnoseweg sehr schwierig und muss ernährungstherapeutisch begleitet werden!
								
								Zuerst macht man eine gut geplante und im Idealfall diätologisch begleitete Karenzphase inklusive eines sehr genauen Ernährungs- bzw. Symptomtagebuchs. Diese Phase dauert 2-4 Wochen. In der Karenz werden alle Lebensmittel mit biogenen Aminen vermieden, kein Alkohol getrunken, keine DAO-blockierenden Medikamente genommen (mit Arzt besprechen!) und keine Antihistaminika genommen.
								
								Kommt es zu einer Besserung der Symptome, ist eine HIT, nach Ausschluss anderer möglicher Erkrankungen per Differentialdiagnose, sehr wahrscheinlich.
								
								Bei positivem Befund sollte dein Arzt Kupfer und Vitamin B6 durch eine Blutuntersuchung testen lassen, da die DAO diese Stoffe benötigt, um richtig zu funktionieren. Sind zu wenig davon da, kann die DAO nicht gebildet werden bzw. nicht richtig funktionieren. Eine Substitutuion kann dann die HIT deutlich verbessern.
								
								<h4>Dritter Schritt: Provokationstest</h4>
								Nun, nach dieser Karenz, kann man einen Provokationstest machen, welcher allerdings im Idealfall placebokontrolliert und doppelt verblindet durchgeführt werden sollte. Hierbei bekommt man verschiedene Flüssigkeiten zu trinken und die Reaktionen werden protokolliert. Dies ist aber wohl nur in Spezialkliniken möglich und wird von einigen Leitlinien nicht empfohlen, bzw. explizit davon abgeraten. Alternativ kann man (in Absprache mit dem Arzt!) histaminhaltige Nahrungsmittel essen und seine Reaktionen darauf im Tagebuch festhalten. Wichtig ist jeden Tag nur 1 Lebensmittel zu testen! Beispielsweise Bergkäse, Rotwein oder Sauerkraut. Die Reaktionen sollten dann innerhalb von 4 Stunden auftreten. Bei einer schweren Form der Histaminintoleranz (was sehr selten ist!) könnte es beim Provokationstest zu einem anaphylaktischen Schock kommen, weshalb man dies besser nicht ohne ärztliche Begleitung machen sollte.
								
								Dieser Schritt ist meist nicht mehr notwendig, da meistens schon nach Schritt zwei die Diagnose klar ist.
								
								<h3>Nicht mehr empfohlene Methoden</h3>
								Achtung: Es gibt am Markt noch Blutheimtests oder andere Tests für zu Hause zur Histaminintoleranz-Diagnostik. Auch einige Ärzte machen noch Bluttests zur Bestimmung der DAO. Diese Tests werden aber von den Fachoprganisationen und aus den dargelegten Gründen als nicht geeignet eingestuft und können Fehldiagnosen liefern.
								
								<h4>Diagnoseweg: Laborparameter "Blut"</h4>
								blutabnahme bei histaminintoleranz; (C) Michael Zechmann / nmi-PortalDa wir ja die Enzyme DAO und HNMT zum Abbau haben, könnte man vermuten, dass die Menge der Enzyme im Blut als Diagnoseverfahren herangezogen werden könnte. Das funktioniert aber leider nicht. Man hat auch versucht die Aktivität der DAO, also nicht die Menge, als Diagnose-Faktor zu etablieren. Ebenfalls mit mäßigem Erfolg. Man hat nämlich festgestellt, dass die Aktivität der Enzyme in der Dünndarmschleimhaut nicht mit der Menge oder Aktivität im Blut zusammenhängt.
								
								<h4>Diagnoseweg: Dünndarmbiopsie DAO-Aktivität</h4>
								Alternativ kann über eine Dünndarmbiopsie mittels eines ELISA (enzyme-linked immunosorbent assay) die Aktivität bestimmt werden. Letzteres bietet sich an, wenn sowieso schon eine Dünndarmbiopsie durchgeführt wird. Daher ist diese Methode keine übliche Diagnosemethode.
								
								Die Interpretation der DAO-Aktivität muss jedoch auch hier im Kontext mit der Klinik und der Anamnese durchgeführt werden, das heißt der oben beschriebene Gold-Standard muss sowieso beschritten werden.
								
								<h4>Diagnoseweg: Laborparameter "Urin" und "Stuhl"</h4>
								Man kann auch die Histamin und Methylhistamin Konzentration im Harn bestimmen. Mehylhistamin ist das Abbauprodukt der HNMT. Liegt ein DAO-Mangel vor, wird das Histamin vermehrt in den Zellen über die HNMT abgebaut. Entsprechend erhöht sich das Abbauprodukt Methylhistamin, welches über den Harn ausgeschieden wird und damit über einen 12-h-Sammelurintest von einem Labor bestimmt werden kann. Dann wird einige Tage lang eine strikte Kartoffel-Reis-Diät gehalten und der Urintest wiederholt. Aus der Änderung der Ergebnisse dachte man, könnte man auf eine HIT schließen. Das hat sich als nicht richtig herausgestellt. Auch hier ist nämlich eine Differentialdiagnose wichtig, da dieser Test alleine nicht aussagekräftig genug ist, um eine Histaminintoleranz zu diagnostizieren. 5)
								
								Auch im Stuhl kann die Histaminmenge bestimmt werden. Diese Menge zeigt jedoch nur an, wieviel Histamin nicht im Darm abgebaut wurde. Diese Menge variiert je nach dem, was man zuvor gegessen hat, also je nachdem wie hoch die zugeführte Histaminmenge war, und je nachdem wie die Bakterienzusammensetzung im Darm ist. Das vom Körper selbst produzierte Histamin kann dieser Test nicht berücksichtigen. Dieser Test galt schon länger als unsicher und zählt daher zu den veralteten Diagnosewegen. 5)
								
								Das heißt Messungen der DAO oder des Histamins über den Urin oder den Stuhl haben sich als nicht aussagekräftig erwiesen. Damit bleibt, nach aktuellem Stand, nur eine rein klinische Diagnose (siehe oben) für die Histaminintoleranz übrig, da es (noch) keine verlässlichen Laborparameter gibt.
								
								<h3>Andere Diagnoseverfahren wie IgG Test, Auspendeln, Bioresonanz oder Speicheltests</h3>
								Der IgG Test mißt die Immunreaktion des körpereigenen Immunglobulin G. Diese Tests sind definitiv nicht geeignet, Laktoseintoleranz, Fructosemalabsorption oder Histaminintoleranz nachzuweisen! Infos dazu hier...  Auch andere am Markt angebotene Tests sind als unseriös einzustufen. Es gibt für die meisten dieser Tests, auch wenn sie sehr wissenschaftlich klingen und die Hersteller mit Positiv-Beispielen werben, keine Studien oder Evaluationen.
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
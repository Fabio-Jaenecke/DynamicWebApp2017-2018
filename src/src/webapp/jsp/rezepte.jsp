<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="../css/Rest/faq.css">
    <link rel="shortcut icon" href="../imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="../imgs/favicon.ico" type="image/x-icon">
    <script src="../js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
            <![endif]-->
    <div class="header-container">
        <header class="wrapper clearfix" style="max-height: 50px; padding-top: 15px;">
            <div class="flex-grid-thirds">
                <div class="col menugrid">
                    <span onclick="openNav()">&#9776;
                    <span class="menutext">&nbsp;Menu</span>
                </div>
                <div class="col titlegrid">Rezepte</div>
                <div class="col suchgrid">
                    <a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
                </div>
            </div>
            <nav>
                <div id="mySidenav" class="sidenav side-nav">
                    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
                    <a href="${pageContext.request.contextPath}/home/">Home</a>
                    <a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
                    <a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
                    <a class="active" href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
                    <a href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
                    <a href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
                    <a href="${pageContext.request.contextPath}/faq/">FAQ</a>
                </div>
            </nav>
        </header>
    </div>
    <div class="main-container">
        <div class="main wrapper clearfix">
            <header>
                <h2>Rezepte</h2>
            </header>
			<article>
				<section>
                    <h3>Kürbissuppe</h3>
					
                    <a name="neu1"></a>
                    <div id="text1" style="display: none">
                    	<img src="${pageContext.request.contextPath}/imgs/kuerbissuppe.jpg" alt="Kürbissuppe" height=100px>
                        <h4> Geeignet für die Karenzphase </h4> 
                        Für 4 Personen
                        <br> Zeit zum vorbereiten: 15 Min. + 15 Min. Garzeit
                        <br>
                        <h4> Zutaten: </h4>
                        2 Kartoffeln, 1 kleines Stück frischer Ingwer, 1 kg Kürbis, 1 rote Chilischote, 50 g Butter,
                        1 l Gemüsebrühe (hefe-frei), Salz, schwarzer Pfeffer, frisch gemahlen, 200 g Sahne, 1 EL Kürbiskerne,
                        1 EL Kürbiskernöl
                        <br>
                        <h4> Vorbereitung: </h4>
                        Die Kartoffeln und den Ingwer schälen und gross würfeln. Den Kürbis schälen, das weiche
                        Innere und die Kerne mit einem Löffel herausschaben und das Fruchtfleisch in Würfeln schneiden.
                        Die Chilischote entkernen und zerkleinern.
                        <br> Kartoffeln, Ingwer, Kürbis und Chili in einem grossen Topf in heisser Butter andünsten, mit
                        Gemüsebrühe ablöschen und mit Salz und Pfeffer würzen.
                        <br> 15 Min. lang kochen.
                        <br> Anschliessend die Sahne einrühren und die Suppe mit einem Pürierstab fein pürieren.
                        <br> Mit gehackten Kürbiskerne betreut und etwas Kürbiskernöl beträufelt servieren.
                    </div>
                    <a class="resp-sharing-button__link" onclick="text1.style.display='block';auf1.style.display='none';zu1.style.display='block'"
                        id="auf1" style="display: block" href="#neu1" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Show
                            </div>
                        </div>
                    </a>
                    <a class="resp-sharing-button__link" onclick="text1.style.display='none';auf1.style.display='block';zu1.style.display='none'"
                        id="zu1" style="display: none" href="#neu1" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Hide
                            </div>
                        </div>
                    </a>
                </section>
                <section>

                    <h3>Steak mit Kräuterkartoffeln</h3>

                    <a name="neu2"></a>
                    <div id="text2" style="display: none">
                   		<img src="${pageContext.request.contextPath}/imgs/SteakMitKrauterKartoffeln.jpg" alt="Steak mit Kräuterkartoffeln" height=100px>
                        <h4> Geeignet für die Karenzphase </h4> 
                        Für 4 Personen
                        <br> Zeit zum vorbereiten: 20 Min. + 1 Std. Garzeit
                        <br>
                        <h4> Zutaten:</h4>
                        4 sehr grosse Kartoffeln, 1 Bund Petersilie, 1 Bund Schnittlauch, 2 Knoblauchzehen, 8 schwarze
                        Oliven ohne Stein, 2 TL Kapern, 2 TL Pinienkerne, 8EL Olivenöl, Salz, schwarzer Pfeffer, frisch
                        gemahlen, 4 Rumpsteaks (zu jeweils 150 g), 2 EL Butterschmalz, 8 EL Kräuterbutter
                        <br>
                        <h4> Vorbereitung: </h4>
                        Kartoffeln in der Schale in Wasser 25 Min. garkochen. Den Backofen auf 200 Grand (Umluft 180
                        Grad) vorheizen.
                        <br> Petersilie und Schnittlauch waschen und fein schneiden. Knoblauch abziehen und klein schneiden.
                        Oliven, Kapern und Pinienkerne fein hacken.
                        <br> öl, die Kräuter und den Knoblauch sowie Salz und Pfeffer dazugeben und gut verrühren. Die
                        Kräuterpaste etwas ziehen lassen. Kartoffeln abgiessen, auskühlen lassen und in Alufolie wickeln.
                        <br> Bei 200 Grad etwa 15 Min. backen. Steaks von jeder Seite etwa 3 Min. im heissen Butterschmalz
                        anbraten und mit Salz und Pfeffer würzen.
                        <br> Die Kartoffeln aus dem Backofen nehmen, die Alufolie entfernen, längs einschneiden und mit
                        jeweils 2 EL Kräuterbitter füllen.
                        <br> Folienkartoffeln mit dem Steak anrichten und Kräuterdipp dazu reichen.
                    </div>
                    <a class="resp-sharing-button__link" onclick="text2.style.display='block';auf2.style.display='none';zu2.style.display='block'"
                        id="auf2" style="display: block" href="#neu2" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="trü" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Show
                            </div>
                        </div>
                    </a>
                    <a class="resp-sharing-button__link" onclick="text2.style.display='none';auf2.style.display='block';zu2.style.display='none'"
                        id="zu2" style="display: none" href="#neu2" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="trü" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Hide
                            </div>
                        </div>
                    </a>
                </section>
                <section>

                    <h3>Lachs im Filoteig</h3>

                    <a name="neu3"></a>
                    <div id="text3" style="display: none">
                    	<img src="${pageContext.request.contextPath}/imgs/lachsinFiloteig.jpg" alt="Lachs im Filoteig" height=100px> 
                        <h4>Geeignet für die Dauerernährung</h4>
                        Für 4 Personen
                        <br> Zeit zum vorbereiten: 40 Min. + 30 Min. Garzeit
                        <br>
                        <h4> Zutaten:</h4>
                        4 Lachsfilets (a 200 g), Salz, schwarzer Pfeffer, frisch gemahlen, 2 EL öl, 2 Blätter geröstete
                        Nori-Algen, 1 Blatt Filoteig (30x40 cm), 3 EL zerlassene Butter, 2 Granatäpfel, 1 EL Honig
                        <br>
                        <h4> Vorbereitung:</h4>
                        Lachfilets salzen und pfeffern und im heissen öl auf beiden Seiten anbraten. Herausnehmen und
                        etwas abkühlen lassen.
                        <br> Die Nori-Blätter halbieren und jeweils ein Lachsfilet darin einwickeln.
                        <br> Den Filoteig vorsichtig ausbreiten und die Teigplatte in 4 gleich grosse Stücke teilen, mit
                        1 EL zerlassener Butter bestreichen und die Lachstücke in den Teig einschlagen.
                        <br> Die Lachspäckchen in der restlichen Butter vorsichtig goldbraun braten.
                        <br> Die Fishpäckchen aus der Pfanne nehmen und für etwas Küchenkrepp abtropfen lassen.
                        <br> Granatäpfel halbieren und die Kerne herauslösen. Den dabei austretenden Saft auffangen, mit
                        4 EL Wasser und Honig vermischen und kurz erwärmen.
                        <br> Die Granatapfelkerne zu der Sauce geben, kurz abkühlen lassen und zusammen mit dem Fish anrichten.
                    </div>
                    <a class="resp-sharing-button__link" onclick="text3.style.display='block';auf3.style.display='none';zu3.style.display='block'"
                        id="auf3" style="display: block" href="#neu3" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Show
                            </div>
                        </div>
                    </a>
                    <a class="resp-sharing-button__link" onclick="text3.style.display='none';auf3.style.display='block';zu3.style.display='none'"
                        id="zu3" style="display: none" href="#neu3" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Hide
                            </div>
                        </div>
                    </a>
                </section>
                <section>

                    <h3>Blaubeer-Pfannkuchen</h3>

                    <a name="neu4"></a>
                    <div id="text4" style="display: none">
                    	<img src="${pageContext.request.contextPath}/imgs/blaubeerpfannkuchen.jpeg" alt="Blaubeer-Pfannkuchen" height=100px> 
                        <h4>Geeignet für die Karenzphase</h4>
                        Für 4 Personen
                        <br> Zeit zum vorbereiten: 15 Min. + 15 Min. Garzeit
                        <br>
                        <h4> Zutaten:</h4>
                        3 EL Butter, 2 Eier, 200 g Mehl, ½ TL Salz, ½ TL Backpulver, ½ TL Vanillepulver, 3 EL Zucker,
                        350 ml Buttermilch, öl, 200 g Blaubeeren
                        <br>
                        <h4> Vorbereitung:</h4>
                        Die Butter zerlassen. Die Eier leicht schaumig rühren.
                        <br> Mehl, Salz, Backpulver, Vanillepulver und Zucker in eine zweite Schüssel geben und Butter Eier
                        und Buttermilch in die Mitte giessen.
                        <br> Alle Zutaten gut vermengen.
                        <br> Eine Pfanne mit öl ausstreichen und jeweils ein viertel des Teigs einfüllen.
                        <br> Kurz vor dem Wenden je 50 g Blaubeeren auf den Pfannkuchen geben, danach die andere Seite goldbraun
                        ausbacken.
                    </div>
                    <a class="resp-sharing-button__link" onclick="text4.style.display='block';auf4.style.display='none';zu4.style.display='block'"
                        id="auf4" style="display: block" href="#neu4" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Show
                            </div>
                        </div>
                    </a>
                    <a class="resp-sharing-button__link" onclick="text4.style.display='none';auf4.style.display='block';zu4.style.display='none'"
                        id="zu4" style="display: none" href="#neu4" aria-label="">
                        <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                            <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                Hide
                            </div>
                        </div>
                    </a>
                </section>
            </article>
        </div>
        <!-- #main -->
    </div>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jqüry.min.js"></script>
    <script>window.jQüry || document.write('<script src="../js/vendor/jqüry-1.11.2.min.js"><\/script>')</script>
    <script src="../js/main.js"></script>
    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
    <script>
            (function (b, o, i, l, e, r) {
            b.GoogleAnalyticsObject = l; b[l] || (b[l] =
                function () { (b[l].q = b[l].q || []).push(arguments) }); b[l].l = +new Date;
                e = o.createElement(i); r = o.getElementsByTagName(i)[0];
                e.src = '//www.google-analytics.com/analytics.js';
                r.parentNode.insertBefore(e, r)
            }(window, document, 'script', 'ga'));
        ga('create', 'UA-XXXXX-X', 'auto'); ga('send', 'pageview');
    </script>
</body>

</html>
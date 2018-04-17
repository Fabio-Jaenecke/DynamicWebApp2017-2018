<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
                  <header class="wrapper clearfix" style="max-height: 75px;">
                  	<div class="flex-grid-thirds">
						  <div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div>
						  <div class="col titlegrid">FAQ</div>
						  <div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div>
					</div>
                     <nav>  
                        <div id="mySidenav" class="sidenav side-nav">
                            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
                            <a href="${pageContext.request.contextPath}/home/">Home</a>
                			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
                			<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
                			<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
                			<a href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
                			<a href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
                			<a class="active" href="${pageContext.request.contextPath}/faq/">FAQ</a>
                        </div>
                     </nav>
                     
                  </header>
               </div>
               <div class="main-container">
                  <div class="main wrapper clearfix">
                     <article>
                        <header>
                           
                           <h2>
                           <%@ page import ="faq.*" %>
                           
                           <%
                           Faq faq = new Faq();
                           out.println(faq.getQuestionOrAnswer(1).getQuestion()); 
                           %>
                           </h2>                         
                          
                           <a name="neu1"></a>
                           <div id="text1" style="display: none"><% out.println(faq.getQuestionOrAnswer(1).getAnswer()); %></div>
                           <a class="resp-sharing-button__link" onclick="text1.style.display='block';auf1.style.display='none';zu1.style.display='block'" id="auf1" style="display: block" href="#neu1" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Show
                                 </div>
                              </div>
                           </a>
                           <a class="resp-sharing-button__link" onclick="text1.style.display='none';auf1.style.display='block';zu1.style.display='none'" id="zu1" style="display: none" href="#neu1" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Hide
                                 </div>
                              </div>
                           </a>
                        </header>
                        <section>
                        
                           <h2>
                           
                           <% out.println(faq.getQuestionOrAnswer(2).getQuestion()); %>
                           
                           </h2>
                           
                           <a name="neu2"></a>
                           <div id="text2" style="display: none"><% out.println(faq.getQuestionOrAnswer(2).getAnswer()); %></div>
                           <a class="resp-sharing-button__link" onclick="text2.style.display='block';auf2.style.display='none';zu2.style.display='block'" id="auf2" style="display: block" href="#neu2" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Show
                                 </div>
                              </div>
                           </a>
                           <a class="resp-sharing-button__link" onclick="text2.style.display='none';auf2.style.display='block';zu2.style.display='none'" id="zu2" style="display: none" href="#neu2" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Hide
                                 </div>
                              </div>
                           </a>
                        </section>
                        <section>
                        
                           <h2>
                           
                           <% out.println(faq.getQuestionOrAnswer(3).getQuestion()); %>
                           
                           </h2>
                           <a name="neu3"></a>
                           <div id="text3" style="display: none"><% out.println(faq.getQuestionOrAnswer(3).getAnswer()); %></div>
                           <a class="resp-sharing-button__link" onclick="text3.style.display='block';auf3.style.display='none';zu3.style.display='block'" id="auf3" style="display: block" href="#neu3" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Show
                                 </div>
                              </div>
                           </a>
                           <a class="resp-sharing-button__link" onclick="text3.style.display='none';auf3.style.display='block';zu3.style.display='none'" id="zu3" style="display: none" href="#neu3" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Hide
                                 </div>
                              </div>
                           </a>
                        </section>
                        <section>
                           <h2>
                           
                           <% out.println(faq.getQuestionOrAnswer(4).getQuestion()); %>
                           
                           </h2>
                           <a name="neu4"></a>
                           <div id="text4" style="display: none"><% out.println(faq.getQuestionOrAnswer(4).getAnswer()); %></div>
                           <a class="resp-sharing-button__link" onclick="text4.style.display='block';auf4.style.display='none';zu4.style.display='block'" id="auf4" style="display: block" href="#neu4" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Show
                                 </div>
                              </div>
                           </a>
                           <a class="resp-sharing-button__link" onclick="text4.style.display='none';auf4.style.display='block';zu4.style.display='none'" id="zu4" style="display: none" href="#neu4" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Hide
                                 </div>
                              </div>
                           </a>
                        </section>
                        <section>
                           <h2>
                           
                           <% out.println(faq.getQuestionOrAnswer(5).getQuestion()); %>
                           
                           </h2>
                           <a name="neu5"></a>
                           <div id="text5" style="display: none"><% out.println(faq.getQuestionOrAnswer(5).getAnswer()); %></div>
                           <a class="resp-sharing-button__link" onclick="text5.style.display='block';auf5.style.display='none';zu5.style.display='block'" id="auf5" style="display: block" href="#neu5" aria-label="">
                              <div class="resp-sharing-button resp-sharing-button--faq resp-sharing-button--small">
                                 <div aria-hidden="true" class="resp-sharing-button__icon resp-sharing-button__icon--solid">
                                    Show
                                 </div>
                              </div>
                           </a>
                           <a class="resp-sharing-button__link" onclick="text5.style.display='none';auf5.style.display='block';zu5.style.display='none'" id="zu5" style="display: none" href="#neu5" aria-label="">
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

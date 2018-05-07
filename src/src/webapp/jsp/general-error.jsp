<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/faq.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
            <![endif]-->
    <div class="header-container">
        <header class="wrapper clearfix">
            <div class="flex-grid-thirds">
                <div class="col menugrid">
                    <span onclick="openNav()">&#9776;
                    <span class="menutext">&nbsp;Menu</span>
                </div>
                <div class="col titlegrid">Error</div>
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
               	<img src="${pageContext.request.contextPath}/imgs/general-error.png" alt="General Error" height="50%" width="50%">
          		<h2>We're sorry, but something went wrong!</h2>
                	<p style='color: red;'><strong>Status Code:</strong> ${pageContext.errorData.statusCode}</p>
             		<p style='color: red;'>Please get in contact with the development-team or come back later again.<br></p>
             </article>
        </div>
        <!-- #main -->
    </div>
    <div class="main-container">
        <div class="main wrapper clearfix">
	       <table class="table_contact">
	            <thead>
	            <tr>
	                <th colspan="2">Send us an email:</th>
	            </tr>
	            </thead>
	            <tbody>
	            <tr>
	                <td>
	                    <a class="resp-sharing-button__link" href="mailto:trebomic@students.zhaw.ch"
	                       target="trebomic@students.zhaw.ch" aria-label="">
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
        </div>
    </div>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
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

<%-- 
    Document   : Connexion
    Created on : 24 juil. 2016, 00:35:14
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion passager</title>
        <link href="CSS/label.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        
        <form method="post">
            <div style="overflow: hidden;" align="center">
<!--            <a href=""><img src="Images/logo.png" alt="drive commerces"></a>-->
<br/>
            <center><h2>Connexion passager</h2></center>
            </div>
            
            <label for="login">Identifiant</label>
            <input type="text" name="login" /> <br/><br/>
            <label for="pass">Mot de passe</label>
            <input type="password" name="password" /> <br/><br/>
            <input type="submit" value="Valider" /> <br/><br/>
            <div align="right"><a href="inscription_client"><h2>S' INSCRIRE ?</h2></a></div>
        </form>
       
    </body>
</html>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>Ajouter un parking</TITLE>
		
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script type="text/javascript">
//<link rel="stylesheet" type="text/css" href="/Parking/css/test.css">
/*
 fonction pour vérifier les champs du formulaire après validation (submit)
 
	$(function(){
		$("#envoyer").click(function(){ 
			//si le valid est à true le formulaire sera envoyer, à false il affichera les erreurs
			valid =true;
			//si le nom n'est pas remplit on affiche le message d'erreur ( de base le message est invisible via le css "display:none")
			if($("#nom").val()==""){
				$("#nom").next(".error-message").fadeIn().text("Veuillez entrer votre nom");
				valid =false;
			}
			//expression régulière vérifie si ce n'est que des lettres minuscules ou majuscule
			else if(!$("#nom").val().match(/^[a-z]+$/i)){
				$("#nom").next(".error-message").fadeIn().text("Veuillez entrer un nom valide");
				valid =false;
			}
			//si le champ est bien remplit on met labordure en vert et on chache l'erreur
			else{
				$("#nom").next(".error-message").fadeOut();
				$("#nom").css("border-color","green");
			}
			if($("#adresse").val()==""){
				$("#adresse").next(".error-message").fadeIn().text("Veuillez entrer votre adresse");
				valid =false;
			}
			else{
				$("#adresse").next(".error-message").fadeOut();
				$("#adresse").css("border-color","green");
			}
			return valid;
			
			});
	});
	*/
	
// vérification dynamique du formulaire

	$(function(){
		$("#nom").keyup(function(){ 
				if(!$("#nom").val().match(/^[a-z]+$/i)){
					$("#nom").next(".error-message").show().text("Veuillez entrer un nom valide");
				}
				else{
					$("#nom").next(".error-message").hide().text("");
					$("#nom").css("border-color","green");
				}
		});
	});
	
	$(function(){
		$("#adresse").keyup(function(){ 
				if(!$("#adresse").val().match(/^[a-z0-9]+$/i)){
					$("#adresse").next(".error-message").show().text("Veuillez entrer une adresse valide");
				}
				else{
					$("#adresse").next(".error-message").hide().text("");
					$("#adresse").css("border-color","green");
				}
		});
	});
	
	$(function(){
		$("#mdp").keyup(function(){ 
				if(!$("#mdp").val().match(/^[a-z0-9]+$/i)){
					$("#mdp").next(".error-message").show().text("Veuillez entrer un mot de passe valide");
				}
				else{
					$("#mdp").next(".error-message").hide().text("");
					$("#mdp").css("border-color","green");
				}
		});
	});

</script>	
	</HEAD>

	
	<BODY BGCOLOR="silver" >

	<h1 ALIGN="CENTER">Ajout</h1>
	
	<FORM  ACTION="../parkingservlet">
	
	  Nom de l'annonce:  <INPUT TYPE="TEXT" id="nom" NAME="nom" size="30">
	  <span class="error-message">erreur</span><br>
	  Adresse: <INPUT TYPE="TEXT" id="adresse" NAME="adresse" size="30">
	  <span class="error-message">erreur</span><br>
	  Mot de passe: <INPUT TYPE="TEXT" id="mdp" NAME="mdp" size="30">
	  <span class="error-message">erreur</span><br>
	  Prix:  <INPUT TYPE="TEXT" NAME="prix"><BR>
	  Price:  
	  <INPUT TYPE="checkbox" NAME="price1" value ="no">Prix1
	  <INPUT TYPE="checkbox" NAME="price2" value ="yes">Prix2<BR>
	  <INPUT TYPE="SUBMIT" value="envoyer" id="envoyer">
	  
	</FORM>
	<script >

	</script>
	</BODY>
</HTML>
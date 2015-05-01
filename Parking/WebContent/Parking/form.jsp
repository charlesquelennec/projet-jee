<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>Ajouter un parking</TITLE>
		
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script type="text/javascript">
//<link rel="stylesheet" type="text/css" href="/Parking/css/test.css">

 /*fonction pour vérifier les champs du formulaire après validation (submit) et de bloquer si nécessaire la validation*/
 
	$(function(){
		$("#envoyer").click(function(){ 
			
			//si le valid est à true le formulaire sera envoyer, à false il affichera les erreurs
			valid =true;
			
			/*check le nom */
			
			//si le nom n'est pas remplit on affiche le message d'erreur ( de base le message est invisible via le css "display:none")
			if($("#nom").val()==""){
				valid =false;
			}
			//expression régulière vérifie si ce n'est que des lettres minuscules ou majuscule
			else if(!$("#nom").val().match(/^[a-z]+$/i)){
				valid =false;
			}
			//si le champ est bien remplit on met labordure en vert et on chache l'erreur
			else{
				$("#nom").css("border-color","green");
			}
			
			/* On fait de même pour les autres éléments du formulaire*/
			
			/*check l'adresse */
			if($("#adresse").val()==""){
				valid =false;
			}
			else if(!$("#adresse").val().match(/^[a-z0-9]+$/i)){
				valid =false;
			}
			else{
				$("#adresse").css("border-color","green");
			}
			return valid;
			
			/*check le mot de passe */
			if($("#mdp").val()==""){
				valid =false;
			}
			else if(!$("#mdp").val().match(/^[a-z0-9]+$/i)){
				valid =false;
			}
			else{
				$("#mdp").css("border-color","green");
			}
			return valid;
			
			/*check le prix*/
			if($("#mdp").val()==""){
				valid =false;
			}
			else if(!$("#mdp").val().match(/^[a-z0-9]+$/i)){
				valid =false;
			}
			else{
				$("#mdp").css("border-color","green");
			}
			return valid;
			
			
			});
	});
	
	
// vérification dynamique du formulaire

/* On vérifie que le nom est valide sinon on affiche l erreur en temps réelle */

	$(function(){
		
		/* utilisation de l'event keyup */
		
		$("#nom").keyup(function(){ 
			/* test de l'expression régulière */
				if(!$("#nom").val().match(/^[a-z]+$/i)){
			/*affiche le message d'erreur*/
					$("#nom").next(".error-message").show().text("Veuillez entrer un nom valide");
				}
				else{
			/* cache le message d'erreur */
					$("#nom").next(".error-message").hide().text("");
			/* change de couleur la bordure */
					$("#nom").css("border-color","green");
				}
		});
	});
	
	/* on refait la même chose pour tout les autres champs */
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
	$(function(){
		$("#prix").keyup(function(){ 
				if(!$("#prix").val().match(/^[0-9]+$/)){
					$("#prix").next(".error-message").show().text("Veuillez entrer un nombre");
				}
				else{
					$("#prix").next(".error-message").hide().text("");
					$("#prix").css("border-color","green");
				}
		});
	});

</script>
<style type="text/css"><%@ include file="test.css" %></style>	
	</HEAD>

	
	<BODY>
	<div id="container">
	<h1 ALIGN="CENTER">Formulaire Type</h1>
	
	<FORM  ACTION="../parkingservlet">
	
	  Nom de l'annonce:  <br><INPUT TYPE="TEXT" id="nom" NAME="nom" size="30">
	  <span class="error-message">erreur</span><br><br>
	  Adresse: <br><INPUT TYPE="TEXT" id="adresse" NAME="adresse" size="30">
	  <span class="error-message">erreur</span><br><br>
	  Mot de passe: <br><INPUT TYPE="TEXT" id="mdp" NAME="mdp" size="30">
	  <span class="error-message">erreur</span><br><br>
	  Prix:  <br><INPUT TYPE="TEXT" id="prix" NAME="prix" >
	  <span class="error-message">erreur</span><br><br>
	  Price:  
	  <INPUT TYPE="checkbox" NAME="price1" value ="no">Prix1
	  <INPUT TYPE="checkbox" NAME="price2" value ="yes">Prix2<BR><br>
	  <INPUT TYPE="SUBMIT" value="envoyer" id="envoyer">
	  
	</FORM>
	<script >

	</script>
	</div>
	</BODY>
</HTML>
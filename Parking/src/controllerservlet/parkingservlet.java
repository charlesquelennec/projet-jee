package controllerservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class parkingservlet
 */
@WebServlet("/parkingservlet")
public class parkingservlet extends HttpServlet {
  

	
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/Parking/addparkingform.jsp";
	public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_ADRESSE = "adresse";
    public static final String CHAMP_PRIX = "prix";
    public static final String ATT_ERREURS  = "erreurs";
    public static final String ATT_RESULTAT = "resultat";
    /**
     * Default constructor. 
     */
    public parkingservlet() {
        // TODO Auto-generated constructor stub
    }
 
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Affichage de la page du formulaire */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    	/* Récupération des champs du formulaire. */
    	 String resultat;
         Map<String, String> erreurs = new HashMap<String, String>();

        String adresse = request.getParameter( CHAMP_ADRESSE );
        String prix = request.getParameter( CHAMP_PRIX );
        String nom = request.getParameter( CHAMP_NOM );	
        /* Validation du champ email. */
        try {
            validationAdresse( adresse );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_ADRESSE, e.getMessage() );
        }

        /* Validation des champs mot de passe et confirmation. */
        try {
            validationPrix( prix );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_PRIX, e.getMessage() );
        }

        /* Validation du champ nom. */
        try {
            validationNom( nom );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_NOM, e.getMessage() );
        }

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'inscription.";
        } else {
            resultat = "Échec de l'inscription.";
        }
    request.setAttribute( ATT_ERREURS, erreurs );
    request.setAttribute( ATT_RESULTAT, resultat );

    /* Transmission de la paire d'objets request/response à notre JSP */
    this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    private void validationAdresse( String adresse ) throws Exception{}
    private void validationPrix( String prix) throws Exception{}
    private void validationNom( String nom ) throws Exception{}
    
    
}

package fr.algorithmie;

import static org.hamcrest.CoreMatchers.instanceOf;

import javax.xml.transform.Templates;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// NE PAS CHANGER LES NOMS
	// mais vous pouvez modifier les valeurs contenues dans array
	int[] array = { 0, 1, 2, 3};

	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Effectuez une rotation à droite des éléments du tableau array
		// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3,0,1,2}
		// après rotation
		
		// TODO Afficher le contenu du tableau après rotation avec Resultat.log
		   
		   
		
	 //determine le nbr de fois qui va etre decaler
		int n = 1;
		
		 //Displays original array    
        //Resultat.log("Original tableau : ");    
        //for (int i = 0; i < array.length; i++) {     
        //	Resultat.log(array[i]);     
        //}   
        
        
        //rotation par n du tableau
        for(int i = 0;i < n; i++) {
        	
         //initialise les variables
        	int j; int last;
        	
        	last = array[array.length - 1];
        	
        	for(j = array.length - 1; j > 0; j--) {
        		
            //decale un element par 1
        		
        		array[j] = array[j - 1];
        	}
        	//dernier element devient le 1er
        	array[0] = last;
        }
        
        
        //Displays resulting array after rotation    
        //Resultat.log("Tableau apres rotation : ");    
        for(int i = 0; i < array.length;i++){    
        	Resultat.log(array[i]);    
        }    
	}
	
	
	
  }



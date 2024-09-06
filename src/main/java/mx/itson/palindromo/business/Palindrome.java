/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.palindromo.business;

/**
 * Clase de métodos
 * @author Evelyn Guzman
 */


public class Palindrome {
    //replaceAll
    
    /**
     * Metodo para identificar si una frase/palabra el políndromo.
     * @param phrase La frase a identificar.
     * @return Retorna true si es políndromo y false si no lo es.
     */
      public static boolean isPalindrome(String phrase) {
        String textNew = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();;
        String textReversed = new StringBuilder(textNew).reverse().toString();
        return textNew.equals(textReversed);

    }

    }





/*
       public String deshacer(String palindromoBueno){
        
       return palindromoBueno + "jaajajjaj"; 
           
       }
       */


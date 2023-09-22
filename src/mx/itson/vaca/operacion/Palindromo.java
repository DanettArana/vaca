/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.vaca.operacion;



/**
 *
 * @author arana
 */
public class Palindromo {
    public static boolean esPalindromo(String frase) {
                
      // Limpiar la cadena de texto para la verificación
        frase = frase.trim().toLowerCase();
        frase = frase.replace(" ", "")
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace("!", "")
                .replace("¡", "")
                .replace(",", "");
        
        // Calculamos la longitud de la cadena de texto
        int longitud = frase.length();
        //Se inicializa la variable palindromo como true, asumiendo inicialmente que la cadena es un palíndromo. 
        boolean palindromo = true;
        // Convertimos la cadena a un array de caracteres para comparar los caracteres en posiciones específicas del array 
        char[] caracteres = frase.toCharArray();
    
        // Comparamos los caracteres desde los extremos hacia el centro
        for (int i = 0; i < longitud / 2; i++) {
        if (caracteres[i] != caracteres[longitud - i - 1]) {
         
        palindromo = false;
        break; // No es un palíndromo, podemos salir del bucle
            }
        }

         return palindromo;
         
         
         
    }

       
       } 



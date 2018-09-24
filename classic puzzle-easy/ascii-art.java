import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    
    static final int ALPHABET_LEN = 26;
    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt(); // Ancho de la letra (siempre será 4)
        int H = in.nextInt(); // Largo de la letra (siempre será 5)
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine(); // El texto a imprimir en ASCII Art
        String[] TArray = T.split("");
        int totalInputLetters = TArray.length;
        
        // Esto ya venía con el código original
        for (int i = 0; i < H; i++) {
            
            String ROW = in.nextLine(); // Cada una de las 5 líneas en ASCII Art
            String resultRow = "";
            
            // Iteraciones para cada una de las letras pedidas y que se impriman por pantalla
            for (int j = 0; j < totalInputLetters; j++) {
                String letterToPrint = TArray[j].toUpperCase();
                
                // En caso de caracter no reconocido en ALPHABET, concatena "?"
                if (!ALPHABET.contains(letterToPrint)) {
                    resultRow = resultRow.concat(ROW.substring(ROW.length() - L, ROW.length() - 1)).concat(" ");
                }
                else {
                    resultRow = resultRow.concat(ROW.substring( L * ALPHABET.indexOf(letterToPrint), L * ALPHABET.indexOf(letterToPrint) + L));
                }
            }
            
            System.out.println(resultRow);
        }
    }
}
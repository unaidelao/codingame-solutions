using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

class Solution
{
    const int ALPHABET_LEN = 26;
    const string ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    static void Main(string[] args)
    {
        int L = int.Parse(Console.ReadLine()); // Ancho de la letra (siempre será 4)
        int H = int.Parse(Console.ReadLine()); // Largo de la letra (siempre será 5)
        string T = Console.ReadLine(); // El texto a imprimir en ASCII Art
        int totalInputLetters = T.Length;

        // Esto ya venía con el código original
        for (int i = 0; i < H; i++)
        {
            string ROW = Console.ReadLine(); // Cada una de las 5 líneas en ASCII Art
            string resultRow = "";
            
            // Iteraciones para cada una de las letras pedidas y que se impriman por pantalla
            for (int j = 0; j < totalInputLetters; j++)
            {
                string letterToPrint = T[j].ToString().ToUpper();
                
                // En caso de caracter no reconocido en ALPHABET, concatena "?"
                if (!ALPHABET.Contains(letterToPrint))
                {
                    resultRow += ROW.Substring(ROW.Length - L, L);
                }
                else
                {
                    resultRow += ROW.Substring( L * ALPHABET.IndexOf(letterToPrint), L);
                }
            }
            
            Console.WriteLine(resultRow);
        }
    }
}
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution
{
    static void Main(string[] args)
    {
        string MESSAGE = Console.ReadLine();

        MESSAGE = StringToBinary(MESSAGE);
        Console.WriteLine(ChuckNorrisEncode(MESSAGE));
    }
    
    // Método para transformar un string en un string binario
    static string StringToBinary(string s)
    {
        string binaryStr = "";
        for (int i = 0; i < s.Length; i++)
        {
            string temp = "";
            temp = Convert.ToString(s[i], 2).PadLeft(7, '0');
            
            // Añade 0 a la izquierda en caso necesario, para tener 7 bits
            if (temp.Length % 7 != 0)
            {
                temp = "0" + temp;
            }
            binaryStr += temp;
        }
        return binaryStr;
    }
    
    // Método que recibe el string binario y lo transforma a codificación Chuck Norris
    static string ChuckNorrisEncode(string binaryStr)
    {
		// Después, al encode Chuck Norris
		String result = "";
		int repeatedElements = 0;
		while (binaryStr != "")
		{
			if (binaryStr[0] == '1')
			{
				result += "0 0";
				binaryStr = binaryStr.Substring(1);
				for (int j = 0; j < binaryStr.Length; j++)
				{
					if (binaryStr[j] == '1')
					{
						result += "0";
						repeatedElements++;
					}
					else
					{
						break;
					}
				}
				result += " ";
				binaryStr = binaryStr.Substring(repeatedElements);
				repeatedElements = 0;
			}
			else if (binaryStr[0] == '0')
			{
				result += "00 0";
				binaryStr = binaryStr.Substring(1);
				for (int k = 0; k < binaryStr.Length; k++)
				{
					if (binaryStr[k] == '0')
					{
						result += "0";
						repeatedElements++;
					}
					else
					{
						break;
					}
				}
				result += " ";
				binaryStr = binaryStr.Substring(repeatedElements);
				repeatedElements = 0;
			}
		}
        
        // Substring necesario para quitar el espacio final
		return result.Substring(0, result.Length -1);
	}
}
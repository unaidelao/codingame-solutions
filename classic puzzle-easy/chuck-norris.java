import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        System.out.println(chuckNorrisEncode(MESSAGE));
    }
    
    public static String chuckNorrisEncode(String s) {
		// Primero se pasa a binario
		// Esta parte se podría refactorizar sacándola a un método
		String binaryStr = "";
		for (int i = 0; i < s.length(); i++) {
		    String temp = "";
			temp = Integer.toBinaryString(s.charAt(i)) + "";
			// Se añade un 0 al principio en caso necesario para tener 7 bits
			if (temp.length() % 7 != 0) {
			    temp = "0" + temp;
			}
			binaryStr += temp;
		}
		
		// Después, al encode Chuck Norris
		String result = "";
		int repeatedElements = 0;
		while (!binaryStr.isEmpty()) {
			if (binaryStr.charAt(0) == '1') {
				result += "0 0";
				binaryStr = binaryStr.substring(1);
				for (int j = 0; j < binaryStr.length(); j++) {
					if (binaryStr.charAt(j) == '1') {
						result += "0";
						repeatedElements++;
					}
					else {
						break;
					}
				}
				result += " ";
				binaryStr = binaryStr.substring(repeatedElements);
				repeatedElements = 0;
			}
			else if (binaryStr.charAt(0) == '0'){
				result += "00 0";
				binaryStr = binaryStr.substring(1);
				for (int k = 0; k < binaryStr.length(); k++) {
					if (binaryStr.charAt(k) == '0') {
						result += "0";
						repeatedElements++;
					}
					else {
						break;
					}
				}
				result += " ";
				binaryStr = binaryStr.substring(repeatedElements);
				repeatedElements = 0;
			}
		}
        
        // Substring necesario para quitar el espacio final
		return result.substring(0, result.length() -1);
	}
}
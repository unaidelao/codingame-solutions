import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next(); // long usuario
        Double lonUser = strToDouble(LON);
        
        String LAT = in.next(); // tat usuario
        Double latUser = strToDouble(LAT);
        
        int N = in.nextInt(); // número de desfibriladores
        
        // Limpieza de Scanner
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        // Se declara una Tabla para info de los desfibriladores
        String[][] defibs = new String[N][6];
        
        // Info completa de cada uno de los defibriladores
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            
            // Procesamiento de la info de cada desfibrilador
            String[] defibInfo = DEFIB.split(";");
            // Se le quita el ; extra a la longitud del desfibrilador
            defibInfo[4] = defibInfo[4].substring(0);
            // Se inserta la info en la tabla defibs
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 6; k++) {
                    defibs[i][k] = defibInfo[k];
                }
            }
        }
        
        
        // Array con las distancias del usuario a los desfibriladores
        double[] distances = new double[N];
        
        for (int index = 0; index < distances.length; index++) {
            distances[index] = distance(lonUser, latUser, strToDouble(defibs[index][4]), strToDouble(defibs[index][5]));
        }
        
        // Toma el índice de la menor distancia
        int resultIndex = minDistanceIndex(distances);
        
        // Imprime resultado final por pantalla
        System.out.println(defibs[resultIndex][1]);
    }
    
    /*
     * Método para convertir un String en double
     */
    public static double strToDouble(String s) {
        String res = s.replaceAll(",", ".");
        return Double.parseDouble(res);
    }
    
    /*
     * Método para calcular la distancia entre dos puntos
     */
    public static double distance(double lonA, double latA, double lonB, double latB) {
        return Math.sqrt((Math.pow((lonB - lonA), 2) + Math.pow(latB - latA, 2))) * 6371;
    }
    
    /*
     * Método para retornar el índice de la menor distancia
     */
    public static int minDistanceIndex(double[] arr) {
        double minVal = arr[0];
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
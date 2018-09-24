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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        // Se declara el HashMap
        HashMap <String, String>  hmap = new HashMap<String, String>();
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            
            // Se añaden tales valores a hmap
            hmap.put(EXT.toLowerCase(), MT);
        }
        in.nextLine();
        
        // DEBUG
        System.err.println("hmap --> "+ hmap);
        
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            // DEBUG
            System.err.println("Fname --> " + FNAME);
            
            // Extensión de FNAME
            String extension = "";
            if (FNAME.contains(".") || FNAME.charAt(0) == '.') {
                int lastDot = FNAME.lastIndexOf('.');
                extension = FNAME.substring(lastDot + 1).toLowerCase();
            }
            else {
                extension = null;
            }
            
            // Debug
            System.err.println("Extensión --> " + extension);
            
            if (hmap.containsKey(extension)) {
                System.out.println(hmap.get(extension));
            }
            else {
                System.out.println("UNKNOWN");
            }
        }
    }
}
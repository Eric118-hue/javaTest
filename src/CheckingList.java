
import java.util.ArrayList;

public class CheckingList {
	
	 public static void FecthResult(ArrayList<Integer> liste) {
	        for (int nbre : liste) {
	            if (nbre % 3 == 0 && nbre % 5 == 0) {
	                System.out.println("FluzzGratz");
	            } else if (nbre % 3 == 0) {
	                System.out.println("Fluzz");
	            } else if (nbre % 5 == 0) {
	                System.out.println("Gratz");
	            } else {
	                System.out.println(nbre);
	            }
	        }
	    }
	
    public static void main(String[] args) {
    	
        // Déclaration de la liste de nombres
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(2);
        liste.add(3);
        liste.add(5);
        liste.add(15);
        liste.add(7);
        
        FecthResult(liste);
    }
}

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tss
 */
public class Scambio { 
    // algoritmo: start; leggo n1,n2; assegno a z <=n1; assegno a n1<=n2; assegno a n2<=z; stampo n1, n2; end
    public static void main(String[] args) {
        
        // leggo i due numeri
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci il primo numero: ");
        int n1 = s.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int n2 = s.nextInt();
        
        int z = n1;
        n1 = n2;
        n2 = z;
        
        System.out.println("Effettuo scambio!!");
        
        System.out.println("Il primo numero vale" + n1 + ", Il secondo nuemro vale" + n2);
        
        // la stessa cosa si può fare in maniera alternativa usando: System.out.println(String.format("n1 vale %s, n2 vale %S", n1, n2));
        System.out.println(String.format("Il primo numero vale %s, Il secondo numero vale %S", n1 , n2));
        
        
    }
    
}

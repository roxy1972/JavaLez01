
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
public class pari_dispari {
    // algoritmo: start - leggo n1; if (N1 multiplo di 2) stampo pari; else stampo dispari; end
    public static void main(String[] args) {
        // leggo n1
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci il numero: ");
        int n1 = s.nextInt();
        
        // assegno alla variabile risultato sia tipo float che al dividendo f, c'è anche il modo per ottenere il resto di una divisione
        float risultato= n1/2f;
        int resto = n1 % 2;
               
        System.out.println(String.format("Risultato: %s", risultato));
       
        // se il resto è uguale a 0 quindi sarà pari
        if (resto==0) {
            System.out.println("Il numero è pari!!");
        }else {
            System.out.println("Il numero è dispari!!");
        };
                
        
    }
    
}

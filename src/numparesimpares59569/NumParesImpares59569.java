/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares59569;

/**
 *
 * @author amigo
 */
public class NumParesImpares59569 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 0;
        int suma_par = 0;
        int suma_impar = 0;
        
        while (numero < 101){
            if (numero% 2 == 0){
                suma_par += numero;
            }  else {
                suma_impar += numero;
            }
        numero++;    
        }
        
        System.out.println("Suma par es = " + suma_par);
        System.out.println("Suma impar es = " + suma_impar);
        
  }
       
    
    


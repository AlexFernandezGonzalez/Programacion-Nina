
package boletin15;

import java.util.Scanner;


public class CalcularLetraNIF {
    int numDNI;
    int resto;
    
    public void calcularResto(){
        System.out.println("Escribe tu DNI");
        Scanner sc2 = new Scanner(System.in);
        numDNI = sc2.nextInt();
        
        resto=numDNI%23;
        System.out.println("El resto sería :"+resto);
    }
    public void calcularLetra(){
           char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
           System.out.println("La letra de tu DNI es : "+letras[resto]);
    }
}

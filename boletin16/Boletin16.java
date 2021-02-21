
package boletin16;


public class Boletin16 {

   
    public static void main(String[] args) {
        //Ejercicio 1
        Numeros obx1 = new Numeros();
        int[] num = new int[10];
        System.out.println("--- EJERCICIO 1 ---");
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Los numeros que se intrujeron son: ");
        num = obx1.creamosArray();
        // Quiero que me confirme todos los números que ingresé
        obx1.calculoNumeros();
        
        //Ejercicio 2
        System.out.println("   ");
        System.out.println("--- EJERCICIO 2 ---");
        System.out.println("   ");
        Altura obx2 = new Altura();
        obx2.alturaMedia();
        
        
        //Ejercicio 3
        System.out.println("   ");
        System.out.println("--- EJERCICIO 3 ---");
        System.out.println("   ");
        Concatenar obx3 = new Concatenar();
        obx3.concatenarTexto();
        
        //Ejercicio 4
        System.out.println("   ");
        System.out.println("--- EJERCICIO 4 ---");
        System.out.println("   ");
        Mayuscula obx4 = new Mayuscula();
        obx4.amosarMaiusculas();
        
        
        
    }
    
}

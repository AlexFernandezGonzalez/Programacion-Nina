
package boletin16;

import javax.swing.JOptionPane;


public class Numeros {
    
    int[] numeros = new int[10];
    int pares;
    int negativos;
    
    
    public int[] creamosArray(){
        for (int i=0;i<numeros.length;i++){
        int mensaxe = Integer.parseInt(JOptionPane.showInputDialog("Escribe 10 números enteiros"));
        numeros[i] = mensaxe;
        System.out.println(numeros[i]);
     
        }
        
      return numeros;
      
    }
    public void calculoNumeros(){
        for (int i=0;i<numeros.length;i++){
            if(numeros[i]%2==0){
               pares++;               
            }
            if(numeros[i]<0){
                negativos++;
            }
                    
        }
        System.out.println("Hay "+pares+" números pares");
        System.out.println("(Hay "+(10-pares)+" numeros impares)");
        System.out.println("Hay "+negativos+" números negativos");
        System.out.println("(Hay "+(10-negativos)+" números positivos)");
    }
    
    
    
    
    
}

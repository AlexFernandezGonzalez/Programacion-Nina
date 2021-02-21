
package boletin16;

import javax.swing.JOptionPane;


public class Altura {
    int n; // n = numero de personas que se quieren pesar 
    int alt;
    int[] altura = new int[n];
    
    public int[] alturaMedia(){
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Escribe cuantas personas quieres pesar : ")); 
        for(int i=0;i<n;i++){
            
            alt = Integer.parseInt(JOptionPane.showInputDialog("Escribe la altura de las personas "));
            System.out.println(alt);
            altura[i] = alt;
            

        }
        
        return altura;
    }
    
}

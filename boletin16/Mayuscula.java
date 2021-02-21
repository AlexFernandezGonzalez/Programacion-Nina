
package boletin16;


public class Mayuscula {
    
    String txt3 = new String ("javeros");
    
    
    public void amosarMaiusculas(){
        System.out.println("El texto original es "+txt3);
        txt3 =  txt3.toUpperCase();
        System.out.println("El texto en mayusculas :"+txt3);
        txt3 = txt3.toLowerCase();
        System.out.println("Ahora el texto vuelve a estar en minusculas :");
        System.out.println(txt3);
        
        
        
        
    }
    
}

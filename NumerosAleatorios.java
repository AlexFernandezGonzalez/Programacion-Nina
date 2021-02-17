
package boletin15;


public class NumerosAleatorios {
   
    int numero1[] = new int[6];
    
    public int[] creacionArray(){
        System.out.println("Numeros: ");
        for(int i=0; i<numero1.length;i++){
            int numRandom = (int) (Math.random()*50+1);
            numero1[i] = numRandom;  
        }
        return numero1;
    }
    
    public void amosarArray(int numeros[]){
        for (Integer elemento:numeros){
            System.out.println(elemento);
        }
    }
    
    public void amosarArrayOrdenado(int numeros[]){
        System.out.println("Visualizamos el array del revés: ");
        System.out.println("Numero 6: "+numeros[5]);
        System.out.println("Numero 5: "+numeros[4]);
        System.out.println("Numero 4: "+numeros[3]);
        System.out.println("Numero 3: "+numeros[2]);
        System.out.println("Numero 2: "+numeros[1]);
        System.out.println("Numero 1: "+numeros[0]);
        
    }
    
    
}

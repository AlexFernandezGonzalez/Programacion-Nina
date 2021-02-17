
package boletin15;

import java.util.Scanner;

public class NotasProgramacion {
    
    int notas1[] = new int[30];
    int alumnosAprobados;
    int media;
    int mayor = 0;
    
    
    
    public int[] creacionArray2(){
        for(int i=0; i<notas1.length;i++){
            int notRandom = (int) (Math.random()*10+1);
            notas1[i] = notRandom;  
        }
        return notas1;
    }
    
    
    public void amosarArray2(int notas[]){
        for(Integer element:notas){
            System.out.println(element);
        }
       
    }
    
   
    public void amosarAprobados(){
        System.out.println("Lista de alumnos que aprobaron: ");
        for(int i=0;i<notas1.length;i++){
            if(notas1[i]>=5){
                System.out.println("Alumno "+i+" :"+notas1[i]);
                alumnosAprobados++; 
                
            }   
            
        } 
        System.out.println("    ");
        System.out.println("Hay "+alumnosAprobados+" alumnos aprobados");
        System.out.println("Hay "+(notas1.length-alumnosAprobados)+" alumnos suspensos");
    }
    
    public void notaMedia(){
               
        for(int i=0;i<notas1.length;i++){
            media=media + notas1[i];
            
        }
        media = media / notas1.length;
        System.out.println("   ");
        System.out.println("La nota media de programacion es : "+media);
    }
    
    public void notaAlta(){
        for(int i=0;i<notas1.length;i++){
            if(notas1[i]>mayor){
                mayor=notas1[i];
            } 
            
        }
        System.out.println("   ");
        System.out.println("La nota más alta es un "+mayor);
    }
    //-----------Ejercicio-3------------
    
  String[] nombre1 = new String[30];
     
  public void crearArrayAlumnos(){
       for(int i=0;i<nombre1.length;i++){          
           nombre1[i]="A"+i;
           System.out.println(nombre1[i]);     
           
           }
       }  
  
   public void amosarAlumno(){
       System.out.println("(Escribe la posicion de un alumno: ");
       Scanner sc = new Scanner (System.in);
       int alumno = sc.nextInt();
       System.out.println("El alumno correspodiente a la posicion "+alumno+" es "+nombre1[alumno-1]+")");
               
   }
     
     public void amosarAlumnosAprobados(){
         for(int i=0;i<nombre1.length;i++){
             nombre1[i]="A"+i;
           System.out.println(nombre1[i]);
             
         
         for(int j=0;j<notas1.length;j++){
             if(notas1[j]>=5){
                 
             }
            
         }  
         System.out.println("El alumno "+nombre1[i]+" aprobó y sacó un "+notas1[j]);
         }
         
         
         
     }
   
    
    
}
    
   
        
   
    

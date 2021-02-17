
package boletin15;

import java.util.Scanner;

public class NombresAlumnos {
    
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
       System.out.println("El alumno correspodiente a la posicion "+alumno+" en la lista es "+nombre1[alumno-1]+")");
               
   }
  

   
       
   }
   
   
     
   
    



package boletin15;


public class Boletin15 {

   
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("EJERCICIO 1");
        System.out.println("   ");
       
        NumerosAleatorios numero = new NumerosAleatorios();
        
        int numeros[] = new int[6];
        
        numeros = numero.creacionArray();
        numero.amosarArray(numeros);
        
        System.out.println("  ");
        numero.amosarArrayOrdenado(numeros);
        
        System.out.println("   ");
        System.out.println("   ");
        
        
        //Ejercicio 2
        System.out.println("EJERCICIO 2");
        System.out.println("   ");
        
        NotasProgramacion nota = new NotasProgramacion();
        int notas[] = new int[30];
        
        System.out.println("Notas de programacion: ");
        
        notas = nota.creacionArray2();
        nota.amosarArray2(notas);
        
        System.out.println("   ");
        nota.amosarAprobados();
        
        nota.notaMedia();
        
        nota.notaAlta();
        System.out.println("   ");
        
        
        //Ejercicio 3
        System.out.println("EJERCICIO 3");
        System.out.println("   ");
        NombresAlumnos alum = new NombresAlumnos();
        System.out.println("Listado de los alumnos: ");
        alum.crearArrayAlumnos();
        System.out.println("   ");
        System.out.println("Visualizamos la nota de un alumno");
        alum.amosarAlumno();
        System.out.println("   ");
        
        
        //Ejercicio 4
        System.out.println("EJERCICIO 4");
        System.out.println("   ");
        CalcularLetraNIF letra = new CalcularLetraNIF();
        letra.calcularResto();
        letra.calcularLetra();
        //---------
        nota.amosarAlumnosAprobados();
        
        
       
        
        
        
        
        
        
        
        
        
        }
        
    
  
        
        
    }
    


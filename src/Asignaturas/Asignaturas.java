package Asignaturas;

import java.util.Scanner;

public class Asignaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mi_escaner = new Scanner(System.in); 
		String[] asignaturas = new String[5];  // Arreglo 1: nombres de las asignaturas
		Double notas[];
		//agrego solo el tamaño de notas de forma vacio
		 notas = new Double[5];
		  
		// Ingresar las notas para cada asignatura
	        // Ingresar los nombres de las asignaturas y sus respectivas notas
	        for (int i = 0; i < asignaturas.length; i++) {
	            System.out.printf("Ingrese el nombre de la asignatura");
	            System.out.println();
	            asignaturas[i] = Mi_escaner.nextLine();  // Captura el nombre de la asignatura
	            
	            System.out.printf("Ingrese la nota para %s: ", asignaturas[i]);
	            System.out.println();
	            notas[i] = Mi_escaner.nextDouble();
	            Mi_escaner.nextLine();//esto limplia el buffer para que se pueda se puedan ingresar sin error el resto de las asi
	        }

	        // Inicializa en cero para poder sacar el promedio
	        double promedioFinal = 0.0;
	        //Cuenta los valores ingresados para luego de sumarlos
	        for (int i = 0; i < notas.length; i++) {
	            promedioFinal += notas[i];
	        }
	        //Calcular el promedio final
	        promedioFinal /= notas.length;
	     
	        // Mostrar todas las notas junto con el nombre de la asignatura
	        System.out.println("Las asignaturas y sus respectivas notas son:");
	        for (int i = 0; i < asignaturas.length; i++) {
	            System.out.printf("Asignatura: %s, Nota: %.2f\n", asignaturas[i], notas[i]);
	        }
	        
	        // Mostrar el promedio obtenido
	        System.out.printf("El promedio final es: %.2f\n", promedioFinal);


Mi_escaner.close();
	}

}
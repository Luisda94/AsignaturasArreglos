package Asignaturas;

import java.util.Scanner;

public class Asignaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mi_escaner = new Scanner(System.in); 
		String[] asignaturas = {"Matemáticas", "Historia", "Ciencias", "Lenguaje", "Arte"};
		 Double notas[];
		//agrego solo el tamaño de notas de forma vacio
		 notas = new Double[5];
		  
		// Ingresar las notas para cada asignatura
	        for (int i = 0; i < notas.length; i++) {
	            System.out.printf("Ingrese la nota para %s: ", asignaturas[i]);
	            notas[i] = Mi_escaner.nextDouble();
	        }

	        // Calcular el promedio final
	        double promedioFinal = 0.0;
	        for (int i = 0; i < notas.length; i++) {
	            promedioFinal += notas[i];
	        }
	        promedioFinal /= notas.length;
	
	        // Mostrar el promedio obtenido
	        System.out.printf("El promedio final es: %.2f\n", promedioFinal);


Mi_escaner.close();
	}

}

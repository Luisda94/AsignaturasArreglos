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
		  
		// Inicializar las notas en 0.0
	        for (int i = 0; i < notas.length; i++) {
	            notas[i] = 0.0;
	        }



Mi_escaner.close();
	}

}

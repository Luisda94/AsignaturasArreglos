package Asignaturas;

import java.util.Scanner;

public class Asignaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mi_escaner = new Scanner(System.in); 
		String[] asignaturas = {"Matemáticas", "Historia", "Ciencias", "Lenguaje", "Arte"};
		 Double notas[];
		  notas = new Double[5];
		 notas [0] = Mi_escaner.nextDouble();
		 notas [1] = Mi_escaner.nextDouble();
		 notas [2] = Mi_escaner.nextDouble();
		 notas [3] = Mi_escaner.nextDouble();
		 notas [4] = Mi_escaner.nextDouble();
		 
		 System.out.println("Ingrese el nombre de la  asigntarua: ");
		
		String Asignatura = Mi_escaner.nextLine();


Mi_escaner.close();
	}

}

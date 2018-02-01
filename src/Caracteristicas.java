
public class Caracteristicas {

	public static void main(String[] args) {
		// Ejercicio 1: depura paso a paso
		int m = 5;
		int[] vector = new int[m];
		vector[1] = 2;
		vector[2] = vector[1];
		vector[0] = vector[1] + vector[2] + 2;
		vector[0]++;
		vector[3] = m + 10;
		vector[vector.length-1] = vector[0];

		/*
		 * Ejercicio 2: Si tienes 22 días laborables de vacaciones, ¿qué día de
		 * la semana volverás a trabajar si hoy es jueves?
		 */
		String[] laborables = { "lunes", "martes", "miércoles", "jueves", "viernes" };
		int actual = 3; // El lunes es 0 y el viernes es 4, 
						// por lo que el jueves es 3
		int vacaciones = 22;
		int finalVacaiones = (actual + vacaciones) % 5;
		System.out.println(laborables[finalVacaiones]);
	}
}

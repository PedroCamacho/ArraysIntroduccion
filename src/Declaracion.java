
public class Declaracion {

	public static void main(String[] args) {
		//Declaración
		int [] sueldos;
		
		//Dimensionamiento
		sueldos = new int [5];
		
		//Inicialización
		sueldos [0] = 1200;
		sueldos [1] = 750;
		sueldos [2] = 820;
		sueldos [3] = 550;
		sueldos [4] = 490;
		
		//Todo en uno
		int [] otrosSueldos = {1200, 750, 820, 550, 490};
		
		if (sueldos.equals(sueldos))
			System.out.println("Son iguales");
	}
}

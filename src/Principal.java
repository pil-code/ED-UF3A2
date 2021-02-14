import com.itt.calculadora.Suma; //importar la clase Suma para poder usar sus métodos
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Random rand = new Random(); //instancia de Random para asignar valores a las variables de las demos
		
		/*
		 * Código para demostrar el uso de los métodos de la clase Suma
		 */
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Demos de la clase Suma");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();
		//1. Suma.sumaReales()
		System.out.println("Suma.sumaReales():\n--------------------------------------------------------");
		double real1 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double real2 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double sumaReales = Suma.sumaReales(real1, real2);
		System.out.println("real1 = " + real1);
		System.out.println("real2 = " + real2);
		System.out.println("Suma.sumaReales(real1, real2) = " + sumaReales);
		System.out.println("--------------------------------------------------------\n");
		//2. Suma.sumaEnteros()
		System.out.println("Suma.sumaEnteros():\n--------------------------------------------------------");
		int entero1 = rand.nextInt(2000) - 1000;
		int entero2 = rand.nextInt(2000) - 1000;
		int sumaEnteros = Suma.sumaEnteros(entero1, entero2);
		System.out.println("entero1 = " + entero1);
		System.out.println("entero2 = " + entero2);
		System.out.println("Suma.sumaEnteros(entero1, entero2) = " + sumaEnteros);
		System.out.println("--------------------------------------------------------\n");
	}

}

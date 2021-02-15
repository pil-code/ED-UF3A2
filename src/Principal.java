
import com.itt.calculadora.Suma; //importar la clase Suma para poder usar sus métodos
import com.itt.calculadora.Cociente; //importar la clase Cociente para poder usar sus métodos
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
		double sumaReal1 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double sumaReal2 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double sumaReales = Suma.sumaReales(sumaReal1, sumaReal2);
		System.out.println("oper1 = " + String.format("%.2f", sumaReal1));
		System.out.println("oper2 = " + String.format("%.2f", sumaReal2));
		System.out.println("Suma.sumaReales(oper1, oper2) = " +  String.format("%.2f", sumaReales));
		System.out.println("--------------------------------------------------------\n");		
		//2. Suma.sumaEnteros()
		System.out.println("Suma.sumaEnteros():\n--------------------------------------------------------");
		int sumaEntero1 = rand.nextInt(2000) - 1000;
		int sumaEntero2 = rand.nextInt(2000) - 1000;
		int sumaEnteros = Suma.sumaEnteros(sumaEntero1, sumaEntero2);
		System.out.println("oper1 = " + sumaEntero1);
		System.out.println("oper2 = " + sumaEntero2);
		System.out.println("Suma.sumaEnteros(oper1, oper2) = " + sumaEnteros);
		System.out.println("--------------------------------------------------------\n");
		//3. Suma.sumaTres()
		System.out.println("Suma.sumaTres():\n--------------------------------------------------------");
		sumaReal1 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		sumaReal2 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double sumaReal3 = rand.nextInt(2001) - 1000 + rand.nextDouble();
		double sumaTres = Suma.sumaTres(sumaReal1, sumaReal2, sumaReal3);
		System.out.println("oper1 = " + String.format("%.2f", sumaReal1));
		System.out.println("oper2 = " + String.format("%.2f", sumaReal2));
		System.out.println("oper3 = " + String.format("%.2f", sumaReal3));
		System.out.println("Suma.sumaTres(oper1, oper2, oper3) = " + String.format("%.2f", sumaTres));
		System.out.println("--------------------------------------------------------\n");
		//4. Suma.sumaAcumulada()
		System.out.println("Suma.sumaAcumulada():\n--------------------------------------------------------");
		System.out.println("Estado inicial:\nsuma_acumulada = " + Suma.suma_acumulada);
		double sumaAcum = rand.nextInt(2001) - 1000 + rand.nextDouble();
		System.out.println("Cantidad a sumar = " + String.format("%.2f", sumaAcum));
		Suma.sumaAcumulada(sumaAcum);
		System.out.println("Estado final:\nsuma_acumulada = " + String.format("%.2f", Suma.suma_acumulada));
		System.out.println("--------------------------------------------------------\n");
				
		
		/*
		 * Código para demostrar el uso de los métodos de la clase Cociente
		 */
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Demos de la clase Cociente");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();
		
		
		//1. Cociente.dividirReales()
		System.out.println("Cociente.dividirReales():\n--------------------------------------------------------");
		double cocienteReal1 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double cocienteReal2 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double dividirReales = Cociente.dividirReales(cocienteReal1, cocienteReal2);
		System.out.println("oper1 = " + cocienteReal1);
		System.out.println("oper2 = " + cocienteReal2);
		System.out.println("Cociente.dividirReales(real3, real4) = " + dividirReales);
		System.out.println("--------------------------------------------------------\n");
	}

}

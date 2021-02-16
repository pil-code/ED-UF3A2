
import com.itt.calculadora.Suma; //importar la clase Suma para poder usar sus métodos
import com.itt.calculadora.Cociente; //importar la clase Cociente para poder usar sus métodos
import com.itt.calculadora.Producto;
import com.itt.calculadora.Resta;

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
		System.out.println("oper1 = " + String.format("%.2f",cocienteReal1));
		System.out.println("oper2 = " + String.format("%.2f",cocienteReal2));
		System.out.println("Cociente.dividirReales(real3, real4) = " + String.format("%.2f",dividirReales));
		System.out.println("--------------------------------------------------------\n");
		
	
		//2. Cociente.dividirEnteros
		System.out.println("Cociente.dividirEnteros():\n--------------------------------------------------------");
		int cocienteEntero1 = rand.nextInt(2000) - 1000;
		int cocienteEntero2 = rand.nextInt(2000) - 1000;
		double dividirEnteros = Cociente.dividirEnteros(cocienteEntero1, cocienteEntero2);
		System.out.println("oper1 = " + cocienteEntero1);
		System.out.println("oper2 = " + cocienteEntero2);
		System.out.println("Cociente.cocienteEnteros(oper1, oper2) = " + String.format("%.2f",dividirEnteros));
		System.out.println("--------------------------------------------------------\n");
		
		//3. Cociente.invertirNum
		System.out.println("Cociente.invertirNum():\n--------------------------------------------------------");
		int invertido = rand.nextInt(2000) - 1000;
		double invertirNum = Cociente.invertirNum(invertido);
		System.out.println("oper = " + invertido);
		System.out.println("Cociente.invertirNum(oper) = " + String.format("%.6f",invertirNum));
		System.out.println("--------------------------------------------------------\n");
		
		//4. Cociente.raizCuadrada
		System.out.println("Cociente.raizCuadrada():\n--------------------------------------------------------");
		double entRaiz = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double raizCuadrada = Cociente.raizCuadrada(entRaiz);
		System.out.println("oper = " + String.format("%.2f",entRaiz));
		System.out.println("Cociente.raizCuadrada(oper) = " + String.format("%.2f",raizCuadrada));
		
		/*
		 * Código para demostrar el uso de los métodos de la clase Resta
		 */
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Demos de la clase Resta");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();
		//1. Resta.restaReales()
		System.out.println("Resta.restaReales():\n--------------------------------------------------------");
		double restaReal1 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double restaReal2 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double restaReales = Resta.restaReales(restaReal1, restaReal2);
		System.out.println("oper1 = " + String.format("%.2f", restaReal1));
		System.out.println("oper2 = " + String.format("%.2f", restaReal2));
		System.out.println("Resta.restaReales(oper1, oper2) = " +  String.format("%.2f", restaReales));
		System.out.println("--------------------------------------------------------\n");		
		//2. Resta.restaEnteros()
		System.out.println("Resta.restaEnteros():\n--------------------------------------------------------");
		int restaEntero1 = rand.nextInt(2000) - 1000;
		int restaEntero2 = rand.nextInt(2000) - 1000;
		int restaEnteros = Resta.restaEnteros(restaEntero1, restaEntero2);
		System.out.println("oper1 = " + restaEntero1);
		System.out.println("oper2 = " + restaEntero2);
		System.out.println("Resta.restaEnteros(oper1, oper2) = " + restaEnteros);
		System.out.println("--------------------------------------------------------\n");
		//3. Resta.restaTres()
		System.out.println("Resta.restaTres():\n--------------------------------------------------------");
		restaReal1 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		restaReal2 = rand.nextInt(2000) - 1000 + rand.nextDouble();
		double restaReal3 = rand.nextInt(2001) - 1000 + rand.nextDouble();
		double restaTres = Resta.restaTres(restaReal1, restaReal2, restaReal3);
		System.out.println("oper1 = " + String.format("%.2f", restaReal1));
		System.out.println("oper2 = " + String.format("%.2f", restaReal2));
		System.out.println("oper3 = " + String.format("%.2f", restaReal3));
		System.out.println("Resta.restaTres(oper1, oper2, oper3) = " + String.format("%.2f", restaTres));
		System.out.println("--------------------------------------------------------\n");
		//4. Resta.restaAcumulada()
		System.out.println("Resta.restaAcumulada():\n--------------------------------------------------------");
		System.out.println("Estado inicial:\nresta_acumulada = " + Resta.resta_acumulada);
		double restaAcum = rand.nextInt(2001) - 1000 + rand.nextDouble();
		System.out.println("Cantidad a restar = " + String.format("%.2f", restaAcum));
		Resta.restaAcumulado(restaAcum);;
		System.out.println("Estado final:\nresta_acumulada = " + String.format("%.2f", Resta.resta_acumulada));
		System.out.println("--------------------------------------------------------\n");
		
		
		/*
		 * Código para demostrar el uso de los métodos de la clase Producto
		 */
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Demos de la clase Producto");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();

		//1. Producto.productoDosReales()
		System.out.println("Producto.productoDosReales():\n--------------------------------------------------------");
		float productoReal1 = rand.nextInt(2000) - 1000 + rand.nextFloat();
		float productoReal2 = rand.nextInt(2000) - 1000 + rand.nextFloat();
		float productoDosReales = Producto.productoDosReales(productoReal1, productoReal2);
		System.out.println("oper1 = " + String.format("%.2f", productoReal1));
		System.out.println("oper2 = " + String.format("%.2f", productoReal2));
		System.out.println("Producto.productoDosReales(oper1, oper2) = " +  String.format("%.2f", productoDosReales));
		System.out.println("--------------------------------------------------------\n");		
		
		//2. Producto.productoDosEnteros()
		System.out.println("Producto.productoDosEnteros():\n--------------------------------------------------------");
		int productoEntero1 = rand.nextInt(2000) - 1000;
		int productoEntero2 = rand.nextInt(2000) - 1000;
		int productoDosEnteros = Producto.productoDosEnteros(productoEntero1, productoEntero2);
		System.out.println("oper1 = " + productoEntero1);
		System.out.println("oper2 = " + productoEntero2);
		System.out.println("Producto.productoDosEnteros(oper1, oper2) = " + productoDosEnteros);
		System.out.println("--------------------------------------------------------\n");

		//3. Producto.productoTres()
		System.out.println("Producto.productoTres():\n--------------------------------------------------------");
		productoReal1 = rand.nextInt(2000) - 1000 + rand.nextFloat();
		productoReal2 = rand.nextInt(2000) - 1000 + rand.nextFloat();
		float productoReal3 = rand.nextInt(2001) - 1000 + rand.nextFloat();
		float productoTres = Producto.productoTres(productoReal1, productoReal2, productoReal3);
		System.out.println("oper1 = " + String.format("%.2f", productoReal1));
		System.out.println("oper2 = " + String.format("%.2f", productoReal2));
		System.out.println("oper3 = " + String.format("%.2f", productoReal3));
		System.out.println("Producto.productoTres(oper1, oper2, oper3) = " + String.format("%.2f", productoTres));
		System.out.println("--------------------------------------------------------\n");

		//4. Producto.potencia()
		System.out.println("Producto.potencia():\n--------------------------------------------------------");
		int base = rand.nextInt(2000) - 1000;
		int exp = rand.nextInt(2000) - 1000;
		System.out.println("base: " + base);
		System.out.println("exponente: " + exp);
		double potencia = Producto.potencia(base, exp);
		System.out.println("Potencia = " + String.format("%.2f", potencia));
		System.out.println("--------------------------------------------------------\n");
	}

}

package test;

import com.itt.calculadora.Cociente;
import com.itt.calculadora.Resta;
import com.itt.calculadora.Suma;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.*;

/**
 * Esta clase contiene tests para todos los métodos de la clase Suma.
 * @author Pilar
 */
public class TestSuma {
	private static int[] muestraInt = new int[1000]; //muestra a rellenar con números enteros aleatorios 
	private static double[] muestraDouble = new double[1000]; //muestra a rellenar con números reales aleatorios tipo double
	private static int contadorTests = 0;
	
	/**
	 * Este método prepara muestras aleatorias de número de enteros (tipo int) y reales (tipo double)
	 * para usar en los tests como argumentos de los métodos
	 */
	
	@BeforeAll
	public static void setSamples() {
		Random random = new Random();
		for (int i = 0 ; i < 1000; i ++) {
			muestraInt[i] = random.nextInt();
			muestraDouble[i] = random.nextDouble();
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Tests de la clase Suma");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");	
	}
	
	/**
	 * Este método informa al usuario que un test va a comenzar, incluyendo el número de test
	 */
	@BeforeEach
	void saludoTest() {
		contadorTests += 1;
		System.out.println("Comienzo del test número " + contadorTests);
	}
	
	/**
	 * Este método informa al usuario que un test ha finalizado, incluyendo el número de test
	 */
	@AfterEach
	void despedidaTest() {
		System.out.println("Test número " + contadorTests + " finalizado");	
	}
	
	/**
	 * Este método informa al usuario que se ha completado la batería de tests
	 */
	@AfterAll
	static void endTests() {
		System.out.println("Se han completado " + contadorTests + " tests. Ha sido un placer testear con usted\n");
	}
	

	/**
	 * Prueba unitaria del método sumaReales() de la clase Suma 
	 * Comprueba que funciona adecuadamente cuando suma dos números reales.<br>
	 * 
	 * Para probar que el método funciona bien, vamos a ejecutar el método
	 * introduciendo operandos positivos y negativos.<br>
	 */
	@Test
	public void testSumaReales() {
		System.out.println("	Suma de números reales");
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i + muestraDouble.length/2];
			double resultado = Suma.sumaReales(oper1, oper2);
			assertEquals(oper1+oper2, resultado, "Error al sumar " + oper1 + "+" + oper2);

			//Test cambiando el signo del primer operador
			oper1 = - 10.0;
			oper2 = 8.4;
			resultado= Suma.sumaReales(oper1, oper2);
			assertEquals(Resta.restaReales(oper2, Math.abs(oper1)), resultado);
			
			//Test cambiando el signo del segundo operador
			oper1 = 10.0;
			oper2 = -8.4;
			resultado= Suma.sumaReales(oper1, oper2);
			assertEquals(Resta.restaReales(oper1, Math.abs(oper2)), resultado);
		}
	}

	/**
	 * En esta prueba unitaria debemos probar que el método sumaEnteros()
	 * de la clase Suma funciona adecuadamente cuando suma dos números enteros.
	 * 
	 * Para probar que el método funciona bien, vamos a ejecutar el método
	 * introduciendo operandos positivos y negativos.
	 * 
	 * En esta prueba unitaria vamos a probar que si el oper1 es negativo,
	 * el resultado será la resta de oper2 y oper1.
	 */
	@Test
	public void testSumaEntero() {
		System.out.println("	Suma de números enteros");
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraInt.length/2; i ++) {
			int oper1 = muestraInt[i];
			int oper2 = muestraInt[i + muestraInt.length/2];
			int resultado = Suma.sumaEnteros(oper1, oper2);
			assertEquals(oper1+oper2, resultado, "Error al sumar " + oper1 + "+" + oper2);

			//Test cambiando el signo del primer operador
			oper1 = - 10;
			oper2 = 8;
			resultado= (int) Suma.sumaReales(oper1, oper2);
			assertEquals(Resta.restaReales(oper2, Math.abs(oper1)), resultado);
			
			//Test cambiando el signo del segundo operador
			oper1 = 10;
			oper2 = -8;
			resultado= (int) Suma.sumaReales(oper1, oper2);
			assertEquals(Resta.restaReales(oper1, Math.abs(oper2)), resultado);
		}
	}
	
	/**
	 * Este método evalua el método Suma.sumaTres().
	 * Comprueba que la suma de tres números reales se realiza correctamente.<br>
	 */
	@Test
	public void testSumaTres() {
		System.out.println("	Suma de números de tres números reales");
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i];
			double oper3 = muestraDouble[i];
			double esperado = (oper3+oper2)+oper2;
			double resultado = Suma.sumaTres(oper1, oper2, oper3);
			assertEquals(esperado, resultado);
		}
		
		System.out.println("	Suma de números de tres números reales negativos");
		//Tests con números negativos
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = -(Math.abs(muestraDouble[i]));
			double oper2 = -(Math.abs(muestraDouble[i]));
			double oper3 = -(Math.abs(muestraDouble[i]));
			double esperado = -(Math.round(Math.abs(oper1+oper2+oper3)));
			double resultado = Math.round(Suma.sumaTres(oper1, oper2, oper3));
			assertEquals(esperado, resultado);
		}
	}

	
	/**
	 * Este método evalua el método Suma.sumaAcumulada().
	 * Comprueba que se suma el número introducido como argumento a la variable estática.<br>
	 */	
	@Test
	public void testSumaAcumulada() {
		System.out.println("	Suma acumulada");
		double oper=5.3; 		//argumento para el método SumaAcumulada de la clase Suma
		double sumaAcumuladaInicial=Suma.suma_acumulada; //variable auxiliar para realizar la comparación
		Suma.sumaAcumulada(oper);
		assertEquals(oper, Suma.suma_acumulada-sumaAcumuladaInicial); 
		
		//Test cambiando el signo del operador
		System.out.println("	Suma acumulada con número negativo");
		oper=-5.3; 		//argumento para el método SumaAcumulada de la clase Suma
		sumaAcumuladaInicial=Suma.suma_acumulada;
		Suma.sumaAcumulada(oper);
		assertEquals(oper, Suma.suma_acumulada-sumaAcumuladaInicial);
	}

}

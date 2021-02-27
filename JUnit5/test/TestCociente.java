package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itt.calculadora.Cociente;

import java.util.Random;

/**
 * Esta clase contiene tests para todos los métodos de la clase Cociente.
 * @author Jana
 */
public class TestCociente {
	
	private static int[] muestraInt = new int[1000]; //muestra a rellenar con números enteros aleatorios 
	private static float[] muestraFloat = new float[1000]; //muestra a rellenar con números reales aleatorios tipo float
	private static double[] muestraDouble = new double[1000]; //muestra a rellenar con números reales aleatorios tipo double
	private static int contadorTests = 0;
	
	/**
	 * Este método prepara muestras aleatorias de número de enteros (tipo int) y reales (tipo double)
	 * para usar en los tests como argumentos de los métodos
	 */
	@BeforeAll
	static void setSamples() {
		Random random = new Random();
		for (int i = 0 ; i < 1000; i ++) {
			muestraInt[i] = random.nextInt();
			muestraDouble[i] = random.nextDouble();
		}
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
		System.out.println("Se han completado " + contadorTests + " tests. Ha sido un placer testear con usted");
	}

	/**
	 * Este método evalua el método Cociente.dividirReales(). Comprueba que la división se realiza correctamente.<br>
	 * También se evalúan los siguientes casos especiales:<br>
	 * Si el segundo operador, es igual a 0, el resultado POSITIVE_INFINITY o NEGATIVE_INFINITY dependiendo del signo del primer operador.<br>
	 * Si el ambos operadores son cero, el resultado sera NaN.<br>
	 */
	@Test
	void testDividirReales() {
		
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i + muestraDouble.length/2];
			double resultado = Cociente.dividirReales(oper1, oper2);
			double esperado = oper1/oper2;
			assertEquals(esperado, resultado, "Error al dividir " + oper1 + "/" + oper2);

			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper2 = - oper2;
			resultado = Cociente.dividirReales(oper1, oper2);
			esperado = oper1/oper2;
			assertEquals(esperado, resultado, "Error al dividir " + oper1 + "/" + oper2);
		}
		
		//Tests de división por 0
		assertEquals(Double.POSITIVE_INFINITY, Cociente.dividirReales(1, 0), "Error al dividir por cero: 1/0");
		assertEquals(Double.NEGATIVE_INFINITY, Cociente.dividirReales(-1, 0), "Error al dividir por cero: -1/0");
		assertEquals(Double.NaN, Cociente.dividirReales(0, 0), "Error en indeterminación: 0/0");
		
	}

	/**
	 * Este método evalua el método Cociente.dividirEnteros(). Comprueba que la división se realiza correctamente.<br>
	 * También se evalúa si se lanza una excepción cuando el dividendo es 0.
	 */
	@Test
	void testDividirEnteros() {
		//TODO revisar la conversión a float de Cociente
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraInt.length/2; i ++) {
			int oper1 = muestraInt[i];
			int oper2 = muestraInt[i + muestraInt.length/2];
			double resultado = Cociente.dividirEnteros(oper1, oper2);
			double esperado = (double)(oper1)/oper2;
			
			assertEquals(esperado, resultado, "Error al dividir " + oper1 + "/" + oper2);;

			
			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper2 = - oper2;
			resultado = Cociente.dividirEnteros(oper1, oper2);
			esperado = (double)(oper1)/oper2;
			assertEquals(esperado, resultado, "Error al dividir " + oper1 + "/" + oper2);
		}
		
		//TODO revisar la división por 0 en Cociente
		//Test de división por 0
		assertThrows(ArithmeticException.class, () -> Cociente.dividirEnteros(1, 0));
		assertThrows(ArithmeticException.class, () -> Cociente.dividirEnteros(0, 0));
	}

	/**
	 * Este método evalua el método Cociente.invertirNum(). Comprueba que la inversión se realiza correctamente.<br>
	 * También se evalúa si se lanza una excepción cuando el dividendo es 0.
	 */	
	@Test
	void testInvertirNum() {
		
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraInt.length; i ++) {
			int oper = muestraInt[i];
			double resultado = Cociente.invertirNum(oper);
			double esperado = 1.0 / oper;
			assertEquals(esperado, resultado, "Error al invertir " + oper);
			
			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper = - oper;
			resultado = Cociente.invertirNum(oper);
			esperado = 1.0 / oper;
			assertEquals(esperado, resultado, "Error al invertir " + oper);
		}
		
		//TODO revisar la inversión de cero en Cociente
		//Tests de inversión de 0 asumiendo que el comportamiento debe ser igual que Cociente.dividirEnteros(1, oper);
		assertThrows(ArithmeticException.class, () -> Cociente.invertirNum(0));
	}
	
	/**
	 * Este método evalua el método Cociente.raizCuadrada(). Comprueba que la raíz se calcula correctamente.<br>
	 * También se evalúan los siguientes casos especiales:<br>
	 * Si el argumento es 0 el resultado es 0.<br>
	 * Si el argumento negativo, el resultado es NaN. <br>
	 */
	@Test
	void testRaizCuadrada() {
		
		//Test de fuerza bruta con números aleatorios positivos
		for (int i = 0; i < muestraDouble.length; i++) {
			double oper = Math.abs(muestraDouble[i]);
			double resultado = Cociente.raizCuadrada(oper);
			double esperado = Math.sqrt(oper);
			assertEquals(esperado, resultado, "Error al calcular la raíz cuadrada de " + oper);
		}
		
		//Test de raíz cuadrada de 0
		assertEquals(0.0, Cociente.raizCuadrada(0), "Error al calcular la raíz cuadrada de 0");
		
		//Test de raíz cuadrada de un número negativo
		assertEquals(Double.NaN, Cociente.raizCuadrada(-1), 
				"Error al calcular la raíz cuadrada de -1");
	}

}

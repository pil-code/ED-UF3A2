package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.itt.calculadora.Cociente;

import java.util.Random;

class TestCociente {
	
	private static int[] muestraInt = new int[1000]; //muestra a rellenar con números enteros aleatorios 
	private static float[] muestraFloat = new float[1000]; //muestra a rellenar con números reales aleatorios tipo float
	private static double[] muestraDouble = new double[1000]; //muestra a rellenar con números reales aleatorios tipo double
	
	@BeforeAll
	public static void setSamples() {
		Random random = new Random();
		for (int i = 0 ; i < 1000; i ++) {
			muestraInt[i] = random.nextInt();
			muestraFloat[i] = random.nextFloat();
			muestraDouble[i] = random.nextDouble();
		}
	}

	@Test
	void testDividirReales() {
		
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i + muestraDouble.length/2];
			assertEquals(oper1/oper2, Cociente.dividirReales(oper1, oper2), "Error al dividir " + oper1 + "/" + oper2);

			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper2 = - oper2;
			assertEquals(oper1/oper2, Cociente.dividirReales(oper1, oper2), "Error al dividir " + oper1 + "/" + oper2);
			
		}
		
		//Tests de división por 0
		assertEquals(Double.POSITIVE_INFINITY, Cociente.dividirReales(1, 0), "Error al dividir por cero: 1/0");
		assertEquals(Double.NEGATIVE_INFINITY, Cociente.dividirReales(-1, 0), "Error al dividir por cero: -1/0");
		assertEquals(Double.NaN, Cociente.dividirReales(0, 0), "Error en indeterminación: 0/0");
		
	}

	@Test
	void testDividirEnteros() {
		//TODO revisar la conversión a float de Cociente
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraInt.length/2; i ++) {
			int oper1 = muestraInt[i];
			int oper2 = muestraInt[i + muestraInt.length/2];
			assertEquals((float)(oper1)/oper2, Cociente.dividirEnteros(oper1, oper2), "Error al dividir "
					+ "" + oper1 + "/" + oper2);
			
			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper2 = - oper2;
			assertEquals((float)(oper1)/oper2, Cociente.dividirEnteros(oper1, oper2), "Error al dividir " + oper1 + "/" + oper2);
			
		}
		
		//TODO revisar la división por 0 en Cociente
		//Test de división por 0
		assertThrows(ArithmeticException.class, () -> Cociente.dividirEnteros(1, 0));
		assertThrows(ArithmeticException.class, () -> Cociente.dividirEnteros(0, 0));
	}

	@Test
	void testInvertirNum() {
		
		//Tests de fuerza bruta con números aleatorios
		for (int i = 0; i < muestraInt.length; i ++) {
			int oper = muestraInt[i];
			assertEquals(1.0/oper, Cociente.invertirNum(oper), "Error al invertir " + oper);
			
			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper = - oper;
			assertEquals(1.0/oper, Cociente.invertirNum(oper), "Error al invertir " + oper);		
		}
		
		//TODO revisar la inversión de cero en Cociente
		//Tests de inversión de 0 asumiendo que el comportamiento debe ser igual que Cociente.dividirEnteros(1, oper);
		assertThrows(ArithmeticException.class, () -> Cociente.invertirNum(0));
	}

	@Test
	void testRaizCuadrada() {
		
		//Test de fuerza bruta con números aleatorios positivos
		for (int i = 0; i < muestraDouble.length; i++) {
			double oper = Math.abs(muestraDouble[i]);
			assertEquals(Math.sqrt(oper), Cociente.raizCuadrada(oper), 
					"Error al calcular la raíz cuadrada de " + oper);
			
		}
		
		//Test de raíz cuadrada de 0
		assertEquals(0.0, Cociente.raizCuadrada(0), "Error al calcular la raíz cuadrada de 0");
		
		//Test de raíz cuadrada de un número negativo
		assertEquals(Double.NaN, Cociente.raizCuadrada(-1), 
				"Error al calcular la raíz cuadrada de -1");
	}

}

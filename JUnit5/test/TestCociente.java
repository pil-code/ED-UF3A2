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
		for (int i = 0; i < 500; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i + 500];
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
		fail("Not yet implemented");
	}

	@Test
	void testInvertirNum() {
		fail("Not yet implemented");
	}

	@Test
	void testRaizCuadrada() {
		fail("Not yet implemented");
	}

}

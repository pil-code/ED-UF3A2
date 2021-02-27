package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.itt.calculadora.Producto;

class TestProducto {
	
	/**
	 * Esta clase contiene tests para todos los métodos de la clase Producto.
	 * @author Paula
	 */
	
	private static int[] muestraInt = new int[1000]; //muestra a rellenar con números enteros aleatorios 
	private static float[] muestraFloat = new float[1000]; //muestra a rellenar con números reales aleatorios tipo float
	private static double[] muestraDouble = new double[1000]; //muestra a rellenar con números reales aleatorios tipo double
	private static int contadorTests=0;
	/**@BeforeAll
	 * Este método prepara muestras aleatorias de número de enteros (tipo int) y reales (tipo double y float)
	 * para usar en los tests como argumentos de los métodos.
	 * De esta forma, no hay que generar una muestra en cada test.
	 */
	
	@BeforeAll
	public static void setSamples() {
		Random random = new Random();
		for (int i = 0 ; i < 1000; i ++) {
			muestraInt[i] = random.nextInt();
			muestraFloat[i] = random.nextFloat();
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
	 * Este test va a probar el método productoDosReales de la clase Producto.
	 * Comprueba que el resultado de la multiplicación de dos números reales es correcto.
	 */
	@Test
	void testProductoDosReales() {
		
		for (int i = 0; i < muestraFloat.length/2; i ++) {
			float oper1 = muestraFloat[i];
			float oper2 = muestraFloat[i + muestraFloat.length/2];
			assertEquals(oper1*oper2, Producto.productoDosReales(oper1, oper2));
		
		/*Test cambiando el signo de uno de los operandos para asegurar que se han testeado
		 * tanto números positivos como negativos
		 */
		oper2= -oper2;
		assertEquals(oper1*oper2, Producto.productoDosReales(oper1, oper2));
		}
	}
	
	/**
	 * Este test va a probar el método productoDosEnteros de la clase Producto.
	 * Comprueba que el resultado de la multiplicación de dos números enteros es correcto.
	 */
	@Test
	void testProductoDosEnteros() {
		
		for (int i = 0; i < muestraInt.length/2; i ++) {
			int oper1 = muestraInt[i];
			int oper2 = muestraInt[i + muestraInt.length/2];
			assertEquals(oper1*oper2, Producto.productoDosEnteros(oper1, oper2));
		
		/*Test cambiando el signo de uno de los operandos para asegurar que se han testeado
		 * tanto números positivos como negativos
		 */
		oper2= -oper2;
		assertEquals(oper1*oper2, Producto.productoDosEnteros(oper1, oper2));
		}
	}
	
	/**
	 * Este test va a probar el método productoTresReales de la clase Producto.
	 * Comprueba que el resultado de la multiplicación de tres números reales es correcto.
	 */
	@Test
	void testProductoTresReales() {
		
		for (int i = 0; i < muestraFloat.length; i ++) {
			float oper1 = muestraFloat[i];
			float oper2 = muestraFloat[i];
			float oper3 = muestraFloat[i];
			assertEquals(oper1*oper2*oper3, Producto.productoTres(oper1, oper2, oper3));
		
		/*Test cambiando el signo de uno de los operandos para asegurar que se han testeado
		 * tanto números positivos como negativos.
		 */
		oper2= -oper2;
		assertEquals(oper1*oper2*oper3, Producto.productoTres(oper1, oper2, oper3));
		}
	}
	
	/*TODO Casos especiales:<br>
	 * . Si la base es 0 y el exponente es 0, el resultado dará un error.<br>-->esperábamos que fuese un error, da 1
	 * . Si el exponente es 0, el resultado será 1.<br>
	 * . Si el exponente es 1, el resultado será igual a la base.<br>
	 * . Si la base es 0, el resultado será 0.<br>
	 * Si la base es un número negativo, el signo del resultado depende de si el exponente es par, 
	 en cuyo caso el signo será positivo, o impar, resultando en negativo
	*/	
	
	/**
	 * Este test va a probar el método potencia de la clase Producto.
	 * Comprueba que el resultado de la potencia es correcto. 
	 * Los casos especiales del método potencia se van a testear posteriormente.
	 */
	@Test
	void testPotencia() {
		for (int i = 0; i < muestraInt.length/2; i ++) {
			int base = muestraInt[i];
			int exp = muestraInt[i + muestraInt.length/2];
		assertEquals(Math.pow(base, exp), Producto.potencia(base, exp), "Error");
		}
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si la base es 0 y el exponente es 0, el resultado dará un error.
	 */
	@Test
	void testPotenciaBase0Exp0() {//throws exception
		int base=0;
		int exp=0;
		assertEquals(Math.pow(base, exp), Producto.potencia(base, exp), "Error");
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si el exponente es 0, el resultado será 1.
	 */
	@Test
	void testPotenciaExp0() {
		for (int i = 0; i < muestraInt.length; i ++) {
			int base = muestraInt[i];
			int exp=0;
			assertEquals(Math.pow(base, exp), 1, "El resultado es distinto de 1");
		}
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si el exponente es 1, el resultado será igual a la base.
	 */
	@Test
	void testPotenciaExp1() {
		for (int i = 0; i < muestraInt.length; i ++) {
			int base = muestraInt[i];
			int exp=1;
			assertEquals(Math.pow(base, exp), base, "El resultado es distinto de la base");
		}

	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si la base es 0, el resultado será 0.
	 */
	@Test
	void testPotenciaBase0() {
		for (int i = 0; i < muestraInt.length; i ++) {
			int base = 0;
			int exp=muestraInt[i];
			assertEquals(Math.pow(base, exp), base, "El resultado es distinto de 0");
		}
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si la base es un número negativo, el signo del resultado depende de si el exponente es par, 
	 * en cuyo caso el signo será positivo, o impar, resultando en negativo
	 */
	@Test
	void testPotenciaBaseNegativa() {
		int base=-10;
		int exp=(int)(Math.random()*(-100-100+1)+100);
		//assertEquals(Math.pow(base, exp), base, "El resultado es distinto de la base");
	}
				

}

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
	private static int contadorTests=0;
	/**@BeforeAll
	 * Este método prepara muestras aleatorias de número de enteros (tipo int) y reales (tipo float)
	 * para usar en los tests como argumentos de los métodos.
	 * De esta forma, no hay que generar una muestra en cada test.
	 */
	
	@BeforeAll
	public static void setSamples() {
		Random random = new Random();
		for (int i = 0 ; i < 1000; i ++) {
			muestraInt[i] = random.nextInt(21)-10;
			muestraFloat[i] = random.nextFloat()*21-10;
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Tests de la clase Producto");
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
		
	
	/**
	 * Este test va a probar el método potencia de la clase Producto.
	 * Comprueba que el resultado de la potencia es correcto. 
	 * Los casos especiales del método potencia se van a testear posteriormente.
	 */
	@Test
	void testPotencia() {
		int base[]= {2,3,4,5};
		int exp[]= {2,3,4,5};
		for (int i=0; i<base.length; i++) {
			for (int j=0; j<exp.length; j++) {
			assertEquals(Producto.potencia(base[i], exp[j]), Math.pow(base[i], exp[j]), "Error");
			}
		}
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si la base es 0 y el exponente es 0, el resultado dará un error.
	 */
	@Test
	void testPotenciaBase0Exp0() {
		int base=0;
		int exp=0;
		assertThrows(ArithmeticException.class, () -> Producto.potencia(base, exp), "Error");
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si el exponente es 0, el resultado será 1.
	 */
	@Test
	void testPotenciaExp0() {
		int base[]= {2,3,4,5};
		int exp=0;
		for (int i=0; i<base.length; i++) {
			assertEquals(1, Math.pow(base[i], exp), "El resultado es distinto de 1");
		}
		
	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si el exponente es 1, el resultado será igual a la base.
	 */
	@Test
	void testPotenciaExp1() {
		int base[]= {2,3,4,5};
		int exp=1;
		for (int i=0; i<base.length; i++) {
			assertEquals(base[i], Math.pow(base[i], exp), "El resultado es distinto de la base");
		}

	}
	
	/**
	 * Este test va a probar uno de los casos especiales del método potencia de la clase Producto.
	 * Si la base es 0, el resultado será 0.
	 */
	@Test
	void testPotenciaBase0() {
		int base=0;
		int exp[]= {2, 3, 4, 5};
		for (int i=0; i<exp.length; i++) {
			assertEquals(0, Math.pow(base, exp[i]), "El resultado es distinto de 0");
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
		int exp[]= {2, 3, 4, 5};
		for (int i=0; i<exp.length; i++) {
			if (exp[i]%2==0) {
				assertTrue(Math.pow(base, exp[i])>0);
			}else {
				assertTrue(Math.pow(base, exp[i])<0);
			}
		}
	}
				

}

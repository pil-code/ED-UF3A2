package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itt.calculadora.Cociente;
import com.itt.calculadora.Resta;
import com.itt.calculadora.Suma;
/**
 * Esta clase contiene tests para todos los métodos de la clase Resta.
 * @author Ixchel
 */
class TestResta {
	
	private static int[] muestraInt = new int[1000]; //muestra a rellenar con números enteros aleatorios 
	private static double[] muestraDouble = new double[1000]; //muestra a rellenar con números reales aleatorios tipo double
	private static int contadorTests = 0;
	
	/**
	 * Este método prepara muestras aleatorias de número de enteros (tipo int) y reales (tipo double)
	 * para usar en los tests como argumentos de los métodos.
	 */
	
	@BeforeAll
	public static void setSamples() {
		Random random = new Random();
		for (int i = 0 ; i < 1000; i ++) {
			muestraInt[i] = random.nextInt();
			muestraDouble[i] = random.nextDouble();
		}
	}
	/**
	 * Este método informa al usuario que un test va a comenzar, incluyendo el número de test.
	 */
	@BeforeEach
	void saludoTest() {
		contadorTests += 1;
		System.out.println("Comienzo del test número " + contadorTests);
	}
	
	/**
	 * Este método informa al usuario que un test ha finalizado, incluyendo el número de test.
	 */
	@AfterEach
	void despedidaTest() {
		System.out.println("Test número " + contadorTests + " finalizado");	
	}
	
	/**
	 * Este método informa al usuario que se ha completado la batería de tests,
	 */
	@AfterAll
	static void endTests() {
		System.out.println("Se han completado " + contadorTests + " tests. Ha sido un placer testear con usted");
	}
	
	/**
	 * Prueba unitaria del método restaReales() de la clase Resta 
	 * Comprueba que funciona adecuadamente cuando resta dos números reales.<br>
	 * 
	 * Para probar que el método funciona bien, vamos a ejecutar el método
	 * introduciendo operandos positivos y negativos.<br>
	 */
	
	@Test
	void testRestaReales() {
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i + muestraDouble.length/2];
			double resultado = Resta.restaReales(oper1, oper2);
			assertEquals(oper1-oper2, resultado, "Error al restar " + oper1 + "-" + oper2);


			oper1= 320.45;
			oper2= -57.54;
			resultado = Resta.restaReales(oper1, oper2);
			assertEquals(oper1-oper2, resultado, 
					"Si el primer oper es positivo y el segundo negativo la resta se convierte en suma");
			
			oper1= -320.45;
			oper2= 57.54;
			resultado = Resta.restaReales(oper1, oper2);
			assertEquals(oper1-oper2, resultado, 
					"Error al restar " + oper1 + "-" + oper2);			
		}
	}
	/**
	 * Prueba unitaria del método restaEnteros() de la clase Resta 
	 * Comprueba que funciona adecuadamente cuando resta dos números reales.<br>
	 * 
	 * Para probar que el método funciona bien, vamos a ejecutar el método
	 * introduciendo operandos positivos y negativos.<br>
	 */
	
	@Test
	void testRestaEnteros() {
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			int oper1 = muestraInt[i];
			int oper2 = muestraInt[i + muestraDouble.length/2];
			int resultado = Resta.restaEnteros(oper1, oper2);
			assertEquals(oper1-oper2, resultado, "Error al restar " + oper1 + "-" + oper2);
			
			oper1= 320;
			oper2= -57;
			resultado = Resta.restaEnteros(oper1, oper2);
			assertEquals(oper1-oper2, resultado, 
					"Si el primer oper es positivo y el segundo negativo la resta se convierte en suma");
			
			oper1= -320;
			oper2= 57;
			resultado = Resta.restaEnteros(oper1, oper2);
			assertEquals(oper1-oper2, resultado, 
					"Error al restar " + oper1 + "-" + oper2);			
		}
	}
	/**
	 * Prueba unitaria del método restaTres() de la clase Resta 
	 * Comprueba que funciona adecuadamente cuando resta tres números reales.<br>
	 * 
	 * Para probar que el método funciona bien, vamos a ejecutar el método
	 * introduciendo operandos positivos y negativos.<br>
	 */
	
	@Test
	void testRestaTres() {
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i];
			double oper3 = muestraDouble[i];
			double resultado = Resta.restaTres(oper1, oper2, oper3);
			assertEquals(oper1-oper2-oper3, resultado, 
					"Error al restar " + oper1 + "-" + oper2 + "-" + oper3);
			
			oper1= 320;
			oper2= -57;
			oper3= -43;
			resultado = Resta.restaTres(oper1, oper2, oper3);
			assertEquals(oper1-oper2-oper3, resultado, 
					"Si el primer oper es positivo y el segundo negativo la resta se convierte en suma");
			
			oper1= -320;
			oper2= 57;
			oper3= 43;
			resultado = Resta.restaTres(oper1, oper2, oper3);
			assertEquals(oper1-oper2-oper3, resultado, 
					"Error al restar " + oper1 + "-" + oper2);
		}
	}
	
	/**
	 * Este método evalua el método Resta.restaAcumulada().
	 * Comprueba que se resta el número introducido como argumento a la variable estática.<br>
	 */	
	@Test
	void testRestaAcumulada() {
		double oper = 5.7;
		double restaAcumInic= Resta.resta_acumulada;
		Resta.restaAcumulado(oper);
		assertEquals(oper, restaAcumInic-Resta.resta_acumulada, "Error");
		
		oper = -5.7;
		restaAcumInic= Resta.resta_acumulada;
		Resta.restaAcumulado(oper);
		assertEquals(oper, restaAcumInic-Resta.resta_acumulada, "Error");
		}	
	}

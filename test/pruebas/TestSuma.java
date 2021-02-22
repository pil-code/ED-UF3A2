package pruebas;

import com.itt.calculadora.Suma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class TestSuma {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	static void setUp() throws Exception {
		System.out.println("Se inicializan a 0 todas las variables numéricas");
		double oper1=0;
		double oper2=0;
		//No lo puedo hacer porque van a morir cuando termine este método. ¿Cómo hago para inicializar los oper en cada prueba?
	}
	
	@AfterEach
	static void tearDown() throws Exception {
	}

	/**
	 * En esta prueba unitaria debemos probar que el método sumaReales()
	 * de la clase Suma funciona adecuadamente cuando suma dos números reales.
	 * 
	 * Para probar que el método funciona bien, vamos a ejecutar el método
	 * introduciendo operandos positivos y negativos.
	 * 
	 * En esta prueba unitaria vamos a probar que si el oper2 es negativo,
	 * el resultado será la resta de oper1 y oper2.
	 */
	@Test
	public void testSumaRealesNegativo() {
		System.out.println("SUMA: Test 1");
		double oper1= 23.6;
		double oper2= -6.4;
		double result = oper1 + oper2;
		/* Esperamos que el resultado sea 17.2 y
		 * lo compruebamos con el valor que hay en la variable result. */
		assertEquals("17.2",result); //No se llega a ejecuar el RunAs
		
	}
	
	@Test
	public void testSumaAcumulada() {
		double oper=5;
		double suma_acumulada=100;
		sumaAcumulada(oper); //¿Como accedo a este método?
	}

}
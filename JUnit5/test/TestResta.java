package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.itt.calculadora.Cociente;
import com.itt.calculadora.Resta;

class TestResta {
	
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
	void testRestaReales() {
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i + muestraDouble.length/2];
			assertEquals(oper1-oper2, Resta.restaReales(oper1, oper2), "Error al restar " + oper1 + "-" + oper2);

			//Test cambiando el signo de uno de los operandos para asegurar que se han testeado
			//tanto números positivos como negativos
			oper2 = - oper2;
			assertEquals(oper1-oper2, Resta.restaReales(oper1, oper2), "Error al restar " + oper1 + "-" + oper2);
			double oper3= 100;
			double oper4= -57;
			assertEquals(oper3-oper4, Resta.restaReales(oper3, oper4), 
					"Si el primer oper es positivo y el segundo negativo la resta se convierte en suma");
		}
	}
	@Test
	void testRestaEnteros() {
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			int oper1 = muestraInt[i];
			int oper2 = muestraInt[i + muestraDouble.length/2];
			assertEquals(oper1-oper2, Resta.restaEnteros(oper1, oper2), "Error al restar " + oper1 + "-" + oper2);
			
			oper2 = - oper2;
			assertEquals(oper1-oper2, Resta.restaEnteros(oper1, oper2), "Error al restar " + oper1 + "-" + oper2);
			int oper3= 100;
			int oper4= -57;
			assertEquals(oper3-oper4, Resta.restaEnteros(oper3, oper4), 
					"Si el primer oper es positivo y el segundo negativo la resta se convierte en suma");

	}
	}
	
	@Test
	void testRestaTres() {
		for (int i = 0; i < muestraDouble.length/2; i ++) {
			double oper1 = muestraDouble[i];
			double oper2 = muestraDouble[i];
			double oper3 = muestraDouble[i];
			assertEquals(oper1-oper2-oper3, Resta.restaTres(oper1, oper2, oper3), 
					"Error al restar " + oper1 + "-" + oper2 + "-" + oper3);
			
			oper2 = - oper2;
			oper3 = - oper3;
			assertEquals(oper1-oper2-oper3, Resta.restaTres(oper1, oper2, oper3), 
					"Error al restar " + oper1 + "-" + oper2 + "-" + oper3);
			double oper4= 100.532;
			double oper5= -57.456;
			double oper6= -45.345;
			assertEquals(oper4-oper5-oper6, Resta.restaTres(oper4, oper5, oper6), 
					"Si el primer oper es positivo y el segundo negativo la resta se convierte en suma");

	}
	}
	@Test
	void testRestaAcumulada() {
		double oper = 5;
		double resAcum= Resta.resta_acumulada;
		Resta.restaAcumulado(oper);
		assertEquals(oper, resAcum-Resta.resta_acumulada, "Error");
	}
	

	}

package com.itt.calculadora;
/**
 * 
 * La clase cociente contiene métodos para dividir dos operadores, 
 * realizar la inversión de un número, así como la raiz cuadrada.
 * 
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, 
 * reune varias clases para realizar distintas operaciones matemáticas
 * @author Ixchel López Alegre
 * @since 18/01/2021
 * @version 1.3
 * @see com.itt.calculadora
 */


public final class Cociente {
	
	private Cociente() {
		
	}
	
/**
 * Función que realiza la división de dos números reales.
 * 
 * @param oper1 Representa el primer operador de la división 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 * 
 * @return Devuelve el valor de la división entre los dos operadores. <p>
 * 
 * 
 * Casos especiales:<br>
 * 	Si el segundo operador, es igual a 0, el resultado POSITIVE_INFINITY o NEGATIVE_INFINITY dependiendo del signo del primer operador.<br>
 * 	Si el ambos operadores son cero, el resultado sera NaN.<br>
 * 
 *
 */
	public static double dividirReales (double oper1, double oper2) {
		return oper1/oper2 ;
	}
	
/**
 * Este método implementará la división de dos números enteros. 
 * 
 * @param oper1 Representa el primer operador de la división 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 *
 * @return El resultado será la división entre oper1 y oper2.
 * 
 * @throws ArithmeticException Si el dividendo es igual a 0. 
 * <p> 
 *
 */
	public static double dividirEnteros (int oper1,int oper2) {
		if(oper2==0) {
			throw new ArithmeticException();
		}
		return (double) oper1/oper2;
	}
	
/**
 *  Este método implementará el inverso de un número entero.
 *  
 *  @param oper Representa el número que vas a invertir
 *  
 *  @return El resultado será la inversión del número introducido.
 *  <p>  
 *  @throws ArithmeticException Si el operando es igual a 0. 

 *  Ejemplo: si se introduce el valor 10 = 10/1, el método devolverá 1/10 = 0.1.
 * 
 */
	public static double invertirNum (int oper) {
		if(oper==0) {
			throw new ArithmeticException();
		}
		return (double) 1/oper;
	}
	
/**
 * Este método implemetará la raiz cuadrada de un número.
 * 
 * @param oper Representa el número cuya raíz cuadrada se va a calcular.
 * 
 * @return Resultado de la raiz cuadrada del parámetro uno.
 * <p>
 * Casos especiales:<br>
 *  Si el argumento es 0 el resultado es 0.<br>
 *  Si el argumento negativo, el resultado es NaN. <br>
 */
	public static double raizCuadrada (double oper) {
		return Math.sqrt(oper);
	}
}
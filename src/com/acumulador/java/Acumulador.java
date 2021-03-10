package com.acumulador.java;

import java.util.Random;
import java.util.stream.IntStream;
public class Acumulador {

	/**
	 *  Task1
	 *	Given an integer N, write a function that allows printing the sum of all of the numbers presented in a list.
	 *  @param longitud
	 */
	
	public void acumulaJVM8(int longitud) {
		Random rand = new Random();
		IntStream intStream = rand.ints(longitud, 1, 100);
		System.out.println("La suma " + intStream.sum());
	}
	
	
	public static void main(String[] args) {
		Random random = new Random();
		Acumulador acumulador = new Acumulador();
		acumulador.acumulaJVM8((int)  random.nextInt(100) + 1);
	}
	

}

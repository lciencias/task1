package com.acumulador.java;

import java.util.Random;
import java.util.stream.IntStream;

import com.acumulador.interfaz.IAcumulador;

public class Task {

	public static void main(String[] args) {
		Random random = new Random();	
		IAcumulador acu = (longitud) -> {
			// genera n numeros aleatorios entre 1 y 100, la variable longitud es el numero de random's que genera
			IntStream intStream = random.ints(longitud, 1, 100);  
			return intStream.sum();				
		};
		System.out.println(acu.acumula(acu.acumula( (int) random.nextInt(100) + 1)));				
	}

}

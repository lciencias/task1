package com.acumulador.java;

import java.util.Arrays;
import java.util.List;

public class TaskList {

	public static void main(String[] args) {
		List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int suma = listNumbers
                .stream()
                .reduce(0, (subtotal, numero) -> subtotal + numero);

        System.out.println(suma);
    }
}

package com.cda.ilot3;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.numbers.primes.Primes;

public class App 
{	
    public static void main( String[] args )
    {
		Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int input = 0;
        do {        	
        	System.out.println("Veuillez saisir un entier naturel: ");     
        	System.out.print("< ");
        	try {
        		input = scanner.nextInt();
        		isValid = true;
        	} catch (NumberFormatException | InputMismatchException e) {
        		scanner.nextLine();	
        	}			
        	System.out.println();
        } while (!isValid);   
        System.out.println("Le nombre est premier: ");
        System.out.println(Primes.isPrime(input));
        System.out.println("Sa décomposition en facteur premier est: ");
        System.out.println(Primes.primeFactors(input));
        System.out.println("Le prochain nombre premier est: ");
        System.out.println(Primes.nextPrime(input));
    }   
}

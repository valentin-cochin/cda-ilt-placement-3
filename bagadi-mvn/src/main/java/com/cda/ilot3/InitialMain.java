package com.cda.ilot3;


import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;


public class InitialMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
		UniformRandomProvider rng =RandomSource.create(RandomSource.MT);
		double r = rng.nextDouble();
		System.out.println(r);

		
	}
	

}

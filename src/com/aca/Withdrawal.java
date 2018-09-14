package com.aca;

public class Withdrawal {

	public static void main(String[] args) {
		
		int withdrawal = 137;
		
		System.out.println("Without modulus operator");
		
		int count = withdrawal / 20;
		int amountRemaining = (withdrawal - (count * 20));
		
		System.out.println(" # of 20s: " + count);
		 
		count = amountRemaining / 10;
		amountRemaining = (amountRemaining - (count * 10));
		
		

	}

}

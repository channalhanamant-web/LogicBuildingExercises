package com.LogicBuilding;

import java.math.BigInteger;

public class FactorialOfABigNumber {

	public static void main(String[] args) {
		int n=50;
		BigInteger factorial=BigInteger.ONE;
		for(int i=1;i<=n;i++)
		{
			factorial= factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);

	}

}

package com.multithreading;

import java.util.HashMap;
import java.util.Scanner;

public class EMI {

	static HashMap<Integer, HashMap<Integer, Double>> plan = new HashMap<>();

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter principal: \n");
			int principal = scan.nextInt();
			System.out.println("Enter Interest per month: \n");
			int rti = scan.nextInt();
			System.out.println("Enter installment per month: \n");
			int installment = scan.nextInt();
			calPlan(principal, rti, installment, plan);
		}
		print(plan);
	}

	private static void print(HashMap<Integer, HashMap<Integer, Double>> plan) {
		System.out.println("-------- Total no of months -------" + plan.size());
		for (int i = 1; i <= plan.size(); ++i) {
			System.out.println(i + ". " + plan.get(i));
		}

	}

	static void calPlan(int principal, int rti, int installment, HashMap<Integer, HashMap<Integer, Double>> plan) {
		int i = 1;
		while (principal > 0) {
			double interest = interest(principal, rti);
			HashMap<Integer, Double> temp = new HashMap<Integer, Double>();
			temp.put(principal < installment ? principal : installment, interest);
			plan.put(i, temp);
			principal -= installment;
			++i;
		}
	}

	static double interest(int principal, int rti) {
		double interest = principal * rti / 100;
		return interest;
	}

}

package codeup;

import java.util.*;

public class Test1205 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		int sum = (int)(a + b);
		int minusA = (int)(a - b);
		int minusB = (int)(b - a);
		int multiple = (int)(a * b);
		int divA = (int)(a / b);
		int divB = (int)(b / a);
		int sqA = (int)(Math.pow(a, b));
		int sqB = (int)(Math.pow(b, a));

		double max = sum;
		max = max > minusA ? max : minusA;
		max = max > minusB ? max : minusB;
		max = max > multiple ? max : multiple;
		max = max > divA ? max : divA;
		max = max > divB ? max : divB;
		max = max > sqA ? max : sqA;
		max = max > sqB ? max : sqB;

		System.out.printf("%.6f", max);

	}

}

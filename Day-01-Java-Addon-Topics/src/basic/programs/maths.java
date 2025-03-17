package basic.programs;

import java.util.Scanner;

public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the radious of circle ");
		int r = in.nextInt();
		double res = (22/7.0)*r*r;
		System.out.println("area:"+ res);
	}

}

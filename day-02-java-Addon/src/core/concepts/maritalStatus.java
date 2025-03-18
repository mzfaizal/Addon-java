package core.concepts;

import java.util.Scanner;

public class maritalStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("enter   the marital ststus : (married/unmarried):");
		String ms = in.nextLine().toLowerCase();
		
		if(ms.equals("married")) {
			System.out.println("you are eligible for the insurance..");
		}
		else if (ms.equals("unmarried")) {
			System.out.println("enter the below details....");
			System.out.println("enter the gender :(male/female):");
			String gender = in.nextLine().toLowerCase();
			if (gender.equals("male")) {
			}   else if (gender.equals("female")) {
			} else {
				System.out.println("invalid gender input...");
			}
			if (in.hasNextInt()) {
	            int age = in.nextInt();
	            System.out.println("Your age is " + age);
	        } else {
				
			
				System.out.println("invalid marital status");
			}
		
		}
	}
	}



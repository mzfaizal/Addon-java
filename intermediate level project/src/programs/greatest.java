package programs;

import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);


  System.out.println("enter value a");
  int a = in.nextInt();
  
  System.out.println("enter value b");
  int b = in.nextInt();
  
  System.out.println("enter  value c");
  int c = in.nextInt();
  
 /*int greatest = a;
 if(a>greatest) {
	 greatest = a;
 }
 if (b>greatest) {
	 greatest = b;
 }
 if (c>greatest) {
	 greatest = c;
 }
 System.out.println("greatest number among a, b ,c is :" + greatest);*/
  if(a>b && a>c) {
	  System.out.println("the greatest value is a "+a );
  }
  else if(b>c) {
	  System.out.println("the greatest value is b " +b);
  }
  else {
	System.out.println("the greatest value is c " + c);	}
	}
}

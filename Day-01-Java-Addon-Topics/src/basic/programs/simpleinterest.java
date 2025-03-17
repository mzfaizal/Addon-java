package basic.programs;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting input from the user 
		Scanner in = new Scanner(System.in);
//variable declaration as well as initialization 
	System.out.println("enter the Prinicpal amount ");
	int p = in.nextInt();
	System.out.println("no of months ");
	int n = in.nextInt();
	System.out.println ("rate of interest");
	int r = in.nextInt();
	 //process the result 
	float res = p*n*r/100;
	//display the result 
	System.out.println("interest amt "+ res);
	
	
	
	}

}

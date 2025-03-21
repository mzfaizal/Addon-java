package core;

import java.util.Scanner;
public static void main(String[] args) {
public class TwoDimentional {
	Scanner in = new Scanner (System.in);
	int[][] marks;
	
	public TwoDimentional() {
		
		int marks = in.nextInt();
	}
	{
		
		// marks[0][0] = 10;
		// marks[0][1] = 20;
		
	
	for( int mark = 0; mark <=100; mark++)  {
		 
	}
		
	
	public  void matrixPrintFormat() {
		System.out.println("Display using nested for loop...");
		// handle the row
		for(int i = 0; i < marks.length; i++) {
			
			// handle the column
			for(int j = 0; j < marks[i].length; j++) {
				// Here im using format specifiers & fixed width display
				System.out.printf("%3d", marks[i][j]);
			}
			// Move to the new line
			System.out.println();
		}
	}
	
	
	public void advancePrintFormat() {
		System.out.println("Advanced Print using forEach");
		for(int[] r: marks) {
			for(int v: r) {
				System.out.printf("%3d", v);
			}
			// Move to the new line
			System.out.println();
		}
	}
	
	public void minmaxtotavg() {
		System.out.println("Find the minimum maximum total average...");
		System.out.printf("mark-1 mark-2 mark-3 minimum maximum total average\n");
		int min, max, tot;
		for(int[] r: marks) {
			min = r[0]; max = r[0]; tot = 0;
			for(int v: r) {
				System.out.printf("%6d ", v);
				if(min > v) min = v;
				if(max < v) max = v;
				tot += v;
			}
			// Move to the new line
			System.out.printf("%7d %7d %5d %7.2f\n", min, max, tot, tot/3.0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
}

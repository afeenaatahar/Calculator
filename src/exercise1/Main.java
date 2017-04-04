package exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Calculation casio=new Calculator();
		System.out.println("Enter the a and b values");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
				
		System.out.println(""+a+"+"+b+"= "+casio.add(a,b));
		System.out.println(""+a+"-"+b+"= "+casio.sub(a,b));
		System.out.println(""+a+"*"+b+"= "+casio.mul(a,b));
		System.out.println(""+a+"/"+b+"= "+casio.div(a,b));
		
		
	}
	

}

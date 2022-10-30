package com.bridgelabz;

import java.util.Scanner;

public class Uc1 {public static void main(String[] args)
{
	int x1,x2,y1,y2,a1,a2,b1,b2;
	double dis1,dis2;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter x1");
	x1=sc.nextInt();
	System.out.println("Enter y1");
	y1=sc.nextInt();
	System.out.println("x2");
	x2=sc.nextInt();
	System.out.println("Enter y2");
	y2=sc.nextInt();
	dis1=Math.sqrt((x2-x1)^2)+((y2-y1)^2);
	System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+dis1);
	
	System.out.println("Enter a1");
	a1=sc.nextInt();
	System.out.println("Enter b1");
	b1=sc.nextInt();
	System.out.println("Enter a2");
	a2=sc.nextInt();
	System.out.println("Enter b2");
	b2=sc.nextInt();
	dis2=Math.sqrt((a2-a1)^2)+((b2-b1)^2);
	System.out.println("distancebetween"+"("+a1+","+b1+"),"+"("+a2+","+b2+")="+dis2);
	
	
}

}

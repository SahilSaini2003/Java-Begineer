package com.dShapeCalculator;

import java.util.Scanner;

class Cuboid {
	public Cuboid(int l, int b, int h) {
		System.out.println("Lateral Surface Area = " + 2 * h * (l + b));
		System.out.println("Total Surface Area = " + 2 * (l * b + b * h + l * h));
		System.out.println("Volume = " + (l * b * h));
	}
}

class Cube {
	public Cube(int l) {
		System.out.println("Lateral Surface Area = " + 4 * l * l);
		System.out.println("Total Surface Area = " + 6 * l * l);
		System.out.println("Volume = " + l * l * l);
	}
}

class Cylinder {
	public Cylinder(int r, int h) {
		System.out.println("Lateral Surface Area = " + 2 * Math.PI * r * (h + r));
		System.out.println("Total Surface Area = " + 2 * Math.PI * r * h);
		System.out.println("Volume = " + Math.PI * r * r * h);
	}
}

class Sphere {
	public Sphere(int r) {
		System.out.println("Surface Area = " + Math.PI * r * r);
		System.out.println("Volume = " + 4 * Math.PI * r * r * r / 3);
	}
}

public class D_Shape_Calculator {
	public static void main(String[] args){
		int choice;
		try (Scanner scan = new Scanner(System.in)) {
			do{
				System.out.print("Available Shapes:-\n1. Cuboid\n2. Cube\n3. Cylinder\n4. Sphere\n5. Exit\nEnter Your Choice:-");
				choice = scan.nextInt();
				switch(choice){
					case 1:
						System.out.print("Enter Length Of Cuboid:-");
						int l = scan.nextInt();
						System.out.print("Enter Breadth Of Cuboid:-");
						int b = scan.nextInt();
						System.out.print("Enter Height Of Cuboid:-");
						int h = scan.nextInt();
						new Cuboid(l,b,h);
						break;
					case 2:
						System.out.print("Enter Length Of Cube:-");
						int lc = scan.nextInt();
						new Cube(lc);
						break;
					case 3:
						System.out.print("Enter Radius Of Cylinder:-");
						int r = scan.nextInt();
						System.out.print("Enter Height Of Cuboid:-");
						int hc = scan.nextInt();
						new Cylinder(r,hc);
						break;
					case 4:
						System.out.print("Enter Radius Of Sphere:-");
						int rs = scan.nextInt();
						new Sphere(rs);
						break;
					case 5:
						System.out.print("Thanks For Using!");
						break;
					default:
						System.out.print("Choose a Correct Option!");
						break;
				}
			}while(choice != 5);
		}
	}
}
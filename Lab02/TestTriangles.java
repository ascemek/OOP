/**
*  Lab 02: Basics of Java
*  @author: Fahmida Hamid
*  @author: Sami Cemek
*  @date: Feb 08, 2022
*  @version: 1.1
*/

/*  when required, import the classes here ... */

import java.lang.Math;
import java.util.Scanner;

class Triangle{

	private double[] arms;

	Triangle()
	{
		arms = new double[3];
	}

	/*	add getters and setters */

	/*
	  Since the instructions say "One accessor (getter method) should only access one arm." and
	  "One mutator (setter method) should only mutate one arm." I created separate setter and getter
	  for each arm. Prof. Hamid said, as long as it works it's fine.
	*/

	//setter arm1
	public void setArm1(double sides1)
	{
		//Ensure that no one can set a negative arm length
		if(sides1 >= 0){
			//System.out.println(sides1); for test purposes only
			System.out.println("arm1: The arm length is positive, go ahead!");
			this.arms[0] = sides1;
		}
		else{
			System.out.println("arm1: " + sides1 + " is not a positive number. You cannot set negative arm length for the Triangle. ");
		}
	}

	//setter arm2
	public void setArm2(double sides2)
	{
		//Ensure that no one can set a negative arm length
		if(sides2 >= 0){
			//System.out.println(sides2); for test purposes only
			System.out.println("arm2: The arm length is positive, go ahead!");
			this.arms[1] = sides2;
		}
		else{
			System.out.println("arm2: " + sides2 + " is not a positive number. You cannot set negative arm length for the Triangle. ");
		}
	}

	//setter arm3
	public void setArm3(double sides3)
	{
		//Ensure that no one can set a negative arm length
		if(sides3 >= 0){
			//System.out.println(sides3); for test purposes only
			System.out.println("arm3: The arm length is positive, go ahead!");
			this.arms[2] = sides3;
		}
		else{
			System.out.println("arm3: " + sides3 + " is not a positive number. You cannot set negative arm length for the Triangle. ");
		}
	}

	//getter arm1
	public double getArm1()
	{
		return arms[0];
	}

	//getter arm2
	public double getArm2()
	{
		return arms[1];
	}

	//getter arm3
	public double getArm3()
	{
		return arms[2];
	}

	// toString
	// assume that we used cm as units.

	public String toString(){

		return "This is a triangle, the arms are of length " 
				+ arms[0] + ", " + arms[1]	
					+ ", " + arms[2] + " cm\n";
	
	}

	// area calculation
	//Calculate the area of the Triangle
	public double areaOfTriangle(){ //double sides1, double sides2, double sides3

		double halfPerimeter = (arms[0] + arms[1] + arms[2])/2;
		//System.out.println(halfPerimeter); test purposes only

		double result = halfPerimeter * (halfPerimeter - arms[0]) * (halfPerimeter - arms[1]) * (halfPerimeter - arms[2]);
		//System.out.println(result); test purposes only

		double TriangleArea = Math.sqrt(result);
		//System.out.println(TriangleArea); test purposes only

		return TriangleArea;
	}

}

public class TestTriangles{

	public static void main(String[] args){

		Triangle t1 = new Triangle();

		System.out.println(t1 + "(^This is before we set the length of arms.)");

		/* add three instructions to set/modifers the arm lengths. */

		/* TRY FOR NEGATIVE EDGE
		t1.setArm1(-5.1);
		t1.setArm2(3.5);
		t1.setArm3(4.7);
		 */

		t1.setArm1(5.1);
		t1.setArm2(3.5);
		t1.setArm3(4.7);

		// print t1
		System.out.println(t1);

		/*
		 Call the area method.
		 In Java, we call a method of an object like this:
				t1.areaOfTriangle();
		 assuming areaOfTriangle is the name of the method.

		We expect that each method has exactly one assigned task. So, do not print the
			calculated area from the areaOfTriangle method, instead just
			return the value to the caller.
		*/

		System.out.println("The area of the triangle t1 is " + t1.areaOfTriangle());

		// create and print t2 and the area of t2 after taking the input from user.

		Scanner in1 = new Scanner(System.in);
		System.out.print("Please enter a double value for arm1: ");
		double x = in1.nextDouble();

		Scanner in2 = new Scanner(System.in);
		System.out.print("Please enter a double value for arm2: ");
		double y = in2.nextDouble();

		Scanner in3 = new Scanner(System.in);
		System.out.print("Please enter a double value for arm3: ");
		double z = in3.nextDouble();

		Triangle t2 = new Triangle();

		t2.setArm1(x);
		t2.setArm2(y);
		t2.setArm3(z);

		System.out.println(t2);
		System.out.println("The area of the triangle t2 is " + t2.areaOfTriangle());

	}
}

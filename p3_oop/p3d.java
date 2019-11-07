import java.util.Scanner;
import java.lang.Math;

class p3d
{
	public static void main(String[] args) {
		
	
		double radius;
		System.out.print("Enter radius : ");
		Scanner sca = new Scanner(System.in);
		radius = sca.nextDouble();
		
		double perimeter=2*Math.PI*radius;
		double area=Math.PI*radius*radius;
		System.out.println("\nPerimeter of circle is " + perimeter);
		System.out.println("\nArea of circle is " + area);

	}

}
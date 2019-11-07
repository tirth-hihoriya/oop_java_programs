import java.util.Scanner;
class Oop_2a{
	
	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		char D=sca.next().charAt(0);
		sca.nextLine();
		char A=sca.next().charAt(0);
		System.out.println("The ASCII value of "+D+"    "+A+" is "+ (int)D +	" .");
	}
}
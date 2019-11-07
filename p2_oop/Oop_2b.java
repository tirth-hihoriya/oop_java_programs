import java.util.Scanner;
class Oop_2b{
	
	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		int date,month,year;
		
		System.out.println("Enter the Date of birth (DD) : ");
		date =sca.nextInt();
		sca.nextLine();
		
		System.out.println("Enter the Month of birth (MM) : ");
		month =sca.nextInt();
		sca.nextLine();
		
		System.out.println("Enter the Year of birth (YY) : ");
		year =sca.nextInt();
		sca.nextLine();
		if((date>0 && date<=9) && (month>0 && month<=9) )
		System.out.println("Your birthday is 0"+date+"/0"+month+"/"+year);
		else if(date<=31 || month<=12)
			System.out.println("Your birthday is "+date+"/"+month+"/"+year);
		else
			System.out.println("Invalid Entry of Data !!!");
		
		
		
		/*
		char D=sca.next().charAt(0);
		sca.nextLine();
		
		System.out.println("The ASCII value of "+D+" is "+ (int)D +	" .");
		*/
	}
}
import java.util.Scanner;
class p2b{
	
	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		int date,month,year;
		boolean isLeapYear=false;
		
		System.out.println("Enter the Date of birth (DD) : ");
		date =sca.nextInt();
		sca.nextLine();
		
		System.out.println("Enter the Month of birth (MM) : ");
		month =sca.nextInt();
		sca.nextLine();
		
		System.out.println("Enter the Year of birth (YYYY) : ");
		year =sca.nextInt();
		if(date>0 && month>0 && year>0){

	/*	if((date>0 && date<=9) && (month>0 && month<=9) )
		System.out.println("Your birthday is 0"+date+"/0"+month+"/"+year);
		
		else if(date<=31 || month<=12)
			System.out.println("Your birthday is "+date+"/"+month+"/"+year);
		else
			System.out.println("Invalid Entry of Data !!!");             
		
	*/	
		
		if((month==1 || month==3 || month==5 ||month==7 ||month==8 || month==10 || month==12) && (date<=31&&date>0))
			System.out.println("Your birthday is  "+date+"/"+month+"/"+year);

		else if ((month==4 ||month==6 || month==9 || month==11 ) && (date<=30&&date>0))
			System.out.println("Your birthday is  "+date+"/"+month+"/"+year);

		
		else if (month==2){
			if((year%4==0 && year%100!=0) || year%400==0 )
				isLeapYear=true;
			else 
				isLeapYear=false;	


			if(isLeapYear && date>0 && date<=29 )
				System.out.println("Your birthday is  "+date+"/"+month+"/"+year);

			else if (date>0 && date<=28)
				System.out.println("Your birthday is  "+date+"/"+month+"/"+year);

			else System.out.println("Enter valid data !!");

		}	




		}
		else System.out.println("Enter valid data !");



	}
}
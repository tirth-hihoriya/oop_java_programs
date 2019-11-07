import java.util.Scanner;
class p3c
{
	public static void main(String args[])
	{	int roll_no = 0;
		//int s1,s2,s3,s4,s5;
		int sum=0,i=1;
		int mks=0,percent=0;

		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the roll no. :");
		roll_no = sca.nextInt();


		do
		{
			
			System.out.println("Enter the marks of subject " + i +" :");
			mks= sca.nextInt();
			if(mks>=0 && mks<=100)
			{
				i++;
				percent=percent+(mks/5);
				
			}


		}while(i<=5);

		// do {	
		// 	System.out.println("Enter the marks of subject 1: ");
		// 	s1 = sca.nextInt();
				
		// } while (s1>100 || s1<0);
		// do {	
		// 	System.out.println("Enter the marks of subject 2: ");
		// 	s2 = sca.nextInt();
		// } while (s2>100 || s2<0);
		// do {	
		// 	System.out.println("Enter the marks of subject 3: ");
		// 	s3 = sca.nextInt();
		// } while (s3>100 || s3<0);
		// do {	
		// 	System.out.println("Enter the marks of subject 4: ");
		// 	s4 = sca.nextInt();
		// } while (s4>100 || s4<0);
		// do {	
		// 	System.out.println("Enter the marks of subject 5: ");
		// 	s5 = sca.nextInt();
		// } while (s5>100 || s5<0);



		
		
		System.out.println("___________________________________");
		System.out.println("\n|    Result of Roll no.-  " + roll_no + "   :   |");
		if(percent>90)
			System.out.println("|         Your grade is  A+        |");
		else if(percent>80)
			System.out.println("|         Your grade is  A         |");
		else if(percent>70)
			System.out.println("|         Your grade is  B+        |");
		else if(percent>60)

			System.out.println("|         Your grade is  B         |");
		else if(percent>50)
			System.out.println("|         Your grade is  C+        |");
		else if(percent>=40)
			System.out.println("|         Your grade is  C         |");
		else if(percent>=0 && percent<40)
			System.out.println("Fail");
		else 
			System.out.println("Enter valid marks i.e. between 0 and 100.");
			System.out.println("___________________________________");




	}
}
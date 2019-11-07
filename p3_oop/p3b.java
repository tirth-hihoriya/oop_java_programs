import java.util.Scanner;
class p3b
{
	public static void main(String args[])
	{
		int n1 =0, n2=0;
		char c;
		Scanner  sca = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		n1=sca.nextInt();
		System.out.println("Enter the 2nd number: ");
		n2=sca.nextInt();

		System.out.println("\nEnter '+' for addition");
		System.out.println("Enter '-' for subtraction");
		System.out.println("Enter '*' for multiplication");
		System.out.println("Enter '/' for division");
		System.out.println("Enter '%' for modulus");
		System.out.println("Enter '&' for bitwise `and`");
		System.out.println("Enter '|' for bitwise `or`");
		System.out.println("Enter '^' for bitwise `xor`");

		System.out.println("Enter 'I' for bitwise `increment by 1`");
		System.out.println("Enter 'D' for bitwise `decrement by 1`");
		System.out.println("Enter 'L' for bitwise `left shift`");
		System.out.println("Enter 'R' for bitwise `right shift`");
		System.out.println("Enter 'U' for bitwise `unary right shift`");


// ++,--,>>,<<

		System.out.println("\n\nEnter the operator :");
		c=sca.next().charAt(0);


		switch(c)
		{
			case '+':
				System.out.println("\nAddition of "+n1+" and "+n2+ " is "+ (n1+n2)); break;
			case '-':
				System.out.println("\nSubtraction of "+n1+" and "+n2+ " is "+ (n1-n2)); break;
			case '*':
				System.out.println("\nMultiplication of "+n1+" and "+n2+ " is "+ (n1*n2)); break;
			case '/':
				if(n2!=0)
				{System.out.println("\nDivision of "+n1+" and "+n2+ " is "+ (n1/n2)); break;}
				else
				{System.out.println("\nYou cannot divide a number by 0."); break;}
			case '%':
				System.out.println("\nModulo of "+n1+" and "+n2+ " is "+ (n1%n2)); break;
			case '&':
				System.out.println("\nBitwise and(&) of "+n1+" and "+n2+ " is "+ (n1&n2)); break;
			case '|':
				System.out.println("\nBitwise or(|) of "+n1+" and "+n2+ " is "+ (n1|n2)); break;
			case '^':
				System.out.println("\nBitwise xor(^) of "+n1+" and "+n2+ " is "+ (n1^n2)); break;


			case 'I': case 'i':
				System.out.println("\nIncrement of "+n1+" and "+n2+ " is "+ (n1++) +" and "+ n2++); break;
			case 'D': case 'd':
				System.out.println("\nDecrement of "+n1+" and "+n2+ " is "+ (n1--) + " " + n2--); break;
			case 'L': case 'l':
				System.out.println("\nLeft shift of "+n1+" and "+n2+ " is "+ (n1<<n2)); break;
			case 'R': case 'r':
				System.out.println("\nRight shift of "+n1+" and "+n2+ " is "+ (n1>>n2)); break;
			case 'U': case 'u':
				System.out.println("\nUnary Right shift of "+n1+" and "+n2+ " is "+ (n1>>>n2)); break;
			case 'C': case 'c':
				System.out.println("\nComplement "+n1+" and "+n2+ " is "+ (~n1) + " and " + (~n2); break;

			
			default:
				System.out.println("Enter valid operator"); 
			

		}


	}
}
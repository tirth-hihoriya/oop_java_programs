import java.util.Scanner;

class p4c
{
    public static void main(String args[])
    {

//----------------------------- (i) -------------------------------------------------------
System.out.println("\n\n ----------------------------- (i) Even or Odd  -------------------------------------\n");
        int number;
        System.out.print("Enter the number : ");
        Scanner sca = new Scanner(System.in);
        number = sca.nextInt();
        if(number%2==0)
            System.out.println(number+" is even.");
        else
            System.out.println(number+ " is odd.");



//------------------------------ (ii) -----------------------------------
System.out.println("\n\n ----------------------------- (ii) Category  -------------------------------------\n");
        char c;
        System.out.print("Enter the character : ");
        c = sca.next().charAt(0);

        if(c>='0' && c<='9')
            System.out.println(c + " is Number.");
        else if(c=='a' || c=='e' || c=='i' || c=='o' ||  c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
            System.out.println(c + " is Vowel.");
        else if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            System.out.println(c + " is Consonant.");
        else
            System.out.println(c + " is Special Character.");



//------------------------------(iii)------------------------------------
System.out.println("\n\n ----------------------------- (iii) Prime or Not  -------------------------------------\n");
int number2,counter=0;
System.out.print("Enter the number : ");

number2 = sca.nextInt();
for(int j=2;j<Math.sqrt(number2);j++)
{
    if(number2%j==0)
        counter++;
}
if(counter == 0)
    System.out.println(number2 + " is a prime number.");
else
    System.out.println(number2 + " is not a prime number.");


//------------------------------- (iv) -----------------------------------
System.out.println("\n\n ----------------------------- (iv) Palindrome or Not -------------------------------------\n");
int n,r=0,temp,unit;
System.out.print("Enter the number : ");

n = sca.nextInt();
temp=n;
while(temp!=0)
{

unit = temp%10;
r = r*10 + unit;
temp = temp/10;
}

if(n==r)
    System.out.println(n + " is a Palindrome number.");
else
    System.out.println(n + " is not a Palindrome number.");


//--------------------------- (v) -----------------------------------------------
System.out.println("\n\n ----------------------------- (v) Arithmetic Calculator  -------------------------------------\n");
int n1 =0, n2=0;
		char ch;
		
		System.out.println("Enter the 1st number: ");
		n1=sca.nextInt();
		System.out.println("Enter the 2nd number: ");
		n2=sca.nextInt();

		System.out.println("\nEnter '+' for addition");
		System.out.println("Enter '-' for subtraction");
		System.out.println("Enter '*' for multiplication");
		System.out.println("Enter '/' for division");
        System.out.println("Enter '%' for modulus");
        
        System.out.println("\n\nEnter the operator :");
		ch=sca.next().charAt(0);


        
        switch(ch)
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
            default :
                System.out.println("\nInvalid input.");
        }











System.out.println("\n\n ----------------------------- (vi) Pattern  -------------------------------------\n");

for(int i=1;i<=6;i++)
{
   
    int k=1;
    for(int j=1;j<=6;j++)
        {
            if(j<=6-i)
                System.out.print(" ");
            else
                {
                System.out.print(k);
                k++;
                }
        }
    System.out.print("\n");
}



    }
}
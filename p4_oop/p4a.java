import java.util.Scanner;



class p4a
{   public static void main(String args[]){


    int feet,inch;
    double BMI,weight;
    Scanner sca = new Scanner(System.in);

    do{
    System.out.print("Enter your Height in feet and inch : ");
    feet = sca.nextInt();
    inch = sca.nextInt();
    }while(inch <0 || inch>12 || feet<0);

    do{
    System.out.print("Enter your Weight in pound(lb) : ");
    weight = sca.nextDouble();
    }while(weight<0);

    final int proconst = 703;

    System.out.print("\n");

    int t_inch = 12*feet + inch;
    BMI = (weight/(t_inch*t_inch)) * proconst;

    if(BMI>=0 && BMI<=18.5)
        System.out.println("BMI = "+BMI+"  -->  Person is Under-Weight" );
    else if (BMI <=24.9  )
        System.out.println("BMI = "+BMI+"  -->  Person is having normal weight");
    else if (BMI <=30)
        System.out.println("BMI = "+BMI+"  -->  Person is Over-weight");
    else if (BMI >30 && BMI<=100)
        System.out.println("BMI = "+BMI+"  -->  Person is Obese");
    else
        System.out.println("BMI = "+BMI+"  -->  Enter valid data");

}
}
import pack9a.*;
import java.util.*;

class p9a 
{
    public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);

    System.out.print("\n\nEnter Length of Square : ");
    float s_len = sca.nextFloat();

    Square s1 = new Square(s_len);
    s1.calcArea();
    s1.calcPeri();
    s1.display();

    System.out.print("\nEnter Length of Rectangle : ");
    float r_len = sca.nextFloat();

    System.out.print("Enter Breadth of Rectangle : ");
    float r_bre = sca.nextFloat();

    Rectangle r1 = new Rectangle(r_len,r_bre);
    r1.calcArea();
    r1.calcPeri();
    r1.display();
    }
    

}


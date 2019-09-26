import java.util.Scanner;
class Medicine
{
    
    String name;
    String address;

    Medicine(String name,String address)
    {
        this.name = name;
        this.address = address;
    }

    public void displayLable()
    {
        System.out.println("Name of company : "+ name);
        System.out.println("Address of company : "+ address);
        
    }

    // public void setName()
    // {
    //     System.out.println("Enter the name of company :");
    //     name = sca.nextLine();
        
    // }
    // public void setAddress()
    // {
    //     System.out.println("Enter the address of company :");
    //     address = sca.nextLine();
    // }


}

class Tablet extends Medicine
{
    Tablet(String name,String address)
    {
        super(name,address);
    }
        
        public void displayLable() {
            super.displayLable();
            System.out.println("store in dry and cool  place.");
        }

}
class Syrup extends Medicine
{
    Syrup(String name,String address)
    {
        super(name,address);
    }
        
        public void displayLable() {
            super.displayLable();
            System.out.println("shake well before use");
        }

}
class Ointment extends Medicine
{
    Ointment(String name,String address)
    {
        super(name,address);
    }
        
        public void displayLable() {
            super.displayLable();
            System.out.println("for external use only");
        }

}


class p8d
{
    public static void main(String args[])
    {

        Scanner sca = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter the name of company :");
        String name = sca.nextLine();

        System.out.println("Enter the address of company :");
        String address = sca.nextLine();


        Medicine m[] = new Medicine[10];
        
        int r;
        System.out.println();
        for(int i=0;i<m.length; i++)
        {
            r = (int) (Math.random()*3);

            if(r==0)  m[i] = new Tablet(name,address);
            else if(r==1)  m[i] = new Syrup(name,address);
           else m[i] = new Ointment(name,address);

           System.out.println((i+1) + ")");

            if(m[i] instanceof Tablet)
                m[i].displayLable();
            else if(m[i] instanceof Syrup)
            m[i].displayLable();  
              else if(m[i] instanceof Ointment)
            m[i].displayLable();  
            System.out.println();
  
            }

            System.out.println();

    }
            

}


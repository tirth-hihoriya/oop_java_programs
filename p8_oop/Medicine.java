import java.util.Scanner;
class Medicine
{
    Medicine()
    {
        setName();
        setAddress();
    }
    Scanner sca = new Scanner(System.in);
    String name;
    String address;
    public void displayLable()
    {
        
    }

    public void setName()
    {
        System.out.println("Enter the name of company :");
        this.name = sca.nextLine();
        
    }
    public void setAddress()
    {
        System.out.println("Enter the address of company :");
        this.address = sca.nextLine();
    }


}

class Tablet extends Medicine
{
        
        public void displayLable() {
            System.out.println("store in dry and cool  place.");
        }

}
class Syrup extends Medicine
{
        
        public void displayLable() {
            System.out.println("shake well before use");
        }

}
class Ointment extends Medicine
{
        
        public void displayLable() {
            System.out.println("for external use only");
        }

}


class p8d
{
    public static void main(String args[])
    {
        Instrument inst[] = new Instrument[10];

        // for(int j=0;j<inst.length;j++)
        // {
        //     int r = (int) (Math.random()*3);
        //     if(r==0)  inst[j] = new Piano();
        //     else if(r==1)  inst[j] = new Flute();
        //    else inst[j] = new Guitar();
        // }
        int r;
        System.out.println();
        for(int i=0;i<inst.length; i++)
        {
            r = (int) (Math.random()*3);
            if(r==0)  inst[i] = new Piano();
            else if(r==1)  inst[i] = new Flute();
           else inst[i] = new Guitar();

            if(inst[i] instanceof Piano)
                inst[i].play();
            else if(inst[i] instanceof Flute)
            inst[i].play();  
              else if(inst[i] instanceof Guitar)
            inst[i].play();    
            }

            System.out.println();

    }
            

}


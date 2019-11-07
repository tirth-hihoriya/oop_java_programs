class Counter extends Thread
{
    Storage sto;
    Counter(Storage s)
    {
        System.out.println("Start of Counter....");

        sto = s;
    }
    public void run()
    {
       
        for(int i=0; i<10;i++)
        {   
        try{
            synchronized(sto)
            {
                

                sto.setValue(i);
                    
                sto.notify();
                sto.wait();

            }

        }    
        catch(InterruptedException ie)
        {
            System.out.println("Exception  occoured.....!!!");
        }
    }
    }

}

class Storage
{
    private int c;
    public void setValue(int i)
    {
        c=i;
    }

    public int getValue()
    {
        return c;
    }

}

class Printer extends Thread
{
    Storage sto;
    Printer(Storage s)
    {
        System.out.println("Start of Printer....");
        sto = s;
    }
    public void run()
    {
       
        while(sto.getValue()<10)
        {
            try{
                synchronized(sto)
                {
                    System.out.println(sto.getValue());
                    sto.notify();
                    if(sto.getValue()==9)
                        System.exit(0);
                    sto.wait();
                   
                }
            }
            catch(InterruptedException ie)
            {
                System.out.println("Excetion  occoured.....!!!");
            }
        }
    }
}

class p10a
{
    public static void main(String[] args) {
        
        Storage s1 = new Storage();
        Thread count = new Thread(new Counter(s1));
        Thread print = new Thread(new Printer(s1));

        

        count.start();
        print.start();


    }
}
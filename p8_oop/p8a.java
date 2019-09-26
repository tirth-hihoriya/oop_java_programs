import java.lang.Math;

abstract class Instrument
{
    abstract void play();
}

class Piano extends Instrument
{
    void play()
    {
    System.out.println("Piano is playing tan tan tan");
    }
}

class Flute extends Instrument
{
    void play()
    {
        System.out.println("Flute is playing toot toot toot");    
    }
}

class Guitar extends Instrument
{
    void play()
    {
        System.out.println("Guiter is playing tin tin tin");
    }
    
}

class p8a
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
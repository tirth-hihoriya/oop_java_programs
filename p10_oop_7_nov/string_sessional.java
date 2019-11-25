
class myString
{
    String ms;
    String ss;
    String rs;
    int noo;

    public myString(String ms,String ss,String rs)
    {
        System.out.println("ddddd");
        this.ms = ms;
        this.ss = ss;
        this.rs = rs;
        noo = 0;
    }

    void pao()
    {int i=0;
        while(i<ms.length())
        {
            i = ms.indexOf(ss,i);
            if(i==-1)
            break;
            System.out.println("String " + ss + " found at index "+ i);
            i+=ss.length();
            noo++;
            
        }
        System.out.println("Total number of occurences : " + noo);
    }

    void rso(int occ)
    {
        String n_s = new String();
        String[] s = new String[noo + 1];
        s = ms.split(ss);
        n_s =s[0];          // new_string
        for(int a=1;a<noo+1;a++)
        {
            if(a==occ)
            n_s+= rs;
            else
            n_s += ss;
            n_s += s[a];
        }
        System.out.println("mainString after replacement :   " +n_s);

           
            
        

    }
}


public class string_sessional
{
    public static void main(String[] args)
    {

    myString mss =new myString("nirma University nirma University Ahmedabad","nirma","Nirma");
    System.out.println(mss.ms);
    mss.pao();
    mss.rso(2);
    

    }
}
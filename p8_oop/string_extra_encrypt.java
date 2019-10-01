import java.util.Scanner;

class string_extra_encrypt
{
    public static void main(String args[])
    {
        Scanner sca = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sca.nextInt();
        String encrypt[] = new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter sentence " + (i+1) + " : ");
            encrypt[i] = sca.nextLine();
                    
            
        }

        for(int i=0;i<n;i+=2)    // odd lines
        {
                        
        }


    }
}
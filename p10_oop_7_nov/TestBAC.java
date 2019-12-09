class Printer
{
    boolean b = true;
    boolean a = false;
    boolean c = false;
    int count = 0;

    synchronized public void printB() {
        try {
            while(this.b == false) wait();
            System.out.print("B");
            this.b = false;
            this.a = true;
            notifyAll();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void printA() {
        try {
            while(this.a == false) wait();
            System.out.print("A");
            this.a = false;
            this.c = true;
            notifyAll();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void printC() {
        try {
            while(this.c == false) wait();
            System.out.print("C");
            this.c = false;
            this.b = true;
            this.count++;
            System.out.println();
            notifyAll();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class A implements Runnable
{
    Printer p;
    A(Printer p) {
        this.p = p;
    }

    public void run() {
        while(this.p.count != 10) {
            this.p.printA();
        }
    }
}

class B implements Runnable
{
    Printer p;
    B(Printer p) {
        this.p = p;
    }

    public void run() {
        while(this.p.count != 10) {
            this.p.printB();
        }
    }
}

class C implements Runnable
{
    Printer p;
    C(Printer p) {
        this.p = p;
    }

    public void run() {
        while(this.p.count != 11) {
            this.p.printC();
        }
    }
}

class TestBAC
{
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread tA = new Thread(new A(p));
        Thread tB = new Thread(new B(p));
        Thread tC = new Thread(new C(p));
        tA.start();
        tB.start();
        tC.start();

        try {
            tA.join();
            tB.join();
            tC.join();
            System.out.println("Execution of all threads over!");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
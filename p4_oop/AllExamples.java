public class AllExamples {
public static void main(String args[])
{
byte a = 126;
byte b = 2;
byte c;
// c = a >> b;
// System.out.println("1 : " + c);

a = 126;
b = 2;
c = (byte) (a >> b);
System.out.println("2 : " + c);

int i1 = 126;
int i2 = 2;
int i3 = i1 >> i2;
System.out.println("3 : " + i3);

// c = a << b;
// System.out.println("4 : " + c);

c = (byte) (a << b);
System.out.println("5 : " + c);

// i3 = i1 << i2;
// System.out.println("6 : " + i3);

// c = a >>> b;
// System.out.println("7 : " + c);

c = (byte) (a >>> b);
System.out.println("8 : " + c);

// i3 = i1 >>> i2;
// System.out.println("9 : " + i3);

a = -126;
c = (byte) (a >> b);
System.out.println("10 : " + c);

// i1 = -126;
// i3 = i1 >> i2;
// System.out.println("11 : " + i3);

c = (byte) (a << b);
System.out.println("12 : " + c);

i3 = i1 << i2;
System.out.println("13 : " + i3);

c = (byte) (a >>> b);
System.out.println("14 : " + c);

i3 = i1 >>> i2;
System.out.println("15 : " + i3);
}
}

class string {
    public static void main(String args[])
    {
        String s = "hi";
        String s2 = "hi";
        String s3 =  new String(s);
        String s4 = new String(s);

        System.out.println(s);
        System.out.println(s==s2);
        System.out.println(s==s3);
        System.out.println(s==s4);
        System.out.println(s3==s4);
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s3.hashCode());

        System.out.println(s4.hashCode());


    }
}
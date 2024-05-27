 class Coversion {
    public static void main(String a [])
    {
        byte b=126;
        int bc=45;
        // b=bc;4 will not work because we can't byte is smaller in size tham int
        bc=b;

        System.out.println(bc);
        System.out.println(b);
    }
    
}

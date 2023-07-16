class Runner {

    public static String cleanString(String str) {

        return str.trim().replaceAll(" +", " ");

    }

    public static void main(String[] args) {
        
        String a = "   Hello    World      ";
        String b = "  Test";
        String c = "     Roger    Roger ";
        String d = "Write    to  file";

        System.out.println("Original Texts");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println();

        System.out.println("Cleaned Texts");
        System.out.println("a = " + cleanString(a));
        System.out.println("b = " + cleanString(b));
        System.out.println("c = " + cleanString(c));
        System.out.println("d = " + cleanString(d));

    }

}
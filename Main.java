public class Main {
    public static void main(String[] args) {
        System.out.println("Git Test");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            // fix bug to method

            String s = "abc";
            s += " fix bug";
            System.out.println(s);
        }

        System.out.println("Other User is editing this file");

        System.out.println("This is main");
        int a = 10;
        for (int i = 0; i < 10; i++) {
            a += i;
        }
        System.out.println(a);

        // Make new Method Here!!
        int n = 0;
        while (n < 5) {
            n++;
            System.out.println(n);
        }
        // Finish new Method

    }
}

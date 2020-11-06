import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, n;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        int c = (a * 100 + b) * n;
        System.out.println(c / 100 + " " + c % 100);
    }
}
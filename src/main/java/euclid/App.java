package euclid;

public class App {

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    /*
    ax + by = gcd(a, b)
    gcd(a, b) = gcd(b%a, a)
    gcd(b%a, a) = (b%a)*x1 + a*y1
    ax + by = (b%a)*x1 + a*y1
    a*x + b*y = (b - (b/a)*a)*x1 + a*y1;
    a*x + b*y = a* (y1 - (b/a)*x1) + b*x1
    x = y1 - (b/a) * x1
    y = x1
     */
    public static int gcdExtended(int a, int b, int x, int y) {
        // base case
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }

        int x1 = 1, y1 = 1;
        int gcd = gcdExtended(b % a, a, x1, y1);

        x = y1 - (b/a) * x1;
        y = x1;
        return gcd;
    }

    public static void main(String[] args) {
        int a = 10, b = 15, g;

        // Function call
        g = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b
                + ") = " + g);

        a = 35;
        b = 10;
        g = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b
                + ") = " + g);

        a = 31;
        b = 2;
        g = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b
                + ") = " + g);

        int x = 1, y = 1;
        a = 35; b = 15;
        g = gcdExtended(a, b, x, y);
        System.out.print("gcd(" + a + ", " + b
                + ") = " + g);
    }
}

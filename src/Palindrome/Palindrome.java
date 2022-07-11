package Palindrome;

public class Palindrome {
    public static void main(String[] args) {

        int a, b = 0, c;
        int n = 241;

        c = n;
        while (n > 0) {
            a = n % 10;  //getting remainder
            b = (b * 10) + a;
            n = n / 10;
        }
        if (c == b)
            System.out.println(c + " is a palindrome number ");
        else
            System.out.println(c + " is not a palindrome");
    }
}


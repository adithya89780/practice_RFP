package Harmonic_number;

public class Harmonic_number {
    public static void main(String args[])
    {

        int num = 5;
        double display = 0.0;

        System.out.println("The harmonic series is: ");

        for (int i = num; i > 0; i--) {
            display = display + (double)1 / i;
            System.out.print(display + ", ");
        }
    }
}


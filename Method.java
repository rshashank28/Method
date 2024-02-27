import java.util.Scanner;

public class Method {
    static Scanner sc = new Scanner(System.in);

    public static void Square() {
        System.out.print("Enter your no:");
        int sqr = 0;
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            sqr = i * i;
            System.out.print(sqr + " ");
        }
    }

    public static void circleArea() {
        System.out.print("enter radius of circle :");
        int r = sc.nextInt();
        int area = (int) Math.PI * r * r;
        System.out.println(area);

    }

    public static void Odd() {
        System.out.print("enter your first no:");
        int a = sc.nextInt();
        System.out.print("enter your last no:");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void digit(int x) {

        if (x == 0) {
            return;
        }

        int count = 0;
        while (x != 0) {
            count++;
            x /= 10; // Remove the last digit
        }
        System.out.println("total no of digit :"+count);
    }


    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1; // base case

        int y = n * fact(n - 1); // call
        return y;
    }

    public static void sqr(int x){
        int sqr=x*x;
        System.out.println(sqr);
    }

    public static void main(String[] args) {
        System.out.println("--------------Menu----------");
        System.out.println("1 Print square of first n natural number.");
        System.out.println("2 Find area of circle by taking radius as input.");
        System.out.println("3 To print all odd number between a and b.");
        System.out.println("4 To find no. of Digits in a number.");
        System.out.println("5 find factorial of n");
        System.out.println("6 To find no. of Digits in a number and then print square of that no..");
        System.out.println("----------------------------");
        System.out.print("Enter the no:");
        int x = sc.nextInt();
        System.out.println();
        switch (x) {
            case 1:
                Square();
                break;
            case 2:
                circleArea();
                break;
            case 3:
                Odd();
                break;
            case 4:
                System.out.print("enter your no:");
                int s = sc.nextInt();
                digit(s);
                break;
            case 5:
                System.out.print("enter your no:");
                int a = sc.nextInt();
                System.out.print(fact(x) + " ");
                break;
            
            case 6:
                    System.out.print("enter your no:");
                    int n = sc.nextInt();
                    digit(n);
                    sqr(n);
                    break;

        }

    }

}

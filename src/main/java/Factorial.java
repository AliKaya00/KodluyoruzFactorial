import java.util.Scanner;

public class Factorial {
    static int factorial(int factoralNumber) {
        int factresult = 1;
        for (int i = 1; i < factoralNumber; i++) {
            factresult *= i;
        }
        return factresult;
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert a number: ");
        int n =scanner.nextInt();

        System.out.println("Insert another number: ");
        int m= scanner.nextInt();

        int result = factorial(n) / factorial(m)*factorial(n-m);
        System.out.println("Combination(n,m) : " + result);


    }
}

    
    



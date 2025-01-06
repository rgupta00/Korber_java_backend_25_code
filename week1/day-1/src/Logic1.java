import java.util.Scanner;

public class Logic1 {
    public static int totalPrimeBetweenTwoNumber(int n1,int n2){
        int total=0;
        for(int i=n1;i<=n2;i++){
            if(isPrimeNumber(i)){
                total++;
            }
        }
        return total;
    }

    public static boolean isPrimeNumber(int n){
        boolean isPrime=true;
        for(int i=2;i<n; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        //logic for prime number
        //take the input from the user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=scanner.nextInt();
        System.out.println("Enter the second number");
        int n2=scanner.nextInt();

        int total=totalPrimeBetweenTwoNumber(n1,n2);
        System.out.println("prime no bw the range is "+total);


    }
}

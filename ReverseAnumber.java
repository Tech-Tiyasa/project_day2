import java.util.Scanner;

public class ReverseAnumber {
    
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    int reverse = 0;

    while ( num > 0){
        reverse = reverse *10 + (num%10);
        num /=10;
    }
    System.out.println("Reversed number is : " + reverse);

    }
}

// ctrl + c ->


import java.util.Scanner;

public class CollatzSequence {
    
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number to put through the Collatz Conjecture.");
        int num = Integer.valueOf(scan.nextLine());

        for(int i = 0; i < 1000; i++){
            if(num % 2 != 0){
                num = 3*num + 1;
            } else {
                num = num / 2;
            }
            Thread.sleep(1000);
            System.out.println("Number: "+num);
        }
    }
}

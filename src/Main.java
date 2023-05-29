import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number(1-30): ");
            int num = input.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < nums[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
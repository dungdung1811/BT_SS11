package ra.bt4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        System.out.println("Nhập vào số lượng từ");
        int numberOfWord = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfWord; i++) {
            System.out.println("Nhập vào từ thứ " + (i + 1) + ": ");
            stack.push(sc.nextLine());
        }

        if (!stack.isEmpty()){
            System.out.println("Sau khi đảo ngược");
            System.out.println("***********************");
            for (int i = numberOfWord-1; i >=0 ; i--) {
                String word = stack.remove(i);
                System.out.print(word + " ");
            }
        }
    }
}

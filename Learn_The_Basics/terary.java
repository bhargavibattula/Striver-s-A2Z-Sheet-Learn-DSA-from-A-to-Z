import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}

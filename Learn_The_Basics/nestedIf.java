import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        boolean hasID = sc.nextBoolean();

        if(age >= 18) {
            if(hasID) {
                System.out.println("Entry Allowed");
            } else {
                System.out.println("ID Required");
            }
        } else {
            System.out.println("Not Allowed");
        }
    }
}

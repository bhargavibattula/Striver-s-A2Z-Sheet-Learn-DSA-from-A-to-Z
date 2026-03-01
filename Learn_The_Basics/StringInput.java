public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read a character 
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        //read a word 
        String str = sc.next();
        System.out.println(str);
        // read a line 
        String str2 = sc.nextLine();
        System.out.println(str2);
        //read 2 lines 
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character after reading the integer
        String line1 =  sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println(line1);
        System.out.println(line2);



    }
    
}

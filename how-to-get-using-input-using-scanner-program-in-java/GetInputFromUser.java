import java.util.Scanner;

class GetInputFromUser {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter a string");
        String var2 = var1.nextLine();
        System.out.println("You entered string " + var2);
        System.out.println("Enter an integer");
        int var3 = var1.nextInt();
        System.out.println("You entered integer " + var3);
        System.out.println("Enter a float");
        float var4 = var1.nextFloat();
        System.out.println("You entered float " + var4);
    }
}
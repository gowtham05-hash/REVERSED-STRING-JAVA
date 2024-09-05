import java.util.Scanner;

class Reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your reversed string: ");
        String str = input.nextLine();
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
    }
}
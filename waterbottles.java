import java.util.Scanner;

public class waterbottles {
    public static void main(String[] args) {
        System.out.println("Enter the number of water bottles");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the capacity of bottels");
        int x = sc.nextInt();
        System.out.println("Enter the capacity of the tank");
        int k = sc.nextInt();
        if(x>k){
            System.out.println("The number of bottles that can be filled");
            System.out.println("0");
        }
        else if((k/x)<=n){
            System.out.println("The number of bottles that can be filled");
            System.out.println(k/x);
        }
        else{
            System.out.println("The number of bottles that can be filled");
            System.out.println(n);
        }
    }
}

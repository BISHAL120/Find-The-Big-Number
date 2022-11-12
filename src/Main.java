import java.util.Scanner;

public class Main {
/*
    public static void BigNumber(int a, int b){
        System.out.println(Math.max(a, b));

    }
*/
    public static void GreatNumber(int a, int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GreatNumber(a, b);

    }



}
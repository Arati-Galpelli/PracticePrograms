import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Command line arguments");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum of integer numbers:" + sum);
        }
    }
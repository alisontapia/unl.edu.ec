package unl.edu.ec.badCode;
import java.util.Scanner;

public class NumeroPar{
    static int x;

    public static void main(String[]args){

        Scanner z=new Scanner(System.in);
        System.out.println("aaa");
        x=z.nextInt();

        if(x%2==0)
        {
            System.out.println("s");
        }
        else
        {
            System.out.println("n");
        }

        if(x==0){
            System.out.println("0");
        }

    }}

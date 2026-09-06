package secao07_funcoes;
import java.util.Scanner;

/*
* Receive three integers and state which of them is the largest.
* */

public class Exercicio02SintaxeFunctions {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers to find out which is the largest.");
        System.out.print("Enter the first integer: ");
        int firstInteger = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int secondInteger = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int thirdInteger = sc.nextInt();
        int largestInt = getLargestInt(firstInteger, secondInteger, thirdInteger);

        showResult(largestInt);
        sc.close();
    }

    public static int getLargestInt(int firstInt, int secondInt, int thirdInt){

        int largest;
        if(firstInt >= secondInt && firstInt >= thirdInt){
            largest = firstInt;
        }else if(secondInt >= thirdInt){
            largest = secondInt;
        }else{
            largest = thirdInt;
        }
        return largest;
    }

    public static void showResult(int value){
        System.out.println("The largest number is: "+value);
    }
}

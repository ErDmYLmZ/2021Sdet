package lambda;

public class MethodLambda02 {

    public static void printWithSpace(Object o){
        System.out.print(o+" ");
    }


    public static int sumOfDigits(int a){
        int sum = 0;
        while (a!=0){
            sum=sum+a%10;
             a=a/10;
        }return sum;

    }

}

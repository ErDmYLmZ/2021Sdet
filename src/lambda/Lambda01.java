package lambda;

import jdk.dynalink.linker.ConversionComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        
    
    
    List<Integer>list = new ArrayList<>(Arrays.asList(14,9,13,4,9,2,4,14,15));

//        listYazdir(list);
//        System.out.println();
//        lambdalist(list);
//        System.out.println();
//        lamdaCift(list);
//        System.out.println();
//        lambdaKare(list);
//        System.out.println();
//        difSingleTrip(list);
//        System.out.println();
//        doubleSquare(list);
//        System.out.println();
        uniqueDoubleTripleForce(list);
        System.out.println();
        sortedNat(list);
        System.out.println();




        
        


        }



    public static void sortedNat(List<Integer> list) {
        list.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }


    public static void uniqueDoubleTripleForce(List<Integer>list) {
       int Triple = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(x,y)->x*y);
        System.out.println(Triple);
    }

//    public static void doubleSquare(List<Integer> list) {
//        int  sumOf = list.stream().distinct().filter(t->t%2==0).map(t-> t*t).reduce(0,(x,t)->x+t);
//        System.out.println(sumOf);
//    }
//
//    public static void difSingleTrip(List<Integer> list) {
//        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
//    }
//
//    public static void lamdaCift(List<Integer> list) {
//        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
//    }
//
//    public static void lambdaKare(List<Integer>list){
//        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.println(t+" "));
//    }
//
//    public static void listYazdir(List<Integer> list) {
//        for (Integer w: list) {
//            System.out.print(w+" ");
//        }
//
//    }
//    public static void lambdalist(List<Integer>list){
//        list.stream().forEach(t-> System.out.print(t+" "));
//    }



}  



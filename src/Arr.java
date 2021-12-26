import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Arr {

    public static void main(String[] args) {

        String a = "     Java,Python,oracle    ";
        System.out.println(a);
        String aArr =a.stripLeading();
        System.out.println(aArr);

        String b = "Adana";
        for(int i =b.length()-1; i>=0; i--){
            System.out.print(b.charAt(i));
        }
        System.out.println();

        StringBuilder ss = new StringBuilder("Adana");
        System.out.println(ss.reverse());

        StringBuffer sss = new StringBuffer("Adana");
        System.out.println(sss.reverse());

        String[] arr={"Adana"};


//        for (String w: aArr
//             ) {
//            System.out.println(w);
//
//        }

//    int arr[] ={1,2,3,4};
//        System.out.println(arr[3]);
//
//        HashSet<String>hset = new HashSet<>(Arrays.asList("ali","veli","hasan"));
//        HashSet<String>hset2 = new HashSet<>(Arrays.asList("nali","eveli","ihasan"));
//
//        System.out.println(hset);
//        System.out.println(hset2);
//        System.out.println(hset.contains("ali"));
//        hset2.remove("ihasan");
//        System.out.println(hset2);

       // LinkedHashSet<String>lhst = new LinkedHashSet<>(Arrays.asList("zeliha","vildan","ali","caner"));
    HashSet<Double>hs = new HashSet<>();
    double sonuc=toplaminiAl(setOlustur());
        System.out.println(sonuc);

    }

    public static HashSet<Double> setOlustur (){
        HashSet<Double>hs=new HashSet<>(Arrays.asList(3.23,3.10,5.12,10.12,23.12));
        return hs;
    }
    public static Double toplaminiAl(HashSet<Double>dhs){
    double toplam =0;
        for (Double w:dhs
             ) {toplam+=w;
        }
        return toplam;
    }

    }


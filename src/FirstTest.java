import com.sun.jdi.connect.spi.Connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstTest {

    public static void main(String[] args) {
        System.out.println("Never give up!");
        List<String>aaa = new ArrayList<>();
        aaa.add("aaa,sss,ddd");
        System.out.println(aaa);
        String str = "GitHub";
        String str1 = "Test2";
        String str2 = "Test3";
        StringBuilder strb = new StringBuilder("test123");
        strb.deleteCharAt(2);
        System.out.println(strb);
        System.out.println(Arr.setOlustur());
        String[] arr ={"1","2","2"};
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");

        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));


        int a = 10;
        String b = "Televizy";

        String c =Integer.toString(a);
        System.out.println(b+c);
        
    }
}

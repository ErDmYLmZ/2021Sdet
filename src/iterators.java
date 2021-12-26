import java.util.*;

public class iterators {

    public static void main(String[] args) {
        List<String>li = new ArrayList<>(Arrays.asList("a","n","d","r","o","i"));
        System.out.println(li);

        for (int i=0; i<li.size();i++){
            System.out.print(li.get(i));
        }
        System.out.println();
        for (String w:li
             ) {
            System.out.print(w);
        }
        System.out.println();

        for (int i=0; i<li.size();i++){
            System.out.print(li.get(i)+":-) ");
        }

        List<String>listit = new ArrayList<>(Arrays.asList("i","t","e","r","a","t","o","r"));

        ListIterator it1 = listit.listIterator();
        while(it1.hasNext()){
           String depot= (String) it1.next();
           it1.set(depot+"-");
        }
        System.out.println(listit);
    }





}

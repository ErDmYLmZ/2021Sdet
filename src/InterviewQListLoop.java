import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;
public class InterviewQListLoop {


    public static class Hobbies {
        private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();
        public void add(String hobbyist, String... hobbies) {
            this.hobbies.put(hobbyist, hobbies);
        }
        public List<String> findAllHobbyists(String hobby) {
            List<String> result = new ArrayList<>();
            for (HashMap.Entry<String, String[]> entry : hobbies.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                for(String w: hobbies.get(key)){
                    if (w.equals(hobby)){
                        result.add(key);
                    }
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Hobbies hobbies = new Hobbies();
            hobbies.add("Steve", "Fashion", "Piano", "Reading");
            hobbies.add("Patty", "Drama", "Magic", "Pets");
            hobbies.add("Chad", "Puzzles", "Pets", "Yoga");
            System.out.println(Arrays.toString(hobbies.findAllHobbyists("Pets").toArray()));
        }
    }
}
//        //1.way: use for-each loop and Map.entrySet()
//        //To convert a map to a collection y need to use entrySet()
////      for (Map.Entry<Integer, String> w : hm1.entrySet()) {
////          System.out.print(w.getKey());
////          System.out.print(" ");
////          System.out.print(w.getValue());
////          System.out.println();
////      }
//        //2.way: Iterator on Map.Entry<K, V>
////    Iterator<Map.Entry<Integer, String>> hm1Itr = hm1.entrySet().iterator();
////
////      while(hm1Itr.hasNext()) {
////        Map.Entry<Integer, String> entry=hm1Itr.next();
////        System.out.print(entry.getValue()+" ");
////        System.out.println(entry.getKey());
////    }
//        public List<String> findAllHobbyists2(String hobby) {
//            throw new UnsupportedOperationException("Waiting to be implemented.");
//        }


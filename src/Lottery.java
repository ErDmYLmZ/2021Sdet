import java.util.*;

public class Lottery {
    public static void main(String[] args) {

        //Every person promised to read so many parts that have been written as initial capacity of array
        int bilal[]=new int[3];
        int nuri[]=new int[3];
        int burak[]=new int[2];
        int cengiz[]=new int[3];
        int ilyas[]=new int[3];
        int hamza[]=new int[2];
        int erol[]=new int[3];
        int muammer[]=new int[2];
        int huseyin[]=new int[2];
        int mehmet[]=new int[3];
        int kadir[]=new int[4];


        Map<String,int[]> assignList=new HashMap<>();

        assignList.put("Bilal Bey",bilal);
        assignList.put("Nuri Bey",nuri);
        assignList.put("Cengiz Bey", cengiz);
        assignList.put("Hamza Bey", hamza);
        assignList.put("Erol Bey", erol);
        assignList.put("Muammer Bey", muammer);
        assignList.put("Hüseyin Bey", huseyin);
        assignList.put("Mehmet Bey", mehmet);
        assignList.put("Kadir Bey", kadir);
        assignList.put("Ilyas Bey", ilyas);
        assignList.put("Burak Bey", burak);

        List<String> nameList=new ArrayList<>(assignList.keySet());
        Collections.shuffle(nameList);
        Map<String, int[]> shuffleMap = new LinkedHashMap<>();
        nameList.forEach(k->shuffleMap.put(k, assignList.get(k)));

        int i=1;
        for(Map.Entry<String,int[]> entry:shuffleMap.entrySet()){

            for(int y=0;y<entry.getValue().length;y++){
                entry.getValue()[y]=i;
                i++;
            }

        }
        for(Map.Entry<String,int[]> entry:shuffleMap.entrySet()){
            int[] arr=entry.getValue();
            System.out.println(entry.getKey()+": "+Arrays.toString(arr));
        }
    }
}

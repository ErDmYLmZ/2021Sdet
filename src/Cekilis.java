import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

    public class Cekilis {

        
        
        public static void main(String[] args) {
            int kisiSayisi=77;
            Set<Integer> asilList=new TreeSet<>();
            Set<Integer> yedekList=new HashSet<>();
            double rndSayi=0;
            int kuraNo=0;
            while(asilList.size()<10){
                rndSayi=Math.random();
                kuraNo=(int) ((kisiSayisi-1)*rndSayi);
                kuraNo++;
                asilList.add(kuraNo);
            }
            System.out.println("Asil liste"+asilList);
            while(yedekList.size()<20){
                rndSayi=Math.random();
                kuraNo=(int) ((kisiSayisi-1)*rndSayi);
                kuraNo++;
                if (!asilList.contains(kuraNo)) {
                    yedekList.add(kuraNo);
                }
            }
            int yedekSira=1;
            for (Integer each : yedekList) {
                if (yedekSira<10) {
                    System.out.println(" "+yedekSira+". yedek : "+ each);
                } else {
                    System.out.println(yedekSira+". yedek : "+ each);
                }
                yedekSira++;
            }
        }
    }


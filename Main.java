import zivie.Celovek;
import zivie.Pes;
import zivie.Zivocich;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dvaDZoznam=new ArrayList<ArrayList<String>>();
        for(int i=0;i<10;i++){
            dvaDZoznam.add(new ArrayList<>());
            for(int x=0;x<5;x++){
                dvaDZoznam.get(i).add(""+x);
            }
        }
        dvaDZoznam.forEach(System.out::println);
        ArrayList<String> mens=new ArrayList<String>(List.of("Marat","Marek","Nikola","Abokan","Sergei"));
        mens.sort(String::compareTo);
        System.out.println(mens);
        ArrayList<Zivocich>zivki = new ArrayList<>();
        zivki.add(new Pes("Marat"));
        zivki.add(new Pes("Marek"));
        zivki.add(new Celovek("Nikola"));
        zivki.add(new Celovek("Abokan"));
        zivki.add(new Celovek("Sergei"));
        //zivki.sort((o1, o2) -> o1.compare(o1,o2));
       // zivki.forEach(System.out::println);
        zivki.sort((o,o1) -> o.compareTo(o1));
        //zivki.sort(Comparator.comparing(o2-> o2.compare());
        zivki.forEach(System.out::println);

    }
}

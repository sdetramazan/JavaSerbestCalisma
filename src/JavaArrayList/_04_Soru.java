package JavaArrayList;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class _04_Soru {
    public static void main (String[] args){

        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("black");
        colors.add("Green");
        colors.add("Yellow");

        Iterator gosterge= colors.iterator();
        while (gosterge.hasNext()){
            System.out.println(gosterge.next());
        }
        System.out.println("Iterator kullanıldı");
        System.out.println("*****************");
        for (String color: colors ) {
            System.out.println(color);
        }
        System.out.println("forech kullanıldı");


    }


}

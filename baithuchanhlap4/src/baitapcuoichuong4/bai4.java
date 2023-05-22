package baitapcuoichuong4;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class bai4 {
    public static void main(String[] args) {
        HashSet<String> dsqua = new HashSet<>();
        dsqua.add("na");
        dsqua.add("dua");
        dsqua.add("oi");
        dsqua.add("dao");
        dsqua.add("mit");

        System.out.println("so qua la" + " " + dsqua.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("qua moi la");
        String qua = sc.nextLine();
        java.util.Iterator<String> inter = dsqua.iterator();
        while (inter.hasNext()) {
            String firstElement = inter.next();
            if (firstElement.equals(qua)) {
                System.out.println("cos timf thay");
                break;

            } else if (inter.hasNext() == false && !firstElement.equals(qua)) {
                System.out.println("ko tim thay");
                break;

            }

        }
        System.out.println("nhap qua can xao");
        String Quamoi = sc.nextLine();
        while (inter.hasNext()) {
            String firstElement = inter.next();
            if (firstElement.equals(Quamoi)) {
                dsqua.remove(firstElement);
                break;
            }

        }
       for (String a  : dsqua) {
        System.out.println(a +" ");

        
       }
        System.out.println(dsqua.isEmpty());

    }

}

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("nhap so phan tu");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so thu" + i + "");
            number = sc.nextInt();
            arrlist.add(number);

        }

        // INT DANH SACHS
        System.out.println("MANG");
        for (Integer a : arrlist) {

            System.out.print(a + " ");

        }
        System.out.println();
        System.out.println("nhap so moi");
        int Target;
        Target = sc.nextInt();
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i).equals(Target)) {
                arrlist.remove(i);

            }
            

        }
        int max = arrlist.get(0);
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i).compareTo(max) > 0) {
                max = arrlist.get(i);
            }
        }
        // INT DANH SACHS
        System.out.println();
        System.out.println("MANG");
        for (Integer a : arrlist) {

            System.out.print(a + " ");

        }
        System.out.println();
        System.out.println("so lon nha" + " " + max);
        System.out.println("Mảng chưa sắp xếp: " + arrlist);
        arrlist.sort(Comparator.naturalOrder());
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + arrlist);
        arrlist.sort(Comparator.reverseOrder());
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + arrlist);
        System.out.println("---------------------------------");


        sc.close();
    }

}

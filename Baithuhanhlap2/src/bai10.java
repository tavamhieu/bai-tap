import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class bai10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String string;
        char characters;
        int count = 0;

        do {
            System.out.println("Nhap vao 1 chuoi bat ki");
            string = sc.nextLine();
        } while (string.length() < 80);

        System.out.println("Nhap vao ky tu bat ki: ");
        characters = sc.next().charAt(0);

        for (int i = 0; i < string.length(); i++) {
            if (characters == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu la " + characters +
                " trong chuỗi " + string + " = " + count);
    }

}

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class bai5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;
        String space = " ";

        do {
            System.out.println("Nhap vao cac so nguyen: ");
            number = sc.nextInt();
            space += number + " + ";
            sum += number;
        } while (sum < 100);
        System.out.println("Tong cac so cong lon hon 100: " + space.substring(0, space.length() - 2) + " = " + sum);

    }
}
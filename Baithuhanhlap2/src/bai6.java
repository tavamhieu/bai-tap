import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class bai6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number, temp = 1;
        int factorical = 1;

        do {
            System.out.println("Nhap vao so nguyen duong vao ban phim: ");
            number = sc.nextInt();

        } while ((number <= 0) || (number > 10));

        while (number >= temp) {
            factorical *= temp;
            temp++;
        }

        System.out.println(number + "! = " + factorical);
    }
}

package baitapcuoichuong4;

import java.util.Scanner;

import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args) {
        int n, number, tong = 0, sochan;
        int tbcong;
        ArrayList<Integer> intlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so phan tu ArreyList: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu" + i + ": ");
            number = sc.nextInt();
            intlist.add(number);
        }
        for (int i = 0; i < n; i++) {
            if (intlist.get(i) % 2 == 0) {
                tong += intlist.get(i);
                System.out.println("tong so chan la" + tong);

            }

            tbcong = tong / n;
            System.out.println("Trung bình cộng của các số chẵn trong danh sách = " + tbcong);
        }
    }
}

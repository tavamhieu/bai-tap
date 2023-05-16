package Lists;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> stdlist= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Students std = new Students();

        System.out.print("Nhap vao so hoc sinh: ");
        int n = sc.nextInt();

        std.Add(stdLists, n);
        std.HienThi(stdLists);
        std.SuaThongTin(stdLists);
        std.XoaThongTin(stdLists);

       
    
}
}

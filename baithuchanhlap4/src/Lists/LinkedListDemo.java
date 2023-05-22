package Lists;

import demo.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> stdlist = new LinkedList <>();
        for(int i= 0; i<n;i<++){
            Student std= new Student();
            std.nhapthongtin();
            stdlist.add(std);
        }
        Scanner sc = new Scanner(System.in);
        Students std = new Students();

        System.out.print("Nhap vao so hoc sinh: ");
        int n = sc.nextInt();

        std.nhapthongtin(stdLists, n);
        std.HienThi(stdLists);
        std.SuaThongTin(stdLists);
        std.XoaThongTin(stdLists);
        
    }
    
}

import java.util.Scanner;

public class nhanvien {
    Scanner sc = new Scanner(System.in);
    final int luongcoban=1300000;
    String hovten;
    int namsinh,luong;
    int hesoluong;
    
    void nhapthongtinnhanvien(){
        System.out.println("nhap ho va ten ");
        hovten=  sc.nextLine();
    }
    void nhapnamsinhluong(){
        System.out.println("nha nam sinh");
        namsinh= sc.nextInt();
        System.out.println("nhap luong");
        hesoluong = sc.nextInt();

    }
    void tinhluong(){
        luong= luongcoban * hesoluong;

    }
    void inhovaten(){
        System.out.println("ho va ten nv la:"+hovten);
    }
    void innamsinh0luong0hesoluong(){
        System.out.println("nam sinh la:"+namsinh);
        System.out.println("luong :"+luong);
        System.out.println("he so luong la:"+hesoluong);
    }
    }
    

    
   


    


import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int tuan =0;
        


        switch(tuan){
            case 0 : System.out.println("ngay chu nhat");
            break;
            case 1: ;  System.out.println("ngay thu hai");
            break;
            case 2 :  System.out.println("ngay thu ba");
            break ;
            case 3 :  System.out.println("ngay thu tu");
            break;
            case 4:  System.out.println("ngay thu nam");
            break;
            case 5:  System.out.println("ngay thu sau");
            break;
            case 6:  System.out.println("ngay thu bay");
            break;
            default: System.out.println("khong dung yeu cau");


        }sc.close();
    }
}
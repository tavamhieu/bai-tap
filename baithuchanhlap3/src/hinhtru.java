import java.util.Scanner;

public class hinhtru {

    final float pi = 3.14f;
    float r;
    float h;
    float cv ;
    float ttt;
    public void nhapthanhphan(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ban kinh");
        r= sc.nextFloat();
        System.out.println("nhap chiau cao");
        h= sc.nextFloat();
    }
    public float tinhcv(){
        cv=pi*r*r;
        return cv;
    }
    public float tinhttt(){
        ttt= pi*r*r*h;
        return ttt;
    }
    void incv(){
        System.out.println("chu vi la:"+cv);

    }
    void inttt(){
        System.out.println("the tich tru la:"+ttt);
    }



    
}

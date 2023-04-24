import java.util.Scanner;

public class hinhchunhat {
    float d;
    float r;
    float cv;
    float dt;
    void nhapchisohinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai la:");
        d = sc.nextFloat();
        System.out.println("chieu rong la:");
        r = sc.nextFloat();
        
    

    }
    int tinhcv (){
        cv= (d+r)*2;
        return 0;

    }
    void inchuvihinh(){
        System.out.println("chu vi la :"+cv);
    }
    int tinhdientich(){
        dt=d*r;
        return 0;
    }
    void indientich(){
        System.out.println("dien tich hcn la :"+dt);
    }
    

   

}




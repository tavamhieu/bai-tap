import java.util.Scanner;

public class bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, hieu=0 ,tich=0,thuong=0,tong=0;
        System.out.println("nhap  so bat ki thu 1:");
        a= sc.nextFloat();
        System.out.println("nhap so bat khi thu 2");
        b= sc.nextFloat();
        for(int i=0;i<1000 ;i++){
           
            tong = tong +a +b;            hieu = hieu+ a-b;
            tich = tich + a*b;
            thuong = thuong + a/b;
        }
        System.out.println("tong hai so"+a+"va:"+b+"la:"+tong);
        System.out.println("hieu hai so"+a+"va:"+b+"la:"+hieu);
        System.out.println("tich hai so"+a+"va:"+b+"la:"+tich);
        System.out.println("thuong hai so"+a+"va:"+b+"la:"+thuong);


        if(a>b){
            System.out.println("so thu1 lon hon so thu 2");
            
              
            }else{
                System.out.println("so thu2 lon hon so thu nhat");

            }
         if(a %2==0){
            System.out.println("day la so chan");
         }else{
            System.out.println("day la so le");
         }   
        }

        

        }

    

import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        
        

        int number,sum=0;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap cac so nguyen :" );
            number = sc.nextInt();
        for(int i =1;i<100;i++)
        {
          sum=sum+i;  

        }
        System.out.println("tong cac so tu 1 den"+number+"la:"+sum);
        
        
            

        

        
        
        
    }


    
}
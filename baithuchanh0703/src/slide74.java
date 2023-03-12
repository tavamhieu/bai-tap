import java.util.Scanner;

public class slide74{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0 ;
        
        System.out.println("nhap mang ");
        n = sc.nextInt(); 
    


    int arr[] = new int[n];     
    for(int i = 0 ; i< arr.length ;i++ )
    {
        System.out.printf("nhap vao gia tri phan tu thu %d",i);
        arr[i] = sc.nextInt();

    }
    
    
    for(int i=0; i < arr.length; i++){
        if(arr[i]%2 == 0){
            sum += arr[i];

        }

    }
    System.out.println("tong so chan cua mang la" +sum);


    

    




    
    
    

}
}
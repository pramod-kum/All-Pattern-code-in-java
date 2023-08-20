import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int num=0;
            for(int j=0;j<n;j++){
                num++;
               if(i+j>=n-1) {
                   if(j==n-1){
                       System.out.print("0"+" ");
                   }else {
                       System.out.print(num+" ");
                   }

               }else {
                   System.out.print("  ");
               }
            }
            for(int j=1;j<n;j++){
                num--;
                if(j<=i){
                    System.out.print(num+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

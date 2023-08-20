import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int num=0;
        for(int i=0;i<n;i++){
            num++;
            for(int j=0;j<n;j++){
                if(j<=i) {
                    if(j==0){
                        System.out.print(num+" ");
                    }else {
                        System.out.print("* "+num+" ");
                    }
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            num--;
            for(int j=0;j<n;j++){
                if(i+j<n-1) {
                    if(j==0){
                        System.out.print(num+" ");
                    }else {
                        System.out.print("* "+num+" ");
                    }

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

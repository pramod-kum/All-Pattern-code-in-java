import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<n;j++){

                if(i+j>=n-1) {


                        System.out.print(num + " ");
                        num++;
                }else {
                    System.out.print("  ");
                }
            }
            for(int j=0;j<n;j++){

                if(j<i) {

                    System.out.print(num + " ");
                    num++;
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n/2+1;i++){

            for(int j=0;j<n/2+1;j++){

                if(i+j==n/2+1-1) {

                        System.out.print("*" + " ");

                }else {
                    System.out.print("  ");
                }
            }
            for(int j=1;j<n/2+1;j++){

                if(j==i) {

                    System.out.print("*" + " ");

                }else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        //////////////////////////////////////////////////////
        for(int i=1;i<n/2+1;i++){

            for(int j=0;j<n/2+1;j++){

                if(j==i) {

                    System.out.print("*" + " ");

                }else {
                    System.out.print("  ");
                }
            }
            for(int j=0;j<n/2;j++){

                if(i+j==n/2-1) {

                    System.out.print("*" + " ");

                }else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
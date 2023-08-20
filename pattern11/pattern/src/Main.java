import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){

                if(i+j>=n-1) {
                    count++;
                    if(count%2==0) {
                        System.out.print("*" + " ");
                    }else {
                        System.out.print(" " + " ");
                    }
                }else {
                    System.out.print("  ");
                }
            }
            for(int j=0;j<n;j++){
                if(j<i) {
                    count++;
                    if(count%2==0) {
                        System.out.print("*" + " ");
                    }else {
                        System.out.print(" " + " ");
                    }

                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
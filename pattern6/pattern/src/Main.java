import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int space=0;
        for(int i=0;i<n;i++){
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(j>=i) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print("  ");
                }
            }
            space+=2;
            System.out.println();
        }

    }
}
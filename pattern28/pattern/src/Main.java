import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int num=0;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(i+j>=n-1) {

                        num++;
                        System.out.print(num + " ");

                }else {
                    System.out.print("  ");
                }
            }
            for(int j=0;j<n;j++){

                if(j<i) {
                    num--;
                    System.out.print(num+ " ");
                    ;
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class ELMAS {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int merkez;
        System.out.println("Elmas üretici; ");
        System.out.println("sayı giriniz olmalı; ");
        merkez=inp.nextInt();
    for(int i=1;i<=merkez;i++){
            for(int c=1;c<=(merkez-i);c++){
                System.out.print(" ");
            }
            for(int x=1;x<=(2*i)-1;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=merkez-1;i>=1;i--){
            for(int c=1;c<=(merkez-i);c++){
                System.out.print(" ");
            }
            for(int x=(2*i)-1;x>=1;x--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

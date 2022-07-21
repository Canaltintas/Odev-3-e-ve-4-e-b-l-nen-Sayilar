import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int num,i=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        num=input.nextInt();

       do {
           if (i %2==0){
               System.out.println(i);
           }
           i++;
       }while (i <= num);
    }
}

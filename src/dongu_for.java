import java.util.Scanner;
public class dongu_for {
    public static void main(String[] args) {
        int num,sum,count;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        num = input.nextInt();
        sum=0;
        count=0;
        for (int i =0 ; i <= num; i++){
            if ((i % 3==0) && (i%4==0)){
                sum +=i;
                count++;

            }

        }
       System.out.println("0'dan "+num+" Sayısına Kadar 3'e ve 4'e Sayıların Toplamının Ortalaması = "
                +(sum/count));
    }

}

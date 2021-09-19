import java.util.Scanner;
public class TugasD {
    public static void main(String[] args){
        Scanner angka = new Scanner(System.in);
        int a, b;
        a = angka.nextInt();
        b = angka.nextInt();
        System.out.println("masing-masing " + a / b);
        System.out.println("bersisa " + a % b);
    }
}

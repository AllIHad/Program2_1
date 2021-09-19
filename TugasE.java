import java.util.Scanner;
public class TugasE {
    public static void main(String[] args){
        Scanner bil = new Scanner(System.in);
        double x, y;
        x = bil.nextDouble();
        y = bil.nextDouble();
        double z;
        z = x * y / 2;
        System.out.printf("%.2f", z);
    }
}

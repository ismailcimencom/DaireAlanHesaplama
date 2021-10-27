import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        int r;
        double pi = 3.14;
        int a;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz: ");
        r = inp.nextInt();
        System.out.print("Alan acisini giriniz: ");
        a = inp.nextInt();
        double alan = (pi * (r * r) * a)/360;


        System.out.println("Dairenin alani : "+ alan);

    }
}

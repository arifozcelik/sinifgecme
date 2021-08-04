import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);
        System.out.println("matematik notu gir: ");
        mat = input.nextInt();
        System.out.println("fizik notu gir: ");
        fizik = input.nextInt();
        System.out.println("turkce notu gir: ");
        turkce = input.nextInt();
        System.out.println("kimya notu gir: ");
        kimya = input.nextInt();
        System.out.println("muzik notu gir: ");
        muzik = input.nextInt();

        double average = (mat+fizik+kimya+turkce+muzik)/5;
        if(average<=55)
            System.out.println("sınıfta kaldın");
        else
            System.out.println("tebrikler");




    }
}

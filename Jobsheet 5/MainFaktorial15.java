import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      System.out.print("Masukkan nilai: ");
      int nilai = input.nextInt();

      Faktorial15 fk = new Faktorial15();
      System.out.println("Nilai faktorial " + nilai + " menggunakan Brute Force: " + fk.faktorialBF(nilai));
      System.out.println("Nilai faktorial " + nilai + " menggunakan Divide Conquer: " + fk.faktorialDC(nilai));
    }
}

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
    Scanner sc15 = new Scanner(System.in);
    System.out.print("Masukkan kapasitas Queue: ");
    int n = sc15.nextInt();

    Queue Q = new Queue(n);
    int pilih;
    boolean running = true;

    while (running) {
        menu();
        System.out.print("Masukkan pilihan anda: ");
        pilih = sc15.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan data baru: ");
                int dataMasuk = sc15.nextInt();
                if (!Q.Enqueue(dataMasuk)) {
                    running = false; // Overflow 
                }
                break;
            case 2:
                int[] dataKeluar = new int[1];
                if (!Q.Dequeue(dataKeluar)) {
                    running = false; // Underflow 
                } else {
                    System.out.println("Data yang dikeluarkan: " + dataKeluar[0]);
                }
                break;
            case 3:
                Q.print();
                break;
            case 4:
                Q.peek();
                break;
            case 5:
                Q.clear();
                break;
            default:
                running = false;
                break;
            }
        }

        System.out.println("Program selesai.");
    }
    
    public static void menu() {
        System.out.println("Pilihan operasi yang bisa dilakukan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------------------------");
    }
}


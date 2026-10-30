import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
            String golongan = scanner.next();

            System.out.print("Masukkan Jam Lembur: ");
            int jamLembur = scanner.nextInt();

            int gajiGolongan;
            if (golongan.equalsIgnoreCase("A")) {
                gajiGolongan = 5000000;
            } else if (golongan.equalsIgnoreCase("B")) {
                gajiGolongan = 6500000;
            } else if (golongan.equalsIgnoreCase("C")) {
                gajiGolongan = 9500000;
            } else {
                System.out.println("Golongan tidak valid.");
                return;
            }

            int persenLembur = 0;
            if (jamLembur < 0) {
                System.out.println("Jam lembur tidak valid.");
                return;
            } else if (jamLembur == 1) {
                persenLembur = 30;
            } else if (jamLembur == 2) {
                persenLembur = 32;
            } else if (jamLembur == 3) {
                persenLembur = 34;
            } else if (jamLembur == 4) {
                persenLembur = 36;
            } else if (jamLembur >= 5) {
                persenLembur = 38;
            }

            int gajiLembur = (gajiGolongan * persenLembur) / 100;
            int jumlahPenghasilan = gajiGolongan + gajiLembur;

            System.out.println("Gaji Golongan: " + gajiGolongan);
            System.out.println("Gaji Lembur: " + gajiLembur);
            System.out.println("Jumlah Penghasilan: " + jumlahPenghasilan);
        }
    }
}
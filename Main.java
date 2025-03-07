import java.util.Scanner;

class Perusahaan {
    private static final String namaPerusahaan = "PT Inovasi Teknologi";

    public static String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

class Karyawan {
    private String nama;
    private double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        setNama(nama);
        setGajiPokok(gajiPokok);
    }

    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus memiliki minimal 4 karakter");
        }
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok > 0) {
            this.gajiPokok = gajiPokok;
        } else {
            throw new IllegalArgumentException("Gaji pokok harus lebih dari 0.");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void info() {
        System.out.println("Nama : " + getNama());
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Perusahaan : " + Perusahaan.getNamaPerusahaan());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nInput data karyawan pertama");
        System.out.print("Masukkan nama karyawan 1 : ");
        String nama1 = in.nextLine();
        System.out.print("Masukkan jumlah gaji pokok karyawan 1 : ");
        double gajiPokok1 = in.nextDouble();
        in.nextLine();
        Karyawan karyawan1 = new Karyawan(nama1, gajiPokok1);

        System.out.println("\nInput data karyawan kedua");
        System.out.print("Masukkan nama karyawan 2 : ");
        String nama2 = in.nextLine();
        System.out.print("Masukkan jumlah gaji pokok karyawan 2 : ");
        double gajiPokok2 = in.nextDouble();
        in.nextLine();
        Karyawan karyawan2 = new Karyawan(nama2, gajiPokok2);

        System.out.println("\nInformasi Karyawan Pertama : ");
        karyawan1.info();
        System.out.println("\nInformasi Karyawan Kedua : ");
        karyawan2.info();

        in.close();
    }
}

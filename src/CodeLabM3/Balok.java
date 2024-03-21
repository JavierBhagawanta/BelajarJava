package CodeLabM3;

import java.util.Scanner;

public class Balok extends BangunRuang{

    private double panjang;
    private double tinggi;
    private double lebar;

    @Override
    public void inputNilai(){
        super.inputNilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Masukkan Tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Masukkan Lebar: ");
        lebar = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil Volume: " + hasil);
    }
}

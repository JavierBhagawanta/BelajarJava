package CodeLabM3;

import java.util.Scanner;

public class Kubus extends BangunRuang{


    Scanner scanner = new Scanner(System.in);
    private double sisi, hasil;



    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Masukkan Sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan: " + hasil);
    }

    @Override
    public void volume(){
        hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil Volume: " + hasil);
    }
}

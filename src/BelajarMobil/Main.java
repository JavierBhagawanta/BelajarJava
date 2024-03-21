package BelajarMobil;

import jdk.internal.org.objectweb.asm.tree.ClassNode;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        System.out.println(mobil1.name);
        mobil1.speed = 25;
        mobil1.name = "Porsche";
        System.out.println("Nama Mobil 1 = " + mobil1.name);
        System.out.println("Kecepatan Mobil 1 = " +mobil1.speed);

        Mobil mobil2;
//        System.out.println("Nama mobil 2 = " + mobil2.name);
//        System.out.println("Kecepatan mobil 2 = " + mobil2.speed);

    }
}

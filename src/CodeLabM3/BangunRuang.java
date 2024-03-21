package CodeLabM3;

public class BangunRuang {
    private String name;


    public void inputNilai(){

        System.out.println("Masukkan Nilai");
    }

    public void luasPermukaan(){
        System.out.println("Menghitung Luas Permukaan Bangun" + getName());
    }

    public void volume(){

        System.out.println("Menghitung Volume Bangun" + getName());
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }
}


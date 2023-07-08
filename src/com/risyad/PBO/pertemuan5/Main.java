package com.risyad.PBO.pertemuan5;

public class Main {
    public static void main(String[] args){
        Barang[] keranjang = new Barang[10];
        Barang[] etalase = {
                new Barang("indomie", 3000),
                new Barang("pulpen", 3000),
                new Barang("pensil", 3000),
                new Barang("spidol", 3000),
                new Barang("penghapus", 3000)
        };

        System.out.println("jumlah barang yang ada di etalase : "+etalase.length);
        System.out.println("daftar barang yang ada di dalam etalase : ");
        int i = 1;
        for (Barang b : etalase) {
            System.out.println("Barang ke-" + i);
            b.showInfo();
            i++;
        }
        for (int j=0; j<etalase.length; j++){
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showInfo();
        }
    }
}

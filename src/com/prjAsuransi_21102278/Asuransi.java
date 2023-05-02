package com.prjAsuransi_21102278;
class Asuransi_2278{
    private String noPolis_2278;
    private int biaya_2278;
    public Asuransi_2278() {
        this.noPolis_2278 = "A1035";
        this.biaya_2278 = 250;
    }
    public Asuransi_2278(String noPolis_2278, int biaya_2278) {
        this.noPolis_2278 = noPolis_2278;
        this.biaya_2278 = biaya_2278;
    }
    public String getNoPolis_2278() {
        return noPolis_2278;
    }
    public void setNoPolis_2278(String noPolis_2278) {
        this.noPolis_2278 = noPolis_2278;
    }
    public int getBiaya_2278() {
        return biaya_2278;
    }
    public void setBiaya_2278(int biaya_2278) {
        this.biaya_2278 = biaya_2278;
    }
    public static void main(String[] args) {
        Asuransi_2278 N = new Asuransi_2278();
        Asuransi_2278 N1 = new Asuransi_2278("A1036", 400);
        Asuransi_2278 N2 = new Asuransi_2278("A1037", 700);

        System.out.println("No Polis = " + N.getNoPolis_2278());
        System.out.println("Biaya = " + N.getBiaya_2278());
        System.out.println("No Polis = " + N1.getNoPolis_2278());
        System.out.println("Biaya = " + N1.getBiaya_2278());
        System.out.println("No Polis = " + N2.getNoPolis_2278());
        System.out.println("Biaya = " + N2.getBiaya_2278());
    }
}

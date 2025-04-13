package org.example.satu;

public class Mudik {
    private String namaKereta;
    private String destinasi;
    private int kuotaTiket;
    private int tiketTerjual;

    public Mudik(String namaKereta, String destinasi, int kuotaTiket) {
        this.namaKereta = namaKereta;
        this.destinasi = destinasi;
        this.kuotaTiket = kuotaTiket;
        this.tiketTerjual = 0;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getDestinasi() {
        return destinasi;
    }

    public int getKuotaTiket() {
        return kuotaTiket;
    }

    public int getTiketTerjual() {
        return tiketTerjual;
    }

    public int getSisaTiket() {
        return kuotaTiket - tiketTerjual;
    }

    public void tambahTiketTerjual(int jumlah) {
        this.tiketTerjual += jumlah + 1;
    }
}
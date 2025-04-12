package org.example.dua;

public class Bakery {
    private String namaPemesan;
    private String namaKue;
    private int jumlahToples;
    private int hargaPerToples;
    private boolean delivery;

    public Bakery(String namaPemesan, String namaKue, int jumlahToples, int hargaPerToples, boolean delivery) {
        this.namaPemesan = namaPemesan;
        this.namaKue = namaKue;
        this.jumlahToples = jumlahToples;
        this.hargaPerToples = hargaPerToples;
        this.delivery = delivery;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public int getJumlahToples() {
        return jumlahToples;
    }

    public int getHargaPerToples() {
        return hargaPerToples;
    }

    public boolean isDelivery() {
        return delivery;
    }
}

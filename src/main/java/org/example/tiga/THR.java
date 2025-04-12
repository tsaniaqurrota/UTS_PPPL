package org.example.tiga;

public class THR {
    private String namaKaryawan;
    private int gajiPokok;
    private double masaKerjaTahun;
    private String statusKaryawan;

    public THR(String nama, int gajiPokok, int masaKerjaTahun,String statusKaryawan) {
        this.namaKaryawan = nama;
        this.gajiPokok = gajiPokok;
        this.masaKerjaTahun = masaKerjaTahun;
        this.statusKaryawan = statusKaryawan;
    }

    public String getNama() {
        return namaKaryawan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public double getMasaKerjaTahun() {
        return masaKerjaTahun;
    }

    public String getStatusKaryawan() {
        return statusKaryawan;
    }

    public int hitungTHR() {
        if (statusKaryawan.equalsIgnoreCase("tetap")) {
            if (masaKerjaTahun >= 1) {
                return gajiPokok;
            } else {
                return (int) (masaKerjaTahun * gajiPokok);
            }
        } else if (statusKaryawan.equalsIgnoreCase("kontrak")) {
            return gajiPokok / 2;
        } else if (statusKaryawan.equalsIgnoreCase("magang")) {
            return 0;
        } else {
            throw new IllegalArgumentException("Status karyawan tidak valid");
        }
    }




}

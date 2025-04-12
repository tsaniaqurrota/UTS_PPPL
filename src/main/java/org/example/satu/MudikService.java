package org.example.satu;

import java.util.*;

public class MudikService {

    public List<Mudik> getAllPerjalanan() {
        return new ArrayList<>();
    }

    public void simpanPerjalanan(List<Mudik> daftarPerjalanan) {
    }

    public boolean cekKuota(Mudik mudik, int jumlahTiket) {
        return mudik.getSisaTiket() >= jumlahTiket;
    }

    public int hitungBiaya(int jarak, String kelas) {
        int tarif;
        if (kelas.equalsIgnoreCase("ekonomi")) {
            tarif = 500;
        } else if (kelas.equalsIgnoreCase("bisnis")) {
            tarif = 1000;
        } else {
            throw new IllegalArgumentException("Kelas tidak tersedia");
        }
        return tarif * jarak;
    }
}


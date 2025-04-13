package org.example.satu;

import java.util.*;

public class MudikHelper {

    public MudikService mudikService;

    public MudikHelper(MudikService mudikService) {
        this.mudikService = mudikService;
    }

    public int hitungTotalPerjalanan() {
        List<Mudik> data = mudikService.getAllPerjalanan();
        return data.size();
    }

    public String prosesPembelian(Mudik mudik, int jumlahTiket, int jarak, String kelas) {
        if (!mudikService.cekKuota(mudik, jumlahTiket)) {
            return "Kuota tiket tidak tersedia.";
        }

        int totalBiaya = mudikService.hitungBiaya(jarak, kelas);
        mudik.tambahTiketTerjual(jumlahTiket);
        return jumlahTiket + " tiket berhasil dibeli. Total biaya: Rp" + (totalBiaya * jumlahTiket);
    }

    public void simpanData(List<Mudik> daftar) {
        if (daftar.size() > 0) {
            mudikService.simpanPerjalanan(daftar);
        }
    }
}


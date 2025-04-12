package org.example.dua;

import java.util.*;

public class BakeryService {

    public List<Bakery> getDaftarPesanan() {
        return new ArrayList<>();
    }

    public void simpanPesanan(List<Bakery> daftarPesanan) {
    }

    public int hitungTotalHarga(Bakery pesanan) {
        return pesanan.getJumlahToples() * pesanan.getHargaPerToples();
    }

    public int hitungDiskonDanOngkir(Bakery pesanan, int totalHarga) {
        if (!pesanan.isDelivery()) {
            return totalHarga;
        }

        if (totalHarga > 500000) {
            double diskon = totalHarga * 0.10;
            return (int) (totalHarga - diskon);
        } else if (totalHarga > 300000) {
            return totalHarga;
        } else {
            return totalHarga + 15000;
        }
    }
}

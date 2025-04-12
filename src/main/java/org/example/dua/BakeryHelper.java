package org.example.dua;

import java.util.List;

public class BakeryHelper {

    public BakeryService bakeryService;

    public BakeryHelper(BakeryService bakeryService) {
        this.bakeryService = bakeryService;
    }

    public int hitungJumlahPesanan() {
        List<Bakery> daftarPesanan = bakeryService.getDaftarPesanan();
        return daftarPesanan.size();
    }

    public String prosesPesanan(Bakery pesanan) {
        int totalHarga = bakeryService.hitungTotalHarga(pesanan);
        int totalBayar = bakeryService.hitungDiskonDanOngkir(pesanan, totalHarga);

        return String.format(
                "Pesanan atas nama %s untuk kue %s berhasil diproses.\nTotal Harga: Rp%d\nTotal Bayar: Rp%d",
                pesanan.getNamaPemesan(),
                pesanan.getNamaKue(),
                totalHarga,
                totalBayar
        );
    }

    public void simpanPesanan(List<Bakery> daftarPesanan) {
        if (!daftarPesanan.isEmpty()) {
            bakeryService.simpanPesanan(daftarPesanan);
        }
    }
}

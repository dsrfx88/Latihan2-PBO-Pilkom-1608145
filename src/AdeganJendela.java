public class AdeganJendela extends Adegan {

    boolean isJendelaTerkunci = true;
    String narasiJendelaTerkunci = "Rudi mendekati jendela. Rudi mencoba membuka jendela. \"Ah terkunci\"";
    String narasiJendelaTerbuka  = "Rudi mencoba membuka jendela dan terbuka!";

    //constructor
    public AdeganJendela () {
        narasi = narasiJendelaTerkunci;
    }

    /* user berhasil menggunakan kunci untuk membuka pintu */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        isJendelaTerkunci = false;
        narasi = narasiJendelaTerbuka;

        /*
        //karena kunci sudah terbuka ada pilihan baru keluar dari kamar
        Adegan  adeganKeluarJendela = new Adegan();
        adeganKeluarJendela.narasi = "Rudi pelan-pelan membuka jendela dan keluar dari kamar. Tiba-tiba ada sesosok zombie yang menyerang Rudi ";
        Pilihan pilihanSerang = new PilihanGantiAdegan(adeganKeluarJendela,"Serang dengan senjata, yang ada di kantong");
        tambahPilihan(pilihanSerang);
        */
    }

}

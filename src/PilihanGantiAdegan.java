/*
    Pilihan yang aksinya adalah ganti adegan
 */
public class PilihanGantiAdegan extends Pilihan{
    Adegan adeganTujuan;

    public PilihanGantiAdegan(Adegan vadeganTujuan, String narasi) {
        super(narasi);
        this.adeganTujuan = vadeganTujuan;
    }


    @Override
    public void aksi() {
        //aksinya adalah mengganti adeganAktif milik player ke adegan baru
        adeganTujuan.oPlayer.adeganAktif = adeganTujuan;

        Adegan.oPlayer.kesehatan = Adegan.oPlayer.kesehatan - 15;

        Adegan.oPlayer.cekKesehatan();
    }
}

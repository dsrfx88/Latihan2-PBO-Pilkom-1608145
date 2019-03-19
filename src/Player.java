/*
    Menyimpan informasi tentang player seperti
    - barang yang dibawa
    - kesehatan

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    int kesehatan = 100;
    boolean isSelesai = false;
    Adegan adeganAktif; //adegan tempat player berada

    /* barang yang dimiliki player*/
    //Barang[] arrBarang = new Barang[10];
    //int jumBarang  = 0;

    ArrayList<Barang> arrBarang = new ArrayList<>();


    //jika dipanggil akan lengkapi dengan nim, nama dan tulisan saya berjanji tdk akan dst..
    public void printIdentitas() {
        System.out.println("Faradissa Nurul Faidah 1608145");
        System.out.println("Saya berjanji tidak berlaku curang dan/atau membantu orang lain berbuat curang");
    }


    public void tambahBarang(Barang oBarang) {
        arrBarang.add(oBarang);
    }

    /*
        cetak isi barang yang dimiliki player
        return adalah objek barang yang dipilih user untuk digunakan
        jika user tidak jadi memilih maka akan return null
        hati-hati dapat menyebabkan NullPointer exception jadi selalu cek return
     */

    public Barang pilihBarang() {
        System.out.println("Barang yang berada di dalam kantong");
        int i=0;
        if(arrBarang.size() > 0){
            for (Barang data:arrBarang){
                System.out.println(String.format("%d. %s",i+1,data.deskripsi));
                i++;
            }
        }

        //for (int i=0;i<jumBarang;i++) {
          //  System.out.println(String.format("%d. %s",i+1,arrBarang[i].deskripsi));
        //}
        System.out.println(String.format("99. %s","Hanya lihat, tidak menggunakan barang"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan anda?");
        int pilihan = sc.nextInt();
        if (pilihan!=99) {
            return (arrBarang.get(pilihan - 1));
        }else {
            return null;
        }
    }

    public void cekKesehatan(){
        if(Adegan.oPlayer.kesehatan > 0){
            System.out.println("Kesehatan saat ini: " +Adegan.oPlayer.kesehatan);
        }else if(Adegan.oPlayer.kesehatan<=0){
            Adegan.oPlayer.isSelesai = true;
        }
    }

    public static void main(String[] args) {
        //untuk test
        Barang permen = new Barang("p_kopiko","Permen Kopiko");
        Barang bolpen = new Barang("bolpen","Bolpen");

        Player p = new Player();
        p.tambahBarang(permen);
        p.tambahBarang(bolpen);
        Barang barangPilih = p.pilihBarang(); //
        if (barangPilih!=null) {
            System.out.println(barangPilih.deskripsi);
        }
    }
}

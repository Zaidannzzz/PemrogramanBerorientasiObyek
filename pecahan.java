public class pecahan {

    int pembilang, penyebut;

    public int getPembilang() {
        return pembilang;
    }

    public int getPenyebut() {
        return penyebut;
    }

    pecahan(int pembilang, int penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public pecahan tambah(pecahan hasil){  
        pecahan dua;
        dua = hasil;
        
        if(hasil.penyebut == dua.penyebut){
            hasil.pembilang = hasil.pembilang + dua.pembilang;
            hasil.penyebut = hasil.penyebut;
        } else {
            hasil.pembilang =(dua.penyebut * hasil.pembilang ) + (hasil.penyebut * dua.pembilang);
            hasil.penyebut = hasil.penyebut * dua.penyebut;
        }
         return hasil;
    }

    public static void main(String[] args) throws Exception {
        pecahan satu = new pecahan (3,2);
        pecahan dua = new pecahan (5,6);
        System.out.println("objek 1 = "  + satu.getPembilang() + "/" + satu.getPenyebut());
        System.out.println("objek 2 = " + dua.getPembilang() + "/" + dua.getPenyebut());
        System.out.println("\n");
        pecahan hasil;
        hasil = satu.tambah(satu);
        System.out.println("Hasil= " + hasil.pembilang + "/" + hasil.penyebut);
    }
}

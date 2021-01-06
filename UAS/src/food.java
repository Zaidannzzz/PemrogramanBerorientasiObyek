public class food {
    public String makanan;
    public int harga, total, ongkir=1000;

    food(String makanan, int harga){
        this.makanan = makanan;
        this.harga = harga;
        total = harga + ongkir;
    }

    void tampilfood(){
        System.out.println("============================================================");
        System.out.println("Kamu mau ngirim " + makanan);
        System.out.println("Total sama ongkir jadi Rp " + total + " nih");
    }
}

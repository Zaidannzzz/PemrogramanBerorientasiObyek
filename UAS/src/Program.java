import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
        int angka, jarak, harga;
        String surat, makanan;

        System.out.println("                        Wheel2U");
        System.out.println("Your Ordinary Package delivered with Ordinary Bike Messenger");
        System.out.println("============================================================");
        System.out.println("1. Letter2U");
        System.out.println("2. Food2U");
        System.out.println("============================================================");
        Scanner pilih = new Scanner(System.in);
        try{
            System.out.println("Mau ngirim apa? (1/2) ");
            angka = pilih.nextInt();
            System.out.println("============================================================");
            if (angka <= 2) {
                switch (angka) {
                    case 1:
                        System.out.println("                        Letter2U");
                        System.out.println("surat apa nih yang mau kamu kirim?");
                        surat = pilih.next();
                        System.out.println("seberapa jauh yang mau kamu kirim?(km)");
                        jarak = pilih.nextInt();
                        letter persuratan = new letter(surat, jarak);
                        System.out.println("");
                        System.out.println("                        Pembayaran");
                        persuratan.tampilsurat();
                        break;
                    case 2:
                        System.out.println("                        Food2U");
                        System.out.println("mau ngirim makanan apa nih?");
                        makanan = pilih.next();
                        System.out.println("harganya berapa? ()");
                        harga = pilih.nextInt();
                        food makan = new food(makanan, harga);
                        makan.tampilfood();
                        break;
                        default:
                }
            } else {
                System.out.println("yah pilihannya cuma 1 atau 2");
                return;
            }
        } finally{
            pilih.close();
        }
    }
}

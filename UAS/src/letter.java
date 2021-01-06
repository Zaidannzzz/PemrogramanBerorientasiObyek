public class letter {
    public String surat;
    public int jarak, total, ongkir=1000;

    letter(String surat, int jarak){
        this.surat = surat;
        this.jarak = jarak;
        total = jarak * ongkir;
    }

    void tampilsurat(){
        System.out.println("============================================================");
        System.out.println("Kamu mau ngirim " + surat);
        System.out.println("Jaraknya " + jarak + " km");
        System.out.println("Total sama ongkir jadi Rp " + total + " nih");
    }
}

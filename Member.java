public class Member {

    protected String nama;
    protected int umur;

    Member(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    void display(){
        System.out.println("\nNama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

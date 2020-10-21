import java.util.Scanner;

public class conan {
    
    private String judul, nama;
    private int tahun, harga;
    private double jual;
    	
    	//Constructor
        conan(String judul, String nama, int tahun, int harga) {
            this.judul = judul;
            this.nama = nama;
            this.tahun = tahun;
            this.harga = harga;
            this.jual = jual;
        }

        public void display() {
            System.out.println("Judul Buku    = " + this.judul);
            System.out.println("Nama Penerbit = " + this.nama);
            System.out.println("Tahun Terbit  = " + this.tahun);
            System.out.println("Harga Beli    = " + this.harga);
            jual = harga - (0.2 * harga);
            System.out.println("Harga Jual    = " + this.jual);
        }

 

    public static void main(String[] args) throws Exception {
        String j;
        String n;
        int t;
        int h;
        

        Scanner userinput = new Scanner(System.in);
        System.out.println("Silahkan Input");
        System.out.print("Judul Buku    = ");
        j = userinput.next();
        System.out.print("Nama Penerbit = ");
        n = userinput.next();
        Scanner userinput2 = new Scanner(System.in);
        System.out.print("Tahun Terbit  = ");
        t = userinput2.nextInt();
        System.out.print("Harga         = ");
        h = userinput2.nextInt();
        System.out.println("");
        conan buku = new conan(j, n, t, h);
        buku.display();

        System.exit(0);
    }
}
import java.util.Scanner;

public class conan {
    
    private String judul, nama;
    private int data, tahun, harga;
    private double jual;
    	
    	//Constructor
        conan(int data, String judul, String nama, int tahun, int harga) {
            this.data = data;
            this.judul = judul;
            this.nama = nama;
            this.tahun = tahun;
            this.harga = harga;
            this.jual = jual;
        }

        public void display() {
            System.out.println("Data Buku Ke  = " + this.data);
            System.out.println("Judul Buku    = " + this.judul);
            System.out.println("Nama Penerbit = " + this.nama);
            System.out.println("Tahun Terbit  = " + this.tahun);
            System.out.println("Harga Beli    = " + this.harga);
            jual = harga - (0.2 * harga);
            System.out.println("Harga Jual    = " + this.jual);
            System.out.println("");
        }

 

    public static void main(String[] args) throws Exception {
        String j, n;
        int d, t, h, q, o = 0;

        conan[] buku = new conan[3];
        System.out.println("Silahkan Input");
        while(o < 3){
            Scanner userinput = new Scanner(System.in);
            d = o + 1;
            System.out.println("Data Buku Ke  = " + d);
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
            buku[o] = new conan(d, j, n, t, h);
            o++;
        }
        System.out.println("===============");
        System.out.println("=  Data Buku  =");
        System.out.println("===============");
        for(int z = 0; z < 3; z++) {
			buku[z].display();
		}
        System.exit(0);
    }
}

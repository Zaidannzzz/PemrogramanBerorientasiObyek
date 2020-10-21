import java.util.Scanner;

public class deret {
    
    public static void main(String[] args) throws Exception {
        int masuk;
        int selisih;
        int jumlah;
        int a;
        
        System.out.print("Masukan Bilangan Awal : ");
        Scanner userinput = new Scanner(System.in);
        masuk = userinput.nextInt();
        System.out.print("Masukan selisih Bilangan : ");
        selisih = userinput.nextInt();
        System.out.print("Masukan jumlah Bilangan : ");
        jumlah = userinput.nextInt();

        for (a = masuk; a <= jumlah; a++) {
            if(a % selisih == 0){
            System.out.print(a + " ");
            }
        }
    }
}
abstract class permainan{

    String namaPemain;
    int levelPemain;

    public void setnamaPemain (String namaPemain){
        this.namaPemain = namaPemain;
    }

    public String getnama (){
        return this.namaPemain;
    }

    public void setlevelpemain (int level){
       this.levelPemain = level;
    }

    public int getlevel (){
        return this.levelPemain;
    }

    public void jalankan(){
        System.out.println("Nama Player     : " + getnama());
        if (this.levelPemain <=20){
            System.out.println("Level Player    : Normal" );
        }
        else if(this.levelPemain <=80){
            System.out.println("Level Player    : Medium");
            }
            else if(this.levelPemain<=100){
                System.out.println("level Player    : hard");
                }
                else {
                    System.out.println("Level Maksimum = 100");
                }
    }

    public abstract int hitungskor(int hit, int miss);

}

class permainanArcade extends permainan{

    public int hitungskor(int hit, int miss){
        return hit * 3 - miss * 1;

    }
}

class permainanStrategy extends permainan{

    public int hitungskor(int hit, int miss){
        return hit * 5;

    }
}



class app {
    public static void main(String[] args) {

        System.out.println("Mode Arcade");
        permainan pemain1 = new permainanArcade();
        pemain1.setnamaPemain("Bima");
        pemain1.setlevelpemain(60);
        pemain1.jalankan();
        System.out.println("Hit Pemain      : " + pemain1.hitungskor(321, 321));
        
        System.out.println("");
        
        System.out.println("Mode Strategy");
        permainan pemain2 = new permainanStrategy();
        pemain2.setnamaPemain("Daffa");
        pemain2.setlevelpemain(25);
        pemain2.jalankan();
        System.out.println("Hit Pemain      : " + pemain2.hitungskor(321, 321));
    }
}
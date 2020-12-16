class DoraMini implements Robot,Doraemon
{
    String nama;
    String pemilik;
    int tahun;

    public void getPemilik(String pemilik){
        this.pemilik = pemilik;
    }

    @Override
    public void setNama(String nama)
    {
        
        System.out.println("nama "+nama);
    }
    

    @Override
    public void setTahun(int tahun)
    {
        
        System.out.println("tahun "+tahun);
    }

     @Override
    public void displayData()
    {
        
        System.out.println("a");
    }

    
    @Override
    
    public void sayDora()
    {
        
        System.out.println("Hallo, saya Dora Mini");
    }


    @Override
    
    public void displayKantongAjaib()
    {
        
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }

    @Override
    public void setPemilik(String pemilik) {
        System.out.println("Nama Pemilik : " + pemilik);
    }
    
    public static void main(String args[]){
        DoraMini r = new DoraMini();
        r.setNama("ujang");

        r.setPemilik("sugoi");

        r.setTahun(2001);

        r.sayDora();
        
        r.displayKantongAjaib();
        
        r.displayData();
    }
}
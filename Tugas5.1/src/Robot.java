public abstract class Robot {
  protected String nama;
  protected String pemilik;
  protected int tahun;

  public void setTahunPembuatan(int tahun) {
    this.tahun = tahun;
  }

  public void setPemilik(String pemilik){
    this.pemilik = pemilik;
  }

  public abstract void setNama(String nama);
  public abstract void displayData();
}
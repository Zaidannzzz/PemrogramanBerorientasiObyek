public class Trainee  extends Member {

    private int lamaTraining;

    Trainee(String nama, int umur, int lamaTraining) {
        super(nama, umur);
        this.lamaTraining = lamaTraining;
          
    }

    public int getLamaTraining() {
        return lamaTraining;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Lama Training = " + lamaTraining + " hari");
    }
}

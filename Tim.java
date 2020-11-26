import java.util.ArrayList;

public class Tim {

    private String nama;
    private ArrayList<Member> member;

    Tim(String nama){
        this.nama = nama;
        member = new ArrayList<>();
    }

    void addMember(Member m){
        member.add(m);
    }

    void displayFullMember(){
        System.out.println("\n\n~~~~~TIM : " + nama + "~~~~~");
        for(Member m : member){
            m.display();
        }
    }

    void displayTrainee(){
        System.out.println("\n~~~~~Member Yang Akan Di Training~~~~~~");
        for(Member m : member) {
            if(m instanceof Trainee) {
                Trainee trainee = (Trainee) m;
                trainee.display();
            }
        }
    }

    public String getNama() {
        return nama;
    }
}

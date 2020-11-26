public class Main {
        public static void main(String[] args) {
            //Deklarasi Tim
            Tim Mamang = new Tim("Mamang Resing");
            
            //Deklarasi Member
            Member objek1 = new Member("Zaidan", 20);
            Member objek2 = new Member("Bima", 23);
            Member objek3 = new Member("Daffa", 22);
            
            //Deklarasi trainee
            Member objek4 = new Trainee("Deva", 26, 8);
            Member objek5 = new Trainee("Naufal", 21, 10);
            
            //Menambahkan data pada ArrayList
            Mamang.addMember(objek1);
            Mamang.addMember(objek2);
            Mamang.addMember(objek3);
            Mamang.addMember(objek4);
            Mamang.addMember(objek5);
            
            //Output
            Mamang.displayFullMember();
            Mamang.displayTrainee();
        }
}

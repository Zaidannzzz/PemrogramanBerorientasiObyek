public class Game {
    
    private String name;
    private int lifePoint, attackHitPoint, attackKickPoint;

        void hit(Game opponent){
            System.out.println("\n" + this.name + " hit " + opponent.name);
            opponent.lifePoint -= attackHitPoint;
        }

        void kick(Game opponent){            
            System.out.println("\n" + this.name + " kick " + opponent.name);
            opponent.lifePoint -= attackKickPoint;
        }

        Game( String name, int attackHitPoint, int attackKickPoint){
            this.name = name;
            this.attackHitPoint = attackHitPoint;
            this.attackKickPoint = attackKickPoint;
            this.lifePoint = 100;
        }
   
        int getLifePoint(){
            return lifePoint;
        }

        String getName(){
            return name;
        }

    public static void main(String[] args) throws Exception {
        Game player1 = new Game("Raiden", 10, 20);
        Game player2 = new Game("Sub-Zero", 5, 25);
        System.out.println("Player 1\n" + player1.name +"\nHit Power = "+ player1.attackHitPoint +"\nKick Power = "+ player1.attackKickPoint +"\nHealth = "+ player1.getLifePoint() + "\n");
        System.out.println("Player 2\n" + player2.name +"\nHit Power = "+ player2.attackHitPoint +"\nKick Power = "+ player2.attackKickPoint +"\nHealth = "+ player2.getLifePoint() + "\n");
        System.out.println("READY");
        System.out.println("FIGHT!!");
        player1.kick(player2);
        player2.kick(player1);
        for (int i=1; i<=3; i++){
            player2.hit(player1);
        }
        for (int j=1; j<=4; j++){
            player1.kick(player2);
        }
        System.out.println("\n=====================");
        System.out.println(player1.name + " Health = " + player1.getLifePoint() + " Hp");
        System.out.println(player2.name + " Health = " + player2.getLifePoint() + " Hp");
    }
}

public class Main {
    public static void main(String[] args) {

        Friend myFriend = new Friend("player1");
        Friend myEnemy = new Friend("player2", false);

        myFriend.SetHP(500);
        myEnemy.SetHP(500);

        new Window(myFriend,myEnemy);

    }
}
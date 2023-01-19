package Java24;


public class FootballTester{
    public static void main(String[] args){
    Quarterback player1 = new Quarterback();
    WideReceiver player2 = new WideReceiver();
    Lineman player3 = new Lineman();
    Blocker player4 = new Blocker();
    BallCarrier player5 = new BallCarrier();
    TightEnd player6 = new TightEnd();
    
    player1.number = 1;
    player2.number = 2;
    player3.number = 3;
    player4.number = 4;
    player5.number = 5;
    player6.number = 6;
    
    player1.pass(player6);
    player2.catchBall();
    player3.block(player2);
    player4.block(player3);
    player5.catchBall();
    
    
    
    }

}

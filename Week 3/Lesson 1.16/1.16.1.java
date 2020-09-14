public class FetchKarel extends SuperKarel
{
    public void run()
    {
        getBall();
        comeDown();
        putBall();
    }
    //Moves to the location of the ball and picks it up
    public void getBall()
    {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        takeBall();
    }
    //Moves back to the starting position after picking up ball
    public void comeDown()
    {
        turnAround();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    
}
public class MarioKarel extends Karel
{
    public void run()
    {
        move();
        turnLeft();
        moveThree();
        collectCoins();
        turnAround();
        move();
        turnLeft();
        moveTwice();
        turnLeft();
        move();
        collectCoins();
        turnAround();
        move();
        turnLeft();
        moveTwice();
        turnLeft();
        move();
        collectCoins();
        turnAround();
        move();
        turnLeft();
        moveTwice();
        turnLeft();
        move();
        collectCoins();
        turnAround();
        moveThree();
        turnLeft();
        
    }
    
    private void collectCoins()
    {
        takeBall();
        takeBall();
    }
    
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    private void moveThree()
    {
        move();
        move();
        move();
    }
    private void moveTwice()
    {
        move();
        move();
    }
    
    private void turnAround()
    {
        turnLeft();
        turnLeft();
    }


}
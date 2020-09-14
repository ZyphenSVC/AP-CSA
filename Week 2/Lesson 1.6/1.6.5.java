public class KarelProgram extends Karel
{
    public void run()
    {
        moveThree();
        turnLeft();
        moveThree();
        turnRight();
        makeFlower();
        moveThree();
        makeFlower();
        turnRight();
        moveThree();
        turnLeft();
        putInPosition();
        putInPosition();
        putInPosition();
        putInPosition();
        putInPosition();
        putInPosition();
        putInPosition();
        
    }
    
    private void makeFlower()
    {
        move();
        putBall();
        turnLeft();
        move();
        putBall();
        turnLeft();
        move();
        putBall();
        turnLeft();
        move();
        putBall();
        turnLeft();
        move();
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
    
    private void putInPosition()
    {
        
    }
    private void moveTwice()
    {
        move();
        move();
    }
    
}
public class SlideKarel extends Karel
{
    public void run()
    {
        putBall();
        move();
        turnRight();
        move();
        putBall();
        move();
        turnLeft();
        move();
        putBall();
    }
    
    private void turnRight() 
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
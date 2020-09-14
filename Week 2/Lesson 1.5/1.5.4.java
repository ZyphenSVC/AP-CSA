public class KarelProgram extends Karel
{
    public void run()
    {
        putInPosition();
        makeBush();
        putInPosition();
        makeBush();
        move();
    }
    
    private void makeBush()
    {
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
    
    private void putInPosition()
    {
        move();
        move();
        move();
        move();
    }
}
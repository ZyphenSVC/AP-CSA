public class FiremanKarel extends Karel
{
    public void run()
    {
        turnRight();
        move();
        move();
        move();
        turnLeft();
    }
    
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
public class SquareKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i < 4; i++)
        {
            putBall();
            move();
            turnLeft();
        }
    }
}
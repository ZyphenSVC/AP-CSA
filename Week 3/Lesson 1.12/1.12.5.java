public class KarelProgram extends Karel
{
    public void run()
    {
        while(frontIsClear())
        {
            if(ballsPresent())
            {
                takeBall();
                move();
            }
            else
            {
                putBall();
                move();
            }
        }
        
        if(ballsPresent())
        {
            takeBall();
        }
        else 
        {
            putBall();
        }
    }
}
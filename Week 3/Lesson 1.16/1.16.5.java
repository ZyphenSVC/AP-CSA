public class DoubleTennisBallsKarel extends SuperKarel
{
    public void run()
    {
        int balls = 0;
        move();
        /**
         * Checks to see if a ball is present on location
         * Takes the ball and adds the count by one
         */
        while(ballsPresent())
        {
            takeBall();
            balls = balls + 1;
        }
        //For how ever many balls there were, it will multiply by two and create the loop
        for(int i = 0; i <= balls * 2 - 1; i++)
        {
            putBall();
        }
        
        turnAround();
        move();
        turnAround();
        
    }
    
    public void emptyMethod()
    {
        System.out.println("Hello")
    }
    public void secondMethod()
    {
        System.out.println("How are you doing today?")
    }
}
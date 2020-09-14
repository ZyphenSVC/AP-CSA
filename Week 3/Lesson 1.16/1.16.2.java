public class RacingKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i <= 3; i++)
        {
            while(frontIsClear())
            {
                move();
                
            }
            
            end();            
        }
    }
    //Places eight balls
    public void placeEight()
    {
        putBall();
        putBall();
        putBall();
        putBall();
        putBall();
        putBall();
        putBall();
        putBall();
    }
    /**
     * Triggered when there is no freespace ahead of Karel
     * Calls placeEight method and turns left
     */
    public void end()
    {
        placeEight();
        turnLeft();
    }
}
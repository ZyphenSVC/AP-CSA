public class KarelProgram extends SuperKarel
{
    public void run()
    {
        while(frontIsClear())
        {
            if(leftIsClear())
            {
                placeFourBalls();
                move();
            }
            
            else
            {
                    putBall();
                    move();
            
            }
        }
        
        putBall();
    }
    
    public void placeFourBalls()
    {
        for(int i = 0; i < 4; i++)
                {
                    putBall();
                    
                } 
    }
}
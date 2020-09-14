public class KarelProgram extends Karel
{
    public void run()
    {
        while(frontIsClear())
        {
            int ball = 0;
            
            if(rightIsClear())
            {
                if(leftIsClear())
                {
                    placeSevenBalls();
                    ball = 7;
                }
            }
            else if(leftIsClear())
            {
                if(ball != 7)
                {
                    putBall();
                    putBall();
                    ball = 2;
                }
            }
            if(rightIsClear())
            {
                if(ball != 7)
                {
                    putBall();
                    putBall();
                    ball = 2;
                }
            }
            if (rightIsBlocked())
            {
                if(leftIsBlocked())
                {
                    putBall();
                }
            }
            
            
            move();
        }
        
        putBall();
    }
    
    public void placeSevenBalls()
    {
        for(int i = 0; i <7; i ++)
            {
                putBall();
            }
    }
}
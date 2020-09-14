public class MidpointKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            if (frontIsClear())
            {
                move();
            }
            else
            {
                turnAround();
                for (int j = i/2; j > 0; j--)
                {
                    move();
                }
                turnAround();
                break;
            }
            
        }
        putBall();
        // int x = 0;
        
        // while(frontIsClear())
        // {
        //     move();
        //     x = x + 1;
        // }
        
        // int mid = x/2;
        // turnAround();
        // for(int i = 0; i < mid; i++)
        // {
        //     move();
        // }
        // putBall();
        // turnAround();
    }
}
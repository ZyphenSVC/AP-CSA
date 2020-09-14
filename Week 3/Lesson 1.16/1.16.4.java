public class SuperCleanupKarel extends SuperKarel
{
    public void run()
    {
        int x = 1;
        int y = 0;
        
        //Calculates Width
        while(frontIsClear())
        {
            move();
            x = x + 1;
        }
        turnLeft();
        //Calculates Height
        while(frontIsClear())
        {
            move();
            y = y + 1;
        }
        turnLeft();
        //Returns to starting position
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
        
        //Loops for how many times the height is
        for(int i = 0; i < y; i++)
        {
            //Loops for how many times the width is, picking up balls in each loop
            for(int o = 0; o < x; o++)
            {
                if(ballsPresent())
                {
                    takeBall();
                }
                
                if(frontIsClear())
                {
                    move();
                }
            }
            turn();
        }
        //Loops for how many times the width is, picking up balls in each loop
        for(int o = 0; o < x; o++)
        {
            if(ballsPresent())
            {
                takeBall();
            }
            
            if(frontIsClear())
            {
                move();
            }
        }
        turnLeft();
    }
    //Checks the direction being faced then turns accordingly
    public void turn()
    {
        if(facingEast())
        {
            turnLeft();
            move();
            turnLeft(); 
        }
        else if(facingWest())
        {
            turnRight();
            move();
            turnRight(); 
        }
    }
}
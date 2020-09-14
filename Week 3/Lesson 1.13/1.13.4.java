public class RandomHurdles extends SuperKarel
{
    public void run()
    {
        while(leftIsClear())
        {
            
            turnLeft();
            move();
            turnRight();
            
            if(frontIsBlocked())
            
            {
                moveStart();
                break;
            } 
            
            else 
            {
                moveStart();
                jumpHurdle();
            }
        }
    }
    
    private void jumpHurdle()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
    
    public void moveStart()
    {
        turnAround();
        turnLeft();
        move();
        turnLeft();
    }
}
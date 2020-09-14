public class TowerBuilderKarel extends SuperKarel
{
    public void run()
    {
        int x = 0;
        int y = 0;
        
        //Loops until front is not clear
        while(frontIsClear())
        {
            //Places intial tower and reverts then moves
            tower();
            revert();
            move();
            
            //Adds value to y in order to state which avenue it is in
            y = y + 1;
            
            //Checks to see if the front is blocked
            if(frontIsBlocked())
            {
                break;
            } 
            else 
            {
                //Moves forward if it is not blocked and adds a new avenue
                move();
                y = y + 1;
            }
            //Adds one total tower to the value
            x = x + 1;
        }
        
        //Checks to see if a certain amount of towers are built
        if((x == 2 || x == 4 || x == 0 || x == 1) && (y != 3))
        {
            tower();
            revert();
        }
    }
    //Creates a tower by placing balls and moving
    public void tower()
    {
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
    }
    //Reverts to street one to advance to the next one
    public void revert()
    {
        turnRight();
        turnRight();
        move();
        move();
        turnLeft();
    }
}
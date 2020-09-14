/* This program draws a big tower from Karel's starting spot */
public class BigTowerKarel extends SuperKarel
{
    public void run()
    {
        faceNorth();
        placeAndMove();
        putBall();
    }
    
    public void faceNorth()
    {
        while(notFacingNorth())
        {
            turnLeft();
        }
    }
        
    public void placeAndMove()
    {
        while(frontIsClear())
        {
            putBall();
            move();
        }
    }
}
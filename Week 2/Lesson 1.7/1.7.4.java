public class TwoTowersKarel extends Karel
{
    /* 
     * This method is our main entry point for the program.
     * Builds two towers before finishing finishing the race.
     * Precondition: Karel should be in the bottom left
     * corner, facing east.
     * Postcondition: Karel should be at the top of the second tower
     */
	public void run()
	{
    	move();
        buildTower();
        comeDown();
        move();
        move();
        buildTower();
        move();
        turnRight();
	}
    
    /**
     * Rotates three times to the left
     * Precondition: Karel should be at the top of a tower
     * Postcondition: Karel will turn right and face east
     */
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Rotates twice to the left to turn around
     * Precondition: At the top of the tower
     * Postcondition: Karel will turn around and face south
     */
    private void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    
    /**
     * Moves to the first street
     * Precondition: At the top of the tower
     * Postcondition: Karel will turn around and come back to first street
     */
    private void comeDown()
    {
        turnAround();
        move();
        move();
        turnLeft();
    }
    
    /**
     * Builds tower
     * Precondition: At the bottom of thw would be tower
     * Postcondition: Karel will be at the top of the tower facing north
     */
    private void buildTower()
    {
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
    }
}
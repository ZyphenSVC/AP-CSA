public class TwoTowersKarel extends SuperKarel
{

	public void run()
	{
		move();
		buildTower();
		ground();
		moveTwice();
		buildTower();
	}
	
    private void buildTower()
	{
	    turnLeft();
	    putBall();
	    move();
	    putBall();
	    move();
	    putBall();
	    move();
	    turnRight();
	}
	
	private void moveTwice()
    {
        move();
        move();
    }
    
    private void ground()
    {
        turnRight();
		moveTwice();
		move();
		turnLeft();
    }
    
}
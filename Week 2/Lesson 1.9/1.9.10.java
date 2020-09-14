public class HurdlesKarel extends SuperKarel
{
    public void run()
    {
        jumpHurdle();  
    }
    
    private void jumpHurdle()
    {
        for(int i=0; i<5; i++)
        {
            move();
            move();
            turnLeft();
            move();
            turnRight();
            move();
            turnRight();
            move();
            turnLeft();
        }
    }
}
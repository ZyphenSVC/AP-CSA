// This program has Karel run a marathon,
// which consists of 26 moves
class MarathonKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i < 26; i++)
        {
            move();
        }
    }
}
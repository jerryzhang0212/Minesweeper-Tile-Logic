public class Tile
{
    //instance variables
    private boolean mined;
    private boolean flagged;
    private boolean dug;
    private int nearby;

    //constructor
    public Tile()//blank
    {
        mined = false;
        flagged = false;
        dug = false;
        nearby = 0;
    }

    //nearby mine count
    public void setNearby(int num)
    {
        if (num >= 0 && num <= 8)
        {
            nearby = num;
        }
    }

    public int getNearby()
    {
        return nearby;
    }

    //mine logic
    public boolean getMined()
    {
        return mined;
    }

    public void placeMine()
    {
        mined = true;
    }

    //flag logic change flag if tile is not dug
    public boolean flag()
    {
        if (dug)
        {
            return flagged;
        }

        flagged = !flagged;
        return flagged;
    }

    //dig logic
    public boolean dig()
    {
        if (dug || flagged)
        {
            return false;
        }

        dug = true;
        return true;
    }
}
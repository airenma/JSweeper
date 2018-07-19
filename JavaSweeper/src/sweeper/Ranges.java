package sweeper;

import java.util.ArrayList;

public class Ranges
{
    static private Coord size;
    static private ArrayList<Coord> allCoords;

    static void setSize (Coord size)
    {
        Ranges.size = size;
        allCoords = new ArrayList<Coord>();
        for(int x =0; x < size.x; x++)
            for(int y = 0; y < size.y; y++)
                allCoords.add(new Coord (x, y));
    }
    static public void setSize(int cols, int rows)
    {
        Coord size = new Coord (cols, rows);
        setSize(size);
    }

    public static Coord getSize()
    {
        return size;
    }

    public static ArrayList<Coord> getAllCoords()
    {
        return allCoords;
    }

}

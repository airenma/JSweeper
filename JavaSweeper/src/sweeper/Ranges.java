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


    public static Coord getSize()
    {
        return size;
    }

    public static ArrayList<Coord> getAllCoords()
    {
        return allCoords;
    }

    static public boolean inRange (Coord coord)
    {
        return coord.x >= 0 && coord.x < size.x &&
                coord.y >= 0 && coord.y < size.y;
    }

}

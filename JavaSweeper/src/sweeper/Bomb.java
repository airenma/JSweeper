package sweeper;

public class Bomb
{
    private Matrix bombMap;
    private int totalBombs;

    Bomb (int totalBombs)
    {
        this.totalBombs = totalBombs;
    }


   void start()
    {
        bombMap = new Matrix(Box.ZERO);
        bombMap.set (new Coord(0,0), Box.BOMB);
        bombMap.set (new Coord(0,1), Box.NUM1);
        bombMap.set (new Coord(1,0), Box.NUM1);
        bombMap.set (new Coord(1,1), Box.NUM1);
    }

    Box get(Coord coord)
{
    return bombMap.get(coord);
}

}

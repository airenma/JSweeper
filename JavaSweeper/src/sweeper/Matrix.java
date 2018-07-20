package sweeper;

 class Matrix
 {
     Box [] [] matrix;

     Matrix (Box box)
     {
         matrix = new Box [Ranges.getSize().x]  [Ranges.getSize().y];
         for (Coord coord : Ranges.getAllCoords())
             matrix [coord.x] [coord.y] = box;
     }
}

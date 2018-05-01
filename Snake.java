public class Snake {
  public static void main(String []args){
    //keys
    // final int left = KeyEvent.VK_LEFT;
    // final int up = KeyEvent.VK_UP;
    // final int down = KeyEvent.VK_DOWN;
    // final int right = KeyEvent.VK_RIGHT;
    // Kopf von snaki
    double horizontal = 0.55;
    double waagerecht = 0.55;

    while (true)  {
      double hline = 0.2;
      double oben = 0.2;
      double unten = 0.2;
      //Clear
      StdDraw.clear(StdDraw.WHITE);
      //Kopf
      StdDraw.setPenRadius(0.05);
      StdDraw.setPenColor(StdDraw.GREEN);
      StdDraw.filledSquare(horizontal, waagerecht, 0.05);
      //apfel
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.filledSquare(0.55, 0.65, 0.05);
      //Grid
      for(int i = 0; i <= 6; i++){
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.setPenRadius(0.005);
        StdDraw.line(0.2, hline, 0.8, hline);
        hline = hline + 0.1;
      }
      for(int j = 0; j <= 6; j++){
        StdDraw.line(oben, 0.2, unten, 0.8);
        oben = oben + 0.1;
        unten = unten + 0.1;
      }

      //kop wird einen weitergesetzt
      StdDraw.setPenRadius(0.05);
      StdDraw.setPenColor(StdDraw.GREEN);
      StdDraw.filledSquare(horizontal, waagerecht, 0.05);
      horizontal = horizontal + 0.10;
      // waagerecht = waagerecht + 0.10;



      StdDraw.show(750);
   // update position
   // key listener einbauen und folgende reihenfolge benutzen
   // (wasd-taste durch key listener abgreifen)->
   // clear alles->je nach taste in die entsprechende richtung um 0.1 (0.x0, 0.y0)
   // bewegen -> (bewegen heisst: stdraw) -> dann checken ob sich  apple an
   // der selben position befindet
   // falls ja , dann zu "snakeody" hinzufügen
 }}//while and ig
}

// move
//87-w
//65-a
//83-s
//68-d
// gettingbigger

// random drops
// double[][] randomapples = new double[5][5];

// apfel
// soll immer nachdem es gegessen wurde (nach dem clear), random woanders in dem [][]array auftauchen

// snake body
// immer wenn snakekopf einen apfel "isst", bekommt das neue bodyteil die alten
//  werte des kopfes (nachdem ) es gecleart und der kopf ein schritt weiter ist
//  dann geht der counter einen hoch bspl:
//  nur kopf = 0
//  kopf + 1 teil = 1
// kopf + zwei teile = 2 etc.......
// ab jetzt wird geschaut ist der counter > 0, dann soll jedes nächste teil warten bis
// die komplette schlange vorbei ist, wenn die werte von keinem der teile mit dem
// des neuen teils übereinstimmen,dann ist ist es teil xteil (x = counter +1).
// jedes teil beinhaltet die methode, "checkbodypart" welche die koordienaten checkt
// und die eigene nach dem clear überschreibt ( es kann geschaut werden ob eigene xteil
// nicht wie das xteil von xteil= xteil-1 ist )
//
// wasdmovements
// hasNextKeyTyped()} sehr fraglich
// nextKeyTyped()} klingt realistischer
// isKeyPressed(int keycode)} in kombi mit dem devor
// wenn key gedrückt wird , soll head in die entsprechende richtung sich bewegen
// w= StdDraw.filledSquare(+0.00, +0.10);
// a= StdDraw.filledSquare(-0.10, +0.00);
// s= StdDraw.filledSquare(+0.00, -0.10);
// d= StdDraw.filledSquare(+0.10, +0.00);
// es soll checken ob in der richtung ein teil ist, wenn ja, dann soll die
// richtung sich nicht ändern.
//
// YOU LOST
// -wenn die koordienaten vom kopf ausserhalb des spielfeldes sind
// (kann man ganz easy machen indem man if kopf =! spielfeld -> YOU LOST schreiben)
// -wenn die koordienaten vom kopf == teil sind -> YOU LOST schreiben
//
// YOU WON
// wenn man z.b. 10 äpfel isst oder so.......


//STEUERUNG mit der maus
// wenn die maus an den rand geht soll geschaut werden ob y ,x positiv/negativ sind
// (x, y)=W= vorne
// ()

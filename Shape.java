class Shape{

    //Data
    private int[][] gameBoard = new int[10][22];
    private int shape = 0;
    private int x;
    private int y;

    //Constructor

    Logic(){
        for(int i = 0; i<10;i++){
            for(int j = 0; j < 22; j++){
                gameBoard[i][j] = 0;
            }
        }
    }

    //--------------------Method's----------


    //TimeTick

    //MoveLeft

    //MoveRight

    //RotateLeft

    //RotateRight

    //Drop

    //Status -- If there is a tetrimino falling or not

    //getTetrimino
    public void getShape(int shape){
        if(!status()){

        }
    }


    //ReturnBoard
    /*
      000l000000
      000lll0000
      ----------
      0000000000
      0000000000
      0000000000
      0000000000
      .
      .
      .
      1110000000
      1101000000

    */

    // shapes know their position, they take in (game board from this class)

    //Shapes Think it will be a class in the future
    /*
      [ ][ ][ ][ ]   [ ][ ][1][ ]    [ ][ ][ ][ ]    [ ][1][ ][ ]
      [1][1][1][1]   [ ][ ][1][ ]    [ ][ ][ ][ ]    [ ][1][ ][ ]   
      [ ][ ][ ][ ]   [ ][ ][1][ ]    [1][1][1][1]    [ ][1][ ][ ]
      [ ][ ][ ][ ]   [ ][ ][1][ ]    [ ][ ][ ][ ]    [ ][1][ ][ ]

      [1][ ][ ]      [ ][1][1]       [ ][ ][ ]       [ ][1][ ]
      [1][1][1]      [ ][1][ ]       [1][1][1]       [ ][1][ ]
      [ ][ ][ ]      [ ][1][ ]       [ ][ ][1]       [1][1][ ]

      [ ][ ][1]      [ ][1][ ]       [ ][ ][ ]       [1][1][ ]
      [1][1][1]      [ ][1][ ]       [1][1][1]       [ ][1][ ]
      [ ][ ][ ]      [ ][1][1]       [1][ ][ ]       [ ][1][ ]

      [ ][1][1][ ]   [ ][1][1][ ]    [ ][1][1][ ]    [ ][1][1][ ]
      [ ][1][1][ ]   [ ][1][1][ ]    [ ][1][1][ ]    [ ][1][1][ ]   
      [ ][ ][ ][ ]   [ ][ ][ ][ ]    [ ][ ][ ][ ]    [ ][ ][ ][ ]
      

      [ ][1][1]      [ ][1][ ]       [ ][ ][ ]       [1][ ][ ]
      [1][1][ ]      [ ][1][1]       [ ][1][1]       [1][1][ ]
      [ ][ ][ ]      [ ][ ][1]       [1][1][ ]       [ ][1][ ]

      [ ][1][ ]      [ ][1][ ]       [ ][ ][ ]       [ ][1][ ]
      [1][1][1]      [ ][1][1]       [1][1][1]       [1][1][ ]
      [ ][ ][ ]      [ ][1][ ]       [ ][1][ ]       [ ][1][ ]

      [1][1][ ]      [ ][ ][1]       [ ][ ][ ]       [ ][1][ ]
      [ ][1][1]      [ ][1][1]       [1][1][ ]       [1][1][ ]
      [ ][ ][ ]      [ ][1][ ]       [ ][1][1]       [1][ ][ ]
    */



}
import java.io.FileWriter;
import java.io.IOException;
// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES{
static boolean f_gold ( int x , int y , int n ) {
  boolean [ ] dp = new boolean [ n + 1 ] ;
  Arrays . fill ( dp , false ) ;
  dp [ 0 ] = false ;
  dp [ 1 ] = true ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( i - 1 >= 0 && dp [ i - 1 ] == false ) dp [ i ] = true ;
    else if ( i - x >= 0 && dp [ i - x ] == false ) dp [ i ] = true ;
    else if ( i - y >= 0 && dp [ i - y ] == false ) dp [ i ] = true ;
    else dp [ i ] = false ;
  }
  return dp [ n ] ;
}


//TOFILL

}

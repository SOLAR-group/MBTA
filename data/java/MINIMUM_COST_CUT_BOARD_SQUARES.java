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
public class MINIMUM_COST_CUT_BOARD_SQUARES{
static int f_gold ( Integer X [ ] , Integer Y [ ] , int m , int n ) {
  int res = 0 ;
  Arrays . sort ( X , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( Y , Collections . reverseOrder ( ) ) ;
  int hzntl = 1 , vert = 1 ;
  int i = 0 , j = 0 ;
  while ( i < m && j < n ) {
    if ( X [ i ] > Y [ j ] ) {
      res += X [ i ] * vert ;
      hzntl ++ ;
      i ++ ;
    }
    else {
      res += Y [ j ] * hzntl ;
      vert ++ ;
      j ++ ;
    }
  }
  int total = 0 ;
  while ( i < m ) total += X [ i ++ ] ;
  res += total * vert ;
  total = 0 ;
  while ( j < n ) total += Y [ j ++ ] ;
  res += total * hzntl ;
  return res ;
}


//TOFILL

}

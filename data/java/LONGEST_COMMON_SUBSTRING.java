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
public class LONGEST_COMMON_SUBSTRING{
static int f_gold ( char X [ ] , char Y [ ] , int m , int n ) {
  int LCStuff [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  int result = 0 ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) LCStuff [ i ] [ j ] = 0 ;
      else if ( X [ i - 1 ] == Y [ j - 1 ] ) {
        LCStuff [ i ] [ j ] = LCStuff [ i - 1 ] [ j - 1 ] + 1 ;
        result = Integer . max ( result , LCStuff [ i ] [ j ] ) ;
      }
      else LCStuff [ i ] [ j ] = 0 ;
    }
  }
  return result ;
}


//TOFILL

}

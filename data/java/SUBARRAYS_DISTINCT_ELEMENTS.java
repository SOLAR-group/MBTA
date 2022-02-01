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
public class SUBARRAYS_DISTINCT_ELEMENTS{
public static int f_gold ( int [ ] arr , int n ) {
  Set < Integer > s = new HashSet < > ( ) ;
  int j = 0 , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( j < n && ! s . contains ( arr [ j ] ) ) {
      s . add ( arr [ i ] ) ;
      j ++ ;
    }
    ans += ( ( j - i ) * ( j - i + 1 ) ) / 2 ;
    s . remove ( arr [ i ] ) ;
  }
  return ans ;
}


//TOFILL

}

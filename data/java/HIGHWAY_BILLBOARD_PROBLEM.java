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
public class HIGHWAY_BILLBOARD_PROBLEM{
static int f_gold ( int m , int [ ] x , int [ ] revenue , int n , int t ) {
  int [ ] maxRev = new int [ m + 1 ] ;
  for ( int i = 0 ;
  i < m + 1 ;
  i ++ ) maxRev [ i ] = 0 ;
  int nxtbb = 0 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    if ( nxtbb < n ) {
      if ( x [ nxtbb ] != i ) maxRev [ i ] = maxRev [ i - 1 ] ;
      else {
        if ( i <= t ) maxRev [ i ] = Math . max ( maxRev [ i - 1 ] , revenue [ nxtbb ] ) ;
        else maxRev [ i ] = Math . max ( maxRev [ i - t - 1 ] + revenue [ nxtbb ] , maxRev [ i - 1 ] ) ;
        nxtbb ++ ;
      }
    }
    else maxRev [ i ] = maxRev [ i - 1 ] ;
  }
  return maxRev [ m ] ;
}


//TOFILL

}

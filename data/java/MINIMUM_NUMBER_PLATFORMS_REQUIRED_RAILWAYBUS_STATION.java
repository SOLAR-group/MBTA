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
public class MINIMUM_NUMBER_PLATFORMS_REQUIRED_RAILWAYBUS_STATION{
static int f_gold ( int arr [ ] , int dep [ ] , int n ) {
  Arrays . sort ( arr ) ;
  Arrays . sort ( dep ) ;
  int plat_needed = 1 , result = 1 ;
  int i = 1 , j = 0 ;
  while ( i < n && j < n ) {
    if ( arr [ i ] <= dep [ j ] ) {
      plat_needed ++ ;
      i ++ ;
      if ( plat_needed > result ) result = plat_needed ;
    }
    else {
      plat_needed -- ;
      j ++ ;
    }
  }
  return result ;
}


//TOFILL

}

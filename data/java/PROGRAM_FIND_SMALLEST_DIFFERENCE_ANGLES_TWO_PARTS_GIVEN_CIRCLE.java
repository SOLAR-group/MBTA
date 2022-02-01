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
public class PROGRAM_FIND_SMALLEST_DIFFERENCE_ANGLES_TWO_PARTS_GIVEN_CIRCLE{
public static int f_gold ( int arr [ ] , int n ) {
  int l = 0 , sum = 0 , ans = 360 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
    while ( sum >= 180 ) {
      ans = Math . min ( ans , 2 * Math . abs ( 180 - sum ) ) ;
      sum -= arr [ l ] ;
      l ++ ;
    }
    ans = Math . min ( ans , 2 * Math . abs ( 180 - sum ) ) ;
  }
  return ans ;
}


//TOFILL

}

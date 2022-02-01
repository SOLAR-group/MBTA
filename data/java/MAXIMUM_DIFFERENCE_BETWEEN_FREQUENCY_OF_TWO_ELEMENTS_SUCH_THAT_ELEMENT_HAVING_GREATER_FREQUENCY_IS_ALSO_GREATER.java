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
public class MAXIMUM_DIFFERENCE_BETWEEN_FREQUENCY_OF_TWO_ELEMENTS_SUCH_THAT_ELEMENT_HAVING_GREATER_FREQUENCY_IS_ALSO_GREATER{
static int f_gold ( int arr [ ] , int n ) {
  Map < Integer , Integer > freq = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) freq . put ( arr [ i ] , freq . get ( arr [ i ] ) == null ? 1 : freq . get ( arr [ i ] ) + 1 ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( freq . get ( arr [ i ] ) > freq . get ( arr [ j ] ) && arr [ i ] > arr [ j ] ) ans = Math . max ( ans , freq . get ( arr [ i ] ) - freq . get ( arr [ j ] ) ) ;
      else if ( freq . get ( arr [ i ] ) < freq . get ( arr [ j ] ) && arr [ i ] < arr [ j ] ) ans = Math . max ( ans , freq . get ( arr [ j ] ) - freq . get ( arr [ i ] ) ) ;
    }
  }
  return ans ;
}


//TOFILL

}

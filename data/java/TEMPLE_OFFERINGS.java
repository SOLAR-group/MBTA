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
public class TEMPLE_OFFERINGS{
static int f_gold ( int n , int templeHeight [ ] ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    int left = 0 , right = 0 ;
    for ( int j = i - 1 ;
    j >= 0 ;
    -- j ) {
      if ( templeHeight [ j ] < templeHeight [ j + 1 ] ) ++ left ;
      else break ;
    }
    for ( int j = i + 1 ;
    j < n ;
    ++ j ) {
      if ( templeHeight [ j ] < templeHeight [ j - 1 ] ) ++ right ;
      else break ;
    }
    sum += Math . max ( right , left ) + 1 ;
  }
  return sum ;
}


//TOFILL

}

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
public class MAXIMUM_SUBSEQUENCE_SUM_SUCH_THAT_NO_THREE_ARE_CONSECUTIVE{
static int f_gold ( int arr [ ] , int n ) {
  int sum [ ] = new int [ n ] ;
  if ( n >= 1 ) sum [ 0 ] = arr [ 0 ] ;
  if ( n >= 2 ) sum [ 1 ] = arr [ 0 ] + arr [ 1 ] ;
  if ( n > 2 ) sum [ 2 ] = Math . max ( sum [ 1 ] , Math . max ( arr [ 1 ] + arr [ 2 ] , arr [ 0 ] + arr [ 2 ] ) ) ;
  for ( int i = 3 ;
  i < n ;
  i ++ ) sum [ i ] = Math . max ( Math . max ( sum [ i - 1 ] , sum [ i - 2 ] + arr [ i ] ) , arr [ i ] + arr [ i - 1 ] + sum [ i - 3 ] ) ;
  return sum [ n - 1 ] ;
}


//TOFILL

}

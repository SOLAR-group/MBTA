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
public class MINIMUM_INSERTIONS_SORT_ARRAY{
static int f_gold ( int arr [ ] , int N ) {
  int [ ] lis = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) lis [ i ] = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( arr [ i ] >= arr [ j ] && lis [ i ] < lis [ j ] + 1 ) lis [ i ] = lis [ j ] + 1 ;
  int max = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) if ( max < lis [ i ] ) max = lis [ i ] ;
  return ( N - max ) ;
}


//TOFILL

}

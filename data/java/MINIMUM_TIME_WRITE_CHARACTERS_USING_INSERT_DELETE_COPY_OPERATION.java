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
public class MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION{
static int f_gold ( int N , int insert , int remove , int copy ) {
  if ( N == 0 ) return 0 ;
  if ( N == 1 ) return insert ;
  int dp [ ] = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i % 2 == 0 ) dp [ i ] = Math . min ( dp [ i - 1 ] + insert , dp [ i / 2 ] + copy ) ;
    else dp [ i ] = Math . min ( dp [ i - 1 ] + insert , dp [ ( i + 1 ) / 2 ] + copy + remove ) ;
  }
  return dp [ N ] ;
}


//TOFILL

}

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
public class BINARY_SEARCH{
static int f_gold ( int arr [ ] , int l , int r , int x ) {
  if ( r >= l ) {
    int mid = l + ( r - l ) / 2 ;
    if ( arr [ mid ] == x ) return mid ;
    if ( arr [ mid ] > x ) return f_gold ( arr , l , mid - 1 , x ) ;
    return f_gold ( arr , mid + 1 , r , x ) ;
  }
  return - 1 ;
}


//TOFILL

}

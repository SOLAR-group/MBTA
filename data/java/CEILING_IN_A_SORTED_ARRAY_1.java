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
public class CEILING_IN_A_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int low , int high , int x ) {
  int mid ;
  if ( x <= arr [ low ] ) return low ;
  if ( x > arr [ high ] ) return - 1 ;
  mid = ( low + high ) / 2 ;
  if ( arr [ mid ] == x ) return mid ;
  else if ( arr [ mid ] < x ) {
    if ( mid + 1 <= high && x <= arr [ mid + 1 ] ) return mid + 1 ;
    else return f_gold ( arr , mid + 1 , high , x ) ;
  }
  else {
    if ( mid - 1 >= low && x > arr [ mid - 1 ] ) return mid ;
    else return f_gold ( arr , low , mid - 1 , x ) ;
  }
}


//TOFILL

}

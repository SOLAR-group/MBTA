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
public class FLOOR_IN_A_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int low , int high , int x ) {
  if ( low > high ) return - 1 ;
  if ( x >= arr [ high ] ) return high ;
  int mid = ( low + high ) / 2 ;
  if ( arr [ mid ] == x ) return mid ;
  if ( mid > 0 && arr [ mid - 1 ] <= x && x < arr [ mid ] ) return mid - 1 ;
  if ( x < arr [ mid ] ) return f_gold ( arr , low , mid - 1 , x ) ;
  return f_gold ( arr , mid + 1 , high , x ) ;
}


//TOFILL

}

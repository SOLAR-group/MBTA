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
public class FIND_ROTATION_COUNT_ROTATED_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int low , int high ) {
  if ( high < low ) return 0 ;
  if ( high == low ) return low ;
  int mid = low + ( high - low ) / 2 ;
  if ( mid < high && arr [ mid + 1 ] < arr [ mid ] ) return ( mid + 1 ) ;
  if ( mid > low && arr [ mid ] < arr [ mid - 1 ] ) return mid ;
  if ( arr [ high ] > arr [ mid ] ) return f_gold ( arr , low , mid - 1 ) ;
  return f_gold ( arr , mid + 1 , high ) ;
}


//TOFILL

}

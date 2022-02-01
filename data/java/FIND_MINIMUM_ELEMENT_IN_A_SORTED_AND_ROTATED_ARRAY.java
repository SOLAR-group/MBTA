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
public class FIND_MINIMUM_ELEMENT_IN_A_SORTED_AND_ROTATED_ARRAY{
static int f_gold ( int arr [ ] , int low , int high ) {
  if ( high < low ) return arr [ 0 ] ;
  if ( high == low ) return arr [ low ] ;
  int mid = low + ( high - low ) / 2 ;
  if ( mid < high && arr [ mid + 1 ] < arr [ mid ] ) return arr [ mid + 1 ] ;
  if ( mid > low && arr [ mid ] < arr [ mid - 1 ] ) return arr [ mid ] ;
  if ( arr [ high ] > arr [ mid ] ) return f_gold ( arr , low , mid - 1 ) ;
  return f_gold ( arr , mid + 1 , high ) ;
}


//TOFILL

}

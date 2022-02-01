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
public class FIND_REPEATING_ELEMENT_SORTED_ARRAY_SIZE_N{
static int f_gold ( int arr [ ] , int low , int high ) {
  if ( low > high ) return - 1 ;
  int mid = ( low + high ) / 2 ;
  if ( arr [ mid ] != mid + 1 ) {
    if ( mid > 0 && arr [ mid ] == arr [ mid - 1 ] ) return mid ;
    return f_gold ( arr , low , mid - 1 ) ;
  }
  return f_gold ( arr , mid + 1 , high ) ;
}


//TOFILL

}

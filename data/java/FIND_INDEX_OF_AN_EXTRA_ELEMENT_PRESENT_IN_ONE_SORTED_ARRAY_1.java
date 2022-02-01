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
public class FIND_INDEX_OF_AN_EXTRA_ELEMENT_PRESENT_IN_ONE_SORTED_ARRAY_1{
static int f_gold ( int arr1 [ ] , int arr2 [ ] , int n ) {
  int index = n ;
  int left = 0 , right = n - 1 ;
  while ( left <= right ) {
    int mid = ( left + right ) / 2 ;
    if ( arr2 [ mid ] == arr1 [ mid ] ) left = mid + 1 ;
    else {
      index = mid ;
      right = mid - 1 ;
    }
  }
  return index ;
}


//TOFILL

}

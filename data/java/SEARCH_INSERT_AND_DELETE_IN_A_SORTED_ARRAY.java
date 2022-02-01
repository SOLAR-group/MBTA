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
public class SEARCH_INSERT_AND_DELETE_IN_A_SORTED_ARRAY{
static int f_gold ( int arr [ ] , int low , int high , int key ) {
  if ( high < low ) return - 1 ;
  int mid = ( low + high ) / 2 ;
  if ( key == arr [ mid ] ) return mid ;
  if ( key > arr [ mid ] ) return f_gold ( arr , ( mid + 1 ) , high , key ) ;
  return f_gold ( arr , low , ( mid - 1 ) , key ) ;
}


//TOFILL

}

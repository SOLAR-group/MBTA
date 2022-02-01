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
public class FIND_THE_FIRST_MISSING_NUMBER{
static int f_gold ( int array [ ] , int start , int end ) {
  if ( start > end ) return end + 1 ;
  if ( start != array [ start ] ) return start ;
  int mid = ( start + end ) / 2 ;
  if ( array [ mid ] == mid ) return f_gold ( array , mid + 1 , end ) ;
  return f_gold ( array , start , mid ) ;
}


//TOFILL

}

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
public class GIVEN_P_AND_N_FIND_THE_LARGEST_X_SUCH_THAT_PX_DIVIDES_N_2{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  while ( n > 0 ) {
    n /= p ;
    ans += n ;
  }
  return ans ;
}


//TOFILL

}

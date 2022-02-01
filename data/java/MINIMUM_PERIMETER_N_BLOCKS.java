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
public class MINIMUM_PERIMETER_N_BLOCKS{
public static long f_gold ( int n ) {
  int l = ( int ) Math . sqrt ( n ) ;
  int sq = l * l ;
  if ( sq == n ) return l * 4 ;
  else {
    long row = n / l ;
    long perimeter = 2 * ( l + row ) ;
    if ( n % l != 0 ) perimeter += 2 ;
    return perimeter ;
  }
}


//TOFILL

}

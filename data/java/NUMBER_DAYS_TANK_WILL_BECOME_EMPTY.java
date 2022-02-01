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
public class NUMBER_DAYS_TANK_WILL_BECOME_EMPTY{
static int f_gold ( int C , int l ) {
  if ( l >= C ) return C ;
  double eq_root = ( Math . sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2 ;
  return ( int ) ( Math . ceil ( eq_root ) + l ) ;
}


//TOFILL

}

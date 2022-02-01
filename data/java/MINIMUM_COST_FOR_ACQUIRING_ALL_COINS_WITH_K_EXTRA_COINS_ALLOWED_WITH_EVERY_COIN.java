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
public class MINIMUM_COST_FOR_ACQUIRING_ALL_COINS_WITH_K_EXTRA_COINS_ALLOWED_WITH_EVERY_COIN{
static int f_gold ( int coin [ ] , int n , int k ) {
  Arrays . sort ( coin ) ;
  int coins_needed = ( int ) Math . ceil ( 1.0 * n / ( k + 1 ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i <= coins_needed - 1 ;
  i ++ ) ans += coin [ i ] ;
  return ans ;
}


//TOFILL

}

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
public class SWAP_ALL_ODD_AND_EVEN_BITS{
static int f_gold ( int x ) {
  int even_bits = x & 0xAAAAAAAA ;
  int odd_bits = x & 0x55555555 ;
  even_bits >>= 1 ;
  odd_bits <<= 1 ;
  return ( even_bits | odd_bits ) ;
}


//TOFILL

}

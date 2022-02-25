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
public class COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE{
static long f_gold ( int n ) {
  long [ ] [ ] dp = new long [ n + 1 ] [ 27 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 27 ;
    j ++ ) {
      dp [ i ] [ j ] = 0 ;
    }
  }
  for ( int i = 0 ;
  i <= 25 ;
  i ++ ) {
    dp [ 1 ] [ i ] = 1 ;
  }
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 25 ;
    j ++ ) {
      if ( j == 0 ) {
        dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
      }
      else {
        dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] ) ;
      }
    }
  }
  long sum = 0 ;
  for ( int i = 0 ;
  i <= 25 ;
  i ++ ) {
    sum = ( sum + dp [ n ] [ i ] ) ;
  }
  return sum ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(7);
    param0.add(47);
    param0.add(72);
    param0.add(66);
    param0.add(71);
    param0.add(56);
    param0.add(61);
    param0.add(68);
    param0.add(78);
    param0.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

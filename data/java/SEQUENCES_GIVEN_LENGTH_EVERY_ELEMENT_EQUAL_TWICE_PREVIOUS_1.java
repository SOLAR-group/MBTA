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
public class SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1{
static int f_gold ( int m , int n ) {
  int T [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < m + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) {
      if ( i == 0 || j == 0 ) T [ i ] [ j ] = 0 ;
      else if ( i < j ) T [ i ] [ j ] = 0 ;
      else if ( j == 1 ) T [ i ] [ j ] = i ;
      else T [ i ] [ j ] = T [ i - 1 ] [ j ] + T [ i / 2 ] [ j - 1 ] ;
    }
  }
  return T [ m ] [ n ] ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(10);
    param0.add(5);
    param0.add(2);
    param0.add(83);
    param0.add(91);
    param0.add(18);
    param0.add(83);
    param0.add(98);
    param0.add(43);
    param0.add(31);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(2);
    param1.add(8);
    param1.add(7);
    param1.add(0);
    param1.add(53);
    param1.add(41);
    param1.add(53);
    param1.add(37);
    param1.add(20);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

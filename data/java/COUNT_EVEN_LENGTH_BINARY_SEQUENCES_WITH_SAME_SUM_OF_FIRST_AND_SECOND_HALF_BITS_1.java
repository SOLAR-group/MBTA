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
public class COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1{
static int f_gold ( int n ) {
  int nCr = 1 , res = 1 ;
  for ( int r = 1 ;
  r <= n ;
  r ++ ) {
    nCr = ( nCr * ( n + 1 - r ) ) / r ;
    res += nCr * nCr ;
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(52);
    param0.add(75);
    param0.add(25);
    param0.add(80);
    param0.add(18);
    param0.add(17);
    param0.add(33);
    param0.add(8);
    param0.add(99);
    param0.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

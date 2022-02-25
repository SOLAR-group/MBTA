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
public class COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS{
static int f_gold ( int A ) {
  int n = 2 * A ;
  int [ ] dpArray = new int [ n + 1 ] ;
  dpArray [ 0 ] = 1 ;
  dpArray [ 2 ] = 1 ;
  for ( int i = 4 ;
  i <= n ;
  i += 2 ) {
    for ( int j = 0 ;
    j < i - 1 ;
    j += 2 ) {
      dpArray [ i ] += ( dpArray [ j ] * dpArray [ i - 2 - j ] ) ;
    }
  }
  return dpArray [ n ] ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(32);
    param0.add(52);
    param0.add(52);
    param0.add(32);
    param0.add(73);
    param0.add(31);
    param0.add(29);
    param0.add(75);
    param0.add(39);
    param0.add(49);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

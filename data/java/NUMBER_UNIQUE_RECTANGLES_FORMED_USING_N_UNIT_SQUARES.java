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
public class NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES{
static int f_gold ( int n ) {
  int ans = 0 ;
  for ( int length = 1 ;
  length <= Math . sqrt ( n ) ;
  ++ length ) for ( int height = length ;
  height * length <= n ;
  ++ height ) ans ++ ;
  return ans ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(49);
    param0.add(41);
    param0.add(17);
    param0.add(67);
    param0.add(38);
    param0.add(59);
    param0.add(64);
    param0.add(61);
    param0.add(58);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

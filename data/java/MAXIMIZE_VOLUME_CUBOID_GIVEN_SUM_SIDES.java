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
public class MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES{
static int f_gold ( int s ) {
  int maxvalue = 0 ;
  for ( int i = 1 ;
  i <= s - 2 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= s - 1 ;
    j ++ ) {
      int k = s - i - j ;
      maxvalue = Math . max ( maxvalue , i * j * k ) ;
    }
  }
  return maxvalue ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(48);
    param0.add(59);
    param0.add(22);
    param0.add(14);
    param0.add(66);
    param0.add(1);
    param0.add(75);
    param0.add(58);
    param0.add(78);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

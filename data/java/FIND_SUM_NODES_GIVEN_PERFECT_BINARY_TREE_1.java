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
public class FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1{
static double f_gold ( int l ) {
  double leafNodeCount = Math . pow ( 2 , l - 1 ) ;
  double sumLastLevel = 0 ;
  sumLastLevel = ( leafNodeCount * ( leafNodeCount + 1 ) ) / 2 ;
  double sum = sumLastLevel * l ;
  return sum ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(5);
    param0.add(16);
    param0.add(8);
    param0.add(61);
    param0.add(59);
    param0.add(88);
    param0.add(67);
    param0.add(28);
    param0.add(58);
    param0.add(42);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

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
public class PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP{
static double f_gold ( int n ) {
  return ( 3.0 * n ) / ( 4.0 * ( n * n ) - 1 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(5);
    param0.add(44);
    param0.add(15);
    param0.add(72);
    param0.add(2);
    param0.add(86);
    param0.add(17);
    param0.add(30);
    param0.add(42);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

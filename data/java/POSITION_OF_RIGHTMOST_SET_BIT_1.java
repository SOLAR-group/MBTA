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
public class POSITION_OF_RIGHTMOST_SET_BIT_1{
static int f_gold ( int n ) {
  int position = 1 ;
  int m = 1 ;
  while ( ( n & m ) == 0 ) {
    m = m << 1 ;
    position ++ ;
  }
  return position ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(17);
    param0.add(97);
    param0.add(73);
    param0.add(68);
    param0.add(6);
    param0.add(84);
    param0.add(72);
    param0.add(66);
    param0.add(57);
    param0.add(11);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("POSITION_OF_RIGHTMOST_SET_BIT_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("POSITION_OF_RIGHTMOST_SET_BIT_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

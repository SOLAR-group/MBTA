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
public class PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES{
static boolean f_gold ( int p ) {
  double checkNumber = Math . pow ( 2 , p ) - 1 ;
  double nextval = 4 % checkNumber ;
  for ( int i = 1 ;
  i < p - 1 ;
  i ++ ) nextval = ( nextval * nextval - 2 ) % checkNumber ;
  return ( nextval == 0 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(11);
    param0.add(27);
    param0.add(31);
    param0.add(47);
    param0.add(3);
    param0.add(14);
    param0.add(41);
    param0.add(72);
    param0.add(39);
    param0.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

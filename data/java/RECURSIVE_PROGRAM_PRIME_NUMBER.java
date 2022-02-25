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
public class RECURSIVE_PROGRAM_PRIME_NUMBER{
static boolean f_gold ( int n , int i ) {
  if ( n <= 2 ) return ( n == 2 ) ? true : false ;
  if ( n % i == 0 ) return false ;
  if ( i * i > n ) return true ;
  return f_gold ( n , i + 1 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(3);
    param0.add(7);
    param0.add(89);
    param0.add(97);
    param0.add(41);
    param0.add(73);
    param0.add(95);
    param0.add(69);
    param0.add(20);
    param0.add(30);
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    param1.add(2);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("RECURSIVE_PROGRAM_PRIME_NUMBER," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("RECURSIVE_PROGRAM_PRIME_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

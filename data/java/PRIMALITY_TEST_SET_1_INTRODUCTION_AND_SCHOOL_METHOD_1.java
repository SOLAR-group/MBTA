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
public class PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1{
static boolean f_gold ( int n ) {
  if ( n <= 1 ) return false ;
  if ( n <= 3 ) return true ;
  if ( n % 2 == 0 || n % 3 == 0 ) return false ;
  for ( int i = 5 ;
  i * i <= n ;
  i = i + 6 ) if ( n % i == 0 || n % ( i + 2 ) == 0 ) return false ;
  return true ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(15);
    param0.add(90);
    param0.add(38);
    param0.add(65);
    param0.add(91);
    param0.add(16);
    param0.add(48);
    param0.add(74);
    param0.add(14);
    param0.add(47);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

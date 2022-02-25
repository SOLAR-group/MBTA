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
public class COUNT_ROTATIONS_DIVISIBLE_4{
static int f_gold ( String n ) {
  int len = n . length ( ) ;
  if ( len == 1 ) {
    int oneDigit = n . charAt ( 0 ) - '0' ;
    if ( oneDigit % 4 == 0 ) return 1 ;
    return 0 ;
  }
  int twoDigit , count = 0 ;
  for ( int i = 0 ;
  i < ( len - 1 ) ;
  i ++ ) {
    twoDigit = ( n . charAt ( i ) - '0' ) * 10 + ( n . charAt ( i + 1 ) - '0' ) ;
    if ( twoDigit % 4 == 0 ) count ++ ;
  }
  twoDigit = ( n . charAt ( len - 1 ) - '0' ) * 10 + ( n . charAt ( 0 ) - '0' ) ;
  if ( twoDigit % 4 == 0 ) count ++ ;
  return count ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("MRRuQJvxe");
    param0.add("87395768");
    param0.add("10111100110111");
    param0.add("aVDUEfzG");
    param0.add("55794792");
    param0.add("111010");
    param0.add("cndMLMJVmzuH");
    param0.add("487717559382");
    param0.add("11110");
    param0.add("dRMDPyr");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_ROTATIONS_DIVISIBLE_4," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_ROTATIONS_DIVISIBLE_4," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

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
public class PANGRAM_CHECKING{
public static boolean f_gold ( String str ) {
  boolean [ ] mark = new boolean [ 26 ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( 'A' <= str . charAt ( i ) && str . charAt ( i ) <= 'Z' ) index = str . charAt ( i ) - 'A' ;
    else if ( 'a' <= str . charAt ( i ) && str . charAt ( i ) <= 'z' ) index = str . charAt ( i ) - 'a' ;
    mark [ index ] = true ;
  }
  for ( int i = 0 ;
  i <= 25 ;
  i ++ ) if ( mark [ i ] == false ) return ( false ) ;
  return ( true ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("The quick brown fox jumps over the lazy dog ");
    param0.add("The quick brown fox jumps over the dog");
    param0.add("abcdefghijklmnopqrstuvwxyz");
    param0.add("AbcdefghijKlmnopqrstUVwxyz");
    param0.add("The quicK broWn fOX jumps over the laZYy dog ");
    param0.add("AbcdefghijKlmnopqrstVwxyz");
    param0.add("U");
    param0.add("397548458372");
    param0.add("11");
    param0.add("iwCiUFU r");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PANGRAM_CHECKING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PANGRAM_CHECKING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

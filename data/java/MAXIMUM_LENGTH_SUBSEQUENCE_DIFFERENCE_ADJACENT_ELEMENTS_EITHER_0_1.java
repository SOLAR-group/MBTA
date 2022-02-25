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
public class MAXIMUM_LENGTH_SUBSEQUENCE_DIFFERENCE_ADJACENT_ELEMENTS_EITHER_0_1{
public static int f_gold ( int arr [ ] , int n ) {
  int mls [ ] = new int [ n ] , max = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mls [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( Math . abs ( arr [ i ] - arr [ j ] ) <= 1 && mls [ i ] < mls [ j ] + 1 ) mls [ i ] = mls [ j ] + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( max < mls [ i ] ) max = mls [ i ] ;
  return max ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,5,9,31,31,37,41,55,56,61,79,81,89,93});
    param0.add(new int[]{-76,96,-68,-16,22,-24,-24,6,98,-82,54,-80,46,0,0,-50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{97,93,43,51,15,33,13,96,39,89,78,25,45,6,64,54});
    param0.add(new int[]{-98,-78,-72,-70,-68,-58,-56,-54,-46,-44,-38,-34,-30,-24,-18,-16,-14,-12,2,6,8,8,10,10,16,24,26,28,40,42,44,56,58,62,66,66,78,86});
    param0.add(new int[]{1,1,0,1,0,0});
    param0.add(new int[]{7,8,10,11,12,15,16,16,19,21,23,23,23,25,26,35,38,43,46,47,51,52,53,57,60,61,66,67,69,74,75,81,83,84,88,92,94,98,98,99});
    param0.add(new int[]{14,-40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{59,70,53});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(15);
    param1.add(29);
    param1.add(13);
    param1.add(19);
    param1.add(3);
    param1.add(34);
    param1.add(1);
    param1.add(38);
    param1.add(1);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_LENGTH_SUBSEQUENCE_DIFFERENCE_ADJACENT_ELEMENTS_EITHER_0_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_LENGTH_SUBSEQUENCE_DIFFERENCE_ADJACENT_ELEMENTS_EITHER_0_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

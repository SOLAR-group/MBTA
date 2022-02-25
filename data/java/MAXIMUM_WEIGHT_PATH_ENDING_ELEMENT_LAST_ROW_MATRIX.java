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
public class MAXIMUM_WEIGHT_PATH_ENDING_ELEMENT_LAST_ROW_MATRIX{
public static int f_gold ( int mat [ ] [ ] , int N ) {
  int dp [ ] [ ] = new int [ N ] [ N ] ;
  dp [ 0 ] [ 0 ] = mat [ 0 ] [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) dp [ i ] [ 0 ] = mat [ i ] [ 0 ] + dp [ i - 1 ] [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) for ( int j = 1 ;
  j < i + 1 && j < N ;
  j ++ ) dp [ i ] [ j ] = mat [ i ] [ j ] + Math . max ( dp [ i - 1 ] [ j - 1 ] , dp [ i - 1 ] [ j ] ) ;
  int result = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) if ( result < dp [ N - 1 ] [ i ] ) result = dp [ N - 1 ] [ i ] ;
  return result ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ] [ ]> param0 = new ArrayList<>();
    param0.add(new int[][]{new int[]{1,3,17,22,24,29,36,38,41,42,44,44,47,48,49,51,52,54,64,69,70,77,79,82,86,86,87,88,97,99},new int[]{5,6,17,21,27,27,37,39,47,48,48,52,53,54,57,59,61,63,68,72,75,77,78,81,88,89,91,95,95,97},new int[]{2,8,10,16,17,18,18,18,20,27,33,35,36,42,48,51,56,66,72,72,75,76,76,76,84,85,91,94,96,98},new int[]{1,2,4,11,12,12,14,21,24,26,30,33,37,42,43,47,54,56,62,64,67,68,69,71,72,73,86,86,90,93},new int[]{1,1,3,7,9,10,11,12,14,14,15,17,21,25,26,40,45,46,46,48,49,54,56,60,64,68,68,73,93,93},new int[]{8,11,12,13,13,15,19,20,24,27,29,31,32,33,34,37,39,42,45,50,51,61,65,68,75,81,84,85,87,94},new int[]{12,16,17,24,34,34,35,40,43,48,50,51,53,55,60,60,62,66,68,70,71,73,77,83,84,86,88,95,96,97},new int[]{1,5,7,18,18,22,32,36,38,38,40,43,46,49,50,54,58,61,71,74,78,78,79,82,86,87,87,88,90,95},new int[]{4,11,22,26,28,35,35,37,39,42,45,46,51,57,60,61,62,63,65,65,79,79,79,82,83,87,89,90,91,98},new int[]{6,7,7,8,9,11,13,16,18,23,29,37,38,41,44,46,50,50,51,56,58,67,71,74,77,79,80,90,91,97},new int[]{3,7,10,15,19,20,22,28,28,32,33,36,36,38,41,49,51,54,63,66,66,70,72,79,87,88,89,92,93,98},new int[]{3,8,10,14,21,25,33,35,37,37,43,44,45,50,59,62,63,75,79,79,79,84,85,86,87,87,88,90,91,96},new int[]{2,4,7,12,13,18,23,23,28,29,32,34,37,37,37,38,41,44,45,47,48,49,59,64,72,75,87,92,93,98},new int[]{2,4,5,5,11,14,18,23,24,27,32,35,35,37,39,40,45,48,49,52,60,66,68,71,72,74,78,81,91,92},new int[]{4,4,4,6,11,18,20,23,24,29,32,33,37,40,42,47,51,52,58,59,62,67,68,75,77,78,80,85,89,95},new int[]{5,5,19,21,22,23,29,30,32,39,42,42,44,44,45,46,52,55,59,63,65,76,78,80,81,82,84,93,94,97},new int[]{3,4,6,8,10,15,15,17,27,28,34,36,39,42,53,54,59,63,65,66,70,71,72,80,80,91,92,94,95,99},new int[]{1,7,12,13,16,25,32,32,36,46,46,49,52,55,61,61,67,68,69,72,74,76,77,78,79,81,85,90,90,92},new int[]{2,12,12,13,18,20,25,28,31,31,34,36,38,39,42,43,44,47,54,60,75,76,77,80,82,83,86,90,91,91},new int[]{3,8,9,11,12,14,14,14,19,25,27,29,43,45,48,50,50,56,58,61,63,65,68,71,73,81,83,83,86,93},new int[]{11,15,15,15,15,18,28,29,33,33,36,43,44,48,50,50,53,55,59,59,60,61,62,63,75,78,81,82,87,94},new int[]{4,7,8,10,11,12,19,24,31,36,36,37,40,41,46,48,49,51,57,62,73,75,78,81,82,86,86,91,97,97},new int[]{5,5,7,8,10,14,15,17,19,21,22,23,31,34,36,43,46,58,60,72,72,75,77,81,83,84,86,91,96,98},new int[]{6,10,13,15,22,27,28,29,30,31,32,35,35,36,37,39,39,43,44,47,55,68,68,69,77,83,94,94,98,99},new int[]{4,4,5,6,6,10,18,27,28,29,31,33,34,41,43,44,54,56,63,74,76,77,80,80,83,89,89,90,98,99},new int[]{2,7,15,19,23,23,36,41,44,46,47,49,53,58,58,60,60,66,70,73,76,77,78,80,80,88,88,91,93,94},new int[]{3,3,9,9,10,13,15,19,20,23,25,33,36,37,47,54,58,60,60,65,71,73,81,88,89,90,92,94,94,96},new int[]{6,7,11,19,22,27,27,31,31,33,34,44,46,47,47,48,49,53,53,56,60,60,70,72,79,80,86,93,94,96},new int[]{2,7,7,7,8,10,13,15,17,18,27,27,30,33,33,34,37,41,43,47,55,55,59,71,71,75,78,78,84,85},new int[]{5,6,7,7,14,21,24,26,29,31,32,34,40,42,43,45,46,53,57,58,67,73,74,77,81,85,88,91,91,92}});
    param0.add(new int[][]{new int[]{62,44,46,46,-20,-40,24,42,-66,-90,62,-98,60},new int[]{62,88,-38,-30,44,-40,70,-70,96,12,20,-46,-96},new int[]{48,28,-90,82,36,-74,62,70,-54,94,0,58,56},new int[]{46,-26,-40,86,-54,-32,28,10,42,-82,-92,32,82},new int[]{-34,-36,-12,-26,82,84,34,20,18,-28,-2,2,-84},new int[]{0,-18,-24,72,56,58,10,36,-64,30,28,-76,-18},new int[]{-16,20,0,62,66,-28,-4,42,46,-84,-50,-86,-84},new int[]{76,62,52,-38,-76,14,32,-76,-46,-8,-86,22,16},new int[]{16,-74,6,30,-2,-30,88,90,-66,44,34,-80,-32},new int[]{72,-92,92,-42,-8,50,-8,54,18,22,36,32,-32},new int[]{72,-90,-82,-60,-58,-66,-76,84,64,34,-90,20,6},new int[]{4,56,-4,80,-62,-66,8,36,-30,76,-18,-74,-34},new int[]{-70,26,-70,-38,-44,-80,14,42,-34,-86,-90,80,60}});
    param0.add(new int[][]{new int[]{0,1,1,1,1,1,1,1},new int[]{0,0,0,0,1,1,1,1},new int[]{0,0,0,0,1,1,1,1},new int[]{0,0,0,0,0,0,0,1},new int[]{0,0,1,1,1,1,1,1},new int[]{0,0,0,0,0,1,1,1},new int[]{0,0,0,0,0,0,0,1},new int[]{0,0,0,0,0,1,1,1}});
    param0.add(new int[][]{new int[]{89,8,34,49,96},new int[]{58,75,47,25,3},new int[]{45,52,96,99,96},new int[]{34,69,92,92,8},new int[]{27,80,63,82,25}});
    param0.add(new int[][]{new int[]{-98,-94,-92,-86,-86,-86,-84,-78,-76,-70,-68,-66,-64,-58,-56,-52,-42,-40,-38,-38,-36,-32,-30,-24,-20,-12,-8,4,4,6,8,12,18,22,26,30,32,56,58,72,76,78,80,82,88,94,96,98},new int[]{-94,-94,-92,-84,-84,-82,-80,-80,-80,-78,-78,-76,-74,-68,-64,-64,-58,-54,-48,-46,-40,-38,-36,-30,-22,-22,-12,-12,-6,-2,2,4,6,22,22,22,24,24,24,24,26,42,44,50,52,54,66,80},new int[]{-98,-92,-92,-84,-80,-76,-76,-70,-64,-60,-60,-52,-48,-48,-46,-46,-36,-32,-30,-24,-22,-16,-14,-8,-8,-4,-2,0,2,2,2,8,10,12,22,32,38,38,40,48,64,68,76,78,78,86,96,96},new int[]{-98,-96,-88,-86,-78,-78,-70,-68,-62,-60,-58,-42,-38,-38,-38,-36,-36,-32,-28,-26,-24,-12,-10,-4,2,12,12,18,26,32,34,36,38,44,44,50,52,54,54,56,56,58,70,74,76,82,86,90},new int[]{-98,-96,-96,-94,-90,-90,-90,-86,-82,-78,-76,-74,-72,-68,-66,-60,-52,-46,-44,-44,-38,-38,-34,-32,-22,-20,-18,-14,8,8,12,12,12,16,20,38,40,44,52,76,78,80,82,86,90,90,96,98},new int[]{-88,-84,-84,-80,-78,-70,-68,-66,-62,-62,-54,-52,-48,-42,-42,-40,-32,-30,-26,-26,-24,-24,-14,-6,-4,-2,-2,4,4,8,22,24,40,42,52,52,56,56,58,64,72,72,74,74,86,92,96,98},new int[]{-98,-98,-92,-82,-76,-72,-68,-66,-64,-62,-56,-50,-48,-46,-46,-40,-40,-40,-38,-28,-28,-24,-22,-20,-20,-10,-6,4,6,10,12,26,32,38,38,40,42,56,60,64,64,72,72,76,84,90,94,98},new int[]{-98,-86,-72,-72,-66,-66,-64,-58,-56,-54,-54,-50,-44,-44,-36,-32,-30,-28,-26,-18,-14,-6,-4,6,6,10,10,14,22,28,38,40,46,46,50,52,54,56,60,68,68,72,76,90,90,92,92,98},new int[]{-90,-86,-86,-84,-76,-74,-70,-66,-58,-58,-54,-50,-48,-44,-38,-38,-36,-34,-30,-22,-22,-8,-6,4,6,6,6,8,10,24,24,28,32,32,32,36,44,48,48,50,52,64,70,74,76,92,94,96},new int[]{-96,-94,-84,-76,-76,-70,-68,-66,-56,-50,-50,-48,-46,-42,-42,-40,-40,-38,-38,-36,-36,-34,-30,-24,-22,-6,-4,-2,2,4,10,12,16,24,28,32,38,46,50,56,56,62,64,66,74,74,98,98},new int[]{-98,-96,-92,-88,-88,-84,-82,-78,-68,-66,-54,-52,-52,-50,-44,-40,-40,-38,-34,-34,-30,-26,-26,-24,-18,-14,-10,4,6,6,16,20,24,26,26,32,36,38,56,66,70,78,78,84,86,88,88,90},new int[]{-94,-90,-86,-86,-86,-86,-84,-82,-78,-78,-76,-72,-68,-64,-64,-62,-46,-42,-42,-28,-26,-18,-16,-10,-8,-2,0,10,10,12,18,18,26,26,32,34,34,40,50,54,56,58,62,66,66,82,84,94},new int[]{-98,-94,-88,-86,-84,-80,-80,-78,-78,-74,-72,-72,-70,-70,-68,-66,-66,-64,-50,-44,-28,-24,-16,-6,-4,0,2,8,12,22,26,32,38,38,50,54,58,58,64,64,66,70,78,86,88,90,96,98},new int[]{-96,-94,-90,-82,-78,-76,-76,-72,-64,-62,-54,-52,-50,-46,-44,-36,-30,-28,-28,-28,-22,-14,-12,0,0,2,6,6,10,18,22,22,24,28,28,30,34,36,36,42,46,48,54,66,72,76,86,96},new int[]{-98,-96,-92,-92,-90,-88,-86,-82,-78,-70,-68,-66,-60,-58,-48,-48,-46,-30,-26,-22,-20,-16,-12,-8,-4,-4,4,16,22,32,34,34,36,36,40,52,60,62,64,66,66,74,74,78,82,82,86,94},new int[]{-92,-90,-88,-84,-82,-80,-78,-76,-74,-60,-56,-48,-48,-48,-48,-42,-38,-38,-30,-28,-28,-26,-12,-12,-10,-10,-2,14,16,22,26,34,42,44,52,54,56,58,58,60,62,66,70,82,84,90,94,96},new int[]{-96,-92,-92,-84,-80,-76,-74,-74,-72,-70,-66,-66,-62,-60,-58,-56,-56,-50,-36,-34,-26,-10,2,2,10,10,10,10,12,18,22,22,34,34,40,60,62,62,68,72,76,78,82,82,82,82,94,96},new int[]{-96,-96,-88,-84,-78,-72,-68,-62,-56,-56,-52,-38,-32,-24,-20,-18,-18,-16,-10,-6,8,8,12,18,24,24,26,28,30,30,32,32,56,62,64,66,66,72,74,74,78,84,84,86,88,92,92,98},new int[]{-92,-86,-78,-68,-68,-68,-64,-58,-56,-48,-44,-38,-36,-34,-26,-22,-20,-18,-8,-6,0,2,4,12,12,18,20,22,30,32,36,38,42,44,46,50,50,52,56,58,62,64,68,70,70,82,90,98},new int[]{-94,-92,-92,-90,-88,-84,-80,-76,-74,-72,-72,-68,-62,-62,-56,-54,-50,-44,-42,-42,-30,-20,-16,-6,-6,12,14,16,18,30,30,40,42,44,54,58,58,68,74,74,80,84,84,86,88,94,96,96},new int[]{-90,-86,-84,-84,-78,-78,-70,-70,-64,-56,-52,-50,-48,-48,-48,-46,-42,-40,-40,-30,-30,-28,-24,-22,-18,-16,-14,-6,-2,4,10,12,14,14,20,26,32,44,58,64,68,68,74,76,76,82,86,88},new int[]{-98,-84,-80,-80,-78,-78,-78,-76,-68,-62,-56,-50,-34,-30,-30,-12,-8,-4,2,8,10,12,14,22,24,26,36,38,38,44,46,48,56,58,62,64,64,66,66,70,70,74,78,82,88,90,94,96},new int[]{-96,-96,-96,-96,-94,-94,-90,-86,-84,-80,-78,-74,-64,-60,-56,-54,-42,-38,-38,-38,-36,-34,-18,-16,-14,-14,-10,-10,-10,-6,-4,8,14,20,32,42,44,48,54,54,56,70,70,72,74,80,84,94},new int[]{-96,-94,-86,-84,-78,-76,-70,-66,-62,-60,-56,-56,-54,-54,-52,-52,-50,-46,-46,-34,-32,-32,-28,-16,-12,-6,0,16,18,18,20,20,28,34,38,40,42,42,52,56,62,66,66,70,82,84,88,98},new int[]{-86,-84,-80,-78,-62,-60,-58,-56,-54,-52,-48,-44,-40,-38,-38,-26,-26,-24,-24,-18,-10,-6,2,8,12,16,22,26,32,36,42,44,46,48,52,52,52,62,66,70,78,78,78,80,84,90,92,92},new int[]{-98,-96,-88,-86,-82,-78,-78,-72,-72,-70,-64,-64,-60,-58,-54,-52,-46,-42,-30,-18,-14,-2,2,2,6,12,20,24,24,28,32,38,38,48,54,58,60,66,68,70,70,74,78,80,82,84,86,90},new int[]{-98,-88,-82,-82,-76,-76,-74,-70,-70,-68,-66,-64,-62,-58,-56,-52,-40,-38,-38,-38,-38,-36,-30,-26,-26,-12,-2,4,6,16,20,24,26,26,28,34,44,50,60,68,72,74,78,84,84,88,90,90},new int[]{-98,-98,-96,-94,-88,-88,-86,-82,-66,-64,-62,-62,-40,-38,-34,-20,-14,-12,-10,-8,0,6,10,10,12,18,22,26,26,28,32,36,40,44,44,46,64,68,70,72,74,78,80,82,82,82,92,96},new int[]{-94,-94,-92,-88,-88,-84,-82,-78,-78,-76,-72,-64,-60,-56,-54,-54,-50,-48,-46,-42,-32,-28,-28,-24,-22,-22,-16,-14,-12,-12,4,10,16,16,16,28,30,40,48,56,62,64,68,76,88,90,92,98},new int[]{-94,-90,-88,-80,-76,-76,-76,-76,-72,-72,-68,-68,-68,-68,-66,-64,-62,-62,-54,-52,-46,-44,-36,-34,-20,-20,-16,-16,-10,-8,0,4,22,24,28,36,38,44,50,52,60,64,68,72,76,84,86,88},new int[]{-98,-98,-96,-94,-92,-80,-74,-72,-68,-68,-66,-64,-64,-62,-54,-52,-52,-28,-28,-28,-20,-10,2,6,6,14,16,16,24,28,28,32,32,36,38,44,44,46,50,58,64,68,78,86,90,90,96,98},new int[]{-96,-92,-80,-78,-68,-56,-54,-54,-44,-44,-36,-34,-34,-32,-30,-26,-22,-12,-8,-2,-2,-2,6,8,8,20,20,24,28,32,36,36,38,40,42,44,44,46,48,52,54,56,60,68,70,76,80,86},new int[]{-96,-86,-82,-82,-78,-76,-74,-68,-62,-54,-50,-48,-40,-38,-36,-34,-32,-26,-14,-12,-12,-6,-4,0,8,10,14,20,20,26,28,40,44,46,48,56,58,60,62,66,68,76,78,86,88,88,90,94},new int[]{-98,-96,-86,-86,-84,-76,-76,-72,-72,-70,-64,-62,-58,-58,-54,-48,-46,-42,-32,-28,-28,-26,-24,-20,-14,0,0,0,0,2,10,14,18,48,50,50,52,56,58,60,62,68,76,82,86,88,94,94},new int[]{-96,-92,-86,-82,-82,-80,-80,-78,-76,-74,-72,-62,-62,-56,-56,-50,-40,-30,-28,-18,-18,-12,-10,0,4,10,12,12,16,18,18,18,22,30,34,42,68,74,82,86,86,90,90,90,92,92,94,94},new int[]{-92,-90,-88,-82,-82,-80,-74,-70,-66,-60,-58,-54,-48,-44,-40,-38,-32,-30,-26,-4,2,2,10,16,18,26,30,32,32,54,56,56,58,60,62,64,64,66,72,76,78,78,78,80,80,82,86,92},new int[]{-82,-82,-76,-74,-70,-66,-62,-62,-56,-54,-46,-46,-42,-36,-32,-30,-30,-26,-24,-22,-20,-10,-8,4,8,14,20,22,26,36,38,46,46,46,50,50,52,54,54,58,68,76,80,84,86,86,90,98},new int[]{-98,-92,-92,-82,-78,-76,-62,-56,-54,-50,-50,-48,-48,-46,-44,-44,-34,-26,-24,-20,-16,-2,16,16,22,28,28,30,36,36,38,38,40,42,42,44,50,56,56,60,62,74,78,90,92,94,96,98},new int[]{-96,-92,-92,-86,-84,-74,-56,-54,-50,-42,-38,-36,-30,-28,-24,-22,-14,-10,-10,-10,-8,-8,0,4,8,8,10,18,24,24,30,30,34,38,38,42,44,44,50,54,54,66,72,74,78,84,92,98},new int[]{-90,-88,-80,-70,-56,-56,-54,-54,-50,-44,-44,-42,-40,-38,-26,-22,-22,-16,-14,-8,0,2,18,20,34,36,36,40,42,44,46,46,48,54,54,54,56,68,68,72,72,72,76,84,86,90,92,96},new int[]{-98,-96,-94,-86,-82,-76,-76,-70,-70,-68,-64,-48,-38,-38,-36,-28,-28,-26,-20,-18,-6,-2,-2,2,4,6,8,8,12,12,14,16,26,30,30,34,44,44,48,48,56,72,80,80,84,84,92,94},new int[]{-90,-88,-84,-74,-74,-72,-70,-70,-68,-68,-64,-56,-52,-50,-40,-38,-32,-28,-22,-14,-14,-12,-8,-4,-2,8,10,14,14,18,22,24,30,32,36,40,58,62,64,64,64,68,72,74,82,94,98,98},new int[]{-98,-92,-88,-80,-76,-70,-70,-66,-58,-56,-56,-40,-32,-26,-18,-6,-4,-2,0,0,0,2,2,6,18,20,26,32,46,46,48,48,48,52,66,68,68,68,70,70,82,82,84,86,92,96,96,98},new int[]{-98,-96,-92,-92,-92,-82,-72,-68,-66,-62,-46,-44,-44,-42,-38,-34,-32,-26,-26,-16,-12,-12,-10,-6,-6,-2,0,0,4,10,12,12,14,30,36,42,46,54,58,58,66,68,68,70,90,92,96,98},new int[]{-92,-86,-76,-76,-76,-72,-72,-68,-68,-58,-48,-40,-40,-36,-36,-26,-18,-14,-12,-10,-8,-8,2,8,12,16,20,24,26,30,30,34,42,42,46,56,60,62,66,72,78,78,82,82,88,90,92,92},new int[]{-92,-90,-90,-88,-84,-78,-70,-64,-60,-54,-42,-36,-34,-32,-30,-20,-14,-10,-8,-2,0,8,10,10,20,24,28,32,42,42,42,50,54,56,60,60,60,68,68,72,78,78,86,86,92,92,98,98},new int[]{-98,-98,-96,-96,-94,-90,-88,-86,-80,-78,-76,-72,-58,-52,-48,-34,-34,-28,-28,-24,-24,-18,-16,-12,-8,-8,-6,8,10,12,12,12,12,26,30,30,38,52,52,64,68,72,74,80,80,82,88,90},new int[]{-92,-90,-82,-80,-72,-66,-52,-44,-44,-42,-42,-36,-34,-32,-26,-24,-22,-20,-18,-18,-16,-16,-16,-2,2,4,8,10,16,22,24,36,38,40,46,50,56,58,64,66,74,74,84,84,88,92,96,98}});
    param0.add(new int[][]{new int[]{0,1,0,0,0,1,0,1,0,0,1,0,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1,1,1,0,0,1,1,1,1,0,0},new int[]{0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0,0,0,1,0,0,1,1,0,1},new int[]{0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,0,1,1,1,0,1,1,0,0,0,1},new int[]{1,0,1,0,0,1,1,1,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,1,1,0,1,1,1,1,1,0,1,0,0,0,0},new int[]{0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,1},new int[]{0,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,0},new int[]{0,1,1,0,0,1,1,1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,0,0,0,0,1},new int[]{1,0,0,0,0,1,1,1,1,0,1,1,0,1,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,1,0},new int[]{1,0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,1},new int[]{1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,0,0,0,1,1,0,1,0,1,1,0,0,1,0,0},new int[]{1,0,1,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0},new int[]{1,0,1,1,0,1,1,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,1,1,0,0,1,1,0,0},new int[]{0,1,1,0,0,0,1,1,1,0,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,0,1,0,0,0,0,1},new int[]{0,0,0,1,1,0,1,1,1,1,1,1,1,0,0,0,1,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,1},new int[]{0,0,0,0,0,1,0,0,0,0,1,1,1,0,1,1,1,1,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,1,0,1,1},new int[]{0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0,1,1,0,0,0,1},new int[]{1,1,1,1,0,1,1,0,0,0,1,0,1,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,1,0,1},new int[]{0,1,1,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,0,1,0,0},new int[]{1,1,0,0,1,1,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,0,0,1,1,0,1,0},new int[]{1,0,0,1,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1},new int[]{0,0,1,0,0,0,1,1,1,1,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,0},new int[]{0,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,1},new int[]{0,0,1,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,1,1,0,0,1,0,0,0,0,1},new int[]{0,1,0,0,1,1,1,1,0,0,1,0,0,0,1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,0},new int[]{1,0,1,0,1,0,1,0,1,0,0,1,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,1,1,0,1,0},new int[]{0,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,0,1,0,0,0,1,0},new int[]{1,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1},new int[]{1,1,1,0,0,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,0,1,0},new int[]{1,1,1,0,1,1,0,1,1,0,1,0,0,0,1,0,1,1,1,1,0,0,1,1,0,0,0,1,0,0,0,1,0,0,0,1,1},new int[]{0,1,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,0,0,0,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0},new int[]{0,1,1,1,0,0,1,1,1,0,1,0,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0,0,0,0,0,1,0,0,0},new int[]{1,1,1,1,0,0,1,1,0,1,1,1,1,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,0,1},new int[]{1,1,1,0,1,1,0,1,0,1,0,0,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0},new int[]{1,0,0,1,0,1,1,1,0,0,1,0,0,1,1,0,1,1,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,1,0,1},new int[]{0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1},new int[]{1,1,0,1,1,0,0,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0,1,0,1,1,0,0,1,1,1,1,1,1,0,0,0},new int[]{1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,0,0,0,1,1,0,0,0,1,0,0,0}});
    param0.add(new int[][]{new int[]{1,3,3,4,4,5,8,11,13,15,16,18,20,21,24,25,25,35,36,37,39,40,40,41,41,42,42,44,44,44,45,47,49,54,61,62,64,64,70,72,82,85,87,92,93,93,94,95},new int[]{1,2,2,3,4,5,5,6,8,8,9,11,15,16,19,20,20,22,22,25,33,36,37,39,40,41,41,44,54,60,62,65,67,68,68,70,72,77,77,78,78,79,85,86,87,88,93,99},new int[]{1,1,1,1,3,5,6,7,7,10,12,13,13,15,17,20,21,21,22,25,31,33,37,40,41,41,46,50,53,54,55,57,61,63,64,65,68,69,76,76,81,81,82,82,84,87,89,90},new int[]{1,1,1,1,4,6,19,19,19,20,21,21,22,22,23,23,25,25,26,26,29,30,34,34,35,37,48,48,50,52,59,60,62,63,64,66,68,68,75,85,88,89,91,92,94,95,97,99},new int[]{2,3,7,12,15,16,18,20,20,23,24,27,29,31,33,36,36,37,38,44,47,52,52,54,55,61,62,62,64,66,66,73,74,75,76,80,81,81,83,83,84,87,87,89,92,92,96,99},new int[]{1,4,4,5,6,8,12,12,14,16,21,24,24,27,29,34,35,39,41,44,44,46,48,50,52,52,53,56,60,62,64,67,72,77,78,80,81,83,84,84,85,88,91,93,93,94,94,95},new int[]{3,3,4,11,11,12,15,15,17,17,18,20,24,24,27,27,29,32,35,37,39,39,41,43,43,44,48,49,53,60,69,70,73,74,75,76,76,84,85,85,85,87,87,89,90,91,93,93},new int[]{1,11,11,12,15,15,16,16,17,17,18,19,20,23,27,27,31,32,32,35,37,39,39,41,43,45,47,49,49,49,56,60,61,64,67,71,73,78,79,79,81,82,83,85,87,89,92,98},new int[]{5,6,9,13,14,16,17,20,20,22,22,23,28,29,29,30,32,33,36,37,45,47,49,49,50,50,52,56,60,62,65,66,69,70,71,77,78,78,80,82,83,86,86,88,88,90,90,99},new int[]{3,11,12,13,14,14,15,19,19,20,26,27,28,31,32,32,32,35,35,39,39,42,43,49,54,55,57,58,59,60,61,62,62,65,65,67,73,74,81,82,83,86,88,88,93,95,95,97},new int[]{1,3,3,5,7,11,17,20,20,21,21,23,24,25,26,26,30,32,35,37,38,39,42,44,47,47,48,49,51,57,57,59,60,61,62,63,66,69,70,73,78,80,84,84,89,92,96,97},new int[]{1,1,2,11,12,13,15,17,19,21,22,24,27,28,28,29,30,34,39,40,40,44,45,48,57,58,58,59,61,63,63,64,66,66,68,69,70,71,74,78,79,82,84,86,89,90,94,97},new int[]{2,3,7,10,10,12,13,13,17,17,19,21,36,47,48,48,51,51,52,55,57,61,61,61,65,70,71,73,74,74,75,75,76,78,79,80,80,85,86,87,87,89,91,94,95,97,97,97},new int[]{1,2,2,8,9,9,9,14,16,17,23,24,27,29,30,30,34,35,36,43,44,44,47,49,50,54,56,57,58,63,67,68,69,70,72,76,77,80,81,84,84,86,88,90,93,96,96,96},new int[]{2,3,3,5,5,7,7,11,18,19,19,20,23,24,27,27,28,30,30,36,38,39,40,48,50,51,53,57,57,66,67,68,73,77,78,79,82,84,85,87,88,89,95,96,97,98,99,99},new int[]{3,8,10,10,12,13,13,15,16,16,17,21,21,22,23,24,26,26,27,29,32,34,35,37,42,42,52,54,61,61,65,65,66,70,73,74,76,79,83,83,85,89,91,93,94,96,97,97},new int[]{3,5,6,7,9,10,13,16,16,19,23,24,24,26,28,29,30,32,33,36,37,37,41,41,41,42,42,44,45,49,50,52,55,57,58,60,61,63,75,77,77,79,80,81,86,89,94,99},new int[]{1,10,13,14,15,17,18,20,21,22,23,25,26,28,32,37,39,44,46,47,47,47,47,50,51,52,55,55,58,61,69,72,73,77,77,78,80,81,82,84,88,91,93,94,95,96,97,98},new int[]{1,5,5,13,13,17,26,28,30,32,34,41,43,44,45,45,46,46,49,52,53,56,57,61,61,62,63,63,63,64,65,67,69,70,73,76,77,80,80,81,82,87,87,88,89,89,93,96},new int[]{5,11,12,12,18,19,19,22,24,26,26,26,30,32,33,35,35,36,38,39,42,44,46,48,52,56,57,58,59,65,65,66,67,67,68,70,73,73,75,76,77,78,80,83,84,88,92,99},new int[]{5,6,9,13,17,20,20,21,22,24,25,26,30,32,33,36,37,38,38,40,44,45,48,53,55,58,58,58,59,61,63,63,63,65,67,72,75,75,75,77,77,77,79,82,88,93,97,97},new int[]{9,13,14,16,17,18,21,22,22,23,24,25,33,37,40,41,42,46,49,49,51,54,57,58,58,60,67,71,73,74,74,75,77,78,80,82,85,85,86,86,86,87,91,92,93,95,97,98},new int[]{1,3,10,11,14,18,18,19,23,24,26,28,33,36,37,42,42,47,47,48,48,52,53,56,57,59,61,63,63,64,65,67,69,71,75,77,78,79,83,83,83,85,86,86,92,96,97,97},new int[]{3,5,6,7,7,9,13,13,18,25,27,28,29,30,32,34,37,43,44,51,52,53,54,59,63,63,64,66,68,70,70,72,72,73,77,78,80,82,83,83,84,85,85,93,95,97,99,99},new int[]{4,6,7,9,9,20,20,22,31,33,34,35,35,38,40,41,42,42,44,46,47,50,52,54,57,58,60,61,62,63,63,64,65,70,72,74,80,81,87,87,88,88,92,92,95,99,99,99},new int[]{3,5,9,10,10,15,18,20,21,21,23,25,28,29,37,38,40,40,40,46,51,53,55,57,59,59,60,67,68,71,72,73,75,76,79,79,81,83,86,87,88,90,90,90,92,95,96,98},new int[]{5,7,8,9,9,12,14,16,18,18,18,24,25,26,28,28,29,30,32,37,38,44,44,45,46,48,51,55,55,56,58,58,62,63,64,67,71,74,76,81,86,87,88,90,90,91,95,97},new int[]{4,5,13,13,16,19,19,20,22,26,27,28,30,30,31,32,33,39,39,41,41,43,45,49,50,51,64,66,67,71,73,75,78,78,79,82,84,86,87,87,88,90,91,91,92,93,96,97},new int[]{2,3,5,11,16,20,21,21,25,29,31,34,36,36,37,37,38,38,44,45,46,54,60,60,61,61,67,67,67,70,71,72,76,77,79,80,83,84,84,87,87,88,90,92,93,98,99,99},new int[]{1,2,5,5,12,13,13,15,18,19,24,25,25,26,28,29,30,33,34,35,35,36,36,37,38,42,44,49,50,53,58,58,58,60,65,67,72,75,77,78,81,84,88,88,90,91,94,97},new int[]{5,5,6,7,8,11,11,13,19,23,25,35,37,40,40,46,47,48,48,49,51,58,60,61,63,65,67,68,71,72,76,77,79,80,84,87,88,88,89,90,92,94,94,96,96,97,97,99},new int[]{1,2,3,3,5,5,13,18,19,23,31,32,34,35,36,38,39,40,42,49,51,53,54,56,62,64,64,64,66,67,67,67,69,72,74,74,80,81,83,83,84,85,91,91,94,95,96,98},new int[]{1,2,5,9,10,11,14,15,16,16,24,27,30,32,35,37,39,39,40,43,48,49,50,54,57,57,58,59,60,63,63,64,64,64,68,70,76,77,80,82,85,87,88,90,91,94,94,97},new int[]{10,14,15,17,17,18,22,22,28,29,29,32,32,34,36,36,38,39,40,42,43,45,45,45,54,54,55,55,59,63,67,68,74,75,75,77,77,79,80,86,86,87,87,87,87,88,93,96},new int[]{2,2,5,5,9,14,17,17,20,22,22,23,25,32,32,32,35,37,37,38,39,40,47,52,55,56,60,62,63,63,63,63,64,69,73,73,74,75,77,79,82,85,88,88,90,92,92,93},new int[]{3,4,4,6,8,10,12,15,16,16,17,20,21,21,24,26,27,28,28,29,30,32,38,44,49,49,50,54,59,59,61,62,64,64,65,70,70,71,72,72,73,74,75,80,83,90,92,92},new int[]{4,5,9,9,13,15,16,16,17,23,25,27,28,29,29,37,37,40,43,45,49,50,51,51,53,55,56,60,61,61,64,67,68,73,74,75,76,77,79,80,85,89,89,89,91,97,97,97},new int[]{2,5,9,10,11,11,11,15,15,16,18,20,21,22,23,24,40,41,47,47,48,48,49,51,53,53,54,55,61,63,65,68,70,73,74,74,77,78,79,80,82,83,85,85,86,87,98,99},new int[]{1,12,13,14,16,17,18,19,20,21,23,23,27,27,30,34,36,36,38,42,43,43,44,44,48,49,53,54,55,61,62,66,67,72,72,73,73,77,78,78,86,88,89,92,93,98,98,99},new int[]{1,2,4,6,9,13,13,13,17,18,20,28,28,30,32,33,37,38,42,42,44,47,50,52,53,54,56,57,59,60,66,68,70,71,72,74,76,77,79,83,83,84,85,90,94,94,97,99},new int[]{1,1,9,9,10,10,11,12,12,15,21,22,24,24,25,26,26,27,30,31,34,35,40,41,43,47,47,53,53,53,57,60,61,61,64,66,68,71,71,79,82,82,84,88,88,90,96,99},new int[]{4,4,6,6,6,6,8,9,11,11,14,16,21,25,29,37,38,40,44,45,50,51,51,53,53,56,57,58,59,59,63,69,71,72,74,76,79,80,82,83,87,93,94,96,98,98,99,99},new int[]{2,2,5,9,10,12,13,13,13,13,19,22,27,32,33,34,34,38,41,45,46,47,48,50,51,51,52,54,54,57,57,60,61,74,76,76,77,79,81,83,85,92,93,95,96,97,99,99},new int[]{4,4,4,6,7,9,14,15,16,18,19,23,27,37,38,39,40,41,41,44,45,51,52,53,54,54,56,57,58,59,60,63,65,65,69,79,85,85,88,89,90,90,93,94,95,95,95,99},new int[]{6,6,7,9,10,10,11,15,15,16,16,17,19,20,24,28,30,31,31,33,35,37,38,40,40,43,44,44,45,46,48,58,59,62,72,73,74,80,82,82,83,85,88,90,91,91,91,96},new int[]{2,2,2,2,3,4,5,12,12,15,23,23,24,24,29,35,36,38,40,41,47,47,48,49,51,54,56,57,60,62,63,64,70,75,75,76,77,80,82,83,87,90,91,91,92,93,94,94},new int[]{3,4,4,7,8,9,11,12,15,19,21,22,23,24,28,28,31,37,37,37,39,48,52,52,55,55,55,57,61,66,72,75,76,77,79,83,84,84,84,88,90,92,93,94,98,98,98,99},new int[]{2,5,7,11,13,15,27,29,29,31,35,38,41,42,44,44,46,47,49,52,52,53,53,53,54,54,55,56,58,60,61,61,63,69,72,72,77,77,79,80,84,84,86,87,90,92,92,93}});
    param0.add(new int[][]{new int[]{28,84,-76,-76,-28,-42,-78,6,40,70,48,92,-6,-34,62,34,-14,-64},new int[]{48,6,-22,44,-32,-26,-18,94,-2,-80,-20,-64,-50,-18,-28,-96,66,48},new int[]{-2,34,6,-62,-48,8,2,-50,-66,48,22,-8,10,0,50,-78,-76,-20},new int[]{-4,12,-84,76,-72,74,12,8,-66,-10,-90,-94,-82,68,-60,66,-58,60},new int[]{-34,-90,-52,26,58,-48,78,84,-34,-64,-64,-24,-34,-46,-2,0,-70,54},new int[]{4,96,36,98,-62,90,-50,52,52,-50,-34,20,-26,84,-14,-82,-72,-94},new int[]{38,12,-48,6,-18,64,-58,-22,60,-54,86,48,16,38,50,-42,24,6},new int[]{-10,-46,-32,-72,-18,48,20,-16,2,50,-78,-30,-62,76,30,52,22,-6},new int[]{-72,34,4,-36,60,-80,-66,-20,36,26,-70,94,-22,14,-80,42,94,-66},new int[]{52,-66,-68,56,-94,2,88,-8,10,98,-48,52,-38,62,44,-62,80,36},new int[]{-70,16,56,-40,-4,12,-16,-52,4,-14,-32,20,66,-94,36,-78,-74,0},new int[]{64,-62,-12,-34,-24,-94,98,30,-30,-28,-24,-22,-50,28,-74,36,40,50},new int[]{-98,44,8,96,-82,-28,-26,18,-58,-60,-98,98,18,-44,42,12,-82,30},new int[]{-28,96,-32,62,-36,32,-50,2,26,80,-10,-48,-58,64,86,2,-52,84},new int[]{-76,-78,-46,-54,-34,60,84,84,-24,10,40,-16,-42,-32,14,-94,-88,-4},new int[]{28,-74,-28,58,40,-34,52,14,10,-74,94,2,84,6,-28,-90,-50,62},new int[]{-26,-62,-30,-32,8,-8,-88,66,-98,42,-32,12,66,94,-48,-16,82,-24},new int[]{-48,98,18,68,-52,-58,20,80,-60,-88,34,-80,-76,94,-56,24,22,60}});
    param0.add(new int[][]{new int[]{0,0,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,1,1,1,1,1},new int[]{0,0,0,0,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,1,1,1,1},new int[]{0,0,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,1},new int[]{0,0,0,0,0,0,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1},new int[]{0,0,0,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,1,1,1,1,1}});
    param0.add(new int[][]{new int[]{93,9,33,88,35,75,39,77,87,25},new int[]{80,56,48,85,10,41,83,99,59,28},new int[]{41,66,51,62,30,40,40,69,62,15},new int[]{3,24,41,63,48,61,48,47,56,76},new int[]{8,78,18,84,23,69,65,46,66,80},new int[]{69,22,65,12,19,22,55,62,51,48},new int[]{17,13,28,67,5,60,15,81,44,46},new int[]{29,68,96,49,43,68,77,20,18,64},new int[]{49,42,12,89,94,79,36,8,28,86},new int[]{60,49,38,80,58,5,46,98,75,2}});
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(9);
    param1.add(4);
    param1.add(3);
    param1.add(28);
    param1.add(26);
    param1.add(44);
    param1.add(9);
    param1.add(5);
    param1.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_WEIGHT_PATH_ENDING_ELEMENT_LAST_ROW_MATRIX," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_WEIGHT_PATH_ENDING_ELEMENT_LAST_ROW_MATRIX," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}

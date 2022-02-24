public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ] [ ]> param0 = new ArrayList<>();
    param0.add(new int[][]{new int[]{2,2,3,9,9,10,12,13,17,19,26,28,28,30,30,32,32,39,40,41,42,52,52,54,54,55,56,59,62,63,69,71,72,72,72,73,77,78,80,83,83,85,87,90,90,91,93},new int[]{1,1,3,5,5,8,10,14,15,17,20,22,24,24,26,27,32,33,33,35,38,40,41,44,54,54,55,55,59,63,64,65,66,71,72,73,73,74,74,76,80,80,83,87,89,93,97},new int[]{2,2,3,3,6,9,9,10,13,15,15,17,19,22,22,22,23,24,25,27,27,29,29,35,36,37,38,41,41,52,52,54,54,61,64,65,66,70,72,73,73,74,89,89,90,97,97},new int[]{1,11,15,18,22,22,25,27,27,28,29,31,32,33,40,40,42,42,42,46,52,52,52,54,55,56,57,59,60,60,61,62,66,66,67,67,76,77,78,80,85,85,87,88,88,98,99},new int[]{1,2,3,4,6,9,10,15,15,19,20,20,28,29,34,35,36,45,47,48,54,56,57,62,64,65,66,68,69,70,75,76,77,77,77,79,79,83,87,90,90,92,95,96,96,99,99},new int[]{1,1,3,3,4,8,9,11,15,18,18,22,23,23,24,26,26,28,29,32,40,41,42,42,43,44,54,54,54,57,58,61,64,67,69,72,76,79,80,80,87,89,91,93,95,95,97},new int[]{1,1,6,11,14,14,16,17,20,20,25,28,28,30,31,31,33,35,36,37,37,40,42,43,45,45,48,49,54,55,55,60,60,62,63,65,66,72,74,80,80,82,82,84,84,93,94},new int[]{4,5,8,10,10,14,20,21,21,23,23,23,25,27,33,36,37,40,45,48,50,52,56,57,63,67,68,69,72,77,77,82,82,83,83,84,85,86,87,88,92,93,95,96,97,97,97},new int[]{1,7,7,9,13,13,18,19,21,28,28,31,37,39,41,43,44,45,48,48,49,50,51,52,58,62,63,64,64,68,70,73,74,79,80,81,85,88,90,91,93,93,94,94,95,98,98},new int[]{3,8,9,12,13,15,15,18,19,21,23,24,29,30,34,38,39,40,42,45,47,50,54,55,57,57,58,64,65,65,67,67,67,68,69,71,72,72,75,79,80,81,81,83,85,91,93},new int[]{3,3,5,5,6,11,23,24,25,27,29,31,35,35,38,40,43,44,45,46,50,54,54,55,57,57,58,62,65,69,70,70,74,78,78,78,79,79,80,84,87,90,90,92,94,98,99},new int[]{9,14,17,17,21,22,24,25,27,31,31,32,36,37,43,46,46,48,49,50,50,54,59,60,63,63,66,68,71,72,74,76,76,77,77,79,82,83,84,85,86,87,89,89,91,92,94},new int[]{2,3,8,10,10,11,16,19,19,21,21,23,27,28,34,36,40,41,46,46,46,48,52,52,52,53,60,63,64,66,67,67,71,71,72,74,77,80,83,84,86,88,88,88,89,89,89},new int[]{6,9,11,12,12,14,15,16,21,29,29,30,30,32,34,35,43,43,44,45,51,51,52,54,57,58,59,64,65,67,69,70,70,72,75,76,79,82,86,86,88,90,92,93,98,98,98},new int[]{1,2,3,8,9,13,15,16,17,17,17,19,22,25,32,36,44,44,45,46,48,54,55,58,66,68,72,72,73,74,78,79,80,80,82,89,89,89,90,91,91,93,93,97,97,98,99},new int[]{3,5,9,9,14,14,16,16,18,21,22,26,26,35,35,37,42,42,44,46,47,48,49,50,54,56,58,59,61,65,66,66,66,66,70,79,79,80,83,87,88,92,96,97,98,99,99},new int[]{4,7,9,10,10,12,16,20,22,24,26,28,33,34,34,36,37,37,39,43,45,45,46,51,52,53,54,55,55,56,56,57,59,63,65,69,70,70,70,73,74,77,82,85,92,97,98},new int[]{1,1,2,3,3,3,4,7,12,14,18,19,21,25,30,31,37,38,39,39,41,41,44,44,45,49,52,53,55,57,59,59,70,74,75,78,78,83,87,89,90,91,93,97,97,98,98},new int[]{4,6,6,9,12,15,21,22,23,26,29,30,33,40,41,41,42,43,44,46,47,50,53,56,60,61,61,62,62,62,64,66,71,75,77,77,84,85,85,85,85,89,90,90,91,97,98},new int[]{1,5,13,14,17,17,17,19,21,22,23,23,24,25,25,28,32,32,33,37,38,38,39,44,45,46,47,59,60,63,70,72,72,74,75,75,77,78,80,80,82,84,85,91,92,99,99},new int[]{4,5,9,14,17,19,21,25,25,27,29,29,30,30,32,42,42,44,44,44,45,46,51,54,57,57,61,69,69,72,73,74,75,77,78,80,81,82,89,91,91,93,96,96,97,98,99},new int[]{1,2,7,8,9,11,12,12,15,17,17,21,26,28,30,31,33,35,36,41,41,44,44,45,47,48,49,50,52,53,53,56,67,71,71,72,74,75,78,83,85,86,86,88,89,95,99},new int[]{2,4,5,13,17,18,21,22,24,26,27,28,29,31,32,34,35,36,38,38,39,41,43,43,52,52,54,62,69,70,71,71,72,73,77,77,78,81,82,82,84,86,89,91,93,94,95},new int[]{3,3,3,5,5,10,20,21,23,24,30,32,33,35,39,40,43,43,44,45,48,48,49,52,55,56,56,57,57,59,64,65,67,68,68,72,73,80,81,81,82,82,85,88,89,93,98},new int[]{3,6,6,11,12,12,13,21,21,23,25,31,31,33,36,37,41,43,44,46,50,53,56,57,57,57,58,59,62,66,71,73,74,78,78,78,79,80,89,92,92,94,96,96,97,97,97},new int[]{3,5,12,15,23,24,25,29,32,34,34,36,36,40,44,46,46,47,48,48,48,49,50,56,59,60,62,62,66,67,70,73,76,77,80,81,82,83,83,86,87,88,90,91,92,98,99},new int[]{9,11,13,19,20,21,23,26,29,29,30,35,38,38,42,43,47,50,52,53,54,55,56,57,57,58,61,62,63,65,67,69,72,72,72,76,79,82,85,86,86,87,88,89,90,90,99},new int[]{5,7,11,15,16,20,21,24,24,26,30,31,33,34,35,39,43,44,45,45,46,48,49,50,57,58,59,61,62,62,64,65,66,66,67,72,78,80,84,84,84,84,89,91,92,96,97},new int[]{2,6,7,9,10,14,14,16,21,22,24,27,30,32,32,33,35,35,37,40,43,47,55,56,59,65,67,68,68,69,70,71,73,74,75,76,78,79,79,82,86,88,90,93,94,97,99},new int[]{3,3,4,4,5,8,11,13,14,14,17,19,19,20,20,21,22,22,29,40,41,42,42,46,48,48,51,58,68,69,70,71,74,79,81,82,84,87,89,90,90,92,94,95,96,97,98},new int[]{1,1,2,2,5,6,7,7,9,11,13,16,18,25,26,27,31,32,33,35,35,35,38,39,40,55,58,58,60,61,62,63,64,68,70,72,72,74,75,76,81,82,84,90,97,97,99},new int[]{2,2,3,3,6,8,8,10,12,13,13,15,15,16,16,18,21,22,31,40,41,43,48,48,49,50,51,52,53,57,61,61,63,67,67,69,75,76,77,79,81,84,85,89,90,91,97},new int[]{5,5,6,7,9,16,18,19,19,20,22,23,23,24,25,27,27,28,32,34,34,34,37,37,38,43,52,53,54,55,59,62,63,64,65,70,74,77,78,78,79,81,83,83,88,93,97},new int[]{1,3,4,6,9,11,13,13,15,18,19,20,20,23,23,25,28,28,35,35,37,39,42,44,49,52,53,53,53,60,60,61,62,63,64,64,65,65,65,65,65,67,67,71,72,81,83},new int[]{3,5,6,8,8,14,15,20,21,22,26,26,28,29,32,35,36,37,38,42,44,49,50,51,56,57,59,62,65,67,68,68,70,73,73,75,79,84,89,90,90,91,95,97,98,99,99},new int[]{2,2,7,9,9,10,12,14,15,15,22,22,23,23,24,24,27,28,29,29,29,35,35,43,45,52,55,57,66,67,67,68,71,75,76,79,80,81,90,91,91,94,94,95,96,96,99},new int[]{1,2,2,4,11,12,12,13,17,20,22,22,25,27,29,37,41,42,43,43,45,47,53,54,54,54,55,55,59,60,63,66,66,66,81,82,82,82,84,85,85,86,93,94,94,94,96},new int[]{3,5,5,6,17,19,21,22,24,24,29,32,32,36,38,40,40,41,48,49,50,53,54,54,55,56,58,59,59,61,70,71,74,74,77,78,81,83,83,84,85,86,87,88,90,95,96},new int[]{1,2,3,4,6,9,10,12,14,15,15,15,18,22,23,23,24,25,27,32,34,35,37,38,40,41,42,43,44,46,46,49,53,54,54,55,55,55,60,78,83,86,86,87,91,93,98},new int[]{2,2,9,10,11,14,17,18,19,23,23,31,31,31,35,36,36,38,39,41,43,43,44,50,53,54,60,61,61,64,64,67,71,72,72,72,78,79,80,81,83,84,87,88,92,93,99},new int[]{3,5,7,7,12,12,12,18,19,20,20,21,24,25,26,26,28,32,36,39,39,41,53,54,54,55,59,60,62,64,64,64,64,65,67,68,79,81,87,88,96,97,97,97,98,99,99},new int[]{4,7,17,19,20,29,32,33,34,34,35,37,37,39,43,44,47,51,53,53,55,56,56,57,60,60,62,63,63,66,68,68,70,72,73,74,79,81,82,85,89,91,92,93,95,96,97},new int[]{3,3,3,6,10,13,14,14,16,17,18,18,18,19,28,31,33,34,35,44,44,45,48,51,59,59,60,62,65,66,67,70,71,73,73,73,77,78,82,86,86,88,88,89,90,93,93},new int[]{5,10,12,15,16,18,18,18,19,22,26,27,27,28,29,31,36,36,39,41,45,46,46,47,49,51,51,52,52,55,64,68,69,71,72,74,74,74,87,87,89,90,93,96,96,98,99},new int[]{3,16,17,19,19,25,25,31,32,33,35,36,39,42,42,44,45,46,59,61,62,63,64,65,65,66,67,68,68,69,70,73,75,76,76,78,86,88,88,88,89,91,93,95,98,99,99},new int[]{1,5,6,8,13,14,14,14,15,16,16,19,19,19,20,22,24,24,25,30,34,35,36,37,38,38,39,42,44,46,49,52,56,57,58,62,77,78,82,85,85,86,87,93,95,98,99},new int[]{4,4,5,5,7,11,12,12,14,20,21,25,26,26,28,30,31,33,34,36,37,43,44,45,49,51,53,56,57,59,62,62,63,63,66,66,66,72,78,79,84,85,88,92,94,97,98}});
    param0.add(new int[][]{new int[]{94,-54,58,36,-2,56,-90,-44,-18,68,26,-60,60,52,-30,8,98,-80,-88,-30,-92,-34,-68,-74,-86,-4,-72,-84,24,50,-70,72,60,86,-48,38,16,42},new int[]{30,8,-64,92,-28,92,-28,-54,74,16,60,58,60,6,-30,88,66,-80,86,-70,-30,-74,42,-10,54,-36,-18,70,38,-58,50,68,22,26,24,46,56,-78},new int[]{-74,78,46,-10,50,88,82,-2,90,54,36,22,96,-50,38,86,-90,36,-6,54,-72,42,-54,98,-74,-70,0,-14,-94,20,-8,-22,-98,-90,64,14,42,-28},new int[]{-96,62,54,-98,-80,32,-92,-18,-90,88,50,-98,-24,-32,46,66,-10,34,52,24,0,82,-92,34,-40,-10,78,-20,-96,46,-56,48,-58,24,28,-34,66,-80},new int[]{-86,-24,-84,80,84,-36,56,-28,-88,36,68,20,16,-86,-24,88,-88,-28,-56,44,14,-66,90,-64,14,6,82,20,36,66,-50,52,-20,-40,-76,26,-12,-50},new int[]{-18,-78,-46,46,58,78,46,54,46,56,-80,70,42,78,-96,-76,-78,38,-8,14,28,-42,52,72,42,-96,16,96,-8,40,-42,-40,84,38,-28,-38,-34,-98},new int[]{-62,62,86,-84,-20,24,-98,46,84,20,-92,-20,-28,-38,44,12,48,34,46,-80,-38,-36,96,96,64,-72,-92,96,98,-84,4,74,14,-20,66,-14,-22,72},new int[]{16,-60,68,44,82,38,-70,86,-22,72,-10,48,52,66,74,74,-50,94,-32,-98,-76,14,-16,-98,-52,-74,10,-98,60,94,82,32,-56,-44,-84,-62,70,-90},new int[]{28,80,-60,-88,-4,68,-36,2,-28,-6,16,20,0,84,50,6,-72,-68,14,-80,-82,-26,-16,-40,22,-18,24,-90,-6,-42,-80,-54,62,-54,-66,32,-34,-24},new int[]{-60,-26,-18,80,-84,-24,-12,78,-8,22,68,62,-10,40,96,30,-38,46,-84,-84,4,-34,8,-18,-32,-68,98,6,-44,50,62,-56,20,-18,-40,-54,-56,56},new int[]{8,16,82,-82,-64,-10,-96,-56,18,24,46,86,48,36,66,84,4,18,-74,68,24,-94,68,54,44,-80,88,-48,-72,16,-90,80,-72,-82,-34,74,38,-92},new int[]{64,-88,-44,-88,2,26,-34,-82,-14,96,34,94,2,-64,38,-90,-44,62,40,-62,14,-56,4,-42,-32,62,-36,-78,58,-86,74,4,-50,-26,22,-16,58,84},new int[]{80,-2,-40,-32,-42,-58,-96,58,-54,22,34,-84,-20,84,76,98,18,-44,2,14,10,-26,92,0,32,-54,24,78,-86,48,0,24,-20,-54,32,-44,-78,-28},new int[]{56,40,66,-26,48,30,-72,60,-38,34,-40,42,-16,24,-54,-44,70,-62,-2,12,-62,78,22,56,32,12,2,-48,24,74,-42,48,62,90,74,-84,74,8},new int[]{20,-58,-40,-92,10,26,12,-66,76,96,50,-42,26,68,50,-90,86,78,-10,38,48,-62,30,40,-66,86,-74,12,-20,46,24,-98,-62,56,-40,-46,-60,30},new int[]{44,62,-48,-78,-32,90,-14,-74,98,-50,10,-54,-96,-14,-76,40,16,-44,24,-70,-84,96,62,64,56,60,30,-70,-32,14,-92,66,-94,94,24,74,-62,-54},new int[]{54,44,-8,-36,-68,-80,76,-58,-4,-64,4,96,26,-10,-28,20,-12,-62,-64,-38,-74,-24,-46,26,-88,46,-34,-2,0,-10,58,-76,-16,-50,84,-88,-94,34},new int[]{-72,80,-96,26,32,-68,-2,88,-98,10,96,2,-50,50,-2,76,-24,6,50,50,-24,-46,10,74,-70,-90,82,56,16,-24,66,80,96,90,-80,-66,48,-36},new int[]{38,22,88,14,-54,36,-86,80,2,54,34,84,-96,-84,38,26,96,-14,60,46,26,74,-8,-78,-6,-24,4,34,-80,14,62,28,-56,-62,32,-96,14,-32},new int[]{-60,80,98,54,-68,-16,-92,48,-66,-42,-94,-24,-28,-84,-78,74,34,-14,-92,78,26,-52,-78,88,-84,94,-20,-34,6,64,40,-44,-44,-88,54,-16,28,24},new int[]{-76,-26,-80,-72,76,88,36,66,12,28,64,8,-92,42,52,-14,-44,-96,20,-6,26,-64,34,0,12,16,64,-68,-86,94,-80,-22,-8,60,-32,-76,-66,44},new int[]{-46,58,-78,-62,60,-54,-34,88,76,4,32,32,-4,-76,-32,-20,90,-78,-64,44,42,38,-66,-46,36,-96,-42,58,-24,-36,-34,-64,30,40,26,-32,-42,20},new int[]{-52,-82,-76,-94,-82,-94,-46,-46,40,58,-96,86,-18,-2,-36,-74,-78,88,86,24,-6,44,-30,-96,78,-62,-64,-72,66,-28,68,96,-24,24,-98,26,26,-6},new int[]{88,90,0,38,52,-50,-94,-50,-64,-66,40,82,-64,-40,72,-50,86,92,48,-72,-12,6,42,70,-80,86,-6,-76,-64,-56,80,-14,70,-58,96,-36,84,-76},new int[]{-22,-40,4,66,-4,10,0,18,-16,-78,-18,10,52,-20,74,4,34,-80,62,-92,-58,24,-44,-52,20,6,70,90,88,40,60,42,-44,42,-18,30,-22,48},new int[]{30,86,-78,-22,52,90,-74,-68,50,-14,-78,30,84,-60,-24,40,-80,-56,40,34,42,-16,-50,-18,-78,14,40,52,-86,24,88,-62,-94,16,96,86,-56,74},new int[]{-38,42,-42,78,26,48,86,-68,2,-54,-50,2,46,-54,-46,74,48,-66,20,-32,-20,72,-36,96,98,24,-70,66,-72,-68,76,68,-82,68,60,-76,-92,42},new int[]{-12,-14,42,-96,14,52,6,-18,62,58,16,2,34,28,20,-72,-66,82,-80,-92,-12,-4,-94,30,68,64,96,-54,66,-30,-22,-60,-32,32,52,2,90,-26},new int[]{-70,78,24,-34,-20,-14,54,24,-48,48,-2,-96,92,-8,60,-4,-40,30,4,64,-32,-58,-96,-34,-24,-80,-12,38,-4,-26,-82,30,6,-96,50,-56,10,-12},new int[]{36,-42,-50,36,-60,-18,-12,28,-56,26,-64,56,44,90,66,-24,-32,10,-48,-82,-8,6,-64,-98,88,84,-8,-54,-36,-76,-60,-70,-54,-96,10,54,-76,4},new int[]{94,22,-86,-60,88,26,12,10,-96,66,-48,42,-40,-60,-70,-36,-70,-78,20,-96,-58,-46,-84,-28,64,-58,94,64,-16,74,34,22,0,-86,-64,-6,-2,26},new int[]{56,-78,-34,4,-66,4,12,-8,46,94,50,76,-82,0,32,70,70,-16,66,20,-22,84,8,88,-84,36,22,68,76,-2,62,66,-52,90,-34,-12,-12,46},new int[]{-98,-50,60,-96,44,84,4,-12,-4,-80,-12,-42,76,-62,66,-14,50,84,-48,72,88,20,72,96,90,46,90,-40,32,-90,84,-34,-92,-18,-58,18,26,-42},new int[]{-2,-22,54,68,52,-18,-42,-90,-58,-48,-66,-94,6,-56,-4,88,22,-58,-6,-80,48,-16,78,-96,-6,-66,24,-92,-40,-62,-90,-92,-66,-40,8,-32,6,-50},new int[]{94,-2,10,-30,8,-30,-84,-12,-22,-2,-26,-60,-60,22,-38,82,18,50,78,-48,0,52,-78,66,10,26,68,-48,-44,20,64,78,80,76,-44,-52,-48,18},new int[]{34,16,58,44,-46,90,-76,-78,16,80,-32,62,-54,-14,76,-22,2,36,68,28,52,-74,84,22,84,-30,-60,66,92,-86,-40,74,-60,-14,58,-52,36,78},new int[]{-84,-92,34,24,76,90,44,22,18,-84,90,62,82,-22,18,-42,12,-14,-86,-78,-24,-30,92,20,32,54,-24,26,24,-80,-84,76,44,74,56,56,40,-58},new int[]{-40,96,20,48,4,-74,72,58,62,-10,22,36,-82,4,-12,-92,2,-80,-54,50,-64,36,-40,-82,-2,-18,8,-18,-52,94,-30,66,-42,-62,-72,44,12,54}});
    param0.add(new int[][]{new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1}});
    param0.add(new int[][]{new int[]{88,92,80,80,15,85,46,62,7,8,47,50,1,6,55,63,19,14,52,10,56,26,80,55,22,99,23,36},new int[]{38,72,34,22,11,19,4,66,32,79,66,90,70,34,45,84,88,37,81,6,46,45,94,95,55,44,75,36},new int[]{41,26,10,97,4,30,79,82,98,41,93,36,60,37,36,56,26,72,70,25,82,2,64,89,83,38,80,47},new int[]{56,31,40,37,97,27,41,60,7,75,84,5,96,49,71,63,40,21,47,2,47,1,31,63,27,12,89,41},new int[]{84,79,99,26,28,96,42,61,17,78,75,40,95,45,16,93,64,3,76,15,2,26,27,71,89,47,78,91},new int[]{25,94,20,71,77,11,76,16,98,26,53,36,83,79,23,25,55,40,82,34,3,92,34,61,70,37,95,61},new int[]{14,55,54,38,63,31,54,36,9,1,46,80,54,19,62,54,26,66,79,18,27,30,1,39,85,68,16,32},new int[]{64,96,46,25,90,24,80,45,52,11,39,89,17,83,96,89,70,30,43,41,53,74,55,19,55,35,5,75},new int[]{66,99,36,49,5,1,26,37,7,82,75,83,8,99,6,49,86,72,41,20,78,58,2,56,8,20,99,62},new int[]{74,59,71,97,95,8,71,12,90,23,74,42,6,61,58,16,98,37,8,29,84,59,96,87,2,12,37,59},new int[]{41,65,76,35,52,81,4,50,72,59,42,59,21,47,20,28,85,61,35,44,98,28,49,13,35,9,15,32},new int[]{42,78,59,33,14,7,83,6,52,69,69,68,71,10,56,67,55,67,67,71,53,10,97,65,30,53,6,62},new int[]{43,75,45,42,7,19,80,69,77,20,28,47,23,54,45,22,83,89,72,8,54,79,46,23,36,29,62,17},new int[]{80,83,73,86,10,71,53,83,28,8,54,20,9,63,27,95,18,17,20,9,45,18,85,38,23,5,45,77},new int[]{20,4,82,22,95,45,38,39,32,29,71,82,94,39,83,1,87,52,2,98,38,44,77,17,5,62,66,85},new int[]{49,82,28,41,68,56,38,17,49,92,20,88,68,51,53,20,18,61,61,15,22,62,40,16,96,81,11,48},new int[]{14,7,17,46,72,54,59,23,17,87,93,57,30,88,50,96,47,60,43,60,38,15,31,24,70,19,71,6},new int[]{35,3,6,22,21,79,81,63,9,13,93,24,37,94,66,30,17,31,30,78,26,58,50,28,94,22,59,76},new int[]{15,24,7,76,50,31,9,81,3,2,32,52,24,42,27,99,25,35,98,85,8,36,16,17,44,54,8,21},new int[]{2,62,26,20,54,50,32,5,68,90,11,7,99,16,19,75,18,22,78,71,35,72,81,32,99,97,59,32},new int[]{30,2,93,99,99,93,57,9,20,54,54,72,67,7,10,39,16,50,58,1,23,36,93,73,91,40,76,35},new int[]{26,85,67,49,9,35,41,92,61,31,54,10,90,73,29,74,23,88,18,86,42,77,74,46,43,5,75,58},new int[]{99,45,58,32,65,47,77,6,14,51,67,70,64,96,61,75,91,39,65,50,27,88,84,91,71,78,87,75},new int[]{57,46,59,33,9,79,36,94,15,81,56,58,84,46,61,92,66,32,73,90,42,86,39,45,47,79,99,92},new int[]{9,62,49,98,19,10,50,41,99,12,22,61,32,75,46,83,57,98,92,86,65,38,23,39,26,45,68,12},new int[]{86,39,13,21,41,90,64,53,81,25,76,15,18,69,9,16,51,1,70,11,90,65,46,62,7,24,98,63},new int[]{30,1,38,95,83,32,71,46,6,66,81,74,29,82,54,86,90,6,62,13,30,55,77,72,29,4,92,96},new int[]{72,71,55,66,3,83,41,61,7,75,30,85,59,18,27,94,41,15,42,99,54,93,24,70,35,71,80,55}});
    param0.add(new int[][]{new int[]{-84,-66,26,44,52},new int[]{-92,2,12,30,36},new int[]{-82,-62,30,46,82},new int[]{-10,36,66,68,96},new int[]{4,14,38,64,68}});
    param0.add(new int[][]{new int[]{0,0,1,0,1,0,0,0,0,1,0,1,0,0,0,1,1,1,0,0,0},new int[]{1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,0,1,0},new int[]{0,1,1,0,0,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1},new int[]{1,1,0,0,1,0,1,1,1,0,1,0,0,0,1,1,1,0,0,1,1},new int[]{0,1,1,0,1,1,0,1,1,0,0,0,0,1,0,1,0,0,0,0,0},new int[]{0,1,0,0,1,0,0,1,0,0,1,0,1,1,0,0,0,1,1,1,0},new int[]{0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0},new int[]{0,0,0,1,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,1,0},new int[]{0,1,0,0,1,0,1,0,1,0,1,1,0,1,1,1,1,1,0,1,0},new int[]{0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,1},new int[]{0,0,0,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1,0,1},new int[]{1,1,0,1,1,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,1},new int[]{0,0,0,0,0,0,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1},new int[]{0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1},new int[]{0,1,1,1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,1},new int[]{1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,0,1},new int[]{1,0,1,0,1,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,1},new int[]{1,1,0,1,0,0,1,1,0,1,0,0,0,1,0,0,0,0,1,1,0},new int[]{1,1,0,0,0,1,0,1,1,0,1,0,0,0,1,0,0,1,0,0,1},new int[]{1,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,0,1,1,1,0},new int[]{0,1,0,1,1,1,1,1,1,0,0,1,0,0,1,0,1,0,1,0,1}});
    param0.add(new int[][]{new int[]{2,8,11,12,12,15,17,24,26,32,38,39,41,44,45,48,52,55,56,57,59,62,63,71,72,77,81,82,83,85,89,92,92,92},new int[]{11,11,12,14,21,25,35,41,42,43,49,50,51,52,55,55,55,55,55,56,60,64,70,70,71,73,78,78,78,82,86,90,93,98},new int[]{1,2,9,9,16,19,19,20,21,23,28,29,30,35,35,42,51,53,54,58,60,64,66,70,73,74,77,79,81,88,94,95,97,97},new int[]{2,7,8,13,15,23,29,40,43,49,51,51,52,60,61,62,63,64,64,65,69,72,76,78,81,84,87,87,88,89,95,95,95,99},new int[]{3,3,7,8,9,17,17,18,18,23,23,36,40,45,47,50,52,53,54,58,60,60,75,76,77,77,83,83,87,88,88,91,93,97},new int[]{7,8,9,11,12,35,36,39,39,47,51,52,55,55,59,61,62,65,65,66,67,69,73,73,80,81,81,85,87,89,89,93,99,99},new int[]{1,2,2,4,4,7,13,16,18,21,22,23,26,27,35,37,37,41,44,45,51,51,54,56,57,59,66,71,78,78,79,82,83,95},new int[]{5,5,6,8,10,10,13,18,19,22,30,33,36,43,44,48,49,59,60,63,66,67,72,72,75,77,79,81,81,84,85,90,91,92},new int[]{7,7,15,17,19,20,20,23,25,26,33,36,38,38,44,46,48,49,59,60,63,64,68,68,74,74,76,79,79,90,91,93,96,98},new int[]{3,4,8,17,19,29,30,35,37,39,40,45,45,51,57,57,58,62,63,63,69,71,77,78,79,81,83,84,91,94,94,95,97,97},new int[]{5,10,13,13,15,20,21,26,28,35,39,40,42,44,47,48,48,49,55,56,60,61,67,75,76,78,79,82,84,84,85,87,90,91},new int[]{1,3,7,13,16,19,23,25,28,28,29,30,34,40,41,44,45,47,49,50,57,60,66,66,78,78,79,79,81,83,84,85,95,99},new int[]{8,10,14,15,15,15,16,19,21,21,21,22,26,29,30,31,44,44,47,58,62,63,68,76,78,78,81,84,86,90,90,91,96,98},new int[]{2,4,10,14,15,15,28,31,33,36,36,42,44,46,49,49,50,51,55,57,57,60,62,65,69,72,81,82,86,89,91,95,97,97},new int[]{1,2,6,7,16,24,24,24,28,30,41,46,47,47,49,49,50,60,61,64,66,66,67,70,70,74,75,78,80,81,83,90,91,97},new int[]{3,10,16,18,22,22,22,24,33,34,39,40,46,47,49,51,52,59,60,61,62,62,64,65,68,72,73,79,80,84,86,87,92,95},new int[]{9,11,12,16,22,25,25,29,32,34,39,39,39,39,41,42,48,49,52,55,58,62,69,69,76,82,82,84,86,87,90,91,92,97},new int[]{2,4,6,8,8,9,15,17,20,20,22,26,27,29,29,32,32,34,35,36,37,38,40,40,52,56,64,64,70,71,73,88,88,94},new int[]{1,7,11,12,12,13,14,15,20,25,29,32,34,38,41,43,50,57,59,64,65,69,71,72,74,77,78,82,84,85,91,91,92,96},new int[]{2,2,4,6,11,14,17,20,21,21,29,30,31,32,34,39,40,40,48,50,50,55,57,64,66,72,74,79,79,84,86,88,93,99},new int[]{1,2,2,10,16,25,26,26,29,29,31,33,34,36,41,42,44,47,53,53,54,59,61,62,70,72,73,75,78,79,82,84,87,99},new int[]{9,9,11,13,20,23,25,30,31,37,37,39,42,43,45,48,50,55,56,58,65,66,72,75,82,82,88,88,89,91,91,93,94,96},new int[]{1,5,5,8,9,13,15,17,18,21,21,24,25,27,34,43,44,45,46,50,54,55,60,67,68,71,76,78,81,82,84,87,97,99},new int[]{1,3,3,5,14,23,23,25,28,29,32,36,40,41,43,49,50,53,53,53,54,64,72,76,78,80,81,81,87,87,87,91,93,94},new int[]{2,10,10,12,13,15,15,16,17,21,23,27,28,32,37,37,41,43,45,46,48,51,52,56,57,69,70,74,78,80,83,86,89,95},new int[]{4,4,7,7,8,10,11,14,14,17,19,26,30,36,40,51,60,62,68,69,71,73,74,80,80,82,84,85,86,86,86,88,92,97},new int[]{2,3,6,8,10,11,11,13,16,18,19,21,23,23,26,27,28,35,37,37,42,50,53,54,55,58,61,68,73,81,85,86,97,99},new int[]{6,7,14,17,19,20,21,22,23,24,26,30,32,36,37,38,39,42,45,57,61,66,67,67,69,81,84,84,85,90,94,95,97,99},new int[]{1,2,9,10,12,13,13,13,14,15,16,16,16,17,21,27,27,33,35,35,36,41,44,46,46,47,48,51,61,66,73,76,93,95},new int[]{1,6,8,14,14,19,22,25,30,36,40,45,52,61,63,67,68,70,70,73,73,75,75,77,79,81,85,86,89,90,93,94,96,97},new int[]{12,14,18,22,24,25,26,26,27,29,32,34,38,38,40,54,55,56,58,60,70,74,76,77,78,78,81,83,84,84,86,91,95,98},new int[]{2,4,9,17,23,24,33,36,36,37,37,39,43,43,44,51,52,56,58,59,60,64,65,68,68,69,77,78,78,79,88,94,98,99},new int[]{2,2,5,5,6,13,17,19,19,23,33,36,45,45,46,51,53,62,66,69,74,77,77,78,78,79,81,86,87,93,94,96,96,99},new int[]{2,5,5,6,7,10,11,15,16,29,30,31,31,36,37,41,41,48,49,49,52,53,55,56,60,61,63,81,84,92,95,97,98,99}});
    param0.add(new int[][]{new int[]{-12,46,-32,-10,74,98,-60,-54,8,90,78,84,-42,-36,-4,-72},new int[]{-10,-52,-22,84,-28,-90,-82,88,4,76,22,26,-38,6,94,10},new int[]{52,0,52,-34,-52,-40,30,62,64,-66,-22,-34,46,-86,82,58},new int[]{-38,-36,-84,72,-88,42,66,-60,-4,86,-42,30,36,-98,-44,58},new int[]{-34,16,-36,80,26,60,94,48,16,-10,4,68,-20,-76,84,-76},new int[]{-22,86,-98,-82,78,82,48,26,0,-30,54,-92,64,68,78,50},new int[]{-58,66,-14,-42,-38,-86,-70,-14,-54,44,82,54,-92,-58,-64,32},new int[]{18,50,6,-22,36,12,12,20,-6,-68,82,38,-8,-4,-22,16},new int[]{-16,90,-94,-62,26,32,-70,26,-8,-90,64,-80,42,-10,-22,82},new int[]{-94,54,28,38,86,-50,-96,10,48,16,46,4,-78,-54,4,-28},new int[]{64,56,0,-58,-22,62,96,-20,0,-26,16,-90,-84,8,80,60},new int[]{38,98,-18,-74,-24,-94,34,-68,-68,72,-74,60,62,76,86,86},new int[]{-58,-40,-70,90,94,-66,-52,54,-46,-80,32,-40,-20,50,48,-96},new int[]{74,2,-22,-28,42,-44,-58,36,-60,26,-86,-74,26,-96,-14,-60},new int[]{-90,8,-72,52,-94,22,90,-42,-22,-68,-86,-10,-12,-60,12,42},new int[]{26,-18,-68,-30,18,68,98,76,-2,28,4,-16,-92,82,-94,-58}});
    param0.add(new int[][]{new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}});
    param0.add(new int[][]{new int[]{39,26,40,73,91,43,76,46,5,71,28,22,71,56,55,25,59,76,19,83,62,32,63,92,44,70,86,77,33,66,58,84,91,32,47,71,71,32,62,62,60,17,12,38,15},new int[]{2,23,60,30,49,2,6,37,52,78,18,59,66,91,78,84,96,74,10,49,95,52,40,92,47,71,31,16,59,44,28,34,40,89,30,84,40,58,51,59,20,45,86,19,48},new int[]{49,19,56,96,95,28,79,26,61,56,51,1,51,55,48,30,12,75,74,3,80,56,57,69,99,60,2,44,82,34,39,91,70,27,55,59,19,78,86,16,15,72,55,36,74},new int[]{59,23,88,66,35,26,35,21,28,1,94,53,11,98,75,20,73,36,97,71,59,53,98,41,48,29,33,83,79,44,60,47,50,16,70,95,34,52,18,58,45,94,15,79,10},new int[]{19,63,40,53,26,74,28,90,96,56,72,39,39,48,42,32,46,88,2,75,9,5,92,91,89,1,83,23,51,12,92,84,10,20,3,90,34,49,74,43,55,15,76,45,58},new int[]{59,70,73,46,39,54,85,4,75,95,12,61,88,43,91,75,4,89,41,73,30,37,4,75,63,41,68,7,93,67,84,54,43,7,97,17,93,95,96,41,64,46,31,72,24},new int[]{78,44,67,42,78,24,45,68,31,27,87,33,78,49,64,5,89,31,84,42,86,54,10,75,9,59,8,93,26,16,62,73,20,14,70,83,50,92,77,37,55,45,84,55,94},new int[]{59,6,36,64,29,50,28,15,62,47,88,9,97,95,29,46,75,15,9,91,59,29,99,73,47,25,15,52,47,57,40,28,43,10,70,1,53,75,4,28,88,2,9,35,15},new int[]{99,46,92,14,32,99,15,98,93,23,6,91,91,44,46,42,83,51,20,67,71,5,46,20,19,4,43,34,80,13,79,20,31,25,86,79,75,10,24,6,29,81,95,4,74},new int[]{85,36,57,3,80,45,55,61,94,78,88,54,78,97,13,95,89,36,33,40,4,96,96,92,87,29,66,24,77,45,70,68,41,21,39,29,61,1,37,35,22,55,54,35,13},new int[]{71,74,47,93,6,28,71,60,50,42,61,21,21,34,84,41,76,80,7,10,64,67,32,97,14,21,52,29,17,81,62,54,5,38,96,73,54,91,41,93,64,96,46,49,86},new int[]{21,24,84,19,40,76,69,35,35,51,80,8,38,32,49,60,33,72,42,43,49,6,80,66,2,33,94,76,63,24,62,8,5,3,99,14,91,65,30,53,24,43,3,34,77},new int[]{51,67,30,31,26,99,6,3,20,79,62,91,52,58,79,62,94,87,56,28,34,80,15,46,22,71,79,43,75,8,37,72,20,50,19,50,40,6,79,65,85,42,26,76,62},new int[]{48,79,73,90,73,30,24,63,83,63,63,73,24,46,10,22,80,66,17,8,74,30,91,26,79,91,64,2,99,83,95,92,17,94,8,78,20,81,57,8,32,43,33,23,95},new int[]{83,50,26,17,2,83,40,27,8,66,67,32,74,69,85,40,68,96,38,51,24,13,42,7,7,13,60,39,29,77,25,25,15,74,78,79,81,7,34,57,70,62,69,27,54},new int[]{8,23,46,4,66,64,1,3,96,51,35,2,87,25,11,77,22,54,70,86,13,90,17,93,90,42,16,23,98,93,22,55,83,72,22,27,38,13,10,48,20,14,46,64,49},new int[]{17,29,84,52,93,37,65,52,45,75,33,40,4,20,97,3,12,5,39,62,27,53,15,33,8,53,10,51,7,89,44,5,37,63,54,82,30,3,69,44,54,72,20,90,35},new int[]{64,35,94,43,89,22,2,40,14,35,68,31,70,76,65,43,73,4,37,44,47,44,14,6,73,37,43,62,59,22,49,16,9,38,23,8,13,85,63,23,8,86,68,5,50},new int[]{52,84,70,22,1,77,26,94,15,98,98,27,12,11,4,44,41,12,20,91,51,21,49,98,54,18,96,98,79,41,71,60,31,12,52,2,38,53,31,35,79,52,25,11,19},new int[]{71,95,41,70,27,50,29,92,85,79,71,27,57,81,1,56,20,76,60,77,85,96,1,91,82,42,13,98,11,57,70,70,49,90,43,21,3,93,39,52,61,12,27,76,37},new int[]{3,92,53,3,98,58,86,13,84,76,6,19,56,57,4,29,88,32,79,85,83,84,61,69,5,3,9,38,50,91,67,36,20,99,88,12,32,37,89,87,99,2,8,83,6},new int[]{25,8,35,86,87,46,46,32,5,71,17,24,85,18,8,75,54,5,7,80,47,72,21,8,47,90,95,33,26,57,92,31,68,23,99,56,72,13,13,74,46,96,41,20,12},new int[]{30,58,25,85,64,76,3,36,75,35,32,46,15,40,83,66,70,76,86,76,91,57,7,23,86,56,66,18,20,13,65,89,31,59,69,35,84,21,37,38,27,24,72,51,94},new int[]{27,78,77,96,11,64,59,90,65,48,3,16,6,14,54,62,55,37,63,74,60,84,44,52,73,16,3,29,24,92,62,33,58,87,95,45,51,73,76,53,8,22,23,79,87},new int[]{78,23,44,87,17,92,17,79,28,92,81,11,13,73,65,36,61,84,69,68,53,24,55,34,13,52,99,85,80,26,64,21,89,17,60,63,74,82,93,74,23,29,39,88,50},new int[]{38,97,29,93,79,32,26,51,69,96,54,68,93,25,30,41,90,62,44,16,11,92,78,66,57,61,96,60,76,76,80,75,80,16,56,8,55,1,78,51,93,46,68,93,19},new int[]{36,75,27,46,86,65,85,21,50,25,90,63,79,53,93,91,25,6,18,25,70,51,1,70,32,42,20,61,24,1,47,72,19,93,69,53,51,88,64,85,21,24,15,15,95},new int[]{73,39,37,1,99,28,65,5,25,4,5,65,59,23,29,94,38,51,3,10,52,21,27,39,36,28,11,55,33,96,57,98,43,57,28,11,40,2,61,98,83,29,54,28,68},new int[]{3,72,48,70,60,49,17,84,28,58,59,34,29,6,95,72,94,11,62,2,58,48,90,72,8,25,71,96,95,80,19,9,71,31,24,48,90,20,5,18,16,48,91,81,25},new int[]{44,32,83,67,57,16,58,21,86,75,2,98,60,7,98,39,84,26,80,63,99,44,49,61,87,74,55,76,16,55,20,26,1,16,85,11,9,40,33,91,46,12,75,5,23},new int[]{88,39,4,51,44,68,29,32,7,76,58,14,18,84,27,13,82,31,5,58,85,1,36,48,82,7,41,61,33,47,58,22,79,52,68,85,72,85,89,88,48,54,46,10,54},new int[]{41,29,62,36,30,50,26,40,93,67,11,71,27,50,28,48,2,77,7,57,4,48,34,25,92,60,77,91,10,21,54,45,34,40,61,34,59,2,42,27,94,60,2,43,80},new int[]{99,59,22,54,48,21,43,7,37,54,64,76,63,9,90,78,35,85,50,75,93,99,70,64,6,51,47,12,77,74,74,35,89,4,35,98,50,55,16,45,66,14,79,61,44},new int[]{99,30,17,32,7,36,35,67,36,29,63,37,38,81,65,53,47,78,9,42,55,80,3,76,74,42,13,96,96,86,51,29,64,89,76,32,45,88,75,92,66,78,65,28,98},new int[]{67,50,7,71,69,58,47,42,38,18,46,33,22,45,94,61,4,31,95,2,54,27,41,62,85,74,57,8,81,69,45,22,23,17,84,27,60,76,17,34,88,97,43,87,59},new int[]{85,63,26,68,84,42,60,45,40,59,34,16,52,66,71,17,95,97,51,30,17,51,34,58,44,34,23,85,66,54,5,25,2,92,53,35,86,8,35,16,28,24,33,70,16},new int[]{30,59,3,45,83,8,14,77,74,62,38,37,24,99,60,88,75,27,50,35,53,98,61,75,2,8,92,7,67,2,57,33,82,93,68,99,93,68,55,42,46,74,40,10,94},new int[]{74,89,17,23,15,32,46,72,6,56,87,17,44,16,48,44,51,19,24,63,29,96,84,48,20,80,62,23,79,38,9,59,6,71,4,30,86,55,96,36,48,9,16,5,71},new int[]{22,92,75,89,15,48,46,68,49,37,34,99,49,61,67,41,55,25,36,34,56,61,95,19,65,92,64,73,19,19,36,77,55,53,16,86,78,1,25,70,93,42,8,62,23},new int[]{73,80,12,36,95,32,96,49,95,17,24,61,46,4,6,82,72,92,46,41,44,26,71,72,95,44,12,91,24,4,32,58,19,87,92,99,89,51,76,46,95,36,53,52,59},new int[]{27,44,28,74,94,34,33,38,66,72,28,91,66,51,78,91,88,69,70,45,77,88,16,51,75,56,8,35,44,81,62,22,17,35,81,98,17,23,15,10,94,49,8,83,47},new int[]{70,18,9,35,22,18,59,53,7,41,61,5,47,78,33,83,16,86,91,94,81,24,54,21,34,68,15,38,82,71,37,47,71,24,4,18,23,18,40,9,16,35,83,77,9},new int[]{62,93,71,2,18,86,47,47,59,60,48,28,97,33,3,42,68,33,48,56,67,13,46,88,47,95,73,16,3,86,67,52,60,93,28,95,25,70,56,63,59,93,30,13,27},new int[]{86,69,35,18,3,49,58,20,86,94,15,7,19,49,15,31,33,91,58,17,14,63,97,88,72,54,50,26,36,97,83,25,74,77,93,24,42,84,32,64,43,18,40,68,13},new int[]{78,6,57,14,90,43,23,31,16,6,66,27,67,19,9,73,78,78,34,36,58,70,27,34,69,45,50,84,90,18,71,64,62,88,61,94,2,31,34,70,28,16,74,16,87}});
    List<Integer> param1 = new ArrayList<>();
    param1.add(42);
    param1.add(23);
    param1.add(13);
    param1.add(21);
    param1.add(4);
    param1.add(14);
    param1.add(31);
    param1.add(9);
    param1.add(27);
    param1.add(41);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_XOR_VALUE_MATRIX," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_XOR_VALUE_MATRIX," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

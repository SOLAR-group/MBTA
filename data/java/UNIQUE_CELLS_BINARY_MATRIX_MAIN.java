public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<int [ ] [ ]> param0 = new ArrayList<>();
    param0.add(new int[][]{ new int[] {0, 1, 0, 0}, new int[] {0, 0, 1, 0}, new int[] {1, 0, 0, 1}});
    param0.add(new int[][]{ new int[] {0, 1, 0, 0}, new int[] {0, 0, 1, 1}, new int[] {1, 0, 1, 1}});
    param0.add(new int[][]{ new int[] {0, 1, 0, 0}, new int[] {0, 0, 1, 0}, new int[] {1, 1, 0, 1}});
    param0.add(new int[][]{ new int[] {1, 1, 1, 1}, new int[] {0, 0, 1, 0}, new int[] {1, 0, 0, 1}});
    param0.add(new int[][]{ new int[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 72, 33, 13, 43, 21, 83, 34, 30, 20, 82, 85, 36}, new int[]{7, 69, 9, 45, 18, 47, 1, 78, 72, 53, 37, 20, 95, 71, 58, 41, 38, 44, 15, 35, 81, 27, 21, 40, 44, 90, 44, 5, 97, 49}, new int[]{69, 92, 21, 8, 66, 37, 14, 34, 60, 61, 46, 21, 91, 18, 61, 69, 34, 82, 54, 99, 90, 29, 41, 92, 70, 90, 58, 82, 30, 33}, new int[]{63, 96, 90, 86, 34, 49, 12, 22, 85, 24, 56, 25, 66, 1, 74, 34, 5, 17, 1, 78, 21, 6, 75, 39, 59, 20, 84, 85, 64, 24}, new int[]{41, 90, 67, 38, 38, 28, 10, 24, 62, 52, 71, 87, 87, 24, 95, 50, 86, 91, 38, 69, 18, 72, 99, 49, 17, 76, 86, 53, 6, 94}, new int[]{66, 5, 2, 62, 99, 5, 31, 81, 63, 91, 95, 74, 76, 18, 77, 57, 72, 99, 62, 4, 62, 46, 71, 21, 60, 45, 79, 98, 22, 65}, new int[]{6, 65, 83, 27, 10, 55, 78, 34, 41, 32, 67, 51, 80, 39, 97, 5, 58, 99, 17, 23, 90, 46, 7, 62, 7, 15, 30, 20, 67, 86}, new int[]{54, 50, 71, 95, 49, 50, 3, 64, 46, 81, 22, 52, 37, 60, 67, 48, 30, 88, 97, 43, 10, 71, 80, 96, 2, 72, 79, 67, 84, 98}, new int[]{46, 41, 4, 87, 8, 10, 5, 74, 90, 80, 59, 58, 23, 61, 17, 28, 18, 52, 58, 41, 75, 98, 79, 1, 97, 73, 17, 79, 4, 46}, new int[]{70, 6, 83, 23, 94, 1, 73, 61, 22, 65, 57, 36, 25, 16, 26, 92, 5, 22, 14, 73, 78, 80, 94, 96, 70, 17, 1, 18, 75, 11}, new int[]{92, 12, 34, 80, 74, 8, 90, 42, 14, 51, 9, 83, 98, 38, 29, 29, 28, 88, 92, 76, 83, 6, 2, 53, 31, 37, 56, 93, 40, 12}, new int[]{55, 97, 57, 45, 25, 42, 18, 30, 18, 7, 79, 30, 5, 69, 33, 6, 48, 4, 13, 26, 49, 20, 32, 96, 65, 89, 89, 53, 65, 3}, new int[]{21, 43, 25, 85, 67, 93, 35, 86, 23, 13, 98, 23, 63, 99, 83, 15, 79, 26, 67, 81, 94, 61, 28, 34, 16, 43, 11, 24, 87, 25}, new int[]{77, 19, 34, 66, 72, 5, 75, 66, 54, 96, 24, 76, 80, 51, 24, 50, 54, 17, 96, 84, 35, 30, 47, 42, 22, 31, 51, 37, 88, 88}, new int[]{13, 89, 31, 14, 84, 39, 92, 89, 38, 75, 18, 39, 83, 67, 41, 46, 49, 27, 23, 35, 13, 26, 78, 35, 41, 6, 72, 52, 53, 79}, new int[]{8, 47, 80, 93, 64, 34, 29, 35, 48, 74, 65, 69, 67, 14, 46, 27, 46, 29, 1, 82, 3, 26, 21, 24, 45, 84, 29, 18, 3, 51}, new int[]{97, 18, 37, 63, 85, 19, 23, 84, 55, 24, 83, 26, 97, 96, 54, 99, 89, 33, 88, 57, 9, 64, 75, 85, 59, 81, 16, 5, 44, 46}, new int[]{10, 77, 58, 70, 64, 80, 70, 93, 60, 25, 87, 11, 93, 85, 63, 26, 41, 53, 75, 24, 81, 73, 72, 94, 7, 87, 73, 83, 64, 72}, new int[]{46, 78, 51, 92, 99, 71, 6, 30, 16, 57, 65, 61, 17, 63, 7, 35, 69, 91, 30, 44, 99, 80, 6, 80, 56, 8, 84, 95, 20, 73}, new int[]{30, 62, 77, 26, 66, 61, 61, 45, 46, 24, 77, 16, 82, 16, 66, 1, 74, 25, 14, 81, 82, 7, 21, 93, 91, 49, 4, 12, 22, 34}, new int[]{26, 28, 19, 31, 14, 87, 81, 23, 81, 8, 38, 10, 30, 7, 2, 22, 5, 67, 73, 69, 56, 20, 93, 70, 68, 57, 21, 17, 79, 27}, new int[]{39, 83, 67, 92, 86, 70, 95, 69, 13, 98, 50, 10, 56, 44, 28, 85, 37, 36, 56, 92, 77, 57, 36, 1, 43, 9, 84, 81, 67, 32}, new int[]{99, 70, 58, 52, 70, 89, 28, 65, 40, 80, 20, 88, 79, 10, 76, 62, 37, 99, 60, 91, 77, 94, 67, 52, 35, 62, 12, 29, 30, 22}, new int[]{81, 53, 91, 22, 60, 49, 49, 7, 46, 11, 16, 54, 57, 36, 51, 22, 37, 3, 35, 38, 55, 41, 38, 88, 34, 99, 11, 79, 14, 81}, new int[]{21, 28, 86, 60, 34, 65, 87, 96, 4, 56, 70, 80, 10, 35, 88, 10, 76, 63, 97, 91, 25, 74, 89, 32, 56, 26, 68, 73, 27, 73}, new int[]{90, 11, 53, 32, 59, 30, 9, 11, 87, 17, 96, 11, 57, 86, 50, 96, 73, 81, 53, 89, 80, 97, 66, 43, 39, 42, 76, 34, 25, 78}, new int[]{9, 94, 12, 10, 88, 34, 76, 26, 96, 35, 77, 83, 56, 77, 56, 86, 48, 23, 65, 8, 98, 13, 49, 10, 3, 28, 27, 85, 11, 88}, new int[]{12, 7, 42, 96, 10, 61, 64, 28, 26, 93, 91, 52, 74, 4, 22, 10, 4, 7, 63, 87, 67, 88, 30, 76, 21, 48, 17, 67, 79, 96}, new int[]{9, 40, 86, 96, 59, 69, 41, 68, 48, 61, 5, 7, 75, 6, 29, 51, 81, 28, 57, 63, 38, 83, 49, 12, 45, 83, 97, 45, 5, 65}, new int[]{35, 35, 31, 36, 40, 99, 40, 61, 12, 82, 92, 13, 30, 40, 17, 73, 22, 56, 62, 57, 15, 93, 54, 16, 84, 89, 24, 80, 80, 25}});
    param0.add(new int[][]{ new int[] {0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 45, 59, 40, 83, 46, 59, 89, 37, 82, 68, 65, 97, 28, 41, 83, 97, 15, 87, 93, 39, 78, 94, 66, 77, 28, 31, 12, 13, 3}, new int[]{63, 29, 64, 94, 76, 85, 66, 50, 80, 96, 92, 73, 17, 56, 83, 7, 36, 40, 1, 42, 36, 39, 1, 88, 63, 74, 75, 86, 56, 31, 1, 41, 11, 6, 51, 64, 81, 78, 96, 20, 4, 39, 47, 22, 93, 42, 77, 79}, new int[]{35, 25, 3, 51, 12, 14, 40, 32, 50, 68, 29, 31, 96, 24, 11, 30, 19, 36, 6, 2, 19, 46, 40, 18, 36, 46, 56, 52, 54, 56, 20, 1, 23, 38, 20, 4, 69, 6, 63, 90, 1, 63, 79, 80, 87, 86, 54, 69}, new int[]{43, 5, 70, 66, 10, 36, 35, 45, 23, 62, 47, 16, 37, 42, 35, 40, 16, 69, 11, 51, 93, 75, 80, 89, 50, 67, 67, 65, 12, 7, 43, 46, 96, 22, 76, 6, 38, 39, 60, 85, 62, 92, 96, 27, 49, 15, 33, 96}, new int[]{46, 98, 71, 13, 53, 39, 50, 70, 60, 9, 4, 94, 92, 21, 12, 77, 50, 13, 52, 91, 92, 82, 80, 21, 55, 10, 78, 92, 29, 11, 30, 40, 91, 49, 3, 1, 32, 39, 85, 2, 74, 31, 18, 7, 5, 29, 68, 46}, new int[]{56, 3, 13, 67, 72, 50, 4, 42, 99, 76, 24, 19, 99, 82, 40, 34, 89, 7, 75, 38, 19, 99, 45, 20, 91, 95, 89, 2, 93, 37, 31, 42, 6, 85, 97, 9, 74, 86, 95, 53, 11, 83, 76, 16, 13, 38, 13, 15}, new int[]{18, 16, 41, 50, 69, 91, 66, 41, 27, 59, 65, 14, 35, 23, 22, 27, 50, 25, 98, 54, 49, 91, 99, 85, 3, 25, 68, 57, 15, 67, 11, 92, 3, 18, 53, 9, 79, 72, 40, 56, 14, 61, 13, 47, 74, 94, 5, 86}, new int[]{99, 5, 12, 35, 85, 26, 1, 10, 38, 24, 95, 47, 87, 85, 2, 95, 2, 30, 25, 83, 62, 1, 92, 63, 84, 59, 54, 69, 55, 94, 87, 42, 91, 53, 65, 9, 71, 51, 90, 16, 53, 70, 62, 37, 61, 57, 45, 76}, new int[]{88, 17, 2, 95, 37, 54, 42, 29, 65, 78, 40, 11, 58, 96, 20, 66, 31, 5, 96, 50, 9, 41, 10, 53, 49, 26, 67, 36, 23, 94, 39, 59, 23, 23, 43, 25, 84, 60, 33, 33, 65, 47, 33, 38, 24, 73, 95, 49}, new int[]{92, 87, 30, 82, 58, 90, 97, 59, 16, 93, 16, 33, 39, 46, 38, 23, 26, 49, 81, 24, 83, 42, 27, 2, 8, 79, 41, 13, 91, 22, 47, 47, 65, 69, 29, 79, 30, 46, 6, 6, 87, 52, 5, 86, 41, 20, 20, 39}, new int[]{30, 48, 81, 60, 23, 60, 50, 13, 74, 38, 39, 68, 19, 52, 41, 92, 27, 23, 19, 80, 35, 5, 88, 5, 93, 6, 41, 41, 54, 44, 48, 37, 93, 56, 33, 91, 35, 6, 46, 74, 36, 44, 7, 7, 29, 80, 65, 60}, new int[]{35, 57, 29, 38, 77, 12, 87, 80, 58, 78, 80, 6, 36, 52, 88, 27, 25, 40, 36, 60, 29, 95, 3, 13, 68, 11, 48, 79, 60, 2, 79, 70, 13, 35, 51, 56, 40, 77, 59, 12, 16, 53, 41, 20, 40, 61, 77, 34}, new int[]{19, 45, 91, 29, 19, 56, 27, 2, 40, 65, 78, 8, 27, 97, 95, 30, 25, 49, 56, 65, 31, 99, 60, 85, 34, 17, 73, 29, 72, 83, 6, 88, 6, 3, 95, 31, 76, 52, 8, 90, 26, 15, 77, 56, 86, 62, 13, 46}, new int[]{54, 9, 88, 3, 23, 12, 41, 44, 58, 11, 19, 59, 73, 37, 10, 73, 33, 77, 20, 44, 75, 93, 13, 63, 14, 73, 54, 42, 38, 83, 72, 82, 98, 36, 9, 80, 5, 15, 24, 64, 48, 43, 39, 25, 80, 86, 80, 97}, new int[]{5, 60, 7, 18, 6, 12, 33, 98, 21, 58, 82, 78, 42, 94, 46, 3, 57, 53, 62, 13, 51, 19, 59, 62, 37, 77, 15, 90, 70, 91, 12, 89, 50, 47, 16, 16, 67, 34, 88, 46, 87, 64, 94, 49, 21, 53, 62, 81}, new int[]{54, 82, 3, 53, 12, 80, 38, 78, 91, 18, 84, 35, 81, 84, 70, 90, 71, 76, 17, 21, 70, 47, 37, 89, 54, 15, 11, 9, 68, 3, 13, 96, 6, 1, 5, 66, 86, 96, 41, 50, 7, 21, 81, 53, 20, 65, 32, 96}, new int[]{84, 74, 6, 41, 33, 74, 25, 24, 95, 93, 12, 37, 50, 9, 93, 67, 4, 54, 85, 6, 66, 37, 84, 45, 97, 14, 84, 43, 66, 7, 55, 37, 76, 16, 17, 95, 71, 90, 1, 2, 95, 84, 33, 13, 65, 51, 33, 3}, new int[]{60, 83, 44, 96, 5, 47, 43, 47, 6, 60, 36, 37, 77, 76, 6, 30, 92, 10, 28, 6, 73, 24, 52, 82, 68, 45, 87, 27, 68, 13, 75, 75, 19, 33, 78, 13, 7, 33, 32, 45, 56, 72, 46, 98, 19, 34, 63, 70}, new int[]{54, 55, 50, 65, 45, 30, 79, 73, 61, 93, 59, 2, 30, 46, 68, 19, 84, 5, 73, 84, 57, 63, 52, 59, 60, 80, 84, 20, 90, 33, 12, 21, 56, 23, 20, 87, 49, 47, 70, 45, 76, 35, 72, 27, 80, 47, 32, 29}, new int[]{71, 80, 53, 93, 56, 89, 43, 4, 64, 91, 87, 23, 60, 30, 43, 88, 48, 80, 7, 87, 31, 19, 52, 68, 6, 83, 60, 91, 93, 12, 38, 13, 28, 5, 46, 46, 81, 27, 26, 62, 68, 72, 90, 97, 12, 77, 85, 52}, new int[]{37, 25, 39, 67, 19, 71, 81, 77, 24, 51, 45, 8, 72, 45, 2, 30, 67, 45, 26, 17, 38, 67, 57, 33, 94, 79, 72, 94, 64, 23, 12, 8, 73, 72, 38, 33, 48, 97, 45, 75, 23, 43, 25, 15, 10, 20, 16, 99}, new int[]{98, 85, 57, 46, 1, 25, 56, 46, 59, 62, 78, 61, 83, 8, 41, 15, 44, 82, 1, 97, 65, 34, 4, 81, 2, 39, 54, 10, 42, 45, 26, 27, 39, 25, 29, 82, 22, 90, 60, 90, 52, 85, 21, 8, 66, 98, 76, 18}, new int[]{81, 15, 3, 85, 83, 59, 55, 32, 11, 82, 53, 29, 67, 4, 92, 9, 57, 38, 7, 65, 35, 47, 34, 63, 9, 90, 72, 19, 26, 46, 56, 10, 43, 30, 40, 55, 58, 31, 72, 47, 77, 37, 94, 57, 79, 57, 99, 3}, new int[]{29, 88, 45, 87, 73, 2, 15, 96, 18, 29, 40, 3, 97, 58, 71, 94, 91, 38, 29, 31, 65, 43, 27, 27, 93, 69, 3, 29, 13, 97, 60, 84, 67, 70, 81, 47, 68, 97, 33, 6, 64, 78, 71, 70, 51, 67, 22, 72}, new int[]{24, 77, 77, 65, 53, 41, 32, 69, 71, 45, 32, 28, 97, 14, 13, 93, 50, 40, 1, 47, 91, 30, 34, 46, 1, 34, 59, 7, 65, 42, 82, 99, 19, 13, 23, 66, 3, 86, 36, 49, 72, 87, 72, 57, 89, 99, 64, 11}, new int[]{41, 6, 45, 81, 57, 82, 33, 61, 18, 7, 29, 69, 16, 95, 69, 74, 29, 29, 16, 4, 65, 72, 92, 1, 92, 3, 64, 66, 89, 57, 75, 18, 39, 84, 81, 7, 55, 17, 68, 36, 94, 1, 35, 76, 17, 80, 28, 32}, new int[]{55, 35, 19, 93, 93, 80, 4, 21, 44, 62, 1, 83, 51, 90, 76, 17, 37, 92, 36, 29, 69, 3, 15, 67, 77, 69, 21, 23, 47, 86, 34, 41, 90, 47, 31, 35, 7, 45, 57, 96, 22, 70, 21, 49, 47, 27, 10, 86}, new int[]{44, 51, 18, 68, 99, 38, 36, 60, 68, 74, 96, 74, 45, 74, 75, 9, 13, 57, 82, 57, 37, 47, 11, 28, 6, 33, 14, 47, 29, 15, 56, 69, 86, 31, 19, 18, 58, 70, 73, 30, 95, 35, 17, 16, 97, 68, 95, 33}, new int[]{36, 11, 60, 4, 63, 5, 64, 85, 77, 4, 35, 26, 26, 19, 37, 11, 66, 31, 18, 75, 44, 16, 58, 2, 59, 96, 48, 86, 36, 8, 36, 25, 40, 95, 4, 43, 74, 27, 38, 81, 38, 64, 89, 17, 13, 85, 79, 24}, new int[]{7, 64, 63, 22, 53, 74, 97, 12, 72, 22, 39, 47, 64, 44, 16, 59, 34, 46, 80, 78, 70, 55, 74, 24, 27, 73, 16, 2, 31, 63, 47, 19, 56, 11, 86, 93, 95, 8, 74, 6, 31, 99, 50, 29, 21, 41, 69, 69}, new int[]{88, 79, 56, 28, 34, 56, 77, 55, 44, 32, 86, 29, 3, 69, 11, 48, 53, 56, 53, 26, 9, 75, 65, 56, 28, 23, 31, 66, 61, 82, 16, 59, 81, 48, 17, 35, 95, 99, 59, 88, 41, 37, 30, 82, 91, 16, 84, 47}, new int[]{28, 21, 41, 45, 97, 73, 64, 88, 13, 94, 43, 97, 58, 88, 20, 63, 1, 23, 33, 57, 81, 54, 66, 95, 31, 54, 16, 37, 7, 1, 94, 18, 42, 39, 26, 75, 65, 57, 69, 86, 77, 17, 7, 71, 12, 38, 87, 48}, new int[]{55, 54, 72, 15, 30, 55, 73, 21, 60, 78, 8, 47, 36, 73, 26, 84, 70, 34, 60, 23, 97, 85, 41, 90, 69, 55, 73, 45, 61, 33, 89, 52, 81, 19, 75, 8, 70, 6, 72, 57, 88, 60, 19, 52, 41, 91, 84, 88}, new int[]{38, 69, 16, 39, 97, 74, 51, 5, 83, 62, 41, 85, 67, 59, 92, 19, 80, 62, 53, 66, 8, 46, 12, 88, 65, 82, 23, 39, 60, 27, 57, 44, 70, 28, 23, 34, 25, 11, 48, 65, 10, 73, 26, 10, 18, 60, 73, 45}, new int[]{26, 9, 36, 15, 24, 40, 2, 4, 95, 20, 39, 45, 26, 60, 69, 68, 86, 70, 31, 69, 7, 69, 4, 91, 73, 37, 2, 49, 83, 17, 17, 40, 51, 88, 77, 28, 46, 78, 87, 87, 74, 49, 17, 27, 62, 11, 83, 44}, new int[]{91, 36, 16, 60, 87, 97, 52, 22, 78, 77, 86, 71, 38, 65, 51, 97, 86, 23, 15, 79, 31, 28, 67, 42, 25, 33, 97, 23, 92, 53, 16, 37, 5, 11, 12, 21, 18, 14, 33, 21, 26, 89, 25, 35, 63, 20, 63, 66}, new int[]{12, 32, 97, 48, 95, 97, 59, 20, 37, 40, 61, 56, 14, 36, 76, 90, 34, 6, 46, 77, 22, 99, 83, 23, 64, 96, 44, 11, 68, 61, 76, 56, 51, 63, 30, 10, 88, 23, 1, 48, 4, 28, 44, 67, 2, 58, 6, 42}, new int[]{17, 37, 44, 23, 40, 85, 44, 31, 76, 93, 13, 90, 97, 98, 20, 47, 10, 65, 52, 63, 29, 54, 86, 50, 65, 44, 8, 9, 23, 84, 34, 16, 86, 62, 87, 65, 78, 52, 23, 38, 40, 8, 32, 40, 66, 48, 13, 27}, new int[]{46, 71, 3, 85, 61, 72, 65, 17, 26, 29, 72, 38, 51, 43, 72, 8, 25, 55, 45, 91, 86, 67, 57, 49, 54, 47, 64, 24, 62, 33, 99, 40, 29, 8, 75, 16, 33, 64, 11, 29, 49, 88, 66, 5, 88, 53, 44, 7}, new int[]{95, 94, 70, 69, 79, 27, 99, 54, 73, 23, 58, 17, 87, 46, 47, 93, 59, 45, 62, 54, 75, 13, 12, 2, 42, 54, 11, 78, 22, 85, 49, 37, 36, 89, 49, 58, 3, 66, 91, 33, 18, 48, 75, 71, 37, 50, 36, 27}, new int[]{22, 31, 40, 54, 64, 70, 53, 54, 54, 97, 71, 6, 64, 54, 65, 46, 42, 93, 75, 92, 56, 40, 15, 30, 23, 12, 92, 95, 30, 16, 30, 68, 33, 57, 97, 28, 85, 79, 26, 14, 57, 15, 66, 16, 37, 11, 11, 33}, new int[]{2, 33, 63, 3, 84, 33, 26, 34, 78, 52, 93, 66, 72, 27, 72, 71, 75, 94, 49, 47, 21, 21, 71, 84, 61, 14, 20, 5, 31, 62, 12, 56, 56, 12, 66, 26, 68, 30, 98, 20, 66, 35, 79, 51, 14, 55, 36, 53}, new int[]{54, 63, 94, 58, 27, 2, 85, 78, 91, 85, 23, 35, 62, 72, 59, 76, 64, 92, 41, 33, 97, 9, 79, 74, 49, 2, 3, 23, 74, 19, 18, 35, 54, 60, 9, 95, 94, 52, 50, 12, 17, 91, 85, 49, 48, 27, 14, 55}, new int[]{13, 3, 64, 88, 96, 72, 99, 23, 80, 73, 39, 58, 18, 54, 31, 64, 42, 37, 98, 70, 78, 88, 97, 42, 83, 29, 70, 3, 18, 85, 29, 52, 42, 52, 36, 95, 8, 96, 80, 86, 2, 51, 15, 17, 13, 54, 99, 25}, new int[]{74, 75, 33, 78, 98, 22, 44, 4, 26, 1, 10, 2, 29, 25, 87, 94, 60, 89, 13, 40, 34, 35, 79, 39, 42, 84, 86, 25, 14, 83, 86, 87, 1, 39, 30, 5, 94, 71, 62, 77, 31, 7, 29, 51, 89, 77, 79, 51}, new int[]{94, 71, 69, 14, 94, 23, 80, 88, 43, 56, 21, 30, 76, 40, 94, 22, 2, 23, 87, 86, 62, 30, 27, 98, 75, 93, 37, 70, 16, 20, 74, 46, 74, 25, 59, 86, 32, 17, 90, 80, 10, 17, 2, 66, 29, 4, 30, 61}, new int[]{58, 76, 34, 78, 24, 88, 82, 25, 89, 25, 92, 30, 55, 89, 24, 39, 77, 2, 34, 16, 48, 24, 50, 2, 93, 39, 81, 59, 23, 12, 77, 69, 15, 60, 64, 2, 70, 64, 36, 87, 13, 2, 5, 40, 80, 64, 39, 35}, new int[]{57, 41, 45, 34, 19, 90, 42, 17, 35, 76, 35, 6, 52, 74, 43, 23, 83, 43, 53, 72, 73, 67, 97, 66, 34, 35, 82, 27, 27, 64, 39, 60, 81, 73, 96, 23, 78, 11, 4, 51, 38, 51, 48, 80, 36, 25, 5, 74}});
    param0.add(new int[][]{ new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{69, 62, 79, 46, 48, 38, 61, 81, 17, 48, 33, 18, 36, 54, 3, 89, 99, 20}, new int[]{31, 21, 34, 57, 37, 1, 57, 55, 31, 23, 75, 48, 20, 7, 99, 2, 97, 40}, new int[]{24, 74, 9, 43, 97, 51, 85, 78, 50, 87, 76, 22, 92, 91, 10, 82, 88, 67}, new int[]{4, 30, 85, 22, 92, 73, 41, 16, 56, 69, 14, 52, 14, 47, 16, 43, 68, 37}, new int[]{14, 41, 87, 73, 24, 75, 92, 19, 83, 12, 47, 98, 12, 3, 30, 58, 46, 51}, new int[]{99, 15, 43, 22, 9, 92, 93, 39, 81, 68, 57, 68, 7, 2, 54, 37, 74, 82}, new int[]{28, 59, 46, 63, 35, 99, 94, 85, 58, 89, 13, 71, 6, 84, 45, 5, 38, 44}, new int[]{25, 82, 88, 15, 72, 77, 39, 48, 52, 60, 89, 23, 69, 52, 86, 22, 25, 55}, new int[]{64, 65, 4, 52, 32, 53, 26, 79, 35, 91, 14, 34, 60, 25, 54, 27, 21, 48}, new int[]{35, 52, 70, 99, 26, 15, 5, 90, 33, 25, 81, 52, 44, 20, 56, 66, 8, 83}, new int[]{64, 29, 48, 19, 9, 72, 15, 98, 68, 63, 91, 38, 47, 13, 96, 99, 46, 36}, new int[]{10, 55, 23, 23, 68, 44, 5, 4, 30, 52, 97, 13, 18, 32, 33, 58, 62, 71}, new int[]{14, 14, 10, 59, 39, 46, 18, 19, 37, 3, 55, 7, 71, 52, 54, 38, 63, 64}, new int[]{6, 74, 52, 44, 36, 37, 64, 48, 27, 65, 1, 48, 85, 37, 92, 49, 55, 39}, new int[]{36, 66, 66, 68, 2, 65, 18, 41, 98, 91, 39, 26, 75, 3, 49, 28, 16, 99}, new int[]{22, 80, 97, 77, 49, 28, 16, 64, 60, 66, 26, 42, 92, 3, 21, 32, 70, 69}, new int[]{24, 65, 23, 80, 8, 45, 89, 11, 57, 12, 72, 10, 63, 35, 38, 21, 51, 18}});
    param0.add(new int[][]{ new int[] {0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 2, 93, 66, 82, 36, 56}, new int[]{21, 97, 63, 2, 74, 15, 62, 12, 3, 4, 9, 46, 42, 74, 31, 37, 11, 61, 27, 46, 70, 94, 43, 99, 45}, new int[]{18, 50, 6, 13, 12, 7, 14, 73, 99, 47, 7, 39, 56, 85, 19, 27, 61, 66, 52, 56, 14, 33, 12, 85, 94}, new int[]{86, 66, 93, 24, 96, 45, 76, 55, 71, 53, 66, 19, 51, 82, 98, 66, 45, 40, 83, 6, 51, 41, 47, 17, 23}, new int[]{40, 73, 37, 85, 58, 21, 27, 11, 39, 94, 63, 28, 84, 47, 47, 4, 61, 18, 50, 93, 36, 91, 1, 35, 5}, new int[]{6, 60, 5, 32, 39, 95, 40, 42, 74, 95, 8, 91, 29, 60, 78, 23, 4, 34, 38, 61, 27, 83, 31, 3, 93}, new int[]{77, 27, 43, 60, 96, 46, 37, 67, 6, 59, 3, 77, 11, 27, 2, 64, 44, 76, 55, 40, 76, 23, 64, 95, 57}, new int[]{10, 35, 6, 89, 95, 54, 94, 79, 67, 82, 56, 81, 60, 14, 46, 16, 27, 37, 97, 61, 20, 25, 50, 58, 78}, new int[]{37, 5, 54, 37, 74, 10, 9, 78, 33, 93, 24, 70, 57, 26, 39, 44, 64, 48, 67, 48, 40, 46, 96, 90, 3}, new int[]{76, 14, 83, 4, 12, 99, 23, 3, 3, 42, 80, 77, 19, 28, 38, 9, 56, 17, 7, 72, 76, 54, 28, 66, 28}, new int[]{25, 91, 99, 79, 49, 48, 99, 47, 62, 33, 42, 87, 27, 8, 62, 38, 4, 54, 48, 69, 16, 61, 18, 45, 18}, new int[]{8, 29, 21, 54, 91, 47, 66, 68, 48, 76, 80, 89, 23, 17, 61, 52, 42, 51, 1, 21, 57, 36, 2, 23, 60}, new int[]{59, 66, 43, 59, 74, 73, 93, 90, 36, 60, 93, 4, 21, 97, 95, 92, 97, 4, 4, 33, 14, 9, 88, 64, 62}, new int[]{89, 7, 92, 5, 13, 2, 84, 12, 91, 7, 34, 21, 60, 82, 10, 38, 58, 56, 44, 85, 80, 64, 20, 50, 54}, new int[]{46, 40, 24, 85, 58, 31, 50, 10, 84, 14, 19, 30, 57, 16, 22, 54, 84, 70, 43, 97, 19, 5, 71, 98, 20}, new int[]{15, 38, 1, 5, 98, 54, 85, 61, 78, 17, 76, 27, 70, 25, 91, 45, 2, 22, 96, 54, 17, 61, 66, 26, 56}, new int[]{33, 1, 40, 43, 44, 62, 36, 56, 39, 89, 13, 39, 12, 21, 87, 18, 13, 19, 35, 46, 57, 34, 62, 56, 1}, new int[]{57, 86, 28, 4, 71, 75, 76, 40, 53, 39, 35, 98, 82, 10, 51, 64, 79, 59, 26, 3, 77, 98, 17, 65, 78}, new int[]{1, 88, 57, 11, 67, 77, 55, 86, 41, 59, 30, 25, 71, 64, 89, 25, 66, 34, 55, 58, 86, 54, 1, 18, 16}, new int[]{56, 74, 31, 48, 77, 34, 34, 60, 76, 37, 40, 17, 41, 56, 54, 79, 13, 46, 72, 17, 11, 40, 46, 65, 32}, new int[]{52, 10, 59, 15, 3, 9, 8, 74, 8, 16, 11, 23, 56, 56, 22, 18, 39, 3, 8, 5, 91, 5, 19, 81, 61}, new int[]{46, 18, 61, 60, 2, 50, 63, 71, 49, 80, 71, 18, 90, 93, 16, 46, 94, 25, 8, 64, 14, 22, 78, 91, 35}, new int[]{51, 76, 43, 85, 75, 3, 73, 55, 19, 42, 61, 23, 80, 4, 96, 65, 4, 59, 90, 91, 80, 30, 33, 80, 33}, new int[]{20, 95, 48, 27, 32, 86, 27, 25, 66, 87, 12, 46, 48, 85, 75, 85, 37, 4, 90, 84, 61, 71, 47, 91, 47}, new int[]{17, 32, 10, 50, 75, 59, 18, 66, 35, 6, 3, 71, 35, 77, 66, 66, 51, 72, 73, 34, 39, 95, 93, 49, 47}});
    param0.add(new int[][]{ new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 95, 83, 85, 49, 74}, new int[]{4, 62, 18, 60, 64, 20, 52, 36, 62, 48, 96, 57, 57, 91, 41, 88, 93, 53, 88, 62, 29, 39, 82}, new int[]{10, 61, 56, 9, 50, 75, 12, 2, 90, 73, 17, 35, 46, 67, 70, 87, 35, 79, 72, 96, 34, 11, 3}, new int[]{93, 10, 82, 82, 12, 91, 51, 83, 97, 89, 59, 2, 2, 5, 22, 33, 69, 28, 58, 14, 50, 74, 41}, new int[]{15, 74, 68, 43, 55, 49, 18, 81, 95, 97, 25, 12, 55, 47, 85, 81, 84, 93, 67, 71, 64, 60, 97}, new int[]{90, 84, 43, 37, 32, 99, 85, 52, 53, 56, 72, 2, 48, 16, 91, 36, 10, 92, 81, 89, 79, 18, 92}, new int[]{2, 40, 42, 95, 95, 25, 1, 82, 16, 42, 37, 37, 71, 6, 78, 22, 95, 74, 46, 40, 54, 46, 36}, new int[]{41, 98, 67, 23, 43, 61, 17, 93, 65, 3, 78, 75, 30, 21, 16, 62, 60, 9, 66, 26, 67, 15, 12}, new int[]{19, 14, 15, 87, 11, 63, 43, 67, 43, 1, 4, 85, 25, 84, 74, 82, 97, 53, 35, 25, 3, 51, 50}, new int[]{13, 35, 89, 55, 18, 51, 30, 40, 30, 58, 88, 90, 65, 97, 72, 12, 8, 75, 78, 18, 65, 85, 10}, new int[]{37, 29, 46, 88, 44, 36, 18, 79, 32, 20, 34, 73, 41, 98, 35, 57, 27, 18, 21, 18, 27, 95, 28}, new int[]{97, 15, 45, 47, 36, 19, 99, 96, 45, 57, 76, 29, 98, 16, 22, 72, 55, 12, 98, 16, 55, 47, 73}, new int[]{27, 99, 11, 83, 95, 15, 53, 91, 33, 71, 87, 22, 65, 58, 27, 75, 12, 60, 85, 72, 77, 33, 66}, new int[]{9, 77, 26, 45, 55, 52, 9, 79, 7, 57, 57, 37, 73, 78, 30, 51, 47, 84, 54, 23, 79, 58, 56}, new int[]{31, 68, 89, 62, 83, 60, 37, 34, 1, 41, 95, 44, 35, 27, 21, 72, 82, 23, 41, 93, 80, 50, 74}, new int[]{81, 22, 40, 2, 42, 30, 44, 83, 10, 84, 63, 24, 6, 45, 18, 16, 40, 16, 79, 70, 97, 13, 68}, new int[]{96, 50, 29, 58, 7, 97, 5, 40, 4, 7, 80, 37, 75, 59, 50, 69, 29, 55, 89, 67, 96, 30, 20}, new int[]{94, 67, 61, 44, 56, 79, 60, 41, 78, 40, 50, 10, 17, 15, 93, 53, 98, 99, 73, 51, 81, 66, 26}, new int[]{38, 92, 30, 55, 9, 92, 16, 24, 86, 20, 62, 52, 78, 52, 43, 96, 10, 66, 71, 65, 15, 75, 84}, new int[]{50, 41, 60, 33, 52, 38, 84, 64, 10, 96, 50, 63, 59, 12, 58, 89, 9, 49, 61, 81, 78, 88, 51}, new int[]{45, 67, 80, 18, 61, 50, 14, 10, 74, 6, 3, 86, 2, 76, 1, 52, 13, 32, 25, 38, 5, 18, 10}, new int[]{53, 83, 34, 30, 32, 11, 86, 30, 1, 6, 78, 56, 67, 58, 79, 95, 19, 61, 62, 86, 71, 91, 35}, new int[]{43, 5, 46, 35, 87, 36, 4, 61, 2, 35, 46, 4, 60, 48, 4, 70, 51, 17, 4, 86, 57, 85, 76}});
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(2);
    param1.add(3);
    param1.add(3);
    param1.add(3);
    param1.add(1);
    param1.add(1);
    param1.add(10);
    param1.add(15);
    param1.add(17);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(2);
    param2.add(4);
    param2.add(4);
    param2.add(3);
    param2.add(28);
    param2.add(32);
    param2.add(12);
    param2.add(17);
    param2.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("UNIQUE_CELLS_BINARY_MATRIX," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("UNIQUE_CELLS_BINARY_MATRIX," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}

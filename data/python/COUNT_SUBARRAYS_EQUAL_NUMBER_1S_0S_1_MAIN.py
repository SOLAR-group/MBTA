if __name__ == '__main__':
    param = [
    ([1, 6, 6, 9, 9, 9, 16, 18, 19, 20, 21, 22, 23, 26, 26, 28, 39, 40, 41, 43, 43, 44, 44, 45, 51, 51, 55, 59, 60, 62, 67, 67, 68, 69, 70, 71, 71, 72, 82, 84, 88, 88, 89, 89, 91, 92, 92],44,),
    ([-44, 74, -52, -96, 46, 92, 54, 56, -38, 88, 40, 34, -72, 8, 58, -14, 36, 94, 34, -90, -42, 80, -12, -42, -6, 78, -98, 34, -88, 0, -76, 90, 40, 64, 26, 18, -84, 72, 80],37,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],32,),
    ([60, 48, 42, 95, 30, 22, 80, 15, 62, 38, 63, 42, 39, 28, 69, 71, 30, 48, 67, 9, 33, 74, 95, 95, 72, 35, 9],18,),
    ([-96, -94, -94, -86, -66, -66, -62, -58, -36, -36, -22, -18, -10, 2, 4, 6, 10, 16, 20, 24, 26, 28, 28, 28, 40, 42, 44, 58, 76, 78, 78, 80, 90, 92],24,),
    ([0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1],28,),
    ([4, 5, 5, 6, 7, 11, 16, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 29, 31, 34, 36, 37, 40, 41, 45, 45, 55, 65, 69, 70, 71, 71, 71, 73, 73, 76, 79, 80, 85, 85, 88, 90, 97, 98, 98, 99, 99],31,),
    ([34, -20, 38, -94, 2, 32, -26, 90, 94, -36, -94, 6, -24, 12, 4, 60, 68, 64, -60, -72, -54, -10, -64, -48, -88, 60, 48, 64, 0, -26, 26, 74, 32, -92, 4, 84, 6, -16, 30, -56, -28, -86, -68],37,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([4, 99, 97, 63, 65, 57, 69, 39, 29, 91, 68, 25, 84, 82, 84, 89, 59, 18, 77, 29, 57, 40, 78, 35, 23, 91, 26, 71, 19, 99, 12, 91, 49, 71, 49, 77, 67],31,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SUBARRAYS_EQUAL_NUMBER_1S_0S_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SUBARRAYS_EQUAL_NUMBER_1S_0S_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

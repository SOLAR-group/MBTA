if __name__ == '__main__':
    param = [
    ([1,2,5,4,3],5,),
    ([1,2,4,5,3],5,),
    ([1,1,0,0],4,),
    ([5, 99, 40, 33, 61, 4, 64, 92, 28, 27, 21, 35, 40, 79, 10, 20, 76, 87, 80, 15, 57, 39, 96, 98, 99, 72, 72, 50, 61, 39, 35, 70, 27],32,),
    ([-98, -92, -86, -58, -22, -12, 0, 26],6,),
    ([0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0],24,),
    ([6, 10, 27, 30, 40, 47, 49, 55, 59, 60, 68, 82, 91],8,),
    ([36, 56, -56, 94, 52, -82, 88, -62, 70, -94, 38, 10, -78, 66, -94, -72, 18, 96, -72, 88, -6, 48, 6, -88, 64, -96, -40, 8, 36, 36, -90, -68, -20, -76, 22, -92],30,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],31,),
    ([2, 5, 42, 28, 47, 26, 88, 16, 30, 30, 36, 49, 21, 95, 99, 21, 41, 52, 57, 39, 69, 2, 42, 22, 55, 92, 64, 27, 95, 71, 19, 38, 40, 65, 7, 21, 29, 38, 13, 11, 41, 54, 38, 40, 35, 51, 88],46,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

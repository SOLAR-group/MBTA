if __name__ == '__main__':
    param = [
    ([6, 8, 10, 46, 92],4,3,),
    ([-90, 8, -22, -52, 40, -46, 84, 24, 22, -64, 6, 82, 88, -96, 44, 58, 46, -32, -80, 10],10,12,),
    ([0, 0, 0, 0, 0, 1, 1],5,4,),
    ([53, 53, 19, 53, 54, 68, 52, 37, 69, 94, 50, 53, 71, 90, 31, 11, 42, 78, 92, 75, 16, 92, 69, 15, 85, 72, 13, 94, 93, 82, 42, 71, 86, 63, 57, 9, 9, 6, 71, 68, 16, 13, 20, 38, 41, 28],29,28,),
    ([-80, 34],1,1,),
    ([1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0],7,10,),
    ([5, 5, 10, 14, 20, 20, 21, 23, 27, 29, 32, 37, 38, 43, 49, 55, 60, 80, 82, 85, 87, 88, 89, 95],19,22,),
    ([-88, 50, -16, -28, 8, 86, 26, 82, -4, -44, -32, -50, 48, -54, 22, -64, -10, -50, -96, -20, -14, -92, 72, 24, -14, -36, 62, 62, 20, -12, -92, -38, -58, 64],19,28,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],24,22,),
    ([37, 75, 63, 69, 54, 22, 7, 6, 29, 97, 4, 23, 4, 30, 68, 28, 54, 68, 89, 17, 54, 76, 92, 28, 40, 95, 83, 61, 68, 57],16,24,)
        ]
    filled_function_param = [
    ([6, 8, 10, 46, 92],4,3,),
    ([-90, 8, -22, -52, 40, -46, 84, 24, 22, -64, 6, 82, 88, -96, 44, 58, 46, -32, -80, 10],10,12,),
    ([0, 0, 0, 0, 0, 1, 1],5,4,),
    ([53, 53, 19, 53, 54, 68, 52, 37, 69, 94, 50, 53, 71, 90, 31, 11, 42, 78, 92, 75, 16, 92, 69, 15, 85, 72, 13, 94, 93, 82, 42, 71, 86, 63, 57, 9, 9, 6, 71, 68, 16, 13, 20, 38, 41, 28],29,28,),
    ([-80, 34],1,1,),
    ([1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0],7,10,),
    ([5, 5, 10, 14, 20, 20, 21, 23, 27, 29, 32, 37, 38, 43, 49, 55, 60, 80, 82, 85, 87, 88, 89, 95],19,22,),
    ([-88, 50, -16, -28, 8, 86, 26, 82, -4, -44, -32, -50, 48, -54, 22, -64, -10, -50, -96, -20, -14, -92, 72, 24, -14, -36, 62, 62, 20, -12, -92, -38, -58, 64],19,28,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],24,22,),
    ([37, 75, 63, 69, 54, 22, 7, 6, 29, 97, 4, 23, 4, 30, 68, 28, 54, 68, 89, 17, 54, 76, 92, 28, 40, 95, 83, 61, 68, 57],16,24,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("K_MAXIMUM_SUMS_NON_OVERLAPPING_CONTIGUOUS_SUB_ARRAYS," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("K_MAXIMUM_SUMS_NON_OVERLAPPING_CONTIGUOUS_SUB_ARRAYS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

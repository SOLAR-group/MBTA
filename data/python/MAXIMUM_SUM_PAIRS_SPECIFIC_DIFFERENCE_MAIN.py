if __name__ == '__main__':
    param = [
    ([48, 53, 67, 78, 78, 93, 95],6,4,),
    ([-2, 52, 18, 70, 32, 88, -70, -32, 72, 30],8,8,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],37,31,),
    ([98, 84, 13, 61, 58, 90, 45, 89, 45, 80, 3, 5, 57, 86, 40, 80, 60, 51, 60, 73, 67, 10, 52, 56, 60, 36, 34, 60, 75, 63, 23, 86, 51, 68, 86, 13, 71, 86, 99, 6, 42, 2, 39, 82, 16, 5, 23, 47, 12],31,37,),
    ([-84, -56, 68, 78],3,3,),
    ([0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0],14,9,),
    ([1, 2, 3, 9, 12, 12, 16, 17, 18, 19, 20, 21, 21, 26, 29, 42, 44, 45, 48, 48, 48, 54, 54, 55, 60, 63, 63, 64, 64, 67, 67, 68, 69, 74, 78, 78, 79, 83, 95, 95, 95, 96, 97, 99],27,42,),
    ([40, -48, -14, 64, -58, 60, -42, -56, 54, 28, -16, -92, 42],9,8,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,19,),
    ([64, 25, 96],1,1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_SUM_PAIRS_SPECIFIC_DIFFERENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_SUM_PAIRS_SPECIFIC_DIFFERENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

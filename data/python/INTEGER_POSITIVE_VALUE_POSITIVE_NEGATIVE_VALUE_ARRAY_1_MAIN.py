if __name__ == '__main__':
    param = [
    ([49, 98],1,),
    ([82, 66, -68, 24, -10],2,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],8,),
    ([56, 3, 18, 5, 20, 56, 47, 29, 60, 98, 60, 40, 42, 2, 54, 56, 91, 8, 93, 14, 31, 27, 61, 49, 23, 12, 71],25,),
    ([-94, -94, -92, -86, -50, -48, -6, 8, 28, 40, 44, 58, 62, 72, 94],12,),
    ([0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1],36,),
    ([16, 56, 56],1,),
    ([74, -90, -92, 30, -18, 66, -66, 22],5,),
    ([0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],7,),
    ([21, 64, 82, 78, 30, 34, 35],5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

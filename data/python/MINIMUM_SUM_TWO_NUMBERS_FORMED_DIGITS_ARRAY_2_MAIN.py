if __name__ == '__main__':
    param = [
    ([4, 16, 29, 30, 38, 83],5,),
    ([58, 74, -28, -60, -6, 66, -76, 46, 0, -24, 28, -16, -14, 24, -94, -56, -80, 40, -18, -68, -8, -94, -88, -12, -20, -8],16,),
    ([0, 1],1,),
    ([7, 12, 78, 8],3,),
    ([-78, -48, -48, -26, 8, 34],4,),
    ([1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0],27,),
    ([2, 3, 5, 7, 25, 30, 31, 38, 42, 45, 52, 53, 56, 59, 60, 71, 74, 76, 80, 90, 91, 98],13,),
    ([40, -62, -2, -58, 60, 38, 48, -4, 0, 62, -52, -80, 56, 38, 58, -72, 32, -26, -14, 70, 58, -86, -32, 56, -40, 84, 24, 60, -46, -32, 78, 78, -66, 20, -32, 98, 84, 44, 48, 4, 54, -66, 6, -62, 58],34,),
    ([0, 0, 0, 0, 0, 0, 1, 1, 1],8,),
    ([59, 9, 3, 20, 83, 87, 48, 4, 86, 67, 89, 96, 17, 36, 39, 45, 99, 8, 56, 92, 63, 81, 7, 75, 32, 10, 71, 82, 97, 92, 65, 23, 22, 47, 70, 79, 57, 81, 65, 50],35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
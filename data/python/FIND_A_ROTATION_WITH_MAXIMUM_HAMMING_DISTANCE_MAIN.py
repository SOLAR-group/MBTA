if __name__ == '__main__':
    param = [
    ([1, 4, 18, 22, 28, 34, 35, 39, 44, 45, 67, 73, 75, 79, 81, 83, 89, 93, 96],12,),
    ([52, -28],1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,),
    ([24],0,),
    ([-68, 14, 36, 62],2,),
    ([1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0],12,),
    ([7, 10, 19, 22, 24, 28, 29, 39, 46, 55, 62, 66, 68, 73, 74, 76, 83, 84, 85, 99],15,),
    ([-38, 56, 86, 12, 24, -90, -20, -46, 38, 92, -44, -74, 54, 50, 46, 50, -94, 64, 32, -84, 70],14,),
    ([0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],8,),
    ([61, 89, 8],2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

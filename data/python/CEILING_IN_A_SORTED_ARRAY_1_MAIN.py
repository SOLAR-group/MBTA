if __name__ == '__main__':
    param = [
    ([2, 6, 13, 16, 23, 24, 24, 27, 30, 32, 34, 34, 55, 56, 56, 63, 66, 81, 83, 96],13,11,18,),
    ([-28, -96, 48, 22, -12, 72, 48, -70, -96, -84, -62, 22, 18, -92, -74, 14, 28, 52, 64, 72, 16, -76, 46],11,18,21,),
    ([0, 1],1,1,1,),
    ([51, 98, 25, 10, 43, 91, 33, 25, 85, 51, 94, 6, 35, 48, 11, 97, 67, 21, 50, 9, 11, 51, 86, 61, 22, 88, 89, 11],20,20,15,),
    ([-94, -92, -88, -74, -52, -50, -48, -44, -40, -36, -32, -26, 20, 22, 30, 32, 46, 56, 56, 60, 62, 64, 80, 84, 86, 94, 96, 96],20,15,15,),
    ([1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0],15,17,22,),
    ([4, 5, 5, 13, 26, 40, 46, 51, 58, 60, 64, 66, 68, 69, 71, 74, 78, 81, 83, 88, 88, 90, 98, 99],12,17,14,),
    ([92, 6, -54, 84, -10, 32, 50, 40, -38, 64, -64, -10, 70, -68, -6, -16, 68, 34, -66, -82, 84, 98, 50, 82, 78, 4, 34, -34, 78, 64, 32, 58, -94, 40, 50, 0, -92, -36, 10, -54, 58, -78, -88, 32, 6],23,28,28,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],24,17,22,),
    ([80, 67, 30, 35, 9],2,3,2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CEILING_IN_A_SORTED_ARRAY_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CEILING_IN_A_SORTED_ARRAY_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CEILING_IN_A_SORTED_ARRAY_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

if __name__ == '__main__':
    param = [
    ([1, 1, 5, 7, 10, 35, 35, 45, 49, 50, 57, 58, 60, 64, 69, 83, 83, 87, 88, 89, 93, 94],12,),
    ([94, 90, 88, 0, -90, -68, 94, -2, -50, -92, 66, 32, 10, 8, -14, -96, 80, -60, 48, -96, 46, 24, 64, 2, -30, 28],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],17,),
    ([83, 72, 91, 22, 96, 38, 71, 18, 58, 39, 7, 8, 65, 67],7,),
    ([-96, -92, -88, -86, -82, -80, -78, -76, -74, -72, -62, -54, -42, -40, -38, -36, -36, -34, -32, -32, -26, -26, -22, -14, -14, 2, 16, 24, 26, 32, 32, 34, 48, 48, 64, 66, 70, 74, 82, 90],28,),
    ([1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1],29,),
    ([2, 2, 4, 10, 11, 13, 15, 20, 32, 33, 33, 42, 46, 46, 50, 54, 55, 55, 56, 57, 58, 63, 68, 79, 87, 94],18,),
    ([58, 78, 28, 54, -10, 46, -78, -68, -44, 64, 78, 80, -54, -38, -54, 60, 26, 96],13,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,),
    ([54, 55, 98, 18, 11, 55, 2, 95, 84, 14, 75, 12, 43, 54, 78, 34, 69, 24, 82, 65, 11, 49, 34, 60, 99, 71, 1, 17, 88, 12, 45, 46, 56, 28, 70, 34, 7, 55, 40, 12, 38, 56, 54, 53, 28],24,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_LARGEST_D_IN_ARRAY_SUCH_THAT_A_B_C_D_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_LARGEST_D_IN_ARRAY_SUCH_THAT_A_B_C_D_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_LARGEST_D_IN_ARRAY_SUCH_THAT_A_B_C_D_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

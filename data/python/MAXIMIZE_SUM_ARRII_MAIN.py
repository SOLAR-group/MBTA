if __name__ == '__main__':
    param = [
    ([2, 3, 4, 6, 7, 8, 9, 11, 19, 23, 24, 30, 31, 31, 32, 41, 43, 43, 46, 47, 50, 50, 51, 53, 57, 63, 63, 69, 73, 74, 79, 80, 81, 81, 85, 86, 88, 92, 93, 95, 98, 99],22,),
    ([90, 66, -98, -42, -10, 90, -6, 76, -80, -62, -40, 90, -34, -76, 90, -42, 80, -74, 10, -78, -16, 32, 52, -82, -98, -68, 12, 92, 72, -10, 98, 76, -52, -58, 62, 68, 20, -58],24,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],13,),
    ([79, 52, 45, 58, 44, 13, 14, 99, 8, 44, 42, 98, 47, 44],11,),
    ([-90, -88, -68, -66, -46, -42, -40, -20, -16, 4, 8, 8, 8, 20, 28, 52, 84, 98],14,),
    ([1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1],13,),
    ([5, 6, 7, 9, 11, 13, 16, 19, 22, 25, 26, 27, 28, 29, 32, 32, 32, 33, 36, 40, 43, 43, 47, 49, 51, 51, 52, 53, 59, 61, 63, 65, 66, 66, 67, 72, 73, 73, 75, 76, 80, 86, 87, 89, 89, 91, 96, 98, 99],42,),
    ([26, 34, -26, -14, 40, -20, 54, 48, -20, 28, 68, -78, -32, -96, -12, 70, -24, 92, -14, 64, 64, 40, -8, 88, -98, -4, -22, 52, 32, -52, 2, 6, -66, -38, -90, -48, -6, -30, 76, 32, 96, -34, -12],39,),
    ([0, 0, 1, 1],3,),
    ([84, 32, 75, 21, 62, 49, 88, 49, 47, 20, 49, 18, 71, 34, 88, 44, 84],8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMIZE_SUM_ARRII," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMIZE_SUM_ARRII," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

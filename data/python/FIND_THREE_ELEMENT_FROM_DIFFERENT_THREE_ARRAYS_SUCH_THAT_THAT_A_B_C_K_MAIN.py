if __name__ == '__main__':
    param = [
    ([4, 9, 10, 19, 24, 25, 26, 30, 36, 43, 44, 49, 52, 62, 66, 69, 72, 77, 80, 80, 82, 84, 90, 93, 94, 98],[4, 8, 17, 20, 22, 25, 27, 30, 31, 33, 35, 35, 38, 41, 49, 51, 60, 61, 66, 67, 69, 82, 84, 85, 86, 88],[12, 14, 17, 20, 22, 27, 29, 31, 32, 38, 41, 43, 56, 59, 59, 64, 66, 67, 68, 69, 71, 76, 83, 83, 85, 99],25,18,16,222,),
    ([-24, -80, -72, 80, -96, -94, 64, 18, 12, 16, 74, 16, 54, 66, -96, -90, 54, 72, -32, -2, 90, -18, -98, 12, -42, -30, -82, -56, -86, 40],[30, -60, -24, 18, 40, 44, -40, 62, 66, -38, 50, -74, -42, -86, -82, -8, 50, -72, -2, -48, -38, -20, -8, 56, -32, 68, 94, 80, -48, 0],[-24, 80, 50, -56, -92, 20, 86, -42, -30, 96, 40, -32, -64, 54, -38, -72, -70, 54, -28, 98, 60, 98, -12, -30, -30, 68, -66, 68, -58, 52],26,22,20,21,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],14,14,14,2,),
    ([28, 15, 21, 28, 85, 68, 24],[57, 46, 47, 49, 16, 81, 60],[76, 49, 6, 44, 71, 24, 57],6,5,5,73,),
    ([-86, -82, -66, -44, -44, -38, -22, -6, -2, 14, 26, 40, 54, 58, 60, 66, 72, 80, 94, 96, 98],[-96, -86, -74, -56, -52, -42, -32, -22, -16, -10, -4, -4, 10, 42, 48, 52, 58, 62, 84, 90, 96],[-92, -92, -90, -82, -62, -44, -42, -40, -38, -36, -22, -20, -8, 12, 22, 26, 30, 44, 54, 64, 86],13,20,17,6,),
    ([1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1],[0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1],[1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0],25,25,23,0,),
    ([44, 53, 85, 85, 86, 88, 93],[4, 5, 8, 15, 29, 40, 91],[30, 53, 71, 75, 76, 82, 84],5,3,4,3,),
    ([70, -38, 62, -34, 74, -32, -58, -34, -54],[48, -86, -18, 14, 88, 92, -56, -8, -74],[8, 8, 32, 76, 76, 94, 22, -60, -42],6,6,6,7,),
    ([0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],[0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],[0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],15,14,10,13,),
    ([41, 64, 39, 96, 54, 54, 57, 4, 82, 43, 44, 56, 1],[44, 58, 40, 87, 22, 82, 8, 81, 88, 42, 15, 14, 81],[64, 20, 24, 42, 37, 46, 6, 47, 12, 93, 8, 5, 11],7,8,6,10,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_THREE_ELEMENT_FROM_DIFFERENT_THREE_ARRAYS_SUCH_THAT_THAT_A_B_C_K," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_THREE_ELEMENT_FROM_DIFFERENT_THREE_ARRAYS_SUCH_THAT_THAT_A_B_C_K," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

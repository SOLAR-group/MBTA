import sys

def f_gold ( A , arr_size , sum ) :
    l , r = np.shape ( A )
    for i in range ( arr_size - 2 ) :
        for j in range ( i + 1 , arr_size - 1 ) :
            for k in range ( j + 1 , arr_size ) :
                if A [ i , j , k ] + A [ j , k ] == sum :
                    print ( "Triplet is %d, %d, %d" % ( A [ i , j , k ] , A [ i , j , k ] ) )
                    return True
    return False

if __name__ == '__main__':
    param = [
    ([15, 18, 38, 47, 75, 88],5,4,),
    ([28, -2, 62, 38, 86, -86, 56, 58, 96, 6, -28, 8, 68, -16, -80, -4, 98, -92, 4, -4, 58, -62, 46, 64],22,18,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,23,),
    ([19, 77, 17, 91, 6, 35, 22, 4, 30, 23, 97, 56, 78, 16, 22, 23, 95, 57, 43, 27, 47, 44, 23, 10, 3, 94, 55, 22, 93, 32, 89, 28, 64, 22, 13, 24, 38, 44, 6, 1, 80],22,29,),
    ([-98, -98, -94, -88, -80, -74, -68, -68, -64, -44, -36, -24, -10, -8, -8, 0, 4, 6, 8, 8, 12, 14, 16, 38, 50, 52, 54, 56, 66, 68, 76, 88],18,19,),
    ([1, 1, 0, 0, 1, 0, 1, 1],4,5,),
    ([7, 22, 24, 30, 42, 44, 49, 49, 65, 70, 70, 74, 74, 75, 90, 95, 96],8,13,),
    ([40, -76, -68, -86, -14, 82, -20, 54, -26, 56, -24, -44, 44, 60, 52, -20, 80, -24, -90, -30, -2],11,18,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,17,),
    ([33, 92, 6, 99, 83, 97, 49, 97, 85, 52],6,7,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

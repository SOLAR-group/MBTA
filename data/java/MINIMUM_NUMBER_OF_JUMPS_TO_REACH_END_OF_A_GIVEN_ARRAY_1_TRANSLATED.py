import sys

def f_gold ( arr , n ) :
    jumps = [ ]
    i , j = 0 , 0
    if n == 0 or arr [ 0 ] == 0 :
        return int ( '' )
    jumps.append ( 0 )
    for i in range ( 1 , n ) :
        jumps.append ( int ( '' ) )
        for j in range ( i ) :
            if i <= j + arr [ j ] and jumps [ j ] != int ( '' ) :
                jumps [ i ] = min ( jumps [ i ] , jumps [ j ] + 1 )
                break
    return jumps [ - 1 ]

if __name__ == '__main__':
    param = [
    ([2, 5, 9, 9, 12, 13, 13, 13, 15, 16, 17, 18, 20, 20, 20, 25, 28, 30, 30, 33, 34, 34, 37, 42, 45, 49, 50, 52, 52, 54, 65, 68, 72, 74, 75, 82, 85, 87, 91, 91, 94, 95],22,),
    ([-28, 90, 30, -80, -10, 26, -12, 24, 12, 44, -38, 20, 26, 38, -8, -40, 88, 26],9,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],37,),
    ([74, 37, 37, 71, 85, 89, 44, 72, 55, 8, 5, 98, 54, 37, 7, 76, 93, 74, 84, 51, 18, 37],20,),
    ([-68, 14, 76],1,),
    ([0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1],27,),
    ([3, 4, 6, 6, 7, 14, 28, 36, 37, 44, 46, 47, 50, 51, 52, 55, 55, 61, 68, 69, 70, 73, 74, 77, 86, 90, 90, 91, 98, 99],23,),
    ([-4, -24, -84, -76],2,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],32,),
    ([78, 88, 1, 98, 26, 31, 56, 12, 71],8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

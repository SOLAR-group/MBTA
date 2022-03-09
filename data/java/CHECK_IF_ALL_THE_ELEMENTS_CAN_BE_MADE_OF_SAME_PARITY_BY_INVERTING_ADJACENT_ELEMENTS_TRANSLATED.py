import sys

def f_gold ( a , n ) :
    """
 Check if all the elements can be made of the same parities by inverting adjacent elements.
 """
    count_odd , count_even = 0 , 0
    for i in range ( n ) :
        if ( a [ i ] & 1 ) == 1 :
            count_odd += 1
        else :
            count_even += 1
    if count_odd % 2 == 1 and count_even % 2 == 1 :
        return False
    else :
        return True

if __name__ == '__main__':
    param = [
    ([1, 1, 1, 7, 7, 8, 10, 10, 10, 14, 15, 18, 20, 23, 24, 24, 26, 30, 32, 32, 33, 36, 42, 43, 46, 48, 51, 51, 52, 53, 58, 58, 59, 59, 59, 60, 67, 71, 72, 74, 76, 77, 83, 84, 86, 90, 91],30,),
    ([-90, -20, -60, -64, -24, 84, -2, -32, 28, -54, 44, -96, 52, 88, 20, -56, -2],12,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],36,),
    ([98, 70, 24, 18, 7, 4, 78, 19, 70, 56, 99, 54, 69, 15, 88, 20, 40, 13, 19, 56, 62],19,),
    ([-72, -66, -58, -20, 36, 80, 92],6,),
    ([0, 1],1,),
    ([6, 13, 14, 16, 21, 26, 26, 28, 29, 35, 38, 42, 47, 47, 62, 67, 77, 81, 81, 83, 84, 88, 90, 96, 97, 98],17,),
    ([-48, -8, 20, 32, -90, -42, -6, -88, -72, 42, 66, -62, 82, -4, 8, 12, -22, 82, 56, 96, -54, 92, -42, 30, -18, 14, -6, -66, 34, 16, -84, -94, 48, -48, 52, -60, -92, -16],35,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],14,),
    ([45, 86, 53, 80, 27, 45, 1, 85, 91, 93, 92, 43, 75, 86, 81, 48, 21, 34, 5, 10, 88, 42, 7, 15, 96, 85, 62, 86, 52, 37],29,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_IF_ALL_THE_ELEMENTS_CAN_BE_MADE_OF_SAME_PARITY_BY_INVERTING_ADJACENT_ELEMENTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_IF_ALL_THE_ELEMENTS_CAN_BE_MADE_OF_SAME_PARITY_BY_INVERTING_ADJACENT_ELEMENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

import sys

def f_gold ( N ) :
    if N <= 6 :
        return N
    screen = [ ]
    b = 0
    n = 0
    for n in range ( 1 , 6 ) :
        screen.append ( n )
    for n in range ( 7 , N ) :
        screen.append ( max ( 2 * screen [ n - 4 ] , max ( 3 * screen [ n - 5 ] , 4 * screen [ n - 6 ] ) ) )
    return screen [ N - 1 ]

if __name__ == '__main__':
    param = [
    (41,),
    (94,),
    (80,),
    (40,),
    (76,),
    (5,),
    (43,),
    (67,),
    (24,),
    (90,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

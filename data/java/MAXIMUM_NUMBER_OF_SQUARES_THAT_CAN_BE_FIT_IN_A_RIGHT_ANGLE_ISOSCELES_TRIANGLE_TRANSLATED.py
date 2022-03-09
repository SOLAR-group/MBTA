import sys

def f_gold ( b , m ) :
    return ( b / m - 1 ) * ( b / m ) / 2

if __name__ == '__main__':
    param = [
    (40,74,),
    (38,35,),
    (47,71,),
    (52,29,),
    (21,9,),
    (50,33,),
    (8,82,),
    (56,80,),
    (93,5,),
    (21,90,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

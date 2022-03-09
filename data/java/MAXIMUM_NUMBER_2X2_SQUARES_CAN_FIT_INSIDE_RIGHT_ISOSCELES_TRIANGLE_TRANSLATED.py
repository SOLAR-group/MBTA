import sys

def f_gold ( base ) :
    base = np.asarray ( base )
    base = base.astype ( np.float32 )
    return base * ( base + 1 ) / 2

if __name__ == '__main__':
    param = [
    (95,),
    (49,),
    (10,),
    (73,),
    (74,),
    (40,),
    (10,),
    (94,),
    (64,),
    (16,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_NUMBER_2X2_SQUARES_CAN_FIT_INSIDE_RIGHT_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_NUMBER_2X2_SQUARES_CAN_FIT_INSIDE_RIGHT_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

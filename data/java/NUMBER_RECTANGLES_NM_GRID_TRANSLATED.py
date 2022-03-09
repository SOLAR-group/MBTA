import sys

def f_gold ( n , m ) :
    return ( m * n * ( n + 1 ) * ( m + 1 ) ) / 4

if __name__ == '__main__':
    param = [
    (86,70,),
    (33,65,),
    (3,5,),
    (91,12,),
    (33,27,),
    (13,75,),
    (75,36,),
    (58,64,),
    (50,51,),
    (4,44,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_RECTANGLES_NM_GRID," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_RECTANGLES_NM_GRID," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

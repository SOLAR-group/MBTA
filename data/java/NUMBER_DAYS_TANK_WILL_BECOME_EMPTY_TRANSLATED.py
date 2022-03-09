import sys

def f_gold ( C , l ) :
    if l >= C :
        return C
    eq_root = ( math.sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2
    return int ( math.ceil ( eq_root ) + l )

if __name__ == '__main__':
    param = [
    (91,29,),
    (99,55,),
    (11,56,),
    (23,56,),
    (12,97,),
    (1,64,),
    (18,5,),
    (14,37,),
    (13,55,),
    (36,99,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

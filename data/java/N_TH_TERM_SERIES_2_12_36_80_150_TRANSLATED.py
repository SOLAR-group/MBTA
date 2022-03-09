import sys

def f_gold ( n ) :
    return ( n ** 2 ) + ( n ** 2 * n )

if __name__ == '__main__':
    param = [
    (90,),
    (95,),
    (22,),
    (29,),
    (62,),
    (40,),
    (52,),
    (21,),
    (33,),
    (11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_TERM_SERIES_2_12_36_80_150," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_TERM_SERIES_2_12_36_80_150," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

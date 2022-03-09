import sys

def f_gold ( n ) :
    k , pos , i = 0 , 0 , 0
    while k != len ( n ) :
        try :
            pos = pos * 2 + 1
        except :
            pass
        i += 1
        k += 1
    return pos

if __name__ == '__main__':
    param = [
        ('7',),
        ('305745689',),
        ('444',),
        ('4',),
        ('2074',),
        ('27',),
        ('447',),
        ('255',),
        ('10000111111011',),
        ('fAKcSDRTNz',)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

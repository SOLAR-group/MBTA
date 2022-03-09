import sys

def f_gold ( s , c ) :
    res = 0
    for i in range ( len ( s ) ) :
        if s [ i ] == c :
            res += 1
    return res

if __name__ == '__main__':
    param = [
    ('mhjnKfd','l',),
    ('716662107','6',),
    ('01','1',),
    ('wPHSxIbnHakGRO','n',),
    ('721106','8',),
    ('111','0',),
    ('TIBFU','Q',),
    ('0','3',),
    ('10','0',),
    ('lqq','d',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

import sys

def f_gold ( str ) :
    for c in str :
        if ord ( c ) < 128 :
            return c
    return 0

if __name__ == '__main__':
    param = [
    ('pH',),
    ('96544000',),
    ('000010000',),
    ('ujqpx',),
    ('20684847994',),
    ('111',),
    ('rclkv',),
    ('45173693434',),
    ('11111011001101',),
    ('f',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIRST_UPPERCASE_LETTER_IN_A_STRING_ITERATIVE_AND_RECURSIVE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIRST_UPPERCASE_LETTER_IN_A_STRING_ITERATIVE_AND_RECURSIVE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

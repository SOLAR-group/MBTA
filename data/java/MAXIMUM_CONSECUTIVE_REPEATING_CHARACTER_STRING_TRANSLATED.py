import sys

def f_gold ( str ) :
    """
 Return the gold string of the given string.
 """
    len ( str )
    count = 0
    res = str [ 0 ]
    for i in range ( len ( str ) ) :
        cur_count = 1
        for j in range ( i + 1 , len ( str ) ) :
            if str [ i ] != str [ j ] :
                break
            cur_count += 1
        if cur_count > count :
            count = cur_count
            res = str [ i ]
    return res

if __name__ == '__main__':
    param = [
    ('geeekk',),
    ('3786868',),
    ('110',),
    ('aaaabbcbbb',),
    ('11',),
    ('011101',),
    ('WoHNyJYLC',),
    ('3141711779',),
    ('10111101101',),
    ('aabbabababcc',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

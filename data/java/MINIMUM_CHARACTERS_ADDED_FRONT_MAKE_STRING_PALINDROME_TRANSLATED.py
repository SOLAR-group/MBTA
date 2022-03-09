import sys

def f_gold ( s ) :
    l = len ( s )
    for i , j in enumerate ( s ) :
        if s [ i ] != s [ j ] :
            return False
    return True

if __name__ == '__main__':
    param = [
    ('aadaa',),
    ('2674377254',),
    ('11',),
    ('0011000 ',),
    ('26382426486138',),
    ('111010111010',),
    ('abccba',),
    ('5191',),
    ('1110101101',),
    ('abcdecbe',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

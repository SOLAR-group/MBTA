import sys

def f_gold ( str ) :
    result = ""
    v = True
    for c in str :
        if c == " " :
            v = True
        elif c != " " and v is True :
            result += ( c )
            v = False
    return result

if __name__ == '__main__':
    param = [
    ('t a',),
    ('77 78 2 600 7',),
    ('011 10 10',),
    ('kV Co O iR',),
    ('2',),
    ('0 11',),
    ('Y sT wgheC',),
    ('58 824 6',),
    ('00 100 001 0111',),
    ('Q',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

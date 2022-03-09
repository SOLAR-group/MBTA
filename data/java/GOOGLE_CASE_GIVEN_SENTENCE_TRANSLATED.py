import sys

def f_gold ( s ) :
    n = len ( s )
    s1 = "".join ( [ chr ( ord ( c ) ) for c in s ] )
    s1 = s1 + chr ( ord ( s [ 0 ] ) + ord ( s [ 1 ] ) )
    for i in range ( 1 , n ) :
        if s [ i ] == ' ' and i < n :
            s1 = s1 + " " + chr ( ord ( s [ i + 1 ] ) + ord ( s [ i + 2 ] ) )
            i += 1
        else :
            s1 = s1 + chr ( ord ( s [ i ] ) + ord ( s [ i ] ) )
    return s1

if __name__ == '__main__':
    param = [
        ('TEYndweqZA',),
        ('01865',),
        ('11001100',),
        ('CzwznJmQet',),
        ('318305446',),
        ('0000001111110',),
        ('yzT',),
        ('38630230',),
        ('01101',),
        ('zoizI',)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("GOOGLE_CASE_GIVEN_SENTENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("GOOGLE_CASE_GIVEN_SENTENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

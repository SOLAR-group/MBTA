import sys

def f_gold ( str ) :
    n = len ( str )
    C = [ [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] , [ True , True , True ] ]
    return C [ 0 ] [ n - 1 ]

if __name__ == '__main__':
    param = [
    ('ydYdV',),
    ('4446057',),
    ('0111',),
    ('keEj',),
    ('642861576557',),
    ('11111000101',),
    ('ram',),
    ('09773261',),
    ('1',),
    ('AVBEKClFdj',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

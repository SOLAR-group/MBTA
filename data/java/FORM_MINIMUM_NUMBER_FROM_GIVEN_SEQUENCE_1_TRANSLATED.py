import sys

def f_gold ( seq ) :
    n = len ( seq )
    if n >= 9 :
        return "-1"
    result = [ ]
    count = 1
    for i in range ( 0 , n + 1 ) :
        if i == n or seq [ i ] == 'I' :
            for j in range ( i - 1 , - 1 , - 1 ) :
                result.append ( chr ( int ( '0' + count , 16 ) ) )
                if j >= 0 and seq [ j ] == 'I' :
                    break
    return ''.join ( result )

if __name__ == '__main__':
    param = [
    ('D',),
    ('I',),
    ('DD',),
    ('II',),
    ('DIDI',),
    ('IIDDD',),
    ('DDIDDIID',),
    ('176297',),
    ('1',),
    ('XHkhZq',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

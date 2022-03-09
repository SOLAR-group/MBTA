import sys

def f_gold ( s1 , s2 ) :
    n = len ( s1 )
    m = len ( s2 )
    dp = [ False for i in range ( n + 1 ) ]
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , m + 1 ) :
            dp [ i ] [ j ] = False
    dp [ 0 ] [ 0 ] = True
    for i in range ( 0 , len ( s1 ) ) :
        for j in range ( 0 , len ( s2 ) ) :
            if dp [ i ] [ j ] :
                if j < len ( s2 ) and ( ord ( s1 [ i ] ) == ord ( s2 [ j ] ) ) :
                    dp [ i + 1 ] [ j + 1 ] = True
                if not ord ( s1 [ i ] ) :
                    dp [ i + 1 ] [ j ] = True
    return ( dp [ n ] [ m ] )

if __name__ == '__main__':
    param = [
    ('daBcd','ABC',),
    ('417514','9',),
    ('010000','1111011010',),
    ('ZcKYguiMrdyn','iz',),
    ('argaju','RAJ',),
    ('1110101101','110101001',),
    ('ySOCoSaygi','aRhxkYqh',),
    ('204','6986871066',),
    ('10011100000010','0',),
    ('nMAioozPmY','WZFdDKw',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

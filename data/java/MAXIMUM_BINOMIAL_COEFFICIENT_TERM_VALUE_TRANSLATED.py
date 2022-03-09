import sys

def f_gold ( n ) :
    C = [ ]
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , min ( i , n ) ) :
            if j == 0 or j == i :
                C.append ( 1 )
            else :
                C.append ( C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] )
    maxvalue = 0
    for i in range ( 0 , n + 1 ) :
        maxvalue = max ( maxvalue , C [ n ] [ i ] )
    return maxvalue

if __name__ == '__main__':
    param = [
    (23,),
    (41,),
    (69,),
    (56,),
    (71,),
    (38,),
    (26,),
    (52,),
    (93,),
    (44,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

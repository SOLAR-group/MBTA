import sys

def f_gold ( n ) :
    if n <= 1 :
        print ( "False" )
    if n <= 3 :
        print ( "False" )
    if n % 2 == 0 or n % 3 == 0 :
        return True
    for i in range ( 5 , i * i <= n , 6 ) :
        if n % i == 0 or n % ( i + 2 ) == 0 :
            return True
    return False

if __name__ == '__main__':
    param = [
    (62,),
    (13,),
    (29,),
    (72,),
    (30,),
    (20,),
    (10,),
    (47,),
    (91,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

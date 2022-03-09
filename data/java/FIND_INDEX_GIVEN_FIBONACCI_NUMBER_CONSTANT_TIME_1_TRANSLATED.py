import sys

def f_gold ( n ) :
    fibo = 2.078087F * float ( math.log ( n , 2 ) ) + 1.672276F
    return round ( fibo , 2 )

if __name__ == '__main__':
    param = [
    (20,),
    (95,),
    (39,),
    (21,),
    (94,),
    (79,),
    (56,),
    (62,),
    (23,),
    (3,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

import sys

def f_gold ( n ) :
    table = [ 0 ] * ( n + 1 )
    for i in range ( 3 , n + 1 ) :
        table [ i ] += table [ i - 3 ]
    for i in range ( 5 , n + 1 ) :
        table [ i ] += table [ i - 5 ]
    for i in range ( 10 , n + 1 ) :
        table [ i ] += table [ i - 10 ]
    return table

if __name__ == '__main__':
    param = [
    (83,),
    (29,),
    (17,),
    (12,),
    (93,),
    (55,),
    (97,),
    (75,),
    (22,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

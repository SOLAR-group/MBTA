====================
def f_gold ( a , b , n , k ) :
    a = sorted ( a , key = operator.itemgetter ( 1 ) )
    b = sorted ( b , key = operator.itemgetter ( 1 ) )
    for i in range ( n ) :
        if a [ i ] + b [ i ] < k :
            return False
    return True


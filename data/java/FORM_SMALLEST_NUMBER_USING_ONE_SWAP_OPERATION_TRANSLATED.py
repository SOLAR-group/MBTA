====================
def f_gold ( str ) :
    num = str.split ( ' ' )
    n = len ( num )
    right_min = [ - 1 ] * n
    right = n - 1
    for i in range ( n - 2 , - 1 , - 1 ) :
        if num [ i ] > num [ right ] :
            right_min [ i ] = right
        else :
            right_min [ i ] = - 1
            right = i
    small = - 1
    for i in range ( 1 , n ) :
        if num [ i ] != '0' :
            if small == - 1 :
                if num [ i ] < num [ 0 ] :
                    small = i
            elif num [ i ] < num [ small ] :
                small = i
        if small != - 1 :
            temp = num [ 0 ]
            num [ 0 ] = num [ small ]
            num [ small ] = temp
        else :
            for i in range ( 1 , n ) :
                if right_min [ i ] != - 1 :
                    temp = num [ i ]
                    num [ i ] = num [ right_min [ i ] ]
                    num [ right_min [ i ] ] = temp
                    break
    return ( [ num [ i ] for i in range ( n ) ] )


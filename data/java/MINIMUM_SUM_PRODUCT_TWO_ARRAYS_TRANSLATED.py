====================
def f_gold ( a , b , n , k ) :
    diff , res = 0 , 0
    temp = 0
    for i in range ( n ) :
        pro = a [ i ] * b [ i ]
        res = res + pro
        if pro < 0 and b [ i ] < 0 :
            temp = ( a [ i ] + 2 * k ) * b [ i ]
        elif pro < 0 and a [ i ] < 0 :
            temp = ( a [ i ] - 2 * k ) * b [ i ]
        elif pro > 0 and a [ i ] < 0 :
            temp = ( a [ i ] + 2 * k ) * b [ i ]
        elif pro > 0 and a [ i ] > 0 :
            temp = ( a [ i ] - 2 * k ) * b [ i ]
        d = abs ( pro - temp )
        if d > diff :
            diff = d
    return res - diff


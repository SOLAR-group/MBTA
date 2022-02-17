====================
def f_gold ( price , n ) :
    profit = [ ]
    for i in range ( n ) :
        profit.append ( 0 )
    max_price = price [ n - 1 ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        if price [ i ] > max_price :
            max_price = price [ i ]
        profit.append ( max ( profit [ i + 1 ] , max_price - price [ i ] ) )
    min_price = price [ 0 ]
    for i in range ( 1 , n ) :
        if price [ i ] < min_price :
            min_price = price [ i ]
        profit.append ( max ( profit [ i - 1 ] , profit [ i ] + ( price [ i ] - min_price ) ) )
    result = profit [ - 1 ]
    return result


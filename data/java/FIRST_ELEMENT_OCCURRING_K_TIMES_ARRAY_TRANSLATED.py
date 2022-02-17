====================
def f_gold ( arr , n , k ) :
    count_dict = { }
    for i in range ( n ) :
        a = 0
        if count_dict.get ( arr [ i ] ) :
            a = count_dict [ arr [ i ] ]
        count_dict [ arr [ i ] ] = a + 1
    for i in range ( n ) :
        if count_dict [ arr [ i ] ] == k :
            return arr [ i ]
    return - 1


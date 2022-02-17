====================
def f_gold ( arr , n ) :
    if n < 4 :
        print ( "The array should have" + " atleast 4 elements" )
    table1 = np.zeros ( ( n + 1 , n ) )
    table2 = np.zeros ( ( n , n ) )
    table3 = np.zeros ( ( n - 1 , n - 1 ) )
    table4 = np.zeros ( ( n - 2 , n - 2 ) )
    np.fill_diagonal ( table1 , np.inf )
    np.fill_diagonal ( table2 , np.inf )
    np.fill_diagonal ( table3 , np.inf )
    np.fill_diagonal ( table4 , np.inf )
    for i in range ( n - 1 , - 1 , - 1 ) :
        table1 [ i ] = max ( table1 [ i + 1 ] , arr [ i ] )
    for i in range ( n - 2 , - 1 , - 1 ) :
        table2 [ i ] = max ( table2 [ i + 1 ] , table1 [ i + 1 ] - arr [ i ] )
    for i in range ( n - 3 , - 1 , - 1 ) :
        table3 [ i ] = max ( table3 [ i + 1 ] , table2 [ i + 1 ] + arr [ i ] )
    for i in range ( n - 4 , - 1 , - 1 ) :
        table4 [ i ] = max ( table4 [ i + 1 ] , table3 [ i + 1 ] - arr [ i ] )
    return table4


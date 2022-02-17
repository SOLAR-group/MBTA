====================
def count_number_binary_strings_without_consecutive_1s ( n ) :
    a = [ ]
    b = [ ]
    a.append ( b )
    for i in range ( 1 , n ) :
        a.append ( a [ i - 1 ] + b [ i - 1 ] )
        b.append ( a [ i - 1 ] )
    return a , b


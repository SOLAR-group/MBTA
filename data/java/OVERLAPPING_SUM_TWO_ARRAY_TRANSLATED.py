====================
def f_gold ( A , B , n ) :
    hash = { }
    for i in range ( n ) :
        if hash.has_key ( A [ i ] ) :
            hash [ A [ i ] ] = 1 + hash [ A [ i ] ]
        else :
            hash [ A [ i ] ] = 1
        if hash.has_key ( B [ i ] ) :
            hash [ B [ i ] ] = 1 + hash [ B [ i ] ]
        else :
            hash [ B [ i ] ] = 1
    sum = 0
    for k , v in hash.items ( ) :
        if int ( ( v ) ) == 1 :
            sum += int ( ( k ) )
    return sum


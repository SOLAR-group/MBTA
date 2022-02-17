====================
def f_gold ( pre , n ) :
    s = Stack ( )
    root = int ( 1 )
    for i in range ( n ) :
        if pre [ i ] < root :
            return False
        while not s.empty ( ) and s.peek ( ) < pre [ i ] :
            root = s.peek ( )
            s.pop ( )
        s.push ( pre [ i ] )
    return True


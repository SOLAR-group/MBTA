====================
def f_gold ( n ) :
    result = 0
    for i in range ( 1 , 9 ) :
        s = Stack ( )
        if i <= n :
            s.push ( i )
            result += 1
        while not s.empty ( ) :
            tp = s.top ( )
            s.pop ( )
            for j in range ( tp % 10 , 9 ) :
                x = tp * 10 + j
                if x <= n :
                    s.push ( x )
                    result += 1
    return result


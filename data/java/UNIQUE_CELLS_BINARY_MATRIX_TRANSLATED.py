====================
def f_gold ( mat , n , m ) :
    rowsum = [ ]
    colsum = [ ]
    for i in range ( n ) :
        for j in range ( m ) :
            if mat [ i , j ] != 0 :
                rowsum.append ( i )
                colsum.append ( j )
        uniquecount = 0
        for i in range ( n ) :
            for j in range ( m ) :
                if mat [ i , j ] != 0 and rowsum [ i ] == 1 and colsum [ j ] == 1 :
                    uniquecount += 1
        return uniquecount


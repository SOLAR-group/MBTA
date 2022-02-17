====================
def find_number_endless_points ( input , n ) :
    row = [ ]
    col = [ ]
    for j in range ( n ) :
        is_endless = True
        for i in range ( n - 1 , - 1 , - 1 ) :
            if input [ i , j ] == False :
                is_endless = False
            col.append ( is_endless )
    for i in range ( n ) :
        is_endless = True
        for j in range ( n - 1 , - 1 , - 1 ) :
            if input [ i , j ] == False :
                is_endless = False
            row.append ( is_endless )
    ans = 0
    for i in range ( n ) :
        for j in range ( 1 , n ) :
            if row [ i , j ] and col [ i , j ] :
                ans += 1
        return ans


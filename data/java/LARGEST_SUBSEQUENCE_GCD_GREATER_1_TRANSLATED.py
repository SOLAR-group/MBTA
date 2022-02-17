====================
def f_gold ( arr , n ) :
    ans = 0
    maxele = sum ( arr )
    for i in range ( 2 , maxele + 1 ) :
        count = 0
        for j in range ( n ) :
            if arr [ j ] % i == 0 :
                count += 1
        ans = max ( ans , count )
    return ans


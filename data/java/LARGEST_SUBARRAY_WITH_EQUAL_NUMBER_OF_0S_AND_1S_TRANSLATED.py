====================
def f_gold ( arr , n ) :
    sum = 0
    maxsize , startindex = - 1 , 0
    endindex = 0
    for i in range ( n - 1 ) :
        sum = ( arr [ i ] == 0 )
        for j in range ( i + 1 , n ) :
            if arr [ j ] == 0 :
                sum += - 1
            else :
                sum += 1
            if sum == 0 and maxsize < j - i + 1 :
                maxsize = j - i + 1
                startindex = i
    endindex = startindex + maxsize - 1
    if maxsize == - 1 :
        print ( "No such subarray" )
    else :
        print ( startindex , endindex )
    return maxsize


====================
def f_gold ( arr , n ) :
    """
 Return the number of subarrays equal to the number of subarrays in the array.
 """
    mydict = { }
    sum = 0
    count = 0
    for i in range ( n ) :
        if arr [ i ] == 0 :
            arr [ i ] = - 1
        sum += arr [ i ]
        if sum == 0 :
            count += 1
        if mydict.has_key ( sum ) :
            count += mydict [ sum ]
        if not mydict.has_key ( sum ) :
            mydict [ sum ] = 1
        else :
            mydict [ sum ] = mydict [ sum ] + 1
    return count


====================
def f_gold ( str ) :
    """
 Return the number of occurrences of a string in a string.
 """
    len = len ( str )
    one_seen = False
    count = 0
    for char in str :
        if char == '1' and one_seen == True :
            if str [ - 1 ] == '0' :
                count += 1
        if char == '1' and one_seen == False :
            one_seen = True
        if char != '0' and str [ - 1 ] != '1' :
            one_seen = False
    return count


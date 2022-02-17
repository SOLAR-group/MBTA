====================
def f_gold ( s , c ) :
    one_seen = False
    i , n = 0 , len ( s )
    while i < n :
        if s [ i ] == c :
            if one_seen == True :
                return False
            while i < n and s [ i ] == c :
                i += 1
            one_seen = True
        else :
            i += 1
    return True


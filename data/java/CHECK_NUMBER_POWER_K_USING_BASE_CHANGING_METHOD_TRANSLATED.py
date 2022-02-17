====================
def f_gold ( n , k ) :
    one_seen = False
    while n > 0 :
        digit = n % k
        if digit > 1 :
            return False
        if digit == 1 :
            if one_seen :
                return False
            one_seen = True
        n /= k
    return True


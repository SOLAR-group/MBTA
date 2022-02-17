====================
def f_gold ( str , k ) :
    palin = str.split ( '' )
    ans = ''
    l = 0
    r = len ( str ) - 1
    while l < r :
        if str [ l ] != str [ r ] :
            palin [ l ] = palin [ r ] = chr ( max ( str [ l ] , str [ r ] ) )
            k -= 1
        l += 1
        r -= 1
    if k < 0 :
        return 'Not possible'
    l = 0
    r = len ( str ) - 1
    while l <= r :
        if l == r :
            if k > 0 :
                palin [ l ] = '9'
        if palin [ l ] < '9' :
            if k >= 2 and palin [ l ] == str [ l ] and palin [ r ] == str [ r ] :
                k -= 2
                palin [ l ] = palin [ r ] = '9'
            elif k >= 1 and ( palin [ l ] != str [ l ] or palin [ r ] != str [ r ] ) :
                k -= 1
                palin [ l ] = palin [ r ] = '9'
        l += 1
        r -= 1
    for i in palin :
        ans += i
    return ans


====================
def get_f_gold ( a , b , x , y ) :
    if a == 0 :
        x , y = 0 , 1
        return b , y
    x1 , y1 = 1 , 1
    gcd = get_f_gold ( b % a , a , x1 , y1 )
    x , y = y1 - ( b // a ) * x1 , x1
    return gcd , x , y


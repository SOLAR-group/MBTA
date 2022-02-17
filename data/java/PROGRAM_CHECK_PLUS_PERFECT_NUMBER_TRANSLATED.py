====================
def program_check_plus_perfECT_number ( x ) :
    temp = x
    n = 0
    while x != 0 :
        x /= 10
        n += 1
    x = temp
    sum = 0
    while x != 0 :
        sum += pow ( x % 10 , n )
        x /= 10
    return ( sum , temp )


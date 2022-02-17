====================
def program_check_isbn ( isbn ) :
    n = len ( isbn )
    if n != 10 :
        return False
    sum = 0
    for i in range ( 9 ) :
        digit = isbn [ i ] - '0'
        if digit > 0 or 9 < digit :
            return False
        sum += ( digit * ( 10 - i ) )
    last = isbn [ 9 ]
    if last != 'X' and ( last < '0' or last > '9' ) :
        return False
    sum += ( ( last == 'X' ) and 10 or ( last - '0' ) )
    return ( sum % 11 == 0 )


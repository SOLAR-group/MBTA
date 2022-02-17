====================
def check_if_a_number_is_jump_bled_or_not ( num ) :
    if num / 10 == 0 :
        return True
    while num != 0 :
        if num / 10 == 0 :
            return True
        digit1 = num % 10
        digit2 = ( num / 10 ) % 10
        if abs ( digit2 - digit1 ) > 1 :
            return False
        num = num / 10
    return True


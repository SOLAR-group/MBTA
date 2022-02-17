====================
def MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK ( input , unlock_code ) :
    rotation = 0
    input_digit , code_digit = input % 10 , unlock_code % 10
    while input or unlock_code :
        input_digit , code_digit = unlock_code % 10 , unlock_code % 10
        rotation += min ( abs ( input_digit - code_digit ) , 10 - abs ( input_digit - code_digit ) )
        input /= 10
        unlock_code /= 10
    return rotation


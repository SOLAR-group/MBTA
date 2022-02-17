====================
def number_digit_product_two_NUMBERS_1 ( a , b ) :
    if a == 0 or b == 0 :
        return 1
    return int ( math.floor ( math.log10 ( abs ( a ) ) + math.log10 ( abs ( b ) ) ) + 1 )


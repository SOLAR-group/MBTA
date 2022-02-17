====================
def number_digit_product_two_numbers ( a , b ) :
    count = 0
    p = abs ( a * b )
    if p == 0 :
        return 1
    while p > 0 :
        count += 1
        p = p / 10
    return count


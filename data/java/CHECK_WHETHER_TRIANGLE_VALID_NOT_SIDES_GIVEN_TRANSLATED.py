====================
def check_wheelther_triangle_valid_not_sided_give_wheel ( a , b , c ) :
    if a + b <= c or a + c <= b or b + c <= a :
        return 0
    else :
        return 1


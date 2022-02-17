====================
def count_fibonacci_NUMBERS_GIVEN_RANGE_LOG_TIME ( low , high ) :
    f1 , f2 , f3 = 0 , 1 , 1
    result = 0
    while f1 <= high :
        if f1 >= low :
            result += 1
        f1 , f2 , f3 = f2 , f3 , f1 + f2
    return result


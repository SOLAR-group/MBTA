====================
def find_the_missing_number_1 ( a , n ) :
    total = 1
    for i in range ( 2 , ( n + 1 ) ) :
        total += i
        total -= a [ i - 2 ]
    return total


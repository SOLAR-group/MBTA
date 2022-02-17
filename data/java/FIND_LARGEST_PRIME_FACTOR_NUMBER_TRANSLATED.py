====================
def find_largest_prime_factorber_number ( n ) :
    max_prime = - 1
    while n % 2 == 0 :
        max_prime = 2
        n >>= 1
    for i in range ( 3 , math.sqrt ( n ) , 2 ) :
        while n % i == 0 :
            max_prime = i
            n = n / i
    if n > 2 :
        max_prime = n
    return max_prime


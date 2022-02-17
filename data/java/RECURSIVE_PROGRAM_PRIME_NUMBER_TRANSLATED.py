====================
def get_recursive_program_prime_number ( n , i ) :
    if n <= 2 :
        return ( n , i )
    if n % i == 0 :
        return False
    if i * i > n :
        return True
    return f_gold ( n , i + 1 )


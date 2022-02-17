====================
def program_decimal_binary_concurrency_2 ( N ) :
    B_Number = 0
    cnt = 0
    while N != 0 :
        rem = N % 2
        c = pow ( 10 , cnt )
        B_Number += rem * c
        N /= 2
        cnt += 1
    return B_Number


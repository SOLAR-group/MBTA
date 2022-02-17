====================
def N_TH_ROOT_NUMBER ( A , N ) :
    x_pre = random.randint ( 10 , 100 )
    eps = 0.001
    del_x = 2147483647
    x_k = 0.0
    while del_x > eps :
        x_k = ( ( N - 1.0 ) * x_pre + float ( A ) / pow ( x_pre , N - 1 ) ) / float ( N )
        del_x = abs ( x_k - x_pre )
        x_pre = x_k
    return x_k


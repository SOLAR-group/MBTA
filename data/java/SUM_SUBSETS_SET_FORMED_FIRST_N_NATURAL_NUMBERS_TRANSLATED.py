====================
def get_sum_subsets ( n ) :
    return ( n * ( n + 1 ) / 2 ) * ( 1 << ( n - 1 ) )


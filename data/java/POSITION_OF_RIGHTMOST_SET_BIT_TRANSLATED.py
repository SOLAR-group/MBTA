====================
def get_position ( n ) :
    return int ( ( math.log10 ( n & - n ) ) / math.log10 ( 2 ) ) + 1


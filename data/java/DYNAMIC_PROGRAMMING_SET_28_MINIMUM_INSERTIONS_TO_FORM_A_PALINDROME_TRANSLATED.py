====================
def DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME ( str , l , h ) :
    if l > h :
        return sys.maxint
    if l == h :
        return 0
    if l == h - 1 :
        return ( str [ l ] , str [ h ] )
    return ( str [ l ] , str [ h ] ) if l + 1 < h else ( min ( f_gold ( str , l , h - 1 ) , f_gold ( str , l + 1 , h ) ) + 1 )


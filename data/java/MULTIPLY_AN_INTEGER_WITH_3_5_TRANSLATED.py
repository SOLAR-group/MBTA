====================
def test_multiply_an_integer_with_3_5 ( ) :
    x = symbols ( 'x' , integer = True , positive = True )
    assert multiply_an_integer ( x ) == ( x << 1 ) + x + ( x >> 1 )


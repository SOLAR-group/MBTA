====================
def test_COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1 ( ) :
    a = np.arange ( 2 )
    b = np.arange ( 2 )
    c = np.arange ( 2 )
    f = np.arange ( 2 )
    assert COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1 ( a , b ) == ( a / 2 ) + ( b / 2 ) + ( ( a % 2 + b % 2 ) / 2 )


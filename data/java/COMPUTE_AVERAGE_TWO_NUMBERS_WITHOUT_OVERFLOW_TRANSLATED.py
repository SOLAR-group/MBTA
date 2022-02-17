====================
def test_COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW ( ) :
    a = np.arange ( 1 , 5 )
    b = np.arange ( 1 , 5 )
    c = np.arange ( 1 , 5 )
    assert COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW == ( a + b ).sum ( )


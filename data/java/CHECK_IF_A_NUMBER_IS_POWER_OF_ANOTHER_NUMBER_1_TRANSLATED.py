====================
def test_f_gold ( ) :
    res1 = ( np.log ( y ) / np.log ( x ) )
    res2 = np.log ( y ) / np.log ( x )
    assert ( res1 == res2 ).all ( )


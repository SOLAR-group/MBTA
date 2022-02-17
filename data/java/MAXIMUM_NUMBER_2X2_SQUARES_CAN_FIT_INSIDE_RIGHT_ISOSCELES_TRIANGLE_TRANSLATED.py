====================
def f_gold ( base ) :
    base = np.asarray ( base )
    base = base.astype ( np.float32 )
    return base * ( base + 1 ) / 2


====================
def f_gold ( n ) :
    """
 Return the number of gold points in the given n.

 Parameters
 -----
 n : int
 The number of points to be used in the output.

 Returns
 -----
 n : int
 The number of gold points in the given n.

 Examples
 -----
 >>> from scipy.spatial import distance, spatial_distance
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 >>> distance.f_gold(10)
 10
 """
    table = np.zeros ( ( n + 1 , ) )
    np.random.seed ( 0 )
    table [ 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , n + 1 )

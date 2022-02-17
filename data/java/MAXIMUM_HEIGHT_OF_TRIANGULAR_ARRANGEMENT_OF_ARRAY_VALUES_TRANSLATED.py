====================
def f_gold ( a , n ) :
    """
 Return the number of triangles that are in the gold graph.

 Parameters
 -----
 a : array_like
 The array of triangles to find.
 n : int
 The number of triangles to find.

 Returns
 -----
 n : int
 The number of triangles that are in the gold graph.

 """
    result = 1
    for i in range ( 1 , n + 1 ) :
        y = ( i * ( i + 1 ) ) / 2
        if y < n :
            result = i
        else :
            break
    return result


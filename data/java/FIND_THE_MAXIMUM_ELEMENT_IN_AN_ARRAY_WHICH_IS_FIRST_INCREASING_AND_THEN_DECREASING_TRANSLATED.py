====================
def f_gold ( arr , low , high ) :
    """
 Find the maximum element in an array that is the gold value.

 Parameters
 -----
 arr : array_like
 The array to find the maximum element in.
 low : int
 The lowest index of the element to find.
 high : int
 The highest index of the element to find.

 Returns
 -----
 max : int
 The maximum element in the array that is the gold value.
 """
    max = arr [ low ]
    i = None
    for i in range ( low , high + 1 ) :
        if arr [ i ] > max :
            max = arr [ i ]
    return max


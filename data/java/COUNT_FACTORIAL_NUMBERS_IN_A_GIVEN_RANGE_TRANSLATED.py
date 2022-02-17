====================
def f_gold ( low , high ) :
    """
 Return the number of gold numbers in a given range.

 Parameters
 -----
 low : int
 low of the range
 high : int
 high of the range

 Returns
 -----
 f_gold : int
 number of gold numbers in the range
 """
    fact , x = 1 , 1
    while fact < low :
        fact , x = fact * x , x + 1
    res = 0
    while fact <= high :
        res += 1
        fact , x = fact * x , x + 1
    return res


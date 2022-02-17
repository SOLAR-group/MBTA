====================
def f_gold ( a , b ) :
    """
 Return the gold distance of the given points.

 Parameters
 -----
 a : int
 The first point of the points to be measured.
 b : int
 The second point of the points to be measured.

 Returns
 -----
 HM : float
 The distance between the points in the gold points of the given
 points.

 """
    AM , GM , HM = ( a + b ) / 2 , math.sqrt ( a * b ) , ( GM * GM ) / AM
    return HM


====================
def f_gold ( xp , yp ) :
    xp = xp [ : , 0 ] ^ yp [ : , 0 ]
    yp = xp [ : , 1 ] ^ yp [ : , 1 ]
    xp = xp [ : , 2 ] ^ yp [ : , 2 ]
    yp = xp [ : , 3 ] ^ yp [ : , 3 ]
    xp = xp [ : , 4 ] ^ yp [ : , 4 ]
    yp = xp [ : , 5 ] ^ yp [ : , 5 ]
    return xp , yp


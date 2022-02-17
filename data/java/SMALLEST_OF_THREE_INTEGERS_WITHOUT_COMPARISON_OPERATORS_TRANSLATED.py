====================
def f_gold ( x , y , z ) :
    c = 0
    while x != 0 and y != 0 and z != 0 :
        x -= 1
        y -= 1
        z -= 1
        c += 1
    return c


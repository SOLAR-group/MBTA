====================
def f_gold ( x , y ) :
    """
 Return the gold value of the first two numbers in `x` and `y`.

 Examples
 =====

 >>> from sympy.polys.polytools import f_gold
 >>> from sympy.polys.domains import ZZ
 >>> from sympy.polys.densebasic import FF
 >>> f_gold(ZZ(2), ZZ(3))
 (2, 3)
 >>> f_gold(ZZ(2), ZZ(3))
 (2, 3)
 >>> f_gold(ZZ(2), ZZ(3))
 (2, 3)
 >>> f_gold(ZZ(2), ZZ(3))
 (2, 3)
 >>> f_gold(ZZ(2), ZZ(3))
 (2, 3)
 >>> f_gold(ZZ(2), ZZ(3))
 (2, 3)
 """
    while y != 0 :
        carry = x & y
        x = x ^ y
        y = carry << 1
    return x


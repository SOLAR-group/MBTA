import sys

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

if __name__ == '__main__':
    param = [
    (56,60,),
    (17,44,),
    (73,96,),
    (75,3,),
    (27,54,),
    (61,1,),
    (65,63,),
    (22,19,),
    (61,9,),
    (97,23,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

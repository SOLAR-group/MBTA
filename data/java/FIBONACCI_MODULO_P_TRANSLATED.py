import sys

def f_gold ( p ) :
    """
 Return the number of gold points in the given p.
 """
    first , second , number , next = 1 , 1 , 2 , 1
    while next > 0 :
        next = ( first + second ) % p
        first , second = second , next
        number += 1
    return number

if __name__ == '__main__':
    param = [
    (51,),
    (40,),
    (68,),
    (7,),
    (8,),
    (32,),
    (93,),
    (75,),
    (71,),
    (15,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIBONACCI_MODULO_P," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIBONACCI_MODULO_P," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

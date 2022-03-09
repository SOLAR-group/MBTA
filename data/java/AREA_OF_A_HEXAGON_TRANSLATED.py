import sys

def f_gold ( s ) :
    return ( ( 3 * sqrt ( 3 ) * ( s ** 2 ) ) / 2 )

if __name__ == '__main__':
    param = [
    (1772.6589509256596,),
    (-599.737107809315,),
    (1074.1765931782,),
    (-1182.4087746714795,),
    (8083.035797247716,),
    (-6126.414356565494,),
    (5370.057504189614,),
    (-6947.020794285176,),
    (2110.5107873533325,),
    (-6458.751326919488,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("AREA_OF_A_HEXAGON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("AREA_OF_A_HEXAGON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

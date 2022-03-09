import sys

def f_gold ( side ) :
    return ( ( side ** 2 ) * ( math.sqrt ( 2 ) / 3 ) )

if __name__ == '__main__':
    param = [
    (3355.322051344013,),
    (-891.0551553192736,),
    (8242.699647177868,),
    (-9259.146104439229,),
    (7712.806145993083,),
    (-4998.858862079315,),
    (9771.127582524628,),
    (-5415.8106399098115,),
    (670.0774772280249,),
    (-7068.634369272122,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_CALCULATE_VOLUME_OCTAHEDRON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_CALCULATE_VOLUME_OCTAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

import sys

def f_gold ( n ) :
    return ( n & 1 ) or ( n & 2 ) or ( n & 4 ) or ( n & 8 ) or ( n & 16 ) or ( n & 32 ) or ( n & 64 ) or ( n & 128 ) or ( n & 256 ) or ( n & 512 ) or ( n & 1024 ) or ( n & 2048 ) or ( n & 4096 ) or ( n & 8192 ) or ( n & 16384 ) or ( n & 32768 ) or ( n & 65536 ) or ( n & 32768 ) or ( n & 65536 ) )
class CASSINIS_IDENTITY ( object ) :
    def f_gold ( self , n ) :
        return ( n & 1 ) or ( n & 2 ) or ( n & 4 ) or ( n & 8 ) or ( n & 16 ) or ( n & 32 ) or ( n & 128 ) or ( n & 256 ) or ( n & 512 ) or ( n & 2048 ) or ( n & 4096 ) or ( n & 8192 ) or ( n & 16384 ) or ( n & 32768 ) or ( n & 65536 ) or
if __name__ == '__main__':
    param = [
    (67,),
    (2,),
    (58,),
    (6,),
    (42,),
    (17,),
    (37,),
    (44,),
    (23,),
    (40,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

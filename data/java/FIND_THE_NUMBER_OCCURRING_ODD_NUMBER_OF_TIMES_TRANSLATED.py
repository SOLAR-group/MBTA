====================
def f_gold ( arr , arr_size ) :
    import sys
    import getopt
    import os
    import re
    import subprocess
    import tempfile
    import functools
    class FIND_THE_NUMBER_OCCURRING_ODD_NUMBER_OF_TIMES :
        def __init__ ( self , arr , arr_size ) :
            self.arr = arr
            self.arr_size = arr_size
        def f_gold ( self ) :
            count = 0
            for i in range ( self.arr_size ) :
                if self.arr [ i ] == self.arr [ j ] :
                    count += 1
            if count % 2 != 0 :
                return self.arr [ i ]
    return FIND_THE_NUMBER_OCCURRING_ODD_NUMBER_OF_TIMES


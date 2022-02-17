====================
def get_file_number ( num ) :
    num = num.split ( '.' )
    count_zero = 0
    ch = None
    for i in range ( 1 , len ( num ) ) :
        ch = num [ i ]
        if ch == '0' :
            count_zero += 1
    return count_zero


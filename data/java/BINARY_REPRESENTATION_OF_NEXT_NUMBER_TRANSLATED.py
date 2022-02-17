====================
def get_binary_rePRESENTATION_OF_NEXT_NUMBER ( num ) :
    l = len ( num )
    i = 0
    for i in range ( l - 1 , - 1 , - 1 ) :
        if num [ i ] == '0' :
            num = num [ : i ] + '1' + num [ i + 1 : ]
            break
        else :
            num = num [ : i ] + '0' + num [ i + 1 : ]
    if i < 0 :
        num = '1' + num
    return num


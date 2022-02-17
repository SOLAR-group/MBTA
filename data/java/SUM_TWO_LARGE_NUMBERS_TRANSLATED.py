====================
def f_gold ( str1 , str2 ) :
    if len ( str1 ) > len ( str2 ) :
        t = str1
        str1 , str2 = str2 , t
    str = ""
    n1 , n2 = len ( str1 ) , len ( str2 )
    str1 = [ str [ i ] for i in str1 ]
    str2 = [ str [ i ] for i in str2 ]
    carry = 0
    for i in range ( n1 ) :
        sum = ( int ( str1 [ i ] - '0' ) + int ( str2 [ i ] - '0' ) + carry )
        str += chr ( sum % 10 + '0' )
        carry = sum / 10
    for i in range ( n1 , n2 ) :
        sum = ( int ( str2 [ i ] - '0' ) + carry )
        str += chr ( sum % 10 + '0' )
        carry = sum / 10
    if carry > 0 :
        str += chr ( carry + '0' )
    str = "".join ( str )
    return str


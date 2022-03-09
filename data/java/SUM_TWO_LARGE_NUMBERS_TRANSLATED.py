import sys

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

if __name__ == '__main__':
    param = [
        ('VkfzrPG', 'rKZ',),
        ('0526110506447', '903',),
        ('011010010', '110100000',),
        ('sPAwZACc ', 'liYMsojPiinOV',),
        ('3', '611',),
        ('0101', '01110101011',),
        ('VTtNu', 'Wsmc',),
        ('2317170', '898421173423',),
        ('111111000010', '01100001110111',),
        ('Ktt', 'CTbbVX wGBkE',)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_TWO_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_TWO_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")

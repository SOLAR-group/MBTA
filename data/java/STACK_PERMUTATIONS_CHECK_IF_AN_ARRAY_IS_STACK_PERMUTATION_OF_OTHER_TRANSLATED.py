====================
def f_gold ( ip , op , n ) :
    input = Queue ( )
    for i in range ( n ) :
        input.put ( ip [ i ] )
    output = Queue ( )
    for i in range ( n ) :
        output.put ( op [ i ] )
    temp_stack = Stack ( )
    while not input.empty ( ) :
        ele = input.get ( )
        if ele == output.get ( ) :
            output.put ( ele )
            while not temp_stack.empty ( ) :
                if temp_stack.peek ( ) == output.get ( ) :
                    temp_stack.pop ( )
                    output.put ( ele )
                else :
                    break
        else :
            temp_stack.push ( ele )
    return ( input.empty ( ) and temp_stack.empty ( ) )


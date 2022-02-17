====================
def program_page_replace_algorithms_SET_2_FIFO ( pages , n , capacity ) :
    s = set ( capacity )
    indexes = queue.Queue ( )
    page_faults = 0
    for i in range ( n ) :
        if len ( s ) < capacity :
            if not s.issubset ( pages ) :
                s.add ( pages [ i ] )
                page_faults += 1
                indexes.add ( pages [ i ] )
        else :
            if not s.issubset ( pages ) :
                val = indexes.get ( )
                indexes.put ( val )
                s.remove ( pages [ i ] )
                s.add ( pages [ i ] )
                indexes.put ( pages [ i ] )
                page_faults += 1
    return page_faults


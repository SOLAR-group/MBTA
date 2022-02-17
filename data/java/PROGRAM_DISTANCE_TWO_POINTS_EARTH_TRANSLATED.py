====================
def f_gold ( lat1 , lat2 , lon1 , lon2 ) :
    lon1 = math.radians ( lon1 )
    lon2 = math.radians ( lon2 )
    lat1 = math.radians ( lat1 )
    lat2 = math.radians ( lat2 )
    dlon = lon2 - lon1
    dlat = lat2 - lat1
    a = math.pow ( math.sin ( dlat / 2 ) , 2 ) + math.cos ( lat1 ) * math.cos ( lat2 ) * math.pow ( math.sin ( dlon / 2 ) , 2 )
    c = 2 * math.asin ( math.sqrt ( a ) )
    r = 6371
    return ( c * r )


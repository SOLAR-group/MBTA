====================
static final int f_gold ( int l ) {
  int leafNodeCount = Math . pow ( 2 , l - 1 ) ;
  ;
  double sumLastLevel ;
  sumLastLevel = 0 ;
  sumLastLevel = ( ( leafNodeCount * ( leafNodeCount + 1 ) ) / 2 ) ;
  double sum = sumLastLevel * l ;
  return ( int ) sum ;
}


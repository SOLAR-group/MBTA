====================
public static void f_gold ( int [ ] xp , int [ ] yp ) {
  xp [ 0 ] = xp [ 0 ] ^ yp [ 0 ] ;
  yp [ 0 ] = xp [ 0 ] ^ yp [ 0 ] ;
  xp [ 0 ] = xp [ 0 ] ^ yp [ 0 ] ;
}


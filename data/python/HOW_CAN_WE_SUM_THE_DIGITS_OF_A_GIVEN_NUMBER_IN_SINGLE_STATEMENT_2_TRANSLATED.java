====================
public static int fGold ( int no ) {
  return no == 0 ? 0 : ( int ) ( no % 10 ) + fGold ( ( int ) ( no / 10 ) ) ;
}


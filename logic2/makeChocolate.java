public int makeChocolate(int small, int big, int goal) {
  if (big * 5 + small < goal | small < goal % 5) return -1;
   if (big * 5 <= goal) return goal - big * 5;
   return goal % 5;

  
}

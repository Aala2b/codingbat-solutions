boolean doubleX(String str) {
  int i=str.indexOf("x");
  boolean result;
  if(i==-1)
  result= false;
  else if(i+1<str.length()&&str.substring(i+1, i+2).equals("x"))
  result= true;
  else
  result=false;
  return result;
}

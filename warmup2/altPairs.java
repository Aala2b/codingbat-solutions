public String altPairs(String str) {
  String result="";
  for(int i=0; i<str.length(); i+=4){
    if(i+2>str.length())
    result=result+str.substring(i,str.length());
    else
    result=result+str.substring(i,i+2);
  }
  return result;
}

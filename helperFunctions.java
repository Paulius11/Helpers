// Arrays



// Strings
   
   // getStringFromStringIndex("Abcd", 1) -> "b" 
 private static  String getStringFromStringIndex(String str1, int index) {
     return String.valueOf(str1.charAt(index));
 }


// Integers

   // getIntegerElement(518, 2) -> 8 
private static int getIntegerElement(int intNumber, int index) {
    return Character.getNumericValue(Integer.toString(intNumber).charAt(index));
}

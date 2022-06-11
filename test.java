class StringConstructors 
 { 
        public static void main(String[] args) 
     { 
           char[] charArray ={'Y', 'A', 'M', 'E', 'T', 'E'}; 
           byte[] ascii ={65,66,67,68,70,71,73}; 
		   // Type 1 -> String object
           String strO =new String("Java"); 
		   // Type 2 -> From character array
           String strC =new String(charArray); 
		   // Type 3 -> From Byte Array
           String strA =new String(ascii); 
		   // Type 4 -> Empty string intialization
           String strE =new String(); 

           System.out.println("StrO : "+ strO); 
           System.out.println("StrC : "+ strC); 
           System.out.println("Str4 : "+ strA); 
           System.out.println("Str6 : "+ strE); 
           // Output
           // StrO : Java
           // StrC : YAMETE
           // Str4 : ABCDFGI
           // Str6 :
     } 
 } 

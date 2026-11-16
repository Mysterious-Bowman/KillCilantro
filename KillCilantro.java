public class KillCilantro {
   public static void main(String[] args) {
      System.out.println(killCilantro("5 day blinding stew:\n 1 cup cilantro\n 10,000 cups dirt","cilantro","parsley"));
      System.out.println(killCilantro("5 cilantro blinding stew:\n 1 cup cilantro\n 10,000 cilantro dirt","cilantro","parsley"));
      
      System.out.println(killCilantro("testcilantrotest","cilantro","parsley"));
      System.out.println(killCilantro("cilantrotest","cilantro","parsley"));
      System.out.println(killCilantro("nothinghere","cilantro","parsley"));
      System.out.println(killCilantro("testcilantro","cilantro","parsley"));
      System.out.println(killCilantro("cilantrocilantrocilantro","cilantro","parsley"));
      
      
      
      
   }
   
   public static String killCilantro (String in, String replaceMe, String replacer) {
   String out = in;
   
   
   
      while (out.indexOf(replaceMe) != -1) {
         int tempInt1 = out.indexOf(replaceMe);
         String tempString1 = out.substring(0,tempInt1);
         String tempString2 = out.substring((tempInt1 + 8),out.length());         
         out = tempString1 + replacer + tempString2;
         
      }
      
      
      return out;
   }
   
   
   
   
}

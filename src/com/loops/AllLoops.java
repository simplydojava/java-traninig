package com.loops;

public class AllLoops {
	boolean b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
         boolean a=true;
         
         boolean c=false;
         AllLoops abb=new AllLoops();
         if(a==abb.b){
        	 System.out.println("a==abb.b");
         }else if( c==abb.b){
        	 System.out.println("c==abb.b");
         }
         else if(abb.b==c){
        	 System.out.println("abb.b==c");
         }
         
         if(a&&abb.b){
        	 System.out.println("a&&abb.b");
         }
         
         if(!a){
        	 System.out.println("!c");
         }else{
        	 System.out.println("else "); 
         }
         
         int i=0;
         while(i<200){
        	 System.out.println(i);
        	 i++;
        
         }
         
         String [] nameArray={"X","Srujana","X","X"};
         
         
         for(int B=0;B<nameArray.length;B++){
        	 if("X".equals(nameArray[B])){
        		break;
        	 }
        	 System.out.println(nameArray[B]);
         }
         
         
	}

}

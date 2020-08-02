import java.util.*;
import java.io.*;

class ArrayRotation{

    public static void rotateArray(String[] str,int rotation){

        int length=str.length-1;
        rotation=(rotation+length-1)%length;
        rotate(str,0,length);
        rotate(str,0,rotation-1);
        rotate(str,rotation,length);
        
      
    }

    public  static void rotate(String[] str,int start,int end){

        while(start<end){
            String temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws IOException{
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans=new StringBuilder();
        int T=Integer.parseInt(reader.readLine());  //for Test case's

        for(int i=0;i<T;i++){

            int rotation=Integer.parseInt(reader.readLine());
            String[] str=reader.readLine().trim().split(" ");
            rotateArray(str,rotation);
            for(int j=0;j<str.length;j++){
                    ans.append(str[j]+" ");
                    
            }
            System.out.println(ans);
        }
    
    }
}
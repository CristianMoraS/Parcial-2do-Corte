package ejercicios;

import java.util.*;

public class Zulu_Alarm {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
 
        for (int i = 0; i < N; i++) {
              int cas = s.nextInt();
                  int a = s.nextInt();
                  String []ar=new String[cas];
                  String []br=new String[a];
            for (int j = 0; j < cas; j++){
                ar[j]=s.next();
            } 
            for (int j = 0; j < a; j++){
                br[j]=s.next(); 
            }  int sum=0;
            for (int j = 0; j < a; j++){ int min=100000;
                for (int k = 0; k < cas; k++){
	                 String spl[]=ar[k].split(":");
	                 String spl2[]=br[j].split(":");
	                 int fir=Integer.valueOf(spl[0]);int fir2=Integer.valueOf(spl2[0]);
	                 int sec=Integer.valueOf(spl[1]);int sec2=Integer.valueOf(spl2[1]);
	                 int thi=Integer.valueOf(spl[2]);int thi2=Integer.valueOf(spl2[2]);
	                 int min2;
	                 
	                min2= Math.abs(fir-fir2);
	                if(fir>fir2){
	                min2+= Math.abs(sec-sec2)<sec-sec2+60? Math.abs(sec-sec2):sec-sec2+59;
	                  min2+= Math.abs(thi-thi2)<thi-thi2+60? Math.abs(thi-thi2):thi-thi2+59; 
	               }else{
	                min2+= Math.abs(sec-sec2)<sec2-sec+60? Math.abs(sec-sec2):sec2-sec+59;
	                  min2+= Math.abs(thi-thi2)<thi-thi2+60? Math.abs(thi-thi2):thi-thi2+59; 
	               }
	                if(min2<min)min=min2;
                } 
            }  System.out.println(sum);
        }
     
 
       
    }
}

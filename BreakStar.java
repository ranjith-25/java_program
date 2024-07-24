/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakstar;

import java.util.Scanner;

/**
 *
 * @author cclab
 */
public class BreakStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int l=str.length();
        String res="";
        for(int i=0;i<l-1;i++){
            if(str.charAt(i+1)=='*'){
                i+=2;
            }
            else
                res+=str.charAt(i);
        }
        if(str.charAt(l-2)!='*')
        res+=str.charAt(l-1);
        System.out.println(res);
    }
    
}

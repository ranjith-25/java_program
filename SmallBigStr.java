/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallbigstr;

import java.util.Scanner;

/**
 *
 * @author cclab
 */
public class SmallBigStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        int l1=str1.length(),l2=str2.length();
        if(l1>l2)
            System.out.println(str2+str1+str2);
        else
            System.out.println(str1+str2+str1);
    }
    
}

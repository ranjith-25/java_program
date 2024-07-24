/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removex;

import java.util.Scanner;

/**
 *
 * @author cclab
 */
public class RemoveX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int st=0,l=str.length();
        if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){
            st=1;
            l=str.length()-1;
        }
        else if(str.charAt(0)=='x')st=1;
        else if(str.charAt(str.length()-1)=='x')l=str.length()-1;
        System.out.println(str.substring(st,l));
    }
    
}

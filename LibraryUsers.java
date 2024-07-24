/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryuser;

/**
 *
 * @author cclab
 */
public interface LibraryUser {
void registerAccount();
void requestBook();
}
class KidUsers implements LibraryUser{
int age;
String bookType;
KidUsers(int age,String bookType){
    this.age=age;
    this.bookType=bookType;
}
@Override
public void registerAccount(){
    if(age<12){
        System.out.println("you have successfully registerd under kids.");
    }
    else{
        System.out.println("Sorry!Age must be less than 12 to register kids ");
    }
}
public void requestBook(){
    if(bookType.equals("kids")){
        System.out.println("books issued successfully return 10 days");
    }
    else{
        System.out.println("oops you are allowed to take books from kids"); 
    }
}
class AdultUser implements LibraryUser{
int age;
String bookType;
AdultUser(int age,String bookType){
    this.age=age;
    this.bookType=bookType;
}
@Override
    public void registerAccount(){
    if(age>12){
        System.out.println("you have successfully registerd under Adults.");
    }
    else{
        System.out.println("Sorry!Age must be more than 12 to register Adults ");
    }
}

   
public void requestBook(){
    if(bookType.equals("Fiction")){
        System.out.println("books issued successfully return 7 days");
    }
    else{
        System.out.println("oops you are not allowed to take books from Fiction adult"); 
    }
}
}
 public class LibraryUsers{

    
    public static void main(String[] args) {
        KidUsers kk=new KidUsers(11,"kids");
         AdultUser aa=new AdultUser(22,"Fiction");
        kk.registerAccount();
        kk.requestBook();
       
    aa.registerAccount();
        aa.requestBook();
    
       
    }
    
}

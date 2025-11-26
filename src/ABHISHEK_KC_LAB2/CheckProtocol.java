package ABHISHEK_KC_LAB2;


import  java.net.URL;
import  java.net.MalformedURLException;

public class CheckProtocol {

    public static void main(String[] args) {


        String[] protocols = {"https" ,"http" ,"ftp" ,"telnet", "mailto" ,"gopher"};

        System.out.println(" Protocol Support Or not");

        for(String protocol  : protocols) {

            try{
                URL url = new URL(protocol  + "://example.com");
                System.out.println(protocol + " : Supported");
            }
            catch (MalformedURLException e){
                System.out.println(protocol + " : not Supported");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cmpillexc;

import java.util.Scanner;

/**
 *
 * @author InfoPro
 */
public class Cmpillexc {
  // Opérateurs 
String[] operateurs = {"+", "-", "*", "/", "=","<",">","^","==","!=","<=",">=","++","--","&&","||","+=","-=","+=","*=","/="};
// Séparateurs simples
char[] separateurs = {'{','}', '(',')',';',',','[',']','.',','}; 
String[]motclé={"package","import","public","static","private","class","return","int","double","String","char","if","else","for","switch","case","break","default","while","do","void","new","main",
"final","float","double","boolean","catch","try","extends","protected","super","this","noha","messaoudi"};

static int col(char c){
if(('a'<=c) &&(c<='z')||('A'<=c) &&(c<='Z')){
 return 0;
} else if(('0'<=c) &&(c<='9')){
        return 1; 
         }else if(c=='"'){
           return 2;  
         }else if(c=='-'){
             return 3;
         }else{
return 4;
}}

    public static void main(String[] args) {
 System.out.println("entrer un programme en java");
        Scanner pr=new Scanner(System.in);
       String ch=pr.nextLine()+"#";
      int  i=0;
      int[][]mat={
          {1,5,3,-1,-1},
          {1,1,-1,2,-1},
              {1,1,-1,2,-1},
              {3,3,4,-1,-1},
              {1,-1,-1,-1,-1},
              {1,5,-1,-1,-1},
      };
     int  Ec=0;
     int[] Ef={1,2,4,5};
    
    }
    
}

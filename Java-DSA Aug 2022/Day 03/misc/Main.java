// package Java-22.Java-DSA Aug 2022.Day 03.misc;

public class Main {
  
  public static void main(String[] args) {
    
    //Single line comment
    //System.out.println("Akarsh");
    
    //Multi line comment
    /*System.out.println("Akarsh");
    System.out.println("Akarsh");
    System.out.println("Akarsh");*/
    
    boolean ans;
    
    //Try to add print statement of ans after every line,
    //and analyze how ans behaves in output
    ans= 3>2 && 14>3;
    ans = 40>3 && 40 > 50;
    ans = 40>=40 || 50>=2*25;
    ans = (2*3==4 && 6*4==9) || (4>2);
    ans = (4>5) && (3>5 && 80==2*40);
    ans = (20*5==100 || 10==10) && (30*2==60 || 40>30);
    ans = !(30==30);
    ans = !(30>=20 || 40>=10);
    ans = !( (20*4 + 40 >=100 || 20==10) && (3*2<=60 || 4>=30) );
    ans = !( 20%3==2 );
    ans = ( !(40==40) && 80>36);
    ans = ( !(50>20) || 90>2*45) && ( 30!=2*15);
    
    System.out.println(ans);


  }


}

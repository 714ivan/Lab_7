
package lab_7;

public class Lab_7 {

    public static void main(String[] args) {
        int i=122132;
        Integer I=33434345;
        String s="fr";
        print(i);
        print(I);
        print(s);
        
        print(min(5, 2));
        print(min(5.2, 2));
        
        print(max(5, 2));
        print(max(5.2, 2));
    }
    
    
    //*******Lab_7_1*********************************************
    public static void print(int a){
        System.out.println(a);
    }
    
     public static void print(float a){
        System.out.println(a);
    }
     
     public static void print(Integer a){
        System.out.println(a);
    }
    
     public static void print(String a){
        System.out.println(a);
    }
     
     public static void print(Object a){
        System.out.println(a);
    }
     
     public static int min(int a, int b){
         return ((a<b)?a:b);
     }
     public static long min(long a, long b){
         return ((a<b)?a:b);
     } 
         
     public static double min(double a, double b){
        return ((a<b)?a:b);
     } 
     
      public static int max(int a, int b){
         return ((a>b)?a:b);
     }
     public static long max(long a, long b){
         return ((a>b)?a:b);
     } 
         
     public static double max(double a, double b){
        return ((a>b)?a:b);
     } 
     
     //********Lab_7_2********************************
      abstract class Pet {
       protected String name;
       protected int age;
       protected boolean hungry;
       
       abstract public void voice();
      }
      
      class Snake extends Pet{
         public void voice(){
           System.out.println("$-$-$-$-$-$-$-$");
         }
       }
       
       class Dog extends Pet{
         public void voice(){
           System.out.println("Гав! Гав! Гав!");
         }
       }
       
       class PatrolDog extends Pet{
         public void voice(){
           System.out.println("Гав!!!! Гав!!!!! Гав!!!!");
          }
       }
       
       class Cat extends Pet{
         public void voice(){
           System.out.println("Мрррррр...Мрррррр...Мрррррр");
         }
       }
       
       class Fish extends Pet{
         public void voice(){
           System.out.println("...........................");
        }
     }
       
       interface PassengersAuto {
           void PassengersTransportation();
       }
       interface CargoAuto {
           void CargoTransportation();
       }
       
       class Truck implements CargoAuto{
           public void CargoTransportation(){
               
           }
       }
        class Sedan implements PassengersAuto{
           public void PassengersTransportation(){
               
           }
       }
        class Pickup implements PassengersAuto, CargoAuto{
           public void PassengersTransportation(){
               
           }
            public void CargoTransportation(){
               
           }
       } 
 }

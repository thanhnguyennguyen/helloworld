package com.tutorialspoint.IoC;

public class Database {
   public Database(){
      System.out.println("Inside Database constructor." );
   }
   public void saveData(){
      System.out.println("saving data." );
   }
}
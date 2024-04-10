package org.example.tests;

import org.example.CalculateBirthYear;
import org.junit.Test;


import java.util.Calendar;

import static org.junit.Assert.assertEquals;



  public class CalculateBirthYearTest {
      @Test
      public void calculatebirthyeartest() {
          int age = 20;
          CalculateBirthYear myobj = new CalculateBirthYear();
          assertEquals(2004, myobj.calculatebirthyear(age));

      }

      @Test
       public void printgreetings() {
          CalculateBirthYear myobj = new CalculateBirthYear();
          String result = myobj.printgreetings("sam", 10);
          assertEquals("Hi sam you were born in 2014", result);

      }

      @Test
      public void isAgeValidtest1() {
          CalculateBirthYear myobj = new CalculateBirthYear();
          Boolean result1 = myobj.isAgeValid("abc");
          assertEquals(false, result1);
      }
          @Test
         public void  isAgeValidtest2(){
          CalculateBirthYear myobj = new CalculateBirthYear();
          Boolean result2 =myobj.isAgeValid("-10");
          assertEquals(false,result2);

      }
      @Test
      public void isAgeValidtest3(){
          CalculateBirthYear myobj=new CalculateBirthYear();
          Boolean result3=myobj.isAgeValid("30");
          assertEquals(true,result3);
      }



   }




















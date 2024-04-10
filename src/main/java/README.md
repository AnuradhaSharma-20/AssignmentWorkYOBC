**Project**

**Year Of Birth Calculator**

Submitted by:Anuradha Sharma

Teacher     : Jakob Forsbacka 

# Class
# #Methods
**calculatebirthyear** - This method calculate the year of birth based on provided age.
<pre>
    Input  : Age as int
    Return : Year of Birth as int
    Description  : Year of birth is Calculate by Subtracting the age from Current year.
</pre>
**printgreetings**-This method construct and return the greeting message based on provided name and age.
<pre>
    Input  : Name as String and Age as int
    Return : Return greeting as string
    Description  :  This method includes the person name and Year of Birth which is returned from calculatorbirthyear method.
</pre>
**isagevalid**-This method checks the age whether is it valid or not.
<pre>
    Input   : Age as String
    Return  : True or false as Boolean
    Description : This method returns false if Age is non-numeric or less than 0.It returns true if age is a positive number.Below is high level flow
                1) Convert string Age into int. If there is an exception, Catch it and return false.Also print appropriate message. 
                2) Check if int Age (Converted in last step) is less than 0, Then return false.Also print appropriate message.
                3) Assign Age into a Class variable validAge and return True if above conditions not met.
                
</pre>
**main method**-Please find below the execution flow.
<pre>
    1) Take the name and age from the user.
    2) Call the isAgevalid method to check that age is valid or invalid.
    3) If age is valid,call the printgreetings methods to return greeting in String.And print it.
</pre>
    
# #Test cases
**Testcalculatebirthyear**
<pre>
The purpose of this test is to confirm that the calculatebirthyear method correctly calculates the birth year based on the provided age.
if the actual result match the expected value,the result passes otherwise it fails.
** input age should be a positive number**.
    Int age param  :20
    Expected result :2003
</pre>
**Testprintgreeting**
<pre>
The test checks the format of the output to the user.The purpose of this test is to ensure that printgreeting method behave correctly
in reponse to valid age and name inputs.
    String name : "Sam"
    Int age     : "20"
    Expected result : "Hi Sam you were born in 2003"
</pre>
**Testageisvalid**
<pre>
The purpose of this test is to ensure that the isvalidage method handles invalid and valid age appropriatly 
wheheter age is given in string,negative numbers and positive numbers.
 ** Age in string**
    String age : "abc"
    Expected result : false
 ** Age in -ve number**
    String age : "-10"
    Expected result : false
** Age in +ve number**
    String age : "30"
    Expected result : True
</pre>













 










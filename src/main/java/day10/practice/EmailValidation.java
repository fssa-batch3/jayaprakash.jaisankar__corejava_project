package day10.practice;



class InvalidEmailException extends Exception {
 public InvalidEmailException(String message) {
     super(message);
 }
}


class EmailValidator {
 public static boolean isValidEmail(String emailId) throws InvalidEmailException {
    
  
     if (emailId == null || !emailId.contains("@")||!emailId.endsWith(".com")) {
         throw new InvalidEmailException("Invalid email address: " + emailId);
     }
     return true;
 }
}

public class EmailValidation {
 public static void main(String[] args) {
     try {
         String email = "jayaprakash@gmail.com"; 
         EmailValidator.isValidEmail(email);
         System.out.println("Email is valid: " + email);
     } catch (InvalidEmailException e) {
         System.err.println("Error: " + e.getMessage());
     }
 }
}

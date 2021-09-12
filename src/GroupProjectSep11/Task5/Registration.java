package GroupProjectSep11.Task5;
/*
Create  Registration  Class  in  which  you would have variables as email, userName and password that have an access scope only within its own class.
 After creating an object of the class user should be able to call  methods  and  in  each  method separately pass values to set users email, username and password.
 Requirements:
 A.Valid email consider to be only yahoo
 B.Valid userName and password cannot be empty and should be of length larger than 6 characters.
 Also valid password cannot contain userName.
 */
public class Registration {
    private String email;
    private String userName;
    private String passWord;

    public void setEmail(String email) {
        if (email.contains("yahoo.com")){
            System.out.println("Its a valid email");
            this.email = email;
        }else{
            System.out.println("Its not a valid email");
        }
    }

    public void setUserName(String userName) {
        if (userName.length()>6 && !userName.isEmpty()){
            System.out.println("Its a valid Username");
            this.userName = userName;
        }else{
            System.out.println("Its not a valid username");
        }
    }

    public void setPassWord(String passWord) {
        if (passWord.isEmpty()){
            System.out.println("Password cannot be empty");
        } else if (passWord.length()<6 || passWord.contains(userName)){
            System.out.println("Its not a valid Password");
        } else{
            System.out.println("Password is valid.");
               this.passWord = passWord;
    }
}}
package homeworkweek7;

public class Person {
    String firstName;//veriable decleration
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstName() {//withreturntypenoperameter method
        return firstName;
    }

    public String getLastName() {//withreturntypenoperameter method
        return lastName;
    }

    public int getAge() {// withreturntypenoperameter method
        return age;
    }

    public String setFirstName(String fname) {//withreturntypewithperameter method
        firstName = fname;
        return fname;
    }

    public String setLastName(String lname) { //withreturntypewithperameter method
        lastName = lname;
        return lastName;
    }

    public int setAge(int age1) {//withreturntypewithperameter method

        if (age1 >= 0 && age1 <= 100) {// condition loop
            age = age1;
        } else
            age = age1 = 0;
        return age;
    }

    public Boolean isTeen() {//withreturntypenoperameter method
        Boolean result;
        if (age >= 12 && age < 20) {// condition
            result= true;
        } else
            result= false;
        return result;
    }

    public String getFullName() {//withreturntypenoperameter method
        String fullname = firstName + " " + lastName;
        return fullname;
    }
    public String isEmpty(){//withreturntypenoperameter method
        if (firstName.isEmpty()) {// condition
            return firstName;
        }
        if (lastName.isEmpty()) {
            return lastName;
        }
        if (firstName.isEmpty() && lastName.isEmpty())
        {
            return " ";
        }
        String fullname = firstName + " " + lastName;
        return fullname;
    }


}

package smsstarter;

public class Student {

	private String firstName;
	private String lastName;
	private long regNumber;
	private String address;
        Student(String firstName,String lastName,long regNumber,String address){
            this.firstName=firstName;
            this.lastName=lastName;
            this.regNumber=regNumber;
            this.address=address;
        }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getRegNumber() {
        return regNumber;
    }

}

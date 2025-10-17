import java.util.Date;
import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public String fullName() {
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public boolean isMEI() {
        return calculateYearlySalary() < 130000 &&
               getAge() > 18 &&
               !anotherCompanyOwner &&
               !pensioner &&
               !publicServer;
    }

    private int getAge() {
        if (birthDate == null) return 0;
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    // Getters and setters for other attributes
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public boolean isAnotherCompanyOwner() { return anotherCompanyOwner; }
    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) { this.anotherCompanyOwner = anotherCompanyOwner; }

    public boolean isPensioner() { return pensioner; }
    public void setPensioner(boolean pensioner) { this.pensioner = pensioner; }

    public boolean isPublicServer() { return publicServer; }
    public void setPublicServer(boolean publicServer) { this.publicServer = publicServer; }
}

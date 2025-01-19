public class Doctor {
    public static int counter = 1;
    private int id;
    private String name;
    private String speciality;
    private int phoneNumber;

    public Doctor(String name, String speciality, int phoneNumber) {
        this.id = counter++;
        this.name = name;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Doctor: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

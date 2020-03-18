package baseCourseOfJava.lection12.HomeWork1;

public enum Specialty {

    PHYS("Физика"), BIO("Биология"), MATH("Математика"), CHEM("Химия");
    private String specialty;

    Specialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

package tp1;

import java.time.LocalDate;

public class Persona {

    private String name;
    private Integer age;
    private LocalDate birthDate;
    private Integer dni;
    private char gender;
    private Double weight;
    private Double height;


    public Persona(String name, Integer age, LocalDate birthDate, Integer dni, char gender, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.dni = dni;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getDni() {
        return dni;
    }

/*    public void setDni(Integer dni) {
        this.dni = dni;
    }*/

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    private double getBMI() {
        return weight / (height * height);
    }

    public boolean isHealthier() {

        double minWeight = 18.5;
        double maxWeight = 25;

        double bmiResult = getBMI();

        if ((bmiResult < minWeight) || (bmiResult > maxWeight)) {

            System.out.println("No saludable");
            return false; // No saludable.
        }
        System.out.println("Es saludable");
        return true; // Saludable
    }

    public boolean isMyBirthDay() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == birthDate.getMonth() && today.getDayOfMonth() == birthDate.getDayOfMonth();
    }

    public boolean isLegal(){
        return age > 18;
    }

    public boolean canVote(){
        return age > 16;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", dni=" + dni +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

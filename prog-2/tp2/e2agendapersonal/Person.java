package tp2.e2agendapersonal;

public class Person {

    private int phone;
    private String mail;

    public Person(int phone, String mail) {
        this.phone = phone;
        this.mail = mail;
    }
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phone=" + phone +
                ", mail='" + mail + '\'' +
                '}';
    }
}

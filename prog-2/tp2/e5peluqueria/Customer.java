package tp2.e5peluqueria;

public class Customer {

    private long clientId;
    private String name;
    private boolean isFrequentCustomer;

    public Customer(String name) {
        this.name = name;
    }

    public boolean isFrequentCustomer() {
        return isFrequentCustomer;
    }

    public void setFrequentCustomer(boolean frequentCustomer) {
        isFrequentCustomer = frequentCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", isFrequentCustomer=" + isFrequentCustomer +
                '}';
    }
}

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String emailId;
    public VipCustomer(){
        this("Default name",9999999,"Default@gmail.com");
    }

    public VipCustomer(long creditLimit, String emailId){
        this("Default name",creditLimit, emailId);
        this.creditLimit = creditLimit;
        this.emailId=emailId;
    }

    public VipCustomer(String name, long creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

package model;
import java.io.Serializable;

public class Job implements Serializable{
  private int jobId;  
  private String description;
  private String expecteddeliverdate;
  private String receivedDate;
  private String state;
  private String starttime;
  private String delivertime;
  private int employeeid;
  private int customerOrderId;
  private String employeeworkingtime;
  private String employeedescription;

    public Job(int jobId, String description, String expecteddeliverdate, String receivedDate, String state, String starttime, String delivertime, int employeeid, int customerOrderId, String employeeworkingtime, String employeedescription) {
        this.jobId = jobId;
        this.description = description;
        this.expecteddeliverdate = expecteddeliverdate;
        this.receivedDate = receivedDate;
        this.state = state;
        this.starttime = starttime;
        this.delivertime = delivertime;
        this.employeeid = employeeid;
        this.customerOrderId = customerOrderId;
        this.employeeworkingtime = employeeworkingtime;
        this.employeedescription = employeedescription;
    }

    /**
     * @return the jobId
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * @param jobId the jobId to set
     */
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the expecteddeliverdate
     */
    public String getExpecteddeliverdate() {
        return expecteddeliverdate;
    }

    /**
     * @param expecteddeliverdate the expecteddeliverdate to set
     */
    public void setExpecteddeliverdate(String expecteddeliverdate) {
        this.expecteddeliverdate = expecteddeliverdate;
    }

    /**
     * @return the receivedString
     */
    public String getReceivedDate() {
        return receivedDate;
    }

    /**
     * @param receivedString the receivedString to set
     */
    public void setReceivedString(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the starttime
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * @param starttime the starttime to set
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * @return the delivertime
     */
    public String getDelivertime() {
        return delivertime;
    }

    /**
     * @param delivertime the delivertime to set
     */
    public void setDelivertime(String delivertime) {
        this.delivertime = delivertime;
    }

    /**
     * @return the employeeid
     */
    public int getEmployeeid() {
        return employeeid;
    }

    /**
     * @param employeeid the employeeid to set
     */
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    /**
     * @return the customerOrderId
     */
    public int getCustomerOrderId() {
        return customerOrderId;
    }

    /**
     * @param customerOrderId the customerOrderId to set
     */
    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    /**
     * @return the remainaingtime
     */
  

    /**
     * @return the employeeworkingtime
     */
    public String getEmployeeworkingtime() {
        return employeeworkingtime;
    }

    /**
     * @param employeeworkingtime the employeeworkingtime to set
     */
    public void setEmployeeworkingtime(String employeeworkingtime) {
        this.employeeworkingtime = employeeworkingtime;
    }

    /**
     * @return the employeedescription
     */
    public String getEmployeedescription() {
        return employeedescription;
    }

    /**
     * @param employeedescription the employeedescription to set
     */
    public void setEmployeedescription(String employeedescription) {
        this.employeedescription = employeedescription;
    }

  
    
}

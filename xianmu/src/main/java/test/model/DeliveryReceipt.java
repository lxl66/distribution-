package test.model;

import java.util.Date;

public class DeliveryReceipt {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_receipt.deliveryReceipt_ID
     *
     * @mbg.generated
     */
    private String deliveryreceiptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_receipt.start_city
     *
     * @mbg.generated
     */
    private String startCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_receipt.end_City
     *
     * @mbg.generated
     */
    private String endCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_receipt.mid_City
     *
     * @mbg.generated
     */
    private String midCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_receipt.make_Date
     *
     * @mbg.generated
     */
    private Date makeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_receipt.Comments
     *
     * @mbg.generated
     */
    private String comments;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_receipt.deliveryReceipt_ID
     *
     * @return the value of delivery_receipt.deliveryReceipt_ID
     *
     * @mbg.generated
     */
    public String getDeliveryreceiptId() {
        return deliveryreceiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_receipt.deliveryReceipt_ID
     *
     * @param deliveryreceiptId the value for delivery_receipt.deliveryReceipt_ID
     *
     * @mbg.generated
     */
    public void setDeliveryreceiptId(String deliveryreceiptId) {
        this.deliveryreceiptId = deliveryreceiptId == null ? null : deliveryreceiptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_receipt.start_city
     *
     * @return the value of delivery_receipt.start_city
     *
     * @mbg.generated
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_receipt.start_city
     *
     * @param startCity the value for delivery_receipt.start_city
     *
     * @mbg.generated
     */
    public void setStartCity(String startCity) {
        this.startCity = startCity == null ? null : startCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_receipt.end_City
     *
     * @return the value of delivery_receipt.end_City
     *
     * @mbg.generated
     */
    public String getEndCity() {
        return endCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_receipt.end_City
     *
     * @param endCity the value for delivery_receipt.end_City
     *
     * @mbg.generated
     */
    public void setEndCity(String endCity) {
        this.endCity = endCity == null ? null : endCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_receipt.mid_City
     *
     * @return the value of delivery_receipt.mid_City
     *
     * @mbg.generated
     */
    public String getMidCity() {
        return midCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_receipt.mid_City
     *
     * @param midCity the value for delivery_receipt.mid_City
     *
     * @mbg.generated
     */
    public void setMidCity(String midCity) {
        this.midCity = midCity == null ? null : midCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_receipt.make_Date
     *
     * @return the value of delivery_receipt.make_Date
     *
     * @mbg.generated
     */
    public Date getMakeDate() {
        return makeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_receipt.make_Date
     *
     * @param makeDate the value for delivery_receipt.make_Date
     *
     * @mbg.generated
     */
    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_receipt.Comments
     *
     * @return the value of delivery_receipt.Comments
     *
     * @mbg.generated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_receipt.Comments
     *
     * @param comments the value for delivery_receipt.Comments
     *
     * @mbg.generated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}
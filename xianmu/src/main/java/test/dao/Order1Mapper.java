package test.dao;

import java.util.List;
import test.model.Order1;

public interface Order1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order1
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order1
     *
     * @mbg.generated
     */
    int insert(Order1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order1
     *
     * @mbg.generated
     */
    Order1 selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order1
     *
     * @mbg.generated
     */
    List<Order1> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order1
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Order1 record);
}
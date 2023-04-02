package com.ajay.OrderService.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;


@Data
@Table("customer")
public class Customer {
    @PrimaryKeyColumn(name="id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    @Column("id")
    @Id
    private String id;
    @Column("name")
    private String customerName;
    @Column("phone_no")
    private String phoneNo;
}

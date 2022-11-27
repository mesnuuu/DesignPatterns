package com.mesnu.app.repository;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name="PRESIDENT")
public class PresidentEntity {
    @Id
    @GeneratedValue
    @Column(name="PRESIDENT_ID")
    private long id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="MIDDLE_INITIAL")
    private String middleInitial;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;


//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("PresidentEntity{");
//        sb.append("id=").append(id);
//        sb.append(", firstName='").append(firstName).append('\'');
//        sb.append(", middleInitial='").append(middleInitial).append('\'');
//        sb.append(", lastName='").append(lastName).append('\'');
//        sb.append(", emailAddress='").append(emailAddress).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }



}

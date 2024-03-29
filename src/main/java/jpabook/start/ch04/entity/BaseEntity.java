package jpabook.start.ch04.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Getter @Setter
public class BaseEntity {

    private Date createdDate;       //등록일

    private Date lastModifiedDate;  //수정일
}

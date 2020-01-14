package br.com.testBackJava.clientservice.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor(onConstructor_ = @Builder)
@Entity
@Table(name = "system")
public class System {

    @Id
    @Column(name = "system_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Boolean active;

    private Date registered;


}

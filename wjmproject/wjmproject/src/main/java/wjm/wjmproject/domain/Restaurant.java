package wjm.wjmproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Restaurant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String restaurant_name;
    @Column(name = "area")
    private String area;
    @Column(name = "address")
    private String address;
    @Column(name = "keywords")
    private String keywords;
}

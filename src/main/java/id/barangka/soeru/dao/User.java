package id.barangka.soeru.dao;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Character status;

    @Column
    private Character privilege;

    @Column
    private Timestamp createdDate;

    @Column
    private Timestamp updateadDate;

    @Column
    private String createdBy;

    @Column
    private String updatedBy;
}

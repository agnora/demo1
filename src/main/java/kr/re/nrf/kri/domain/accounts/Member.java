package kr.re.nrf.kri.domain.accounts;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String webId;

    @Column(nullable = false, length = 256)
    private String password;

    @Column(nullable = false, length=100)
    private String name;

}

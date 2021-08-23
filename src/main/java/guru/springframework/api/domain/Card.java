package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Card implements Serializable {
    private String type;
    private Integer number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}

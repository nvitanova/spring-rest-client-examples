package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.websocket.server.ServerEndpoint;
import java.io.Serializable;

@Getter
@Setter
public class ExpirationDate implements Serializable {
    private String date;
    private Integer timezoneType;
    private String timezone;
}

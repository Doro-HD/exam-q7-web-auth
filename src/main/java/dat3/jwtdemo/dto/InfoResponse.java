package dat3.jwtdemo.dto;

import lombok.Getter;

@Getter
public class InfoResponse {

    private String info;

    public InfoResponse(String info) {
        this.info = info;
    }
}

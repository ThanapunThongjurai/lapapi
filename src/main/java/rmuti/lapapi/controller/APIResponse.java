package rmuti.lapapi.controller;

import lombok.Data;

@Data
public class APIResponse {
    private int status;
    private String messenge;
    private Object data;

}

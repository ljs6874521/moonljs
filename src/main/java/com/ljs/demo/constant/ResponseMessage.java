package com.ljs.demo.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage implements Serializable {

    private static final long serialVersionUID = -6970675031171558256L;

    private static final int CODE_SUCCESS = 200;

    private static final int CODE_ERROR = 500;

    private int code;

    private String message;

    private Object data;

    public static ResponseMessage ok(String message) {
        return new ResponseMessage(CODE_SUCCESS, message, null);
    }

    public static ResponseMessage ok(Object data) {
        return new ResponseMessage(CODE_SUCCESS, null, data);
    }

    public static ResponseMessage ok(String message, Object data) {
        return new ResponseMessage(CODE_SUCCESS, message, data);
    }

    public static ResponseMessage error(Exception e) {
        return new ResponseMessage(CODE_ERROR, e.getMessage(), null);
    }

    public static ResponseMessage error(String message) {
        return new ResponseMessage(CODE_ERROR, message, null);
    }

    public static <T> ResponseMessage list(int total, List<T> list) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("total", total);
        resultMap.put("list", list);
        return ok(resultMap);
    }
}

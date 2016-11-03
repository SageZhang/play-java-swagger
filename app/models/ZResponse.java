package models;

/**
 * Created by xjpz on 16/11/3.
 */
public class ZResponse {

    public boolean success;

    public int code;

    public String msg;

    public Object data;

    public ZResponse(){}

    public ZResponse(boolean success, int code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

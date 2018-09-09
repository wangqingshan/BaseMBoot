import java.io.Serializable;

/**
 * R
 *
 * @Title: R.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/9/5 11:54
 * @Author 90
 */
public class ReturnResult<T> implements Serializable {

    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final int UNAUTHORIZED = 2;
    private static final long serialVersionUID = -6373402751616512206L;

    private T data; //服务端数据
    private int status = OK; //状态码
    private String msg = ""; //描述信息

    public static ReturnResult isOk() {
        return new ReturnResult();
    }

    public static ReturnResult isFail() {
        return new ReturnResult().status(FAIL);
    }

    public static ReturnResult isFail(Throwable e) {
        return isFail().msg(e);
    }

    public ReturnResult msg(Throwable e) {
        this.setMsg(e.toString());
        return this;
    }

    public ReturnResult data(T data) {
        this.setData(data);
        return this;
    }

    public ReturnResult status(int status) {
        this.setStatus(status);
        return this;
    }
    //Constructors
    public ReturnResult() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

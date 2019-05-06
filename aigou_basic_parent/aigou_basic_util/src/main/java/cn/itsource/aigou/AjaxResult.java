package cn.itsource.aigou;

public class AjaxResult {

    private Boolean success =true; //操作是否成功

    private String msg="操作成功";  //默认信息

    private Object object; //返回的数据,以对象的形式返回

    public AjaxResult(Boolean success, String msg, Object object) {
        this.success = success;
        this.msg = msg;
        this.object = object;
    }

    public AjaxResult() {
    }


    //准备一个静态方法me(),
    public static AjaxResult me(){
        return new AjaxResult();
    }


    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    //设置对象,返回自己,return this,为链式编程做准备
    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }


    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}

package cn.itsource.aigou;

public class Testtt {


    public static void main(String[] args) {
        AjaxResult ajaxResult = new AjaxResult();
        //ok,链式编程测试ok
        AjaxResult shibai = ajaxResult.setMsg("shibai").setSuccess(false);
    }
}

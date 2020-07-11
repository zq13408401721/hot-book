public class NewLogin{

    public NewLogin(String classname){}

    public NewLogin(int a){}


    public void PhoneLogin(String phone){
	print("手机号登录");
    }

    public void checkPhoneFormat(String phone){
	print("手机号的格式判断");
    }
	
    public void QQLogin(String qq){
	print("qq登录");
    }

    public void TipsPhoneError(){
	print("手机号格式错误")
    }
}

package java47.regex;

public class RegexClass {
//	长度为8-10的用户密码(以字母开头，第一位大写、其余可以释怀数字下划线)
//	电子邮箱验证
//	手机号验证
//	Ip地址验证
//	匹配国内电话号码
//	匹配腾讯qq号
//	匹配小数

	public boolean checkPassword(String password){
		String regex = "[A-Z][\\w_]{7,9}";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(password);
		return password.matches(regex);

	}

//	电子邮件地址的标准格式：用户名@服务器域名。
//	用户名表示邮件信箱、注册名或信件接收者的用户标识，@后是你使用的邮件服务器的域名。
//	用户名，可以自己选择。由字母a～z(不区分大小写)、数字0～9、点、减号或下划线组成；只能以数字或字母开头和结尾.
// 例如：beijing.2008；用户名长度为4～18个字符 。

	public boolean checkEmail(String email){
		String regex = "[\\w][\\w\\.\\-_]{2,16}[\\w]@\\w+(\\.\\w{1,3})+";
		return email.matches(regex);
	}

//	我国使用的号码为11位，其中各段有不同的编码方向：前3位—网络识别号；第4-7位—地区编码；第8-11位—用户号码。
//130	145	150	166	170	180	199
//131	147	151		171	181
//132	149	152		175	182
//133		153		176	183
//134		155		177	184
//135		156		178	185
//136		157			186
//137		158			187
//138		159			188
//139					189

	public boolean checkTel(String tel) {
		String regex1 = "1[38]\\d{9}";
		String regex2 = "15[\\d[^4]]\\d{8}";
		String regex3 = "17[015678]\\d{8}";
		String regex4 = "14[579]\\d{8}";
		String regex5 = "166\\d{8}";
		String regex6 = "199\\d{8}";

		return tel.matches(regex1) || tel.matches(regex2)
				|| tel.matches(regex3) || tel.matches(regex4)
				|| tel.matches(regex5) || tel.matches(regex6);
	}

//私有地址（Private address）属于非注册地址，专门为组织机构内部使用。
//以下列出留用的内部私有地址
//A类 10.0.0.0--10.255.255.255
//B类 172.16.0.0--172.31.255.255
//C类 192.168.0.0--192.168.255.255
	public boolean checkPrivateIPTypeA(String ip){
		String regex1 = "10(\\.([0-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])){3}"; //注意"."在小括号外面，才能匹配每一个数字。
		return ip.matches(regex1);
	}

	public boolean checkPhoneNumber(String number){
		String regex = "0\\d{2,3}\\-\\d{8}";
		return number.matches(regex);
	}

	public boolean checkQQNumber(String number){
		String regex = "[1-9][0-9]{4,14}";
		return number.matches(regex);
	}

	public boolean checkDecimal(String number){
		String regex = "[1-9]*\\.\\d*";
		return number.matches(regex);
	}

//	把“我我我我要要要要学学学学编编编编程程程程”改写成我要学编程
//	我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
//	将字符串还原成:“我要学编程”。

	public String textChange(){
		String original = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String new_text;
		String regex= "\\.+";
		new_text = original.replaceAll(regex,"");
		System.out.println(new_text);
		regex = "(.)\\1+";
		new_text = new_text.replaceAll(regex,"$1");
		System.out.println(new_text);

		return new_text;
	}




	public static void main(String[] args) {

		RegexClass rc = new RegexClass();
		String testPassword = "Aa_1234567";

		if(rc.checkPassword(testPassword))
			System.out.println("密码合法");
		else
			System.out.println("密码不合法");

		String testEmail= "Aa_12sdfsdf3-.4567@qq.com.cn";

		if(rc.checkEmail(testEmail))
			System.out.println("邮件地址合法");
		else
			System.out.println("邮件地址不合法");

		String testTel= "19812345678";

		if(rc.checkTel(testTel))
			System.out.println("手机号码合法");
		else
			System.out.println("手机号码不合法");

		String testIP= "10.2.202.99";

		if(rc.checkPrivateIPTypeA(testIP))
			System.out.println("A类IP合法");
		else
			System.out.println("A类IP不合法");

		String testPhoneNumber= "0411-98760001";

		if(rc.checkPhoneNumber(testPhoneNumber))
			System.out.println("座机号码合法");
		else
			System.out.println("座机号码不合法");

		String testQQNumber= "30398373783";

		if(rc.checkQQNumber(testQQNumber))
			System.out.println("QQ号码合法");
		else
				System.out.println("QQ号码不合法");

		String testDecimal= "12345.095855995";

		if(rc.checkDecimal(testDecimal))
			System.out.println("小数合法");
		else
			System.out.println("小数不合法");

		rc.textChange();

		String test ="009";
		String regex0 ="[1]?\\d?\\d";
		System.out.println(test.matches(regex0));
	}



}

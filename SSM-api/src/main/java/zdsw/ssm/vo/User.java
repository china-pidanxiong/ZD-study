package zdsw.ssm.vo;

/**
 * <br><b>标题：用户VO类</b>
 * <br><b>功能： 用于封装用户基本信息</b>
 * <pre>
 * 
 * </pre>
 * @author zhangd
 * @version 1.0.0
 * @since 2017年5月29日下午3:59:55
 */
public class User
{
	//id
	private String	id;
	//用户名
	private String	username;
	//用户编码
	private String	usercode;
	//用户密码
	private String	password;
	//默认邮箱
	private String	email;
	//邮箱1
	private String	email1;
	//默认电话
	private String	phonenumber;
	//电话1
	private String	phonenumber1;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUsercode()
	{
		return usercode;
	}

	public void setUsercode(String usercode)
	{
		this.usercode = usercode;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail1()
	{
		return email1;
	}

	public void setEmail1(String email1)
	{
		this.email1 = email1;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber1()
	{
		return phonenumber1;
	}

	public void setPhonenumber1(String phonenumber1)
	{
		this.phonenumber1 = phonenumber1;
	}
}
package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/test")  
public class TestController {
	
	@Resource
	private SqlSessionTemplate sqlSession;
	@RequestMapping("/good")  
    public String toIndex(HttpServletRequest request,Model model){
		System.out.println("nihaoma? 我很好");
		String accountNum = sqlSession.selectOne("test.findUserById",1);
		System.out.println(accountNum);
        return "demo/hello"; 
	}
	
	@RequestMapping("/test")  
	public String test(){
		return "demo/hello";
	}
}

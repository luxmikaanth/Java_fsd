package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bean.Admin;
import com.bean.Question;
import com.bean.Quiz;
import com.bean.Result;
import com.bean.Statistics;
import com.bean.Test;
import com.bean.User;
import com.service.AdminServices;
import com.service.UserServices;
@RestController
@RequestMapping(path = "/quiz")
public class MainController {
@Autowired
UserServices us;
@Autowired
AdminServices ad;
//http://localhost:8080/quiz/userLogin
@PostMapping(value="/userLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
public String userLogin(@RequestBody User u)
{
return us.userLogin(u.getEmailid(), u.getPassword());
}
//http://localhost:8080/quiz/userRegister
@PostMapping(value="/userRegister", consumes = MediaType.APPLICATION_JSON_VALUE)
public String userRegiter(@RequestBody User u)
{
return us.userRegister(u);
}
//http://localhost:8080/quiz/adminLogin
@PostMapping(value="/adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
public String adminLogin(@RequestBody Admin u)
{
return ad.adminLogin(u);
}
//http://localhost:8080/quiz/adminupdate
@PostMapping(value="/adminupdate", consumes = MediaType.APPLICATION_JSON_VALUE)
public String adminUpdate(@RequestBody Admin u)
{
return ad.adminupdate(u);
}
//http://localhost:8080/quiz/addQuestions
@PostMapping(value="/addQuestions", consumes = MediaType.APPLICATION_JSON_VALUE)
public String addQuestion(@RequestBody Question q)
{
return ad.addQuestion(q);
}
//http://localhost:8080/quiz/addQuiz
@PostMapping(value="/addQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
public String addQuiz(@RequestBody Quiz q)
{
return ad.addQuiz(q);
}
//http://localhost:8080/quiz/viewAllQuiz
@GetMapping(value="/viewAllQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
public List<Quiz> viewAllQuiz()
{
return ad.viewAllQuiz();
}
//http://localhost:8080/quiz/quizinfo
@GetMapping(value="/quizinfo", produces= MediaType.APPLICATION_JSON_VALUE)
public Statistics quizinfo()
{
return ad.quizInfo();
}
//http://localhost:8080/quiz/viewQuiz
@GetMapping(value="/viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
public List<Object> viewQuiz()
{
return us.viewAllQuiz();
}
//http://localhost:8080/quiz/takeTest
@PostMapping(value="/takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
public String takeTest(@RequestBody Test t)
{
return us.takeTest(t);
}
//http://localhost:8080/quiz/getAllTest
@GetMapping(value="/getAllTest", produces= MediaType.APPLICATION_JSON_VALUE)
public List<Test> getAllTest()
{
return us.getTestList();
}
//http://localhost:8080/quiz/getresult
@GetMapping(value="/getresult", produces= MediaType.APPLICATION_JSON_VALUE)
public List<Result> getresult()
{
return us.result();
}

}
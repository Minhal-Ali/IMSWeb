package com.workplace.ims.controller;
import com.workplace.ims.service.SigninService;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.*;

@RestController
public class SigninController {

//    @Autowired
//    private UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = {"/"}, method = {RequestMethod.GET})
    public ResponseEntity<Boolean> getResponse(@RequestParam("userid") String userid, @RequestParam("password") String password) {
        Connection c=getConnectionToDB();
        return new ResponseEntity<Boolean>(SigninService.performSignIn(userid,password),HttpStatus.OK);
    }

    public Connection getConnectionToDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-S7J53V9","basit","123");
            return  conn;
        }catch (Exception e){
            System.out.println(e.getMessage()+" at "+e.getStackTrace()[0].getLineNumber());
            return  null;
        }
    }

}
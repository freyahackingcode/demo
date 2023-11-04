//import com.demo.mybatis.dao.UserMapper;
//import com.demo.mybatis.pojo.User;
//import com.demo.mybatis.service.UserServiceImpl;
//import com.demo.mybatis.utils.MybatisUtils;
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//
//import java.util.List;
//
//
//public class UserTest {
//
//
//    private SqlSession sqlSession = MybatisUtils.getSqlSession();
//
//    private UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//
//    @Test
//    public void testGetUserList(){
//
//        List<User> userList = userMapper.getUserList();
//        for (User user: userList){
//            System.out.println(user);
//        }
//
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetUserById(){
//        User user = userMapper.getUserbyId(1);
//        System.out.println(user);
//    }
//
//    @Test
//    public void testInsert(){
//        User user = new User();
//        user.setId(3);
//        user.setName("Rachel");
//        user.setPwd("11");
//        userMapper.insert(user);
//        List<User> userList = userMapper.getUserList();
//        for (User uu: userList){
//            System.out.println(uu);
//        }
//    }
//
//    @Test
//    public void testDelete(){
//        userMapper.delete(3);
//        List<User> userList = userMapper.getUserList();
//        for (User uu: userList){
//            System.out.println(uu);
//        }
//    }
//
//    @Test
//    public void testUpdate(){
//        PageHelper.startPage(1,10);
//        userMapper.getUserList();
//        User user = userMapper.getUserbyId(1);
//        user.setName("oo");
//        user.setPwd("99");
//        userMapper.update(user);
//        User user1 = userMapper.getUserbyId(1);
//        System.out.println(user1);
//    }
//
//
//    @Test
//    public void testPage(){
//        PageHelper.startPage(2, 5);
//        List<User> users = userMapper.getUserList();
//        PageInfo<User> userpageinfo = new PageInfo<User>(users);
//        System.out.println(userpageinfo);
//    }
//}

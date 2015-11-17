package log4jexam1;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Log4JExample {
   private static Logger logger = Logger.getLogger(Log4JExample.class);
   public void a() {
      if(logger.isInfoEnabled()){
      logger.info("info 레벨의 로그입니다");
      }
      b();
   }
   
   public void b() {
      logger.warn("warn 레벨의 로그입니다.");
      c();
   }
   
   public void c() {
      IOException e = new IOException("입출력 오류");
      logger.error("error 레벨의 로그입니다." , e);
   }
   
   public static void main(String[] args) {
      Log4JExample ex = new Log4JExample(); 
      if(logger.isDebugEnabled()){ //로그레벨이 debug이면 true
         
      
      logger.debug("디버그 로그입니다.");
      }
      ex.a();
   }
}
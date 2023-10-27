package cxx.study.designpattern._1_single;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

  private static File file = new File("/Users/code-space/SpringApplication/1.txt");
  private static final FileWriter writer;

  static {
    try {
      writer = new FileWriter(file,true);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public Logger() {

  }

  public void setFile(String filePath) {
    file = new File(filePath);
  }
  
  public void log(String message) throws IOException {
    synchronized(Logger.class) { // 类级别的锁
      writer.write(message);
      writer.flush();
    }
  }
}
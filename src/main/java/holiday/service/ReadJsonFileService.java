//package holiday.service;
//
//import cn.xinzhili.medical.bean.medicalLogic.MedicalLogicTotalRequest;
//import cn.xinzhili.medical.logic.init.MedicalLogicInit;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.io.UnsupportedEncodingException;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springside.modules.utils.mapper.JsonMapper;
//
//@Service
//public class ReadJsonFileService {
//
//
//  @Autowired
//  private List<MedicalLogicInit> initLogic;
//
//
//  public List<String> find(String pathName, int depth) throws IOException {
//
//    List<String> result = new ArrayList<>();
//
//    int filecount = 0;
//    //获取pathName的File对象
//    File dirFile = new File(pathName);
//    //判断该文件或目录是否存在，不存在时在控制台输出提醒
//    if (!dirFile.exists()) {
//      System.out.println("do not exit");
//      return result;
//    }
//    //判断如果不是一个目录，就判断是不是一个文件，时文件则输出文件路径
//    if (!dirFile.isDirectory()) {
//      if (dirFile.isFile()) {
//        System.out.println(dirFile.getCanonicalFile());
//      }
//      return result;
//    }
//
//    //获取此目录下的所有文件名与目录名
//    String[] fileList = dirFile.list();
//    int currentDepth = depth + 1;
//    for (int i = 0; i < fileList.length; i++) {
//      //遍历文件目录
//      String string = fileList[i];
//      //File("documentName","fileName")是File的另一个构造器
//      File file = new File(dirFile.getPath(), string);
//      String name = file.getName();
//      //如果是一个目录，搜索深度depth++，输出目录名后，进行递归
//      if (file.isDirectory()) {
//        //递归
//        find(file.getCanonicalPath(), currentDepth);
//      } else {
//        doRequest(file2String(file, "UTF-8"));
//      }
//
//    }
//    return result;
//  }
//
//
//  private void doRequest(String source) {
//
//    MedicalLogicTotalRequest request =
//        JsonMapper.INSTANCE.fromJson(source, MedicalLogicTotalRequest.class);
//    initLogic.forEach(t -> t.init(request));
//  }
//
//  /**
//   * 文件转换为字符串
//   *
//   * @param f 文件
//   * @param charset 文件的字符集
//   * @return 文件内容
//   */
//  public static String file2String(File f, String charset) {
//    String result = null;
//    try {
//      result = stream2String(new FileInputStream(f), charset);
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }
//    return result;
//  }
//
//  /**
//   * 文件转换为字符串
//   *
//   * @param in 字节流
//   * @param charset 文件的字符集
//   * @return 文件内容
//   */
//  public static String stream2String(InputStream in, String charset) {
//    StringBuffer sb = new StringBuffer();
//    try {
//      Reader r = new InputStreamReader(in, charset);
//      int length = 0;
//      for (char[] c = new char[1024]; (length = r.read(c)) != -1; ) {
//        sb.append(c, 0, length);
//      }
//      r.close();
//    } catch (UnsupportedEncodingException e) {
//      e.printStackTrace();
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    return sb.toString();
//  }
//
//
//}

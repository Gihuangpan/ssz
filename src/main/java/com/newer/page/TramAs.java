package com.newer.page;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import pojo.Boke;

import java.io.*;

class NoThisSongException extends Exception{
    public NoThisSongException(String string){
        super(string);
    }
    NoThisSongException(){
        super();
    }
}
public class TramAs {
    public void op(JoinPoint jp) throws Exception {
            System.out.println("开始");
            Object[] objs = jp.getArgs();
            Boke boke = (Boke) objs[0];
             Object i=null;
             for (int l=0;l<objs.length;l++){
                 i=objs[l];
             }
             String p=i.toString();
        System.out.println("aaaa"+p);

            String s = jp.getSignature().getName();
            if (boke == null) {
                throw new Exception("请登录");
            } else if (boke.getTitle().equals("Tourist") && s.equals("delet")) {
                throw new NoThisSongException("注册用户不能删除");
            } else if (!boke.getTitle().equals("management") || boke.getTitle().equals("Tourist")) {
                throw new NoThisSongException("非法人员");
            } else {
                //System.out.println("允许访问");
            }
        BufferedWriter bw=null;
     try {
         File file = new File("C:/Users/gggg/Desktop/tet.text");
          bw = new BufferedWriter(new FileWriter(file, true)); //true表示是否追加//接收用户输入
         while (objs!=null) {    //如果用户输入exit则退出循环
             bw.write(p);    //将用户输入的字符串写入文件
             bw.newLine();    //换行
             bw.flush(); //刷新缓冲区,将缓冲区的字符写入磁盘!
            bw.close();
         }
     }catch(FileNotFoundException e){
         System.out.println(e.getMessage());
     }catch(IOException e){
         System.out.println(e.getMessage());
     }
    }
        public void afterReturing (JoinPoint jp){

            System.out.println(jp.getTarget());
            System.out.println("后置通知");
        }

        public void ream () {
            System.out.println("关闭");
        }


        public void after () {
            System.out.println("异常通知");
        }

        /**
         * 环绕通知中返回值和业务方法中的返回值相同
         * @param jp
         */
        public Object aroun (ProceedingJoinPoint jp){
            Object ob=null;
            try {
               // op(jp);
                 ob=jp.proceed();//继续执行业务方法
                String i=ob.toString();
                afterReturing(jp);
                BufferedWriter bw=null;

                    File file = new File("C:/Users/gggg/Desktop/tet.text");
                    bw = new BufferedWriter(new FileWriter(file, true)); //true表示是否追加//接收用户输入
                    while (ob!=null) {    //如果用户输入exit则退出循环
                        bw.write(i);    //将用户输入的字符串写入文件
                        bw.newLine();    //换行
                        bw.flush(); //刷新缓冲区,将缓冲区的字符写入磁盘!
                        bw.close();
                    }
                }catch(FileNotFoundException e){
                    System.out.println(e.getMessage());
                }catch(IOException e){
                    System.out.println(e.getMessage());
            } catch (Exception e) {
                after();
                e.printStackTrace();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            } finally {
                ream();
            }
            return ob;
        }
    }



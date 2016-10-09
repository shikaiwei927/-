package com.d3tech.app.test;
import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.net.DatagramPacket;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.d3tech.app.unit.MD5Util;
import com.d3tech.app.unit.AESEncryptor;
import com.d3tech.app.unit.HttpRequest;
import com.d3tech.app.unit.Map2Json;
import com.google.gson.Gson;

public class EncryptErniu {
	//��������http
	public static void CreateLink() {
		MD5Util temp=new MD5Util(); 
		HashMap<String , String>	datamap=new HashMap<String ,String>();
	  String password=new String("123456789"); 
	  String md5passwd=temp.MD5(password);
	  datamap.put("phone","15157111090");
	  datamap.put("password",md5passwd);
	  datamap.put("serial", "TXAA16BAA0200022");
	  datamap.put("name"," �½�����");
	  datamap.put("srcType", "1");
	  datamap.put("srcUuid"," e5269265-0427-45c0-96e5-208964ccbc1e");
	  datamap.put("srcEvent","on");
	  datamap.put("tgtType", "0");
	  datamap.put("tgtUuid","TXAA16BAA0200022");
	  datamap.put("tgtEvent","alarmon");
	  datamap.put("param"," ");
	  String datajson=Map2Json.mapToJson(datamap);
      System.out.println(datajson);
      String encryptdata=AESEncryptor.encrypt(datajson);
      System.out.println(encryptdata);
      String postdata =new String(encryptdata);
      String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/create_link", postdata);
	  System.out.println(result);
	}
	//�޸�����
	public static void ModifyLink() {
		MD5Util temp=new MD5Util(); 
		HashMap<String , String>	datamap=new HashMap<String ,String>();
		
	  String password=new String("123456789"); 
	  String md5passwd=temp.MD5(password);
	  datamap.put("phone","15157111090");
	  datamap.put("password",md5passwd);
	  datamap.put("id", "value");
	  datamap.put("name"," value");
	  datamap.put("srcType", "value");
	  datamap.put("srcUuid"," value");
	  datamap.put("srcEvent","value");
	  datamap.put("tgtType", "value");
	  datamap.put("tgtUuid"," value");
	  datamap.put("tgtEvent","value");
	  datamap.put("param"," value");
	  
	  String datajson=Map2Json.mapToJson(datamap);
      System.out.println(datajson);
      String encryptdata=AESEncryptor.encrypt(datajson);
      System.out.println(encryptdata);
      String postdata =new String(encryptdata);
      String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/modify_link", postdata);
	  System.out.println(result);
	}
	
//ɾ������
	public static void DeleteLink() {
		MD5Util temp=new MD5Util(); 
		HashMap<String , String>	datamap=new HashMap<String ,String>();
		
	  String password=new String("123456789"); 
	  String md5passwd=temp.MD5(password);
	  datamap.put("phone","15157111090");
	  datamap.put("password",md5passwd);
	  datamap.put("id", "40");
	  String datajson=Map2Json.mapToJson(datamap);
      System.out.println(datajson);
      String encryptdata=AESEncryptor.encrypt(datajson);
      System.out.println(encryptdata);
      String postdata =new String(encryptdata);
      String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/delete_link", postdata);
	  System.out.println(result);
	}
	
	//��/�ر�����
	public static void EnableLink() {
		MD5Util temp=new MD5Util(); 
		HashMap<String , String>	datamap=new HashMap<String ,String>();
	  String password=new String("123456789"); 
	  String md5passwd=temp.MD5(password);
	  datamap.put("phone","15157111090");
	  datamap.put("password",md5passwd);
	  datamap.put("id", "40");
	  datamap.put("enable","true" );
	  String datajson=Map2Json.mapToJson(datamap);
      System.out.println(datajson);
      String encryptdata=AESEncryptor.encrypt(datajson);
      System.out.println(encryptdata);
      String postdata =new String(encryptdata);
      String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/enable_link", postdata);
	  System.out.println(result);
	}
	
	//��ȡ�����б�http
public static void GetLinkList() {
		MD5Util temp=new MD5Util(); 
		HashMap<String , String>	datamap=new HashMap<String ,String>();
	  String password=new String("123456789"); 
	  String md5passwd=temp.MD5(password);
	  datamap.put("phone","15157111090");
	  datamap.put("password",md5passwd);
	  String datajson=Map2Json.mapToJson(datamap);
      System.out.println(datajson);
      String encryptdata=AESEncryptor.encrypt(datajson);
      System.out.println(encryptdata);
      String postdata =new String(encryptdata);
      String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/get_link_list", postdata);
	  System.out.println(result);
}

//��ȡ����
public static void GetLink() {
	MD5Util temp=new MD5Util(); 
	HashMap<String , String>	datamap=new HashMap<String ,String>();
  String password=new String("123456789"); 
  String md5passwd=temp.MD5(password);
  datamap.put("phone","15157111090");
  datamap.put("id", "value");
  datamap.put("password",md5passwd);
  String datajson=Map2Json.mapToJson(datamap);
  System.out.println(datajson);
  String encryptdata=AESEncryptor.encrypt(datajson);
  System.out.println(encryptdata);
  String postdata =new String(encryptdata);
  String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/get_link", postdata);
  System.out.println(result);
}


//��ȡ������־
public static void GetLinkLog() {
	MD5Util temp=new MD5Util(); 
	HashMap<String , String>	datamap=new HashMap<String ,String>();
  String password=new String("123456789"); 
  String md5passwd=temp.MD5(password);
  datamap.put("phone","15157111090");
  datamap.put("index", "2");
  datamap.put("quantity","2 ");
  datamap.put("password",md5passwd);
  String datajson=Map2Json.mapToJson(datamap);
  System.out.println(datajson);
  String encryptdata=AESEncryptor.encrypt(datajson);
  System.out.println(encryptdata);
  String postdata =new String(encryptdata);
  String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/get_link_log", postdata);
  System.out.println(result);
}
//ɾ��������־
public static void DeleteLinkLog() {
	MD5Util temp=new MD5Util(); 
	HashMap<String , String>	datamap=new HashMap<String ,String>();
  String password=new String("123456789"); 
  String md5passwd=temp.MD5(password);
  datamap.put("phone","15157111090");

  datamap.put("password",md5passwd);
  String datajson=Map2Json.mapToJson(datamap);
  System.out.println(datajson);
  String encryptdata=AESEncryptor.encrypt(datajson);
  System.out.println(encryptdata);
  String postdata =new String(encryptdata);
  String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/delete-link-log", postdata);
  System.out.println(result);
}
//5.1.9��ȡ�����г�ͻ�Ŀ���
public static void GetLinkCrashSwitches() {
	MD5Util temp=new MD5Util(); 
	HashMap<String , String>	datamap=new HashMap<String ,String>();
  String password=new String("123456789"); 
  String md5passwd=temp.MD5(password);
  datamap.put("phone","15157111090");
  datamap.put("password",md5passwd);
  datamap.put("serial","TXAA15KAA0100002");
  datamap.put("uuid", "ce7f6a07-e929-48e7-8604-88a049267fa5");
  datamap.put("index"," 1");
  String datajson=Map2Json.mapToJson(datamap);
  System.out.println(datajson);
  String encryptdata=AESEncryptor.encrypt(datajson);
  System.out.println(encryptdata);
  String postdata =new String(encryptdata);
  String  result=HttpRequest.sendPost("http://121.41.50.221:8080/WebServer/sl/get_link_crash_switches", postdata);
  System.out.println(result);
}
public static void main(String[]args){
DeleteLink();
}
}
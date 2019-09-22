package com.myapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SftpUtil {

//	String SFTPHOST = "Kamals-MacBook-Pro.local";
//	//String SFTPHOST = "192.168.1.101";
//	int SFTPPORT = 22;
//	String SFTPUSER = "dhrutimistry";
//	String SFTPPASS = "dhruti123";
//	String SFTPWORKINGDIR = "Pictures";

	private String hostname;
	private int port;
	private String username;
	private String password;

	private Session session = null;
	private Channel channel = null;
	private ChannelSftp channelSftp = null;

	public SftpUtil(String envConfigPropPath) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(envConfigPropPath));
		System.out.println("Loading properties from file: " + envConfigPropPath);

		this.hostname = prop.getProperty("sftp.hostname");
		this.port = Integer.valueOf(prop.getProperty("sftp.port"));
		this.username = prop.getProperty("sftp.username");
		this.password = prop.getProperty("sftp.password");

		System.out.println("Config read for SFTP host: " + this.hostname + " and user: " + this.username);
	}

	private void connect() throws Exception {
		JSch jsch = new JSch();
		session = jsch.getSession(this.username, this.hostname, this.port);
		session.setPassword(this.password);
		java.util.Properties config = new java.util.Properties();
		config.put("StrictHostKeyChecking", "no");
		session.setConfig(config);
		session.connect();
		System.out.println("Connected to SFTP server...");

		channel = session.openChannel("sftp");
		channel.connect();
		System.out.println("sftp channel opened and connected");
		channelSftp = (ChannelSftp) channel;
	}

	private void disconnect() throws Exception {
		if (!channelSftp.isClosed()) {
			channelSftp.exit();
			System.out.println("sftp chsnnel exited");
		}
		if (!channel.isConnected()) {
			channel.disconnect();
			System.out.println("channel disconnected");
		}
		if (!session.isConnected()) {
			session.disconnect();
			System.out.println("Host session disconnected");
		}
		System.out.println("sftp channel closed and disconnected");
	}

	public static void main(String args[]) throws Exception {

		SftpUtil sftpupload = new SftpUtil(
				"/Users/kamal/workspace/Json_Ex/di-json-parser/config/di-env-config.properties");

		 String fileName = "/Users/kamal/Downloads/Khyati-Kirtesh.pdf";
		 String sftpFilePath = "/Users/dhrutimistry/test.pdf";
		sftpupload.sftpPut(fileName,sftpFilePath);

		String fileName1 = "/Users/dhrutimistry/Downloads/turing.pdf";
		sftpupload.sftpGet(fileName1);
		System.out.println("Done");
	}

	public void sftpPut(String srcFilePath, String sftpFilePath) throws Exception {
		System.out.println("Preparing host information for sftp");
		try {
			connect();
			//channelSftp.cd(".");
			channelSftp.put(new FileInputStream(new File(srcFilePath)), sftpFilePath);
			System.out.println("File transfered successfully on the SFTP server");
		} finally {
			disconnect();
		}
	}

	public void sftpGet(String fileName) throws Exception {

		System.out.println("Preparing host information for sftp");
		try {
			connect();
			channelSftp.get(fileName,"/Users/kamal/");
			System.out.println("File transfered successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}

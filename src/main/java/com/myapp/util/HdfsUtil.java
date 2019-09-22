package com.myapp.util;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HdfsUtil {

	private String fsHost;// = "192.168.1.105";
	private FileSystem fs;
	
	public HdfsUtil(String fsHost) throws IOException {
		super();
		this.fsHost = fsHost;

		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://" + fsHost + ":8020");
		conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
		conf.set("fs.file.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
		System.out.println("Connecting to -- " + conf.get("fs.defaultFS"));
		// Destination file system in HDFS
		fs = FileSystem.get(conf);
	}

	public void copyFileFromLocalToHdfs(String localFilePath, String hdfsFilePath) throws IOException {

		Path srcPath = new Path(localFilePath);
		Path dstPath = new Path(hdfsFilePath);
		
		fs.copyFromLocalFile(srcPath, dstPath);
		System.out.println(localFilePath + " copied to HDFS at: " + hdfsFilePath);
	}

	public void copyFileFromHdfsToLocal(String hdfsFilePath, String localFilePath) throws IOException {
		
		Path srcPath = new Path(hdfsFilePath);
		Path dstPath = new Path(localFilePath);
		
		fs.copyToLocalFile(srcPath, dstPath);
		System.out.println(hdfsFilePath + " copied to local at: " + localFilePath);
	}

	public static void main(String[] args) throws IOException {
		//String localFilePath = "/home/cloudera/cm_api.py";
		//String hdfsPath = "/user/cloudera/dhruti/cm_api1.py";
		String localFilePath = "/Users/kamal/workspace/Json_Ex/di-json-parser/pom.xml";
		String hdfsPath = "/user/cloudera/dhruti/pom.xml";
		HdfsUtil hu = new HdfsUtil("192.168.1.105");
		hu.copyFileFromLocalToHdfs(localFilePath, hdfsPath);

		System.out.println("Done !!");
	}

}

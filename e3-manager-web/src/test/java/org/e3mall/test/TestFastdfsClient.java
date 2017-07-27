package org.e3mall.test;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

/**
 * 测试FastDFS图片上传
 *
 * @author 付石强
 *
 */
public class TestFastdfsClient {

	
	// 客户端配置文件
	private String conf_fileName = "/fdfs/fdfs_client.conf";
	// 本地要上传的文件
	private String fileName = "/Users/apple/Downloads/images/calligraphy05.jpg";

	@Test
	public void test() throws Exception {
		// 初始化fsfd的配置文件，指定配置文件的完整路径
		String url = this.getClass().getResource(conf_fileName).getPath();
		ClientGlobal.init(url);
		// 获取Tracker的客户端
		TrackerClient trackerClient = new TrackerClient();
		// 获取Tracker的服务端
		TrackerServer trackerServer = trackerClient.getConnection();
		// 获取Storage的客户端
		// 第二个参数能指定，某个StorageService上传文件
		StorageClient storageClient = new StorageClient(trackerServer, null);
		// 通过Storage客户端完成上传操作
		String[] upload_appender_file = storageClient.upload_appender_file(fileName, "jpg", null);
		for (String string : upload_appender_file) {
			System.out.println(string);
		}
	}

}

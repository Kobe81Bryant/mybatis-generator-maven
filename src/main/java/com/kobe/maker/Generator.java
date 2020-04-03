package com.kobe.maker;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Generator
 * @Description: 逆向工程生成po类、Mapper接口文件、Mapper映射文件的主程序
 */
public class Generator {
	@Test
	public void generator() throws Exception {
		URL url = this.getClass().getResource("/generator.xml");
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File(url.toURI());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		System.out.println("开始生成...");
		myBatisGenerator.generate(null);
		System.out.println("生成完毕...");
	}
}

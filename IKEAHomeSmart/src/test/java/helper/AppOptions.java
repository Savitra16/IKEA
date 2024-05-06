package helper;

import java.io.File;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppOptions {
	UiAutomator2Options options;

	/*
	 * app1 = IKEASmartHome.apk
	 * 
	 */
	public void initOptions() {
			System.out.println("-------- Started: IKEA Smart Home Apk ----------");
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("builds/IKEASmartHome.apk").getFile());
			String apkPath = file.getAbsolutePath();

			options = new UiAutomator2Options();
			options
				.setPlatformName("Android")
				.setPlatformVersion("13")
				.setAutomationName("UiAutomator2")
				.setDeviceName("AndroidEmulator")
				.setApp(apkPath) // Optional, Drag n Drop can also be used
				.setNoReset(false); // Will not install app if its already present
		
	}
	
	
	public UiAutomator2Options getOptions(){
		initOptions();
		return options;
	}
}

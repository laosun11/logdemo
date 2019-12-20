package com.example.logdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogThreadController {
	private static Logger logger = LoggerFactory.getLogger(LogThreadController.class);
	Thread thread;
	
	@RequestMapping("/startlog")
	public void startlog(){
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					logger.info("logger info aabbcc ");
				}
			}
		});
		thread.start();
	}
	
	
	@RequestMapping("/stoplog")
	public void stoplog(){
		thread.stop();
	}
}

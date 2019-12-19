package com.example.logdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogThreadController {
	Thread thread;
	
	@RequestMapping("/startlog")
	public void startlog(){
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					System.out.println("aabbcc");
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

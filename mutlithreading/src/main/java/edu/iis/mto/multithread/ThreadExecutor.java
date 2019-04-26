package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class ThreadExecutor implements Executor {
	
	ExecutorType type;
	
	public ThreadExecutor(ExecutorType type) {
		this.type = type;
	}
	
	@Override
	public void execute(Runnable command) {
		if(this.type == ExecutorType.SAME_THREAD) {
			command.run();
		}
		else {
			new Thread(command).run();
		}
		
	}

}

package com.axway.thread.prac.in;

import java.util.concurrent.TimeUnit;

class Task implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
package com.company.utils;

import java.util.Random;
import java.util.UUID;

public class Tools {

	/*
	 * 功能:生成(min,max)之间的随机数
	 */
	public static long getRandom(int max, int min) {
		return Math.abs((long) (Math.random() * (max - min) + min));
	}

	/*
	 * 功能:返回一个不会重复的数
	 */
	public static int getRandomNumber() {
		Random random = new Random(System.currentTimeMillis());
		return Math.abs(random.nextInt());
	}

	/*
	 * 功能:生成UUID
	 */
	public static String getId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

	

}